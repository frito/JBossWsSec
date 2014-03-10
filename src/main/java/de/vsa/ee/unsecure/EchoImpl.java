/*
 * Copyright © 2002 VSA Verrechnungsstelle der Süddeutschen Apotheken GmbH
 * Tomannweg 6,  81673 München. Alle Rechte vorbehalten.
 * Weiterverbreitung, Benutzung, Vervielfältigung oder Offenlegung,
 * auch auszugsweise, nur mit Genehmigung.
 */

package de.vsa.ee.unsecure;

import javax.ejb.EJB;
import javax.jws.WebService;


@WebService(
        portName = "EchoServicePort",
        serviceName = "EchoService",
        wsdlLocation = "WEB-INF/wsdl/EchoService.wsdl",
        targetNamespace = "http://echo.ee.vsa.de/",
        endpointInterface = "de.vsa.ee.unsecure.Echo"
)
public class EchoImpl implements Echo {

    @EJB
    private de.vsa.ee.logic.Echo echo;

    @Override
    public String echoText(String text) {
        return echo.echoText(text);
    }

}
