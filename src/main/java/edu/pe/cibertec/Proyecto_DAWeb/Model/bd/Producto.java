package edu.pe.cibertec.Proyecto_DAWeb.Model.bd;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

@Entity
@Table(name="producto")
@AllArgsConstructor
public class Producto {
    @Id
    @Column(name="idproducto")
   private Integer idprod;
    @Column(name="idtipopro")
    private Integer tipo;
    @Column(name="idproveedor")
    private Integer idprovedor;
    @Column(name="nombre")
    private String nombre;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name="preciopublico")
    private Double precio;
    @Column(name = "stockminimo")
    private  Integer stockmin;
    @Column(name = "stockmaximo")
    private  Integer stockmax;
    @Column(name="estado")
    private Byte estado;
    @Column(name = "idanimal")
    private Integer idanimal;
    @Column(name = "precioproveedor")
    private  Integer precprov;
}
