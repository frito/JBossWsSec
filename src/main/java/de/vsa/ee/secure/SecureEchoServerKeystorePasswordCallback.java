/*
 * Copyright © 2002 VSA Verrechnungsstelle der Süddeutschen Apotheken GmbH
 * Tomannweg 6,  81673 München. Alle Rechte vorbehalten.
 * Weiterverbreitung, Benutzung, Vervielfältigung oder Offenlegung,
 * auch auszugsweise, nur mit Genehmigung.
 */

package de.vsa.ee.secure;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;

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
public class SecureEchoServerKeystorePasswordCallback implements CallbackHandler {

    @Override
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        throw new RuntimeException("n.y.i.");
    }

}
