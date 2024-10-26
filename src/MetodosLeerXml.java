import javax.xml.XMLConstants;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase con el método para leer información del xml
 * @author cristian
 * @version 1.0
 */
public class MetodosLeerXml {

    /**
     * Método que leer información del xml
     * @param path el path del archivo donde está el xml
     */
    public void readXmlFile(String path){

        //declaramos 4 variables en las cuales van a ir almacenada la información del xml
        String elementoActual = "";
        String codigo = "";
        String nome = "";
        String titulo = "";


        //hacemos el objeto xmlInputFactory para leer el archivo
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        try{
            //esta clase nos permitirá acceder al xml y por parámetro le pasamos el objeto con el path
            XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(new FileInputStream(path));
            int element;

            /**
             * Explicación del proceso de lectura de un archivo xml
             * 1. Establecemos un bucle while de manera que si la lectura del xml sigue dando true, es decir, hay elementos para ler, se ejecuta´ra el código del bucle
             * 2. establecemos una variable igual al siguiente elemento que se está leyendo
             * 3. el next() nos devuelve un int, ese int es igual al tipo de elemento que lee, es decir, el inicio del documento, una dtd, el final de elemento, un texto... etc
             * 4. si el element es igual a una etiqueta de inicio, hacemos que esta sea igual a la variable que contendrá en cualquier momento el valor de la etiqueta actual
             * 5. si el elemento actual coincide con el autor, recogemos el valor del atributo con el metodo getAttributeValue, entre parétensis la posición del elemento del atributo
             * 6. si el elemento es texto, declaramos una variable text igual al texto de la etiqueta
             * 7. comprobamos si coincide con alguno de los campos nome o titulo y comprobamos si el text no está vacío
             * 8. la comprobación del text vacío es porque me generaba duplicados de etiquetas vacías que averigüe con el debug
             * 9. Si no está vacía, el texto es igual al nombre o al título, dependiendo de la etiqueta que coincida
             * 10. por último, comprobamos si la etiqueta actual es final de documento con el END_ELEMENT
             * 11. comprobamos si el final coincide con el nombre autor para sacar por consola el autor codigo, nome y titulo
             * 12. cerramos el documento xml
             */
            while(xmlStreamReader.hasNext()){
                element = xmlStreamReader.next();

                if(element == XMLStreamConstants.START_ELEMENT){
                    elementoActual = xmlStreamReader.getLocalName();

                    if("autor".equals(elementoActual)){
                        codigo = xmlStreamReader.getAttributeValue(0);
                    }
                }

                else if(element == XMLStreamConstants.CHARACTERS){
                    String text = xmlStreamReader.getText().trim();
                   if("nome".equals(elementoActual) && !text.isEmpty()){
                       nome = xmlStreamReader.getText().trim();

                   } else if ("titulo".equals(elementoActual) && !text.isEmpty()) {
                       titulo = xmlStreamReader.getText().trim();
                   }
                }
                else if (element == XMLStreamConstants.END_ELEMENT) {
                    if("autor".equals(xmlStreamReader.getLocalName())){
                        System.out.println("Autor codigo: " + codigo);
                        System.out.println("Nombre: " + nome);
                        System.out.println("titulo: " + titulo);
                    }

                }

            }
            xmlStreamReader.close();

            /**
             * Recogemos excepciones que se pueden dar en el programa
             */
        }catch(IOException ioEx){
            System.out.println("Ups, el archivo no existe");
        }catch(XMLStreamException XmlEx){
            System.out.println("ups, ha ocurrido un error al operar con el xml");
        }

    }
}
