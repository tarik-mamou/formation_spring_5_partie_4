/*
 * This file is generated by jOOQ.
 */
package generation;


import generation.tables.Auteur;
import generation.tables.Livre;
import generation.tables.Profil;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>PUBLIC</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>PUBLIC.AUTEUR</code>.
     */
    public final Auteur AUTEUR = Auteur.AUTEUR;

    /**
     * The table <code>PUBLIC.LIVRE</code>.
     */
    public final Livre LIVRE = Livre.LIVRE;

    /**
     * The table <code>PUBLIC.PROFIL</code>.
     */
    public final Profil PROFIL = Profil.PROFIL;

    /**
     * No further instances allowed
     */
    private Public() {
        super("PUBLIC", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Auteur.AUTEUR,
            Livre.LIVRE,
            Profil.PROFIL);
    }
}
