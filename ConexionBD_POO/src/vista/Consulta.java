/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Container;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Karicha Valesska Romero Lobato <00002517@uca.edu.sv>
 */
public class Consulta extends JFrame {
    public JLabel lblCodigo,lblMarca,lblStock,lblExistencia;
    
    public JTextField codigo,descripcion,stock;
    public JComboBox marca;
    
    ButtonGroup existencia = new ButtonGroup();
    public JRadioButton no;
    public JRadioButton si;
    public JTable resultados;
    
    public JPanel table;
    
    public JButton buscar, eliminar, insertar,limpiar,actualizar;
    
    private static final int ANCHOC = 130, ALTOC =30;
    
    DefaultTableModel tm;
    
    public Consulta(){
        super("Inventario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        agregarLabels();
        formulario();
        llenarTabla();
        Container container = getContentPane();
        container.add(lblCodigo);
        container.add(lblMarca);
        container.add(lblStock);
        container.add(lblExistencia);
        container.add(codigo);
        container.add(marca);
        container.add(stock);
        container.add(si);
        container.add(no);
        container.add(buscar);
        container.add(insertar);
        container.add(actualizar);
        container.add(eliminar);
        container.add(limpiar);
        container.add(table);
        setSize(600,600);
        eventos();
        
    }
    
    public final void agregarLabels(){
        lblCodigo = new JLabel ("Codigo");
        lblMarca = new JLabel("Marca");
        lblStock = new JLabel("Stock");
        lblExistencia = new JLabel("Stock en tienda");
        lblCodigo.setBounds(10,10, ANCHOC,ALTOC);
        lblMarca.setBounds(10,60, ANCHOC, ALTOC);
        lblStock.setBounds(10,100, ANCHOC, ALTOC);
        lblExistencia.setBounds(10,140, ANCHOC, ALTOC);
    }
    
    public final void formulario(){
        codigo = new JTextField();
        marca = new JComboBox();
        stock = new JTextField();
        si = new JRadioButton("si",true);
        no = new JRadioButton("no");
        resultados = new JTable();
        buscar = new JButton ("Buscar");
        
    }

    private void llenarTabla() {
    }

    private void eventos() {
    }
}
