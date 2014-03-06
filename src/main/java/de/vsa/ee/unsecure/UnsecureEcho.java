/*
 * Copyright © 2002 VSA Verrechnungsstelle der Süddeutschen Apotheken GmbH
 * Tomannweg 6,  81673 München. Alle Rechte vorbehalten.
 * Weiterverbreitung, Benutzung, Vervielfältigung oder Offenlegung,
 * auch auszugsweise, nur mit Genehmigung.
 */

package de.vsa.ee.unsecure;

import de.vsa.ee.logic.Echo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

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
@WebService
public class UnsecureEcho implements Echo {

    @WebMethod
    public String echoText(@WebParam(name="text") String text) {
        return text;
    }
}
