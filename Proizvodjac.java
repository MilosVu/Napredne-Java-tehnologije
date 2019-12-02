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
public class Proizvodjac {
    private int idProizvodjac;
    private String naziv;

    public Proizvodjac() {
    }

    public Proizvodjac(int idProizvodjac, String naziv) {
        this.idProizvodjac = idProizvodjac;
        this.naziv = naziv;
    }

    public int getIdProizvodjac() {
        return idProizvodjac;
    }

    public void setIdProizvodjac(int idProizvodjac) {
        this.idProizvodjac = idProizvodjac;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return "ID: "+idProizvodjac+", naziv: "+naziv;
    }
    
    
}
