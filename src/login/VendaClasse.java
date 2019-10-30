/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.util.ArrayList;

/**
 *
 * @author 30133
 */
public class VendaClasse {

    String data;
    int id;
    int total;
    String cliente;
    ArrayList<ProdutosC> produtos;
    
    public void gravaVenda() {
        new Conecta().executaComando(
        "INSERT INTO venda (data_venda, total) VALUES "
        + "('"+ data +"',"+ total +")"); 

        int idVenda = new Conecta().buscaIdVendaCadastrada();
        
        for(ProdutosC p : produtos){
            new Conecta().executaComando(
            "INSERT INTO itemvenda (venda_cod, produto_cod, quantidade_itemvenda, valor_itemvenda) VALUES "
            + "("+ idVenda +", "+p.idp+","+p.quantidade+","+p.preco+")"); 
            
            //Diminui 1 unidade da quantidade (controle de estoque)
            new Conecta().executaComando(
            "UPDATE produtos SET quantidade = quantidade -1 WHERE idproduto = "+p.idp);
        }
    }
    
    @Override
    public String toString() {
        return "Id: "+id+" | Data: "+data+""+ " | Total R$: "+total+"";
    }
    }

