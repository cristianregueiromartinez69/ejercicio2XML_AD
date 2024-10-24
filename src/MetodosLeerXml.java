import javax.xml.XMLConstants;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class MetodosLeerXml {

    public void readXmlFile(String path){

        String elementoActual = "";
        String codigo = "";
        String nome = "";
        String titulo = "";
        boolean marcaNome = false;
        boolean marcaTitulo = false;

        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        try{
            XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(new FileInputStream(path));
            int element;

            while(xmlStreamReader.hasNext()){
                element = xmlStreamReader.next();

                if(element == XMLStreamConstants.START_ELEMENT){
                    elementoActual = xmlStreamReader.getLocalName();

                    if("autor".equals(elementoActual)){
                        codigo = xmlStreamReader.getAttributeValue(0);
                    } else if ("nome".equals(elementoActual)) {
                        marcaNome = true;
                        marcaTitulo = false;
                    } else if ("titulo".equals(elementoActual)) {
                        marcaNome = false;
                        marcaTitulo = true;
                    }
                }

                else if(element == XMLStreamConstants.CHARACTERS){
                    if(marcaNome){
                        nome = xmlStreamReader.getText().trim();
                    } else if (marcaTitulo) {
                        titulo = xmlStreamReader.getText().trim();
                    }
                } else if (element == XMLStreamConstants.END_ELEMENT) {

                    if(xmlStreamReader.getLocalName().equals("autor")){
                        System.out.println("autor codigo: " + codigo);
                        System.out.println("nombre: " + nome);
                        System.out.println("titulo: " + titulo);
                    }
                }
                xmlStreamReader.close();

            }

        }catch(IOException ioEx){
            System.out.println("Ups, el archivo no existe");
        }catch(XMLStreamException XmlEx){
            System.out.println("ups, ha ocurrido un error al operar con el xml");
        }

    }
}
