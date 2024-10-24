import javax.xml.XMLConstants;
import javax.xml.stream.*;
import javax.xml.stream.util.XMLEventAllocator;
import javax.xml.transform.Source;
import java.io.InputStream;
import java.io.Reader;

public class ClaseExtensionXML extends XMLInputFactory {
    /**
     * Crea un nuevo XMLStreamReader a partir de un reader.
     *
     * @param reader los datos XML de los que se leerá
     * @return una instancia de {@code XMLStreamReader}
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public XMLStreamReader createXMLStreamReader(Reader reader) throws XMLStreamException {
        return null;
    }

    /**
     * Crea un nuevo XMLStreamReader a partir de una fuente JAXP. Este método es opcional.
     *
     * @param source la fuente de la que se leerá
     * @return una instancia de {@code XMLStreamReader}
     * @throws UnsupportedOperationException si este método no es
     *                                       soportado por esta XMLInputFactory
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public XMLStreamReader createXMLStreamReader(Source source) throws XMLStreamException {
        return null;
    }

    /**
     * Crea un nuevo XMLStreamReader a partir de un java.io.InputStream.
     *
     * @param stream el InputStream del que se leerá
     * @return una instancia de {@code XMLStreamReader}
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public XMLStreamReader createXMLStreamReader(InputStream stream) throws XMLStreamException {
        return null;
    }

    /**
     * Crea un nuevo XMLStreamReader a partir de un java.io.InputStream.
     *
     * @param stream el InputStream del que se leerá
     * @param encoding la codificación de caracteres del stream
     * @return una instancia de {@code XMLStreamReader}
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public XMLStreamReader createXMLStreamReader(InputStream stream, String encoding) throws XMLStreamException {
        return null;
    }

    /**
     * Crea un nuevo XMLStreamReader a partir de un java.io.InputStream.
     *
     * @param systemId el ID del sistema del stream
     * @param stream el InputStream del que se leerá
     * @return una instancia de {@code XMLStreamReader}
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public XMLStreamReader createXMLStreamReader(String systemId, InputStream stream) throws XMLStreamException {
        return null;
    }

    /**
     * Crea un nuevo XMLStreamReader a partir de un java.io.InputStream.
     *
     * @param systemId el ID del sistema del stream
     * @param reader el InputStream del que se leerá
     * @return una instancia de {@code XMLStreamReader}
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public XMLStreamReader createXMLStreamReader(String systemId, Reader reader) throws XMLStreamException {
        return null;
    }

    /**
     * Crea un nuevo XMLEventReader a partir de un reader.
     *
     * @param reader los datos XML de los que se leerá
     * @return una instancia de {@code XMLEventReader}
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public XMLEventReader createXMLEventReader(Reader reader) throws XMLStreamException {
        return null;
    }

    /**
     * Crea un nuevo XMLEventReader a partir de un reader.
     *
     * @param systemId el ID del sistema de la entrada
     * @param reader los datos XML de los que se leerá
     * @return una instancia de {@code XMLEventReader}
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public XMLEventReader createXMLEventReader(String systemId, Reader reader) throws XMLStreamException {
        return null;
    }

    /**
     * Crea un nuevo XMLEventReader a partir de un XMLStreamReader. Después de
     * usarlo para construir la instancia XMLEventReader devuelta por este método,
     * el XMLStreamReader no debe ser utilizado.
     *
     * @param reader el XMLStreamReader del que se leerá (no se puede modificar)
     * @return un nuevo XMLEventReader
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public XMLEventReader createXMLEventReader(XMLStreamReader reader) throws XMLStreamException {
        return null;
    }

    /**
     * Crea un nuevo XMLEventReader a partir de una fuente JAXP.
     * Soporte de este método es opcional.
     *
     * @param source la fuente de la que se leerá
     * @return una instancia de {@code XMLEventReader}
     * @throws XMLStreamException si ocurre un error
     * @throws UnsupportedOperationException si este método no es soportado por esta XMLInputFactory
     */
    @Override
    public XMLEventReader createXMLEventReader(Source source) throws XMLStreamException {
        return null;
    }

    /**
     * Crea un nuevo XMLEventReader a partir de un java.io.InputStream.
     *
     * @param stream el InputStream del que se leerá
     * @return una instancia de {@code XMLEventReader}
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public XMLEventReader createXMLEventReader(InputStream stream) throws XMLStreamException {
        return null;
    }

    /**
     * Crea un nuevo XMLEventReader a partir de un java.io.InputStream.
     *
     * @param stream el InputStream del que se leerá
     * @param encoding la codificación de caracteres del stream
     * @return una instancia de {@code XMLEventReader}
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public XMLEventReader createXMLEventReader(InputStream stream, String encoding) throws XMLStreamException {
        return null;
    }

    /**
     * Crea un nuevo XMLEventReader a partir de un java.io.InputStream.
     *
     * @param systemId el ID del sistema del stream
     * @param stream el InputStream del que se leerá
     * @return una instancia de {@code XMLEventReader}
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public XMLEventReader createXMLEventReader(String systemId, InputStream stream) throws XMLStreamException {
        return null;
    }

    /**
     * Crea un lector filtrado que envuelve el filtro alrededor del reader.
     *
     * @param reader el reader a filtrar
     * @param filter el filtro a aplicar al reader
     * @return una instancia de {@code XMLEventReader}
     * @throws XMLStreamException si ocurre un error
     */

