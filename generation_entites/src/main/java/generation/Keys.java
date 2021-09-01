/*
 * This file is generated by jOOQ.
 */
package generation;


import generation.tables.Auteur;
import generation.tables.Livre;
import generation.tables.Profil;
import generation.tables.records.AuteurRecord;
import generation.tables.records.LivreRecord;
import generation.tables.records.ProfilRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in 
 * PUBLIC.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AuteurRecord> CONSTRAINT_7 = Internal.createUniqueKey(Auteur.AUTEUR, DSL.name("CONSTRAINT_7"), new TableField[] { Auteur.AUTEUR.ID }, true);
    public static final UniqueKey<LivreRecord> CONSTRAINT_4 = Internal.createUniqueKey(Livre.LIVRE, DSL.name("CONSTRAINT_4"), new TableField[] { Livre.LIVRE.ID }, true);
    public static final UniqueKey<ProfilRecord> CONSTRAINT_8 = Internal.createUniqueKey(Profil.PROFIL, DSL.name("CONSTRAINT_8"), new TableField[] { Profil.PROFIL.ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<LivreRecord, AuteurRecord> FK_LIVRE_AUTEUR = Internal.createForeignKey(Livre.LIVRE, DSL.name("FK_LIVRE_AUTEUR"), new TableField[] { Livre.LIVRE.ID_AUTEUR }, Keys.CONSTRAINT_7, new TableField[] { Auteur.AUTEUR.ID }, true);
    public static final ForeignKey<LivreRecord, ProfilRecord> FK_LIVRE_PROFILE = Internal.createForeignKey(Livre.LIVRE, DSL.name("FK_LIVRE_PROFILE"), new TableField[] { Livre.LIVRE.ID_PROFILE }, Keys.CONSTRAINT_8, new TableField[] { Profil.PROFIL.ID }, true);
}