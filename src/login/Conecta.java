/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author 30133
 */
public class Conecta {

       
  public void executaComando (String comando){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/farmacia?useTimezone=true&serverTimezone=UTC","root","");
            
            Statement stmt= (Statement) con.createStatement();
            
            stmt.execute(comando);            con.close();

            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
  
    public boolean checaSenha(String user, String senha){
        boolean valida = false;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/farmacia?useTimezone=true&serverTimezone=UTC","root","");  

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM login WHERE usuario = '"+user+"' AND senha = '"+senha+"'");
            
            while(rs.next()){
                valida = true;
            }
        }catch(Exception e){
            System.out.println(e);     
        }
        
        return valida;
    }
  
    public static void main(String[] args) {
        
        ArrayList<LoginS> Login = new ArrayList<LoginS>();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/farmacia?useTimezone=true&serverTimezone=UTC","root","");  

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM login");
            
            while(rs.next()){
                
                LoginS l = new LoginS();
                l.usuario = rs.getString("usuario");
                l.senha= rs.getInt("senha");
                              
                
                Login.add(l);
            }

        }catch(Exception e){
            System.out.println(e);
       
            
        } 
    }
        
        public ArrayList<VendaClasse> executaSelectVenda(String comando){
            ArrayList<VendaClasse> vendas = new ArrayList<>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/farmacia?useTimezone=true&serverTimezone=UTC",
                    "root","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(comando);
            
            while(rs.next()){
                VendaClasse v = new VendaClasse();
                v.data = rs.getString("data");
                v.total = Integer.parseInt(rs.getString("total"));
                v.id = Integer.parseInt(rs.getString("id"));
                vendas.add(v);
            }
            con.close();  
        }
        catch(Exception e){
            System.out.println(e);  
        }
        return vendas;
    } 
        
        public int buscaIdVendaCadastrada(){
            int id = 0;
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/farmacia?useTimezone=true&serverTimezone=UTC",
                        "root","");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT MAX(cod_venda) as id FROM venda");

                while(rs.next()){
                    id = Integer.parseInt(rs.getString("id"));
                }
                con.close();  
            }
            catch(Exception e){
                System.out.println(e);  
            }
            return id;
    } 
}


   




