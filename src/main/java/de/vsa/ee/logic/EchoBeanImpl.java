/*
 * Copyright © 2002 VSA Verrechnungsstelle der Süddeutschen Apotheken GmbH
 * Tomannweg 6,  81673 München. Alle Rechte vorbehalten.
 * Weiterverbreitung, Benutzung, Vervielfältigung oder Offenlegung,
 * auch auszugsweise, nur mit Genehmigung.
 */

package de.vsa.ee.logic;

import org.jboss.logging.Logger;

import javax.ejb.Remote;
import javax.ejb.Stateless;


@Stateless
@Remote(Echo.class)
public class EchoBeanImpl implements Echo {

    private static Logger LOG = Logger.getLogger(EchoBeanImpl.class);

    @Override
    public String echoText(String text) {
        LOG.info("echoText: text=" + text);
        return text;
    }

}
