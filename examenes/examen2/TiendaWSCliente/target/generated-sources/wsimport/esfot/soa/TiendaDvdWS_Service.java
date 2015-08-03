
package esfot.soa;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TiendaDvdWS", targetNamespace = "http://soa.esfot/", wsdlLocation = "http://localhost:8080/TiendaWS/TiendaDvdWS?wsdl")
public class TiendaDvdWS_Service
    extends Service
{

    private final static URL TIENDADVDWS_WSDL_LOCATION;
    private final static WebServiceException TIENDADVDWS_EXCEPTION;
    private final static QName TIENDADVDWS_QNAME = new QName("http://soa.esfot/", "TiendaDvdWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/TiendaWS/TiendaDvdWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TIENDADVDWS_WSDL_LOCATION = url;
        TIENDADVDWS_EXCEPTION = e;
    }

    public TiendaDvdWS_Service() {
        super(__getWsdlLocation(), TIENDADVDWS_QNAME);
    }

    public TiendaDvdWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), TIENDADVDWS_QNAME, features);
    }

    public TiendaDvdWS_Service(URL wsdlLocation) {
        super(wsdlLocation, TIENDADVDWS_QNAME);
    }

    public TiendaDvdWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TIENDADVDWS_QNAME, features);
    }

    public TiendaDvdWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TiendaDvdWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TiendaDvdWS
     */
    @WebEndpoint(name = "TiendaDvdWSPort")
    public TiendaDvdWS getTiendaDvdWSPort() {
        return super.getPort(new QName("http://soa.esfot/", "TiendaDvdWSPort"), TiendaDvdWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TiendaDvdWS
     */
    @WebEndpoint(name = "TiendaDvdWSPort")
    public TiendaDvdWS getTiendaDvdWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soa.esfot/", "TiendaDvdWSPort"), TiendaDvdWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TIENDADVDWS_EXCEPTION!= null) {
            throw TIENDADVDWS_EXCEPTION;
        }
        return TIENDADVDWS_WSDL_LOCATION;
    }

}
