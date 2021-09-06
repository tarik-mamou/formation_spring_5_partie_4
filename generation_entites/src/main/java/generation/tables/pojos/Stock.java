/*
 * This file is generated by jOOQ.
 */
package generation.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Stock implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private Integer nombre;

    public Stock() {}

    public Stock(Stock value) {
        this.id = value.id;
        this.nombre = value.nombre;
    }

    public Stock(
        Integer id,
        Integer nombre
    ) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * Getter for <code>public.stock.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>public.stock.id</code>.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>public.stock.nombre</code>.
     */
    public Integer getNombre() {
        return this.nombre;
    }

    /**
     * Setter for <code>public.stock.nombre</code>.
     */
    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Stock (");

        sb.append(id);
        sb.append(", ").append(nombre);

        sb.append(")");
        return sb.toString();
    }
}