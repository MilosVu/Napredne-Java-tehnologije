/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import db.DatabaseBroker;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author student1
 */
public class Glavna {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        DatabaseBroker dbbr=new DatabaseBroker();
        dbbr.uspostaviKonekciju();
        ArrayList<String> tabele=dbbr.vratiTabele();
        for (String tabela : tabele) {
            System.out.println("Tabela: "+tabela);
            dbbr.prikaziAtribute(tabela);
        }
        dbbr.raskiniKonekciju();
    }
}
