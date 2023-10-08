package Dominio;
import java.math.BigDecimal;
import java.util.Date;

public class Produtos {
    private int idProduto;
    private String nomeProduto;
    private int quantidadeProduto;
    private String categoriaProduto;
    private BigDecimal precoUnitario;
    private BigDecimal precoTotal;
    private String fornecedor;
    private Date dataChegada; 

    public Produtos(){}

    public int getIdProduto(){

        return idProduto;
    }
    public void setIdProduto(int idProduto){

        this.idProduto = idProduto;
    }
    public String getNomeProduto(){
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }
    public int getQuantidadeProduto(){
        return quantidadeProduto;
    }
    public void setQuantidadeProduto( int quantidadeProduto){
        this.quantidadeProduto = quantidadeProduto;
    }

     public String getCategoriaProduto(){
        return categoriaProduto;
    }
    public void setCategoriaProduto( String categoriaProduto){
        this.categoriaProduto = categoriaProduto;
    }
    public BigDecimal getPrecoUnitario(){

        return precoUnitario;
    }
    public void setPrecoUnitario(BigDecimal precoUnitario){

        this.precoUnitario = precoUnitario;
    }
    public BigDecimal getPrecoTotal(){

        return precoTotal;
    }
    public void setPrecoToral(BigDecimal precoTotal){

        this.precoTotal = precoTotal;
    }
    public String getFornecedor(){

        return fornecedor;
    }
    public void setFornecedor(String forncedor){
        this.fornecedor = forncedor;
    }
    public Date getDataChegada(){

        return dataChegada;
    }
    public void setDataChegada(Date dataChegada){

        this.dataChegada = dataChegada;
    }
}
