/*
 * This file is generated by jOOQ.
 */
package generation.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Livre implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String  nom;
    private String  langue;
    private Integer idAuteur;
    private Integer idProfile;

    public Livre() {}

    public Livre(Livre value) {
        this.id = value.id;
        this.nom = value.nom;
        this.langue = value.langue;
        this.idAuteur = value.idAuteur;
        this.idProfile = value.idProfile;
    }

    public Livre(
        Integer id,
        String  nom,
        String  langue,
        Integer idAuteur,
        Integer idProfile
    ) {
        this.id = id;
        this.nom = nom;
        this.langue = langue;
        this.idAuteur = idAuteur;
        this.idProfile = idProfile;
    }

    /**
     * Getter for <code>PUBLIC.LIVRE.ID</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>PUBLIC.LIVRE.ID</code>.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>PUBLIC.LIVRE.NOM</code>.
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Setter for <code>PUBLIC.LIVRE.NOM</code>.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter for <code>PUBLIC.LIVRE.LANGUE</code>.
     */
    public String getLangue() {
        return this.langue;
    }

    /**
     * Setter for <code>PUBLIC.LIVRE.LANGUE</code>.
     */
    public void setLangue(String langue) {
        this.langue = langue;
    }

    /**
     * Getter for <code>PUBLIC.LIVRE.ID_AUTEUR</code>.
     */
    public Integer getIdAuteur() {
        return this.idAuteur;
    }

    /**
     * Setter for <code>PUBLIC.LIVRE.ID_AUTEUR</code>.
     */
    public void setIdAuteur(Integer idAuteur) {
        this.idAuteur = idAuteur;
    }

    /**
     * Getter for <code>PUBLIC.LIVRE.ID_PROFILE</code>.
     */
    public Integer getIdProfile() {
        return this.idProfile;
    }

    /**
     * Setter for <code>PUBLIC.LIVRE.ID_PROFILE</code>.
     */
    public void setIdProfile(Integer idProfile) {
        this.idProfile = idProfile;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Livre (");

        sb.append(id);
        sb.append(", ").append(nom);
        sb.append(", ").append(langue);
        sb.append(", ").append(idAuteur);
        sb.append(", ").append(idProfile);

        sb.append(")");
        return sb.toString();
    }
}
