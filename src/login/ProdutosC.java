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
public class ProdutosC {
    String nomep;
    int quantidade;
    String validade;
   int preco;
    String descricao;
    int idp;
    String dia;
    String mes;
    String ano;
    
     @Override
    public String toString() {
        return "Medicamento : "+nomep+" | R$ : "+preco+" | Quantidade : "+quantidade+" | Id : "+idp+" | ";
    }
    
    public void gravap(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/farmacia?useTimezone=true&serverTimezone=UTC","root","");  

            Statement stmt = con.createStatement();
            stmt.execute("INSERT INTO produtos (nomep,quantidade,validade,preco,imagem) VALUES ('"+nomep+"','"+quantidade+"','"+validade+"','"+preco+"','"+descricao+"')");
                    }catch(Exception e){

            System.out.println(e);
        }
    }
    public void excluip(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/farmacia?useTimezone=true&serverTimezone=UTC","root","");  

            Statement stmt = con.createStatement();
            stmt.execute("DELETE FROM produtos WHERE idproduto="+idp);
                    }catch(Exception e){

            System.out.println(e);
        }
    }
    public ArrayList<ProdutosC> executaSelectProdutos(String comando) {
        ArrayList<ProdutosC> produtos = new ArrayList<>();
        try{
            
            
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/farmacia?useTimezone=true&serverTimezone=UTC","root","");  

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(comando);
            
            while(rs.next()){
                ProdutosC produto = new ProdutosC();
                produto.nomep = rs.getString("nomep");
                produto.preco = rs.getInt("preco");
                produto.descricao = rs.getString("imagem");
                produto.quantidade = rs.getInt("quantidade");
                produto.validade = rs.getString("validade");
                produto.idp = rs.getInt("idproduto");               
                produtos.add(produto);
            }
            
            return produtos;
         }catch(Exception e){
            System.out.println(e);
            return null;
        }
     
    
    }
}
