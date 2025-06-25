package com.example.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Arbol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreComun;
    private String tipoFlor;
    private String durezaMadera;
    private double alturaPromedio;
    private String imagenRuta;

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombreComun() { return nombreComun; }
    public void setNombreComun(String nombreComun) { this.nombreComun = nombreComun; }
    public String getTipoFlor() { return tipoFlor; }
    public void setTipoFlor(String tipoFlor) { this.tipoFlor = tipoFlor; }
    public String getDurezaMadera() { return durezaMadera; }
    public void setDurezaMadera(String durezaMadera) { this.durezaMadera = durezaMadera; }
    public double getAlturaPromedio() { return alturaPromedio; }
    public void setAlturaPromedio(double alturaPromedio) { this.alturaPromedio = alturaPromedio; }
    public String getImagenRuta() { return imagenRuta; }
    public void setImagenRuta(String imagenRuta) { this.imagenRuta = imagenRuta; }
}