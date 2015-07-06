
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
    private final static QName _ValidarCIResponse_QNAME = new QName("http://soa.esfot/", "validarCIResponse");
    private final static QName _ProvinciaResponse_QNAME = new QName("http://soa.esfot/", "provinciaResponse");
    private final static QName _Hello_QNAME = new QName("http://soa.esfot/", "hello");
    private final static QName _ValidarCI_QNAME = new QName("http://soa.esfot/", "validarCI");
    private final static QName _Provincia_QNAME = new QName("http://soa.esfot/", "provincia");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: esfot.soa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidarCI }
     * 
     */
    public ValidarCI createValidarCI() {
        return new ValidarCI();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link ValidarCIResponse }
     * 
     */
    public ValidarCIResponse createValidarCIResponse() {
        return new ValidarCIResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link ProvinciaResponse }
     * 
     */
    public ProvinciaResponse createProvinciaResponse() {
        return new ProvinciaResponse();
    }

    /**
     * Create an instance of {@link Provincia }
     * 
     */
    public Provincia createProvincia() {
        return new Provincia();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarCIResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.esfot/", name = "validarCIResponse")
    public JAXBElement<ValidarCIResponse> createValidarCIResponse(ValidarCIResponse value) {
        return new JAXBElement<ValidarCIResponse>(_ValidarCIResponse_QNAME, ValidarCIResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProvinciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.esfot/", name = "provinciaResponse")
    public JAXBElement<ProvinciaResponse> createProvinciaResponse(ProvinciaResponse value) {
        return new JAXBElement<ProvinciaResponse>(_ProvinciaResponse_QNAME, ProvinciaResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarCI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.esfot/", name = "validarCI")
    public JAXBElement<ValidarCI> createValidarCI(ValidarCI value) {
        return new JAXBElement<ValidarCI>(_ValidarCI_QNAME, ValidarCI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Provincia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.esfot/", name = "provincia")
    public JAXBElement<Provincia> createProvincia(Provincia value) {
        return new JAXBElement<Provincia>(_Provincia_QNAME, Provincia.class, null, value);
    }

}
