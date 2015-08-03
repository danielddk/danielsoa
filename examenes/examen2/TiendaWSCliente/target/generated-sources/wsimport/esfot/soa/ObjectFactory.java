
package esfot.soa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the esfot.soa package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HelloResponse_QNAME = new QName("http://soa.esfot/", "helloResponse");
    private final static QName _Hello_QNAME = new QName("http://soa.esfot/", "hello");
    private final static QName _BuscaDirectorResponse_QNAME = new QName("http://soa.esfot/", "buscaDirectorResponse");
    private final static QName _BuscaDirector_QNAME = new QName("http://soa.esfot/", "buscaDirector");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: esfot.soa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link BuscaDirector }
     * 
     */
    public BuscaDirector createBuscaDirector() {
        return new BuscaDirector();
    }

    /**
     * Create an instance of {@link BuscaDirectorResponse }
     * 
     */
    public BuscaDirectorResponse createBuscaDirectorResponse() {
        return new BuscaDirectorResponse();
    }

    /**
     * Create an instance of {@link PeliculaTO }
     * 
     */
    public PeliculaTO createPeliculaTO() {
        return new PeliculaTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.esfot/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.esfot/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaDirectorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.esfot/", name = "buscaDirectorResponse")
    public JAXBElement<BuscaDirectorResponse> createBuscaDirectorResponse(BuscaDirectorResponse value) {
        return new JAXBElement<BuscaDirectorResponse>(_BuscaDirectorResponse_QNAME, BuscaDirectorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscaDirector }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.esfot/", name = "buscaDirector")
    public JAXBElement<BuscaDirector> createBuscaDirector(BuscaDirector value) {
        return new JAXBElement<BuscaDirector>(_BuscaDirector_QNAME, BuscaDirector.class, null, value);
    }

}
