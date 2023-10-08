package Tela;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;

public class View extends JFrame{

    private JLabel lbnome;
    private JTextField txtnome;
    private JLabel lbquantProd;
    private JTextField txtQuantProd;
    private JLabel lbcatProd;
    private JTextField txtCatProd;
    private JLabel lbprecUni;
    private JTextField txtPrecUni;
    private JLabel lbprecTotal;
    private JTextField txtPrecTotal;
    private JLabel lbnomeFornecedor;
    private JTextField txtNomeFornecedor;
    private JLabel lbdataEntrega;
    private JTextField txtDataEntrega;
    private JButton btnentrar;
    private JButton btncancelar;
    private Container ctn;

    public View(){
        setSize(500,500);
        setTitle("ESTOQUE");
        ctn = getContentPane();

        lbnome = new JLabel("Nome do Produto");
        txtnome = new JTextField();
        lbquantProd = new JLabel("Quantidade");
        txtQuantProd = new JTextField();
        lbcatProd = new JLabel("Categoria");
        txtCatProd = new JTextField();
        lbprecUni = new JLabel("Preço Unitário");
        txtPrecUni = new JTextField();
        lbprecTotal = new JLabel("Preço Total");
        txtPrecTotal = new JTextField();
        lbnomeFornecedor = new JLabel("Nome do Fornecedor");
        txtNomeFornecedor = new JTextField();
        lbdataEntrega = new JLabel("Data da Entrega");
        txtDataEntrega = new JTextField();
        btnentrar = new JButton("Enviar");
        btncancelar = new JButton("Cancelar");
        ctn.setLayout(null);

        lbnome.setBounds(10, 40, 100, 25);
        txtnome.setBounds(130, 40, 100, 25);

        lbquantProd.setBounds(10, 80, 100, 25);
        txtQuantProd.setBounds( 130, 80, 100,25);

        lbcatProd.setBounds(10, 120, 100, 25);
        txtCatProd.setBounds( 130, 120, 100,25);

        lbprecUni.setBounds(10, 160, 100, 25);
        txtPrecUni.setBounds( 130, 160, 100,25);

        lbprecTotal.setBounds(10, 200, 100, 25);
        txtPrecTotal.setBounds( 130, 200, 100,25);

        lbnomeFornecedor.setBounds(10, 240, 100, 25);
        txtNomeFornecedor.setBounds( 130, 240, 100,25);

        lbdataEntrega.setBounds(10, 280, 100, 25);
        txtDataEntrega.setBounds( 130, 280, 100,25);

        btnentrar.setBounds(130, 340, 80, 20);
        btncancelar.setBounds(240, 340, 90, 20);


        ctn.add(lbnome);
        ctn.add(txtnome);
        ctn.add(lbquantProd);
        ctn.add(txtQuantProd);
        ctn.add(lbcatProd);
        ctn.add(txtCatProd);
        ctn.add(lbprecUni);
        ctn.add(txtPrecUni);
        ctn.add(lbprecTotal);
        ctn.add(txtPrecTotal);
        ctn.add(lbnomeFornecedor);
        ctn.add(txtNomeFornecedor);
        ctn.add(lbdataEntrega);
        ctn.add(txtDataEntrega);
        ctn.add(btnentrar);
        ctn.add(btncancelar);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String [] args){
        View teste = new View();
        System.out.println(teste);
    }
}
