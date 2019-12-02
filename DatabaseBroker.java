/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author student1
 */
public class DatabaseBroker {
    private Connection connection;
    
    //parametrizovati iz konfiguracionog fajla, da bude fleksibilno!!!
    public void uspostaviKonekciju() throws ClassNotFoundException, SQLException{
        
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/NJTJDBC";
        String user="root";
        String password="";
        
        connection=DriverManager.getConnection(url, user, password);
        System.out.println("Uspesna konekcija!");
        
    }
    
    public void raskiniKonekciju() throws SQLException{
        connection.close();
    }
    
    //zdr: CRUD operacije nad objektima Proizvod i Proizvodjac
    
    
    public ArrayList<String> vratiTabele() throws SQLException{
        ArrayList<String> tabele=new ArrayList<>();
        DatabaseMetaData metaData=connection.getMetaData();
        ResultSet rs=metaData.getTables(null, null, null, null);
        while(rs.next()){
            String tabela=rs.getString(3);
            tabele.add(tabela);
        }
        rs.close();
        return tabele;
    }
    
    public void prikaziAtribute(String tabela) throws SQLException{
        //ArrayList<String> atributi=new ArrayList<>();
        DatabaseMetaData metaData=connection.getMetaData();
        ResultSet rs=metaData.getColumns(connection.getCatalog(), connection.getSchema(), tabela, null);
        while(rs.next()){
            String naziv=rs.getString(4);
            String tip=rs.getString(6);
            String autoIncrement=rs.getString(23);
            System.out.println("naziv: "+naziv+", tip: "+tip+", autoIncrement: "+autoIncrement);
        }
        rs.close();
        
    }
}
