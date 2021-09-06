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
    private Integer idProfil;
    private Integer idStock;
    private Integer prix;

    public Livre() {}

    public Livre(Livre value) {
        this.id = value.id;
        this.nom = value.nom;
        this.langue = value.langue;
        this.idAuteur = value.idAuteur;
        this.idProfil = value.idProfil;
        this.idStock = value.idStock;
        this.prix = value.prix;
    }

    public Livre(
        Integer id,
        String  nom,
        String  langue,
        Integer idAuteur,
        Integer idProfil,
        Integer idStock,
        Integer prix
    ) {
        this.id = id;
        this.nom = nom;
        this.langue = langue;
        this.idAuteur = idAuteur;
        this.idProfil = idProfil;
        this.idStock = idStock;
        this.prix = prix;
    }

    /**
     * Getter for <code>public.livre.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>public.livre.id</code>.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>public.livre.nom</code>.
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Setter for <code>public.livre.nom</code>.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter for <code>public.livre.langue</code>.
     */
    public String getLangue() {
        return this.langue;
    }

    /**
     * Setter for <code>public.livre.langue</code>.
     */
    public void setLangue(String langue) {
        this.langue = langue;
    }

    /**
     * Getter for <code>public.livre.id_auteur</code>.
     */
    public Integer getIdAuteur() {
        return this.idAuteur;
    }

    /**
     * Setter for <code>public.livre.id_auteur</code>.
     */
    public void setIdAuteur(Integer idAuteur) {
        this.idAuteur = idAuteur;
    }

    /**
     * Getter for <code>public.livre.id_profil</code>.
     */
    public Integer getIdProfil() {
        return this.idProfil;
    }

    /**
     * Setter for <code>public.livre.id_profil</code>.
     */
    public void setIdProfil(Integer idProfil) {
        this.idProfil = idProfil;
    }

    /**
     * Getter for <code>public.livre.id_stock</code>.
     */
    public Integer getIdStock() {
        return this.idStock;
    }

    /**
     * Setter for <code>public.livre.id_stock</code>.
     */
    public void setIdStock(Integer idStock) {
        this.idStock = idStock;
    }

    /**
     * Getter for <code>public.livre.prix</code>.
     */
    public Integer getPrix() {
        return this.prix;
    }

    /**
     * Setter for <code>public.livre.prix</code>.
     */
    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Livre (");

        sb.append(id);
        sb.append(", ").append(nom);
        sb.append(", ").append(langue);
        sb.append(", ").append(idAuteur);
        sb.append(", ").append(idProfil);
        sb.append(", ").append(idStock);
        sb.append(", ").append(prix);

        sb.append(")");
        return sb.toString();
    }
}
