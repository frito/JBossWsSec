/*
 * Copyright © 2002 VSA Verrechnungsstelle der Süddeutschen Apotheken GmbH
 * Tomannweg 6,  81673 München. Alle Rechte vorbehalten.
 * Weiterverbreitung, Benutzung, Vervielfältigung oder Offenlegung,
 * auch auszugsweise, nur mit Genehmigung.
 */

package de.vsa.ee.logic;

import org.junit.Test;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Hashtable;

import static org.junit.Assert.assertEquals;


public class TestEJB {

    @Test
    public void testEchoCall() throws Exception {
        Hashtable<String, String> props = new Hashtable<String, String>();
        props.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
        Context jndiContext = new InitialContext(props);
        Echo bean =  (Echo) jndiContext.lookup("ejb:/unsecure/EchoBeanImpl!de.vsa.ee.logic.Echo");
        assertEquals("hello", bean.echoText("hello"));
    }

}
