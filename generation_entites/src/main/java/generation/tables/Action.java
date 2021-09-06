/*
 * This file is generated by jOOQ.
 */
package generation.tables;


import generation.Keys;
import generation.Public;
import generation.tables.records.ActionRecord;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Action extends TableImpl<ActionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.action</code>
     */
    public static final Action ACTION = new Action();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ActionRecord> getRecordType() {
        return ActionRecord.class;
    }

    /**
     * The column <code>public.action.commentaire</code>.
     */
    public final TableField<ActionRecord, String> COMMENTAIRE = createField(DSL.name("commentaire"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.action.date_action</code>.
     */
    public final TableField<ActionRecord, LocalDate> DATE_ACTION = createField(DSL.name("date_action"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>public.action.id_user</code>.
     */
    public final TableField<ActionRecord, Integer> ID_USER = createField(DSL.name("id_user"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.action.id</code>.
     */
    public final TableField<ActionRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    private Action(Name alias, Table<ActionRecord> aliased) {
        this(alias, aliased, null);
    }

    private Action(Name alias, Table<ActionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.action</code> table reference
     */
    public Action(String alias) {
        this(DSL.name(alias), ACTION);
    }

    /**
     * Create an aliased <code>public.action</code> table reference
     */
    public Action(Name alias) {
        this(alias, ACTION);
    }

    /**
     * Create a <code>public.action</code> table reference
     */
    public Action() {
        this(DSL.name("action"), null);
    }

    public <O extends Record> Action(Table<O> child, ForeignKey<O, ActionRecord> key) {
        super(child, key, ACTION);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public Identity<ActionRecord, Integer> getIdentity() {
        return (Identity<ActionRecord, Integer>) super.getIdentity();
    }

    @Override
    public List<ForeignKey<ActionRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ActionRecord, ?>>asList(Keys.ACTION__FK_ACTION_USER);
    }

    private transient ApplicationUser _applicationUser;

    public ApplicationUser applicationUser() {
        if (_applicationUser == null)
            _applicationUser = new ApplicationUser(this, Keys.ACTION__FK_ACTION_USER);

        return _applicationUser;
    }

    @Override
    public Action as(String alias) {
        return new Action(DSL.name(alias), this);
    }

    @Override
    public Action as(Name alias) {
        return new Action(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Action rename(String name) {
        return new Action(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Action rename(Name name) {
        return new Action(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, LocalDate, Integer, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
