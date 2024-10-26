/**
 * Clase main donde ejecutamos el programa
 * @author cristian
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {


        //instanciamos el objeto con el metodo para leer el xml y llamamos al método
        MetodosLeerXml metodosLeerXml = new MetodosLeerXml();
        metodosLeerXml.readXmlFile("autores.xml");
    }
}