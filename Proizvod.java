/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author student1
 */
public class Proizvod {
    private int idProizvod;
    private String naziv;
    private double cena;
    private Proizvodjac proizvodjac;

    public Proizvod() {
    }

    public Proizvod(int idProizvod, String naziv, double cena, Proizvodjac proizvodjac) {
        this.idProizvod = idProizvod;
        this.naziv = naziv;
        this.cena = cena;
        this.proizvodjac = proizvodjac;
    }

    public Proizvodjac getProizvodjac() {
        return proizvodjac;
    }

    public void setProizvodjac(Proizvodjac proizvodjac) {
        this.proizvodjac = proizvodjac;
    }

    public int getIdProizvod() {
        return idProizvod;
    }

    public void setIdProizvod(int idProizvod) {
        this.idProizvod = idProizvod;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "ID: "+idProizvod+", naziv: "+naziv+", cena: "+cena+", proizvodjac: "+proizvodjac;
    }
    
    
}
