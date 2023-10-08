package DAO;
import Dominio.Produtos;
import Conexao.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ProdutoDAO {
    private final Conexao conect;

    public ProdutoDAO(){
        this.conect = new ConectMysql();
    }

    public void addProduto(Produtos produtos){
        try{
            String sql = "INSERT INTO produtos (nomeProduto, quantidadeProduto, categoriaProduto, precoUnitario, precoTotal, fornecedor) VALUE (?,?,?,?,?,?)";
            PreparedStatement ps = conect.obterConexao().prepareStatement(sql);
            ps.setString(1, produtos.getNomeProduto());
            ps.setInt(2, produtos.getQuantidadeProduto());
            ps.setString(3, produtos.getCategoriaProduto());
            ps.setBigDecimal(4, produtos.getPrecoUnitario());
            ps.setBigDecimal(5, produtos.getPrecoTotal());
            //ps.setDate(6, produtos.getDataChegada());

            ps.execute();
            ps.close();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
