import DAO.ProdutoDAO;
import Dominio.Produtos;

public class Main {
    public static void main(String[] args){

        Produtos conecta = new Produtos();
        conecta.setNomeProduto("Coca-Cola");

        new ProdutoDAO().addProduto(conecta);
    }
}
