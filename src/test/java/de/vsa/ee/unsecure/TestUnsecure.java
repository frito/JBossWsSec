/*
 * Copyright © 2002 VSA Verrechnungsstelle der Süddeutschen Apotheken GmbH
 * Tomannweg 6,  81673 München. Alle Rechte vorbehalten.
 * Weiterverbreitung, Benutzung, Vervielfältigung oder Offenlegung,
 * auch auszugsweise, nur mit Genehmigung.
 */

package de.vsa.ee.unsecure;

import org.junit.Test;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

import static org.junit.Assert.assertEquals;


public class TestUnsecure {

    @Test
    public void testEcho() throws Exception {
        QName service = EchoService.SERVICE;
        URL wsdlURL = new URL("http://localhost:8080/unsecure?wsdl");

        Service ess = EchoService.create(wsdlURL, service);
        Echo echoService = ess.getPort(Echo.class);
        assertEquals("bla", echoService.echoText("bla"));
    }

}
