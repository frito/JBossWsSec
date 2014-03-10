/*
 * Copyright © 2002 VSA Verrechnungsstelle der Süddeutschen Apotheken GmbH
 * Tomannweg 6,  81673 München. Alle Rechte vorbehalten.
 * Weiterverbreitung, Benutzung, Vervielfältigung oder Offenlegung,
 * auch auszugsweise, nur mit Genehmigung.
 */

package de.vsa.ee.secure;

import org.apache.cxf.ws.policy.PolicyException;
import org.apache.cxf.ws.security.SecurityConstants;
import org.junit.Test;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class TestSecure {

    @Test
    public void testEcho() throws Exception {
        QName service = EchoService.SERVICE;
        URL wsdlURL = new URL("http://localhost:8080/secure?wsdl");

        Service ses = EchoService.create(wsdlURL, service);
        Echo echoService = ses.getPort(Echo.class);

        try {
            echoService.echoText("call without security configuration!");
        } catch (Exception e) {
            assertTrue(e.getCause() instanceof PolicyException);
        }

        ((BindingProvider)echoService).getRequestContext().put(SecurityConstants.CALLBACK_HANDLER, new SecureEchoServerKeystorePasswordCallback());
        ((BindingProvider)echoService).getRequestContext().put(SecurityConstants.SIGNATURE_PROPERTIES,
                Thread.currentThread().getContextClassLoader().getResource("the-client.properties"));
        ((BindingProvider)echoService).getRequestContext().put(SecurityConstants.ENCRYPT_PROPERTIES,
                Thread.currentThread().getContextClassLoader().getResource("the-client.properties"));
        ((BindingProvider)echoService).getRequestContext().put(SecurityConstants.SIGNATURE_USERNAME, "theclient");
        ((BindingProvider)echoService).getRequestContext().put(SecurityConstants.ENCRYPT_USERNAME, "theserver");

        assertEquals("buh", echoService.echoText("buh"));
    }

}
