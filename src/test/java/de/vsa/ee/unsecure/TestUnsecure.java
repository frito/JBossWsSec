/*
 * Copyright © 2002 VSA Verrechnungsstelle der Süddeutschen Apotheken GmbH
 * Tomannweg 6,  81673 München. Alle Rechte vorbehalten.
 * Weiterverbreitung, Benutzung, Vervielfältigung oder Offenlegung,
 * auch auszugsweise, nur mit Genehmigung.
 */

package de.vsa.ee.unsecure;

import de.vsa.ee.unsecure.client.UnsecureEchoService;
import org.junit.Ignore;
import org.junit.Test;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

import static org.junit.Assert.assertEquals;

/**
 * Kurzer Satz der die Klasse beschreibt.
 * <p/>
 * Detailierte Beschreibung der Klasse
 * <p/>
 * <h3>Extra-Info</h3>
 *
 * @author zeitler
 * @since v1.0
 */
public class TestUnsecure {

    @Test
    public void testEcho() throws Exception {
        QName service = UnsecureEchoService.SERVICE;
        QName servicePort = UnsecureEchoService.UnsecureEchoPort;

        URL wsdlURL = UnsecureEchoService.WSDL_LOCATION;

        Service ess = UnsecureEchoService.create(wsdlURL, service);
        de.vsa.ee.unsecure.client.UnsecureEcho echoService = ess.getPort(de.vsa.ee.unsecure.client.UnsecureEcho.class);
        assertEquals("buh", echoService.echoText("buh"));
    }

}
