
package de.vsa.ee.unsecure.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.vsa.ee.unsecure.client package. 
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

    private final static QName _EchoTextResponse_QNAME = new QName("http://unsecure.ee.vsa.de/", "echoTextResponse");
    private final static QName _EchoText_QNAME = new QName("http://unsecure.ee.vsa.de/", "echoText");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.vsa.ee.unsecure.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EchoText }
     * 
     */
    public EchoText createEchoText() {
        return new EchoText();
    }

    /**
     * Create an instance of {@link EchoTextResponse }
     * 
     */
    public EchoTextResponse createEchoTextResponse() {
        return new EchoTextResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EchoTextResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unsecure.ee.vsa.de/", name = "echoTextResponse")
    public JAXBElement<EchoTextResponse> createEchoTextResponse(EchoTextResponse value) {
        return new JAXBElement<EchoTextResponse>(_EchoTextResponse_QNAME, EchoTextResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EchoText }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unsecure.ee.vsa.de/", name = "echoText")
    public JAXBElement<EchoText> createEchoText(EchoText value) {
        return new JAXBElement<EchoText>(_EchoText_QNAME, EchoText.class, null, value);
    }

}
