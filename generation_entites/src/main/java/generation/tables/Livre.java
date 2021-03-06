/*
 * This file is generated by jOOQ.
 */
package generation.tables;


import generation.Keys;
import generation.Public;
import generation.tables.records.LivreRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Livre extends TableImpl<LivreRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>PUBLIC.LIVRE</code>
     */
    public static final Livre LIVRE = new Livre();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LivreRecord> getRecordType() {
        return LivreRecord.class;
    }

    /**
     * The column <code>PUBLIC.LIVRE.ID</code>.
     */
    public final TableField<LivreRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.LIVRE.NOM</code>.
     */
    public final TableField<LivreRecord, String> NOM = createField(DSL.name("NOM"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.LIVRE.LANGUE</code>.
     */
    public final TableField<LivreRecord, String> LANGUE = createField(DSL.name("LANGUE"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>PUBLIC.LIVRE.ID_AUTEUR</code>.
     */
    public final TableField<LivreRecord, Integer> ID_AUTEUR = createField(DSL.name("ID_AUTEUR"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.LIVRE.ID_PROFILE</code>.
     */
    public final TableField<LivreRecord, Integer> ID_PROFILE = createField(DSL.name("ID_PROFILE"), SQLDataType.INTEGER.nullable(false), this, "");

    private Livre(Name alias, Table<LivreRecord> aliased) {
        this(alias, aliased, null);
    }

    private Livre(Name alias, Table<LivreRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>PUBLIC.LIVRE</code> table reference
     */
    public Livre(String alias) {
        this(DSL.name(alias), LIVRE);
    }

    /**
     * Create an aliased <code>PUBLIC.LIVRE</code> table reference
     */
    public Livre(Name alias) {
        this(alias, LIVRE);
    }

    /**
     * Create a <code>PUBLIC.LIVRE</code> table reference
     */
    public Livre() {
        this(DSL.name("LIVRE"), null);
    }

    public <O extends Record> Livre(Table<O> child, ForeignKey<O, LivreRecord> key) {
        super(child, key, LIVRE);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<LivreRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_4;
    }

    @Override
    public List<UniqueKey<LivreRecord>> getKeys() {
        return Arrays.<UniqueKey<LivreRecord>>asList(Keys.CONSTRAINT_4);
    }

    @Override
    public List<ForeignKey<LivreRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<LivreRecord, ?>>asList(Keys.FK_LIVRE_AUTEUR, Keys.FK_LIVRE_PROFILE);
    }

    private transient Auteur _auteur;
    private transient Profil _profil;

    public Auteur auteur() {
        if (_auteur == null)
            _auteur = new Auteur(this, Keys.FK_LIVRE_AUTEUR);

        return _auteur;
    }

    public Profil profil() {
        if (_profil == null)
            _profil = new Profil(this, Keys.FK_LIVRE_PROFILE);

        return _profil;
    }

    @Override
    public Livre as(String alias) {
        return new Livre(DSL.name(alias), this);
    }

    @Override
    public Livre as(Name alias) {
        return new Livre(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Livre rename(String name) {
        return new Livre(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Livre rename(Name name) {
        return new Livre(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, String, Integer, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
