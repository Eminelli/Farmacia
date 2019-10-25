/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 30133
 */
public class CadastroS {
    
    String nomec;
    String rg;
    String datac;
    String cpf;
    String sexo;
    String email;
    String ano;
    String dia;
    String mes;
    int idc;

    @Override
    public String toString() {
        return nomec;
    }
     
    public void gravac(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/farmacia?useTimezone=true&serverTimezone=UTC","root","");  

            Statement stmt = con.createStatement();
            stmt.execute("INSERT INTO cadastro (nomec,rg,datac,cpf,sexo,email) VALUES ('"+nomec+"','"+rg+"','"+datac+"','"+cpf+"','"+sexo+"','"+email+"')");
                    }catch(Exception e){

            System.out.println(e);
        }
    
    }
    public void excluic(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/farmacia?useTimezone=true&serverTimezone=UTC","root","");  

            Statement stmt = con.createStatement();
            stmt.execute("DELETE FROM cadastro WHERE idcadastro="+idc);
                    }catch(Exception e){

            System.out.println(e);
        }
    }
    
    public ArrayList<CadastroS> listaClientes(){
        try{
            
            ArrayList<CadastroS> clientes = new ArrayList<>();
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/farmacia?useTimezone=true&serverTimezone=UTC","root","");  

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM cadastro");
            
            while(rs.next()){
                CadastroS cliente = new CadastroS();
                cliente.nomec = rs.getString("nomec");
                cliente.cpf = rs.getString("cpf");
                cliente.idc = rs.getInt("idcadastro");
                cliente.datac = rs.getString("datac");
                cliente.sexo = rs.getString("sexo");
                cliente.email = rs.getString("email");
                
                clientes.add(cliente);
            }
            
            return clientes;
         }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}
