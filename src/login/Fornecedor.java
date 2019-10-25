/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author 30133
 */
public class Fornecedor {
    int IdF;
    String NomeF;
    String cpf;
    
        public void gravaf(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/farmacia?useTimezone=true&serverTimezone=UTC","root","");  

            Statement stmt = con.createStatement();
            stmt.execute("INSERT INTO fornecedor (nomef,cpf) VALUES ('"+NomeF+"','"+cpf+"'')");
                    }catch(Exception e){

            System.out.println(e);
        }
    
    }
    public void excluif(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/farmacia?useTimezone=true&serverTimezone=UTC","root","");  

            Statement stmt = con.createStatement();
            stmt.execute("DELETE FROM cadastro WHERE idcadastro="+IdF);
                    }catch(Exception e){

            System.out.println(e);
        }
    }
            
}