    @Override
    public XMLStreamReader createFilteredReader(XMLStreamReader reader, StreamFilter filter) throws XMLStreamException {
        return null;
    }

    /**
     * Crea un lector de eventos filtrado que envuelve el filtro alrededor del lector de eventos.
     *
     * @param reader el lector de eventos a envolver
     * @param filter el filtro a aplicar al lector de eventos
     * @return una instancia de {@code XMLEventReader}
     * @throws XMLStreamException si ocurre un error
     */
    @Override
    public XMLEventReader createFilteredReader(XMLEventReader reader, EventFilter filter) throws XMLStreamException {
        return null;
    }

    /**
     * El resolutor que se establecerá en cualquier XMLStreamReader o XMLEventReader creado
     * por esta instancia de fábrica.
     *
     * @return una instancia de {@code XMLResolver}
     */
    @Override
    public XMLResolver getXMLResolver() {
        return null;
    }

    /**
     * El resolutor que se establecerá en cualquier XMLStreamReader o XMLEventReader creado
     * por esta instancia de fábrica.
     *
     * @param resolver el resolutor para usar en la resolución de referencias
     */
    @Override
    public void setXMLResolver(XMLResolver resolver) {

    }

    /**
     * El reportero que se establecerá en cualquier XMLStreamReader o XMLEventReader creado
     * por esta instancia de fábrica.
     *
     * @return una instancia de {@code XMLReporter}
     */
    @Override
    public XMLReporter getXMLReporter() {
        return null;
    }

    /**
     * El reportero que se establecerá en cualquier XMLStreamReader o XMLEventReader creado
     * por esta instancia de fábrica.
     *
     * @param reporter el resolutor para usar en la notificación de errores no fatales
     */
    @Override
    public void setXMLReporter(XMLReporter reporter) {

    }

    /**
     * Permite al usuario establecer una característica/propiedad específica en la implementación subyacente.
     * La implementación subyacente no está obligada a admitir todos los ajustes de cada propiedad en la especificación
     * y puede usar IllegalArgumentException para indicar que una propiedad no compatible no puede ser establecida con el valor especificado.
     * <p>
     * Todas las implementaciones que implementen JAXP 1.5 o versiones más recientes están obligadas a admitir
     * la propiedad {@link XMLConstants#ACCESS_EXTERNAL_DTD}.
     * <ul>
     *   <li>
     * <p>
     *      El acceso a DTDs externas, referencias de entidades externas está restringido a los
     *      protocolos especificados por la propiedad. Si el acceso es denegado durante el análisis
     *      debido a la restricción de esta propiedad, {@link XMLStreamException}
     *      será lanzado por el método {@link XMLStreamReader#next()} o
     *      {@link XMLEventReader#nextEvent()}.
     *
     *   </li>
     * </ul>
     *
     * @param name  El nombre de la propiedad (no puede ser nulo)
     * @param value El valor de la propiedad
     * @throws IllegalArgumentException si la propiedad no es compatible
     */
    @Override
    public void setProperty(String name, Object value) throws IllegalArgumentException {

    }

    /**
     * Obtener el valor de una característica/propiedad de la implementación subyacente.
     *
     * @param name El nombre de la propiedad (no puede ser nulo)
     * @return El valor de la propiedad
     * @throws IllegalArgumentException si la propiedad no es compatible
     */
    @Override
    public Object getProperty(String name) throws IllegalArgumentException {
        return null;
    }

    /**
     * Consultar el conjunto de propiedades que esta fábrica admite.
     *
     * @param name El nombre de la propiedad (no puede ser nulo)
     * @return true si la propiedad es compatible y false en caso contrario
     */
    @Override
    public boolean isPropertySupported(String name) {
        return false;
    }

    /**
     * Establecer un asignador de eventos definido por el usuario para eventos.
     *
     * @param allocator el asignador definido por el usuario
     */
    @Override
    public void setEventAllocator(XMLEventAllocator allocator) {

    }

    /**
     * Obtiene el asignador utilizado por los flujos creados con esta fábrica.
     *
     * @return una instancia de {@code XMLEventAllocator}
     */
    @Override
    public XMLEventAllocator getEventAllocator() {
        return null;
    }

}
