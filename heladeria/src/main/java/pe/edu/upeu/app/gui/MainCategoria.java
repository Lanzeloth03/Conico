/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pe.edu.upeu.app.gui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import pe.edu.upeu.app.dao.CategoriaDAO;
import pe.edu.upeu.app.dao.CategoriaDaoI;
import pe.edu.upeu.app.modelo.CategoriaTO;
import pe.edu.upeu.app.modelo.ClienteTO;
import pe.edu.upeu.app.util.MsgBox;

<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
public class MainCategoria extends javax.swing.JPanel {

    CategoriaDaoI cDao;
========
<<<<<<< HEAD
<<<<<<<< HEAD:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
public class MainCategoria extends javax.swing.JPanel {

    CategoriaDaoI cDao;
========
=======
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
/**
 *
 * @author LABORATORIO_2
 */
enum TIPOCLXIENTE {
    Natural, General, Juridico
};

public class MainCliente extends javax.swing.JPanel {

    /**
     * Creates new form MainCliente
     */
    ClienteDaoI cDao;
<<<<<<< HEAD
>>>>>>>> 72e2f563068f93f72e04e8f34f0f8d712a94500d:heladeriaconico/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
=======
>>>>>>>> 063a35d6d06b7e1b990ea7bad0e3ba5959b6597a:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
    DefaultTableModel modelo;
    MsgBox msg;
    TableRowSorter<TableModel> trsfiltro;

    public MainCategoria() {
        initComponents();
        ListarClientes();
    }

    public void ListarClientes() {
        cDao = new CategoriaDAO();
        List<CategoriaTO> listarCleintes = cDao.listarClientes();
        jTable1.setAutoCreateRowSorter(true);
        modelo = (DefaultTableModel) jTable1.getModel();
        Object[] ob = new Object[2];
        for (int i = 0; i < listarCleintes.size(); i++) {
            ob[0] = i + 1;
            ob[1] = listarCleintes.get(i).getNombre();
            modelo.addRow(ob);
        }
        jTable1.setModel(modelo);
    }

    private void paintForm() {
        if (jTable1.getSelectedRow() != -1) {
            modelo = (DefaultTableModel) jTable1.getModel();
            int rowx = jTable1.getSelectedRow();
            Object valor = jTable1.getValueAt(rowx, 1);
            //ClienteTO filax = (ClienteTO) 
<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
            //modelo.getRow(jTable1.getSelectedRow());
            cDao = new CategoriaDAO();
            CategoriaTO d = cDao.buscarClientes(valor.toString());

            txtNombre.setText(d.getNombre());
            txtNombre.setEditable(false);
========
<<<<<<< HEAD
<<<<<<<< HEAD:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
            //modelo.getRow(jTable1.getSelectedRow());
            cDao = new CategoriaDAO();
            CategoriaTO d = cDao.buscarClientes(valor.toString());

            txtNombre.setText(d.getNombre());
            txtNombre.setEditable(false);
========
=======
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a

            cDao = new ClienteDAO();
            ClienteTO d
                    = cDao.buscarClientes(valor.toString());
            txtDni.setText(d.getDniruc());
            txtNombre.setText(d.getNombresrs());
            cbxTipo.setSelectedItem(d.getTipo());
            txtDni.setEditable(false);
<<<<<<< HEAD
>>>>>>>> 72e2f563068f93f72e04e8f34f0f8d712a94500d:heladeriaconico/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
=======
>>>>>>>> 063a35d6d06b7e1b990ea7bad0e3ba5959b6597a:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
            btnRegistrar.setText("MODIFICAR");
            //guardarButton.setToolTipText("MODIFICAR");
        } else {
            txtNombre.setEditable(true);
        }
    }

    public void resetForm() {
<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
        txtNombre.setText("");
        txtNombre.requestFocus();
        
========
<<<<<<< HEAD
<<<<<<<< HEAD:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
        txtNombre.setText("");
        txtNombre.requestFocus();
        
========
=======
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
        txtDni.setText("");
        txtNombre.setText("");
        cbxTipo.setSelectedIndex(0);
        txtDni.requestFocus();
<<<<<<< HEAD
>>>>>>>> 72e2f563068f93f72e04e8f34f0f8d712a94500d:heladeriaconico/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
=======
>>>>>>>> 063a35d6d06b7e1b990ea7bad0e3ba5959b6597a:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fondoPanel1 = new pe.edu.upeu.app.component.FondoPanel();
========
<<<<<<< HEAD
<<<<<<<< HEAD:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fondoPanel1 = new pe.edu.upeu.app.component.FondoPanel();
========
        jLabel2 = new javax.swing.JLabel();
        txtDatofiltro = new javax.swing.JTextField();
>>>>>>>> 72e2f563068f93f72e04e8f34f0f8d712a94500d:heladeriaconico/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
=======
        jLabel2 = new javax.swing.JLabel();
        txtDatofiltro = new javax.swing.JTextField();
>>>>>>>> 063a35d6d06b7e1b990ea7bad0e3ba5959b6597a:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
        btnRegistrar = new javax.swing.JButton();
<<<<<<< HEAD
========
<<<<<<<< HEAD:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
        btnRegistrar = new javax.swing.JButton();
=======
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNombre2 = new javax.swing.JLabel();
<<<<<<< HEAD
========
>>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
        jLabel7 = new javax.swing.JLabel();
        txtNombre2 = new javax.swing.JLabel();
        fondoPanel2 = new pe.edu.upeu.app.component.FondoPanel();
========
        cbxTipo = new javax.swing.JComboBox<>();
        fondoPanel1 = new pe.edu.upeu.app.component.FondoPanel();
        jButton1 = new javax.swing.JButton();
>>>>>>>> 72e2f563068f93f72e04e8f34f0f8d712a94500d:heladeriaconico/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
=======
        fondoPanel2 = new pe.edu.upeu.app.component.FondoPanel();
========
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        cbxTipo = new javax.swing.JComboBox<>();
        fondoPanel1 = new pe.edu.upeu.app.component.FondoPanel();
>>>>>>>> 063a35d6d06b7e1b990ea7bad0e3ba5959b6597a:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));

<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("GESTION DE CATEGORIA");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
========
<<<<<<< HEAD
<<<<<<<< HEAD:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("GESTION DE CATEGORIA");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
========
=======
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Gestión de clientes");

        jLabel2.setText("Filtrar Datos");

        txtDatofiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDatofiltroKeyTyped(evt);
<<<<<<< HEAD
>>>>>>>> 72e2f563068f93f72e04e8f34f0f8d712a94500d:heladeriaconico/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
=======
>>>>>>>> 063a35d6d06b7e1b990ea7bad0e3ba5959b6597a:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel6.setText("Filtrar datos");

        javax.swing.GroupLayout fondoPanel1Layout = new javax.swing.GroupLayout(fondoPanel1);
        fondoPanel1.setLayout(fondoPanel1Layout);
        fondoPanel1Layout.setHorizontalGroup(
            fondoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        fondoPanel1Layout.setVerticalGroup(
            fondoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
                .addContainerGap()
<<<<<<< HEAD
========
<<<<<<<< HEAD:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
                .addContainerGap()
=======
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(fondoPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
<<<<<<< HEAD
                .addContainerGap(210, Short.MAX_VALUE))
========
                .addGap(28, 28, 28)
>>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(fondoPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(583, Short.MAX_VALUE))
========
                    .addComponent(jLabel2)
                    .addComponent(txtDatofiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>>> 72e2f563068f93f72e04e8f34f0f8d712a94500d:heladeriaconico/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
=======
                .addContainerGap(583, Short.MAX_VALUE))
========
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(283, 283, 283)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtDatofiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>>> 063a35d6d06b7e1b990ea7bad0e3ba5959b6597a:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
<<<<<<< HEAD
========
<<<<<<<< HEAD:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
>>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
=======
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(fondoPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
<<<<<<< HEAD
<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
========
=======
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
========
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDatofiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
<<<<<<< HEAD
>>>>>>>> 72e2f563068f93f72e04e8f34f0f8d712a94500d:heladeriaconico/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
=======
>>>>>>>> 063a35d6d06b7e1b990ea7bad0e3ba5959b6597a:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 153));

<<<<<<< HEAD
<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
========
<<<<<<<< HEAD:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jPanel5.setBackground(new java.awt.Color(255, 51, 51));
========
        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
>>>>>>>> 72e2f563068f93f72e04e8f34f0f8d712a94500d:heladeriaconico/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
=======
        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        btnNuevo.setBackground(new java.awt.Color(0, 255, 102));
<<<<<<< HEAD
=======
========

        btnNuevo.setBackground(new java.awt.Color(153, 255, 153));
>>>>>>>> 063a35d6d06b7e1b990ea7bad0e3ba5959b6597a:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
<<<<<<< HEAD
        btnEliminar.setBackground(new java.awt.Color(255, 51, 51));
========
>>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
=======
========
        btnRegistrar.setBackground(new java.awt.Color(0, 204, 255));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

>>>>>>>> 063a35d6d06b7e1b990ea7bad0e3ba5959b6597a:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
        btnEliminar.setBackground(new java.awt.Color(255, 51, 51));
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
        btnRegistrar.setBackground(new java.awt.Color(0, 204, 255));
<<<<<<< HEAD
========
<<<<<<<< HEAD:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
>>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
=======
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
<<<<<<< HEAD
<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
========

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnEliminar)
                    .addComponent(btnRegistrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Categoria");

========
        jLabel3.setText("DNI/RUC:");
>>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
=======
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnEliminar)
                    .addComponent(btnRegistrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setBackground(new java.awt.Color(255, 255, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Categoria");

        javax.swing.GroupLayout fondoPanel2Layout = new javax.swing.GroupLayout(fondoPanel2);
        fondoPanel2.setLayout(fondoPanel2Layout);
        fondoPanel2Layout.setHorizontalGroup(
            fondoPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );
        fondoPanel2Layout.setVerticalGroup(
            fondoPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );

<<<<<<< HEAD
>>>>>>>> 72e2f563068f93f72e04e8f34f0f8d712a94500d:heladeriaconico/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
=======
========
        jLabel3.setText("DNI/RUC:");

        jLabel4.setText("Nombres:");

        jLabel5.setText("Tipo:");

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        javax.swing.GroupLayout fondoPanel1Layout = new javax.swing.GroupLayout(fondoPanel1);
        fondoPanel1.setLayout(fondoPanel1Layout);
        fondoPanel1Layout.setHorizontalGroup(
            fondoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );
        fondoPanel1Layout.setVerticalGroup(
            fondoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

>>>>>>>> 063a35d6d06b7e1b990ea7bad0e3ba5959b6597a:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
<<<<<<<< HEAD:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombre))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
========
=======
<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombre))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 373, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(fondoPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>>> 72e2f563068f93f72e04e8f34f0f8d712a94500d:heladeriaconico/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
=======
========
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtDni))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btnNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRegistrar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fondoPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
>>>>>>>> 063a35d6d06b7e1b990ea7bad0e3ba5959b6597a:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
<<<<<<< HEAD
========
<<<<<<<< HEAD:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(234, 234, 234)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
========
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnRegistrar)
                    .addComponent(btnEliminar))
                .addGap(27, 27, 27)
>>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
=======
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
                .addGap(68, 68, 68)
                .addComponent(fondoPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1453, 1453, 1453)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(387, Short.MAX_VALUE))
========
<<<<<<< HEAD
=======
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnRegistrar)
                    .addComponent(btnEliminar))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
<<<<<<< HEAD
                .addGap(18, 18, 18)
                .addComponent(fondoPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
>>>>>>>> 72e2f563068f93f72e04e8f34f0f8d712a94500d:heladeriaconico/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
=======
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fondoPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
>>>>>>>> 063a35d6d06b7e1b990ea7bad0e3ba5959b6597a:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
        );

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(200);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
========
<<<<<<< HEAD
<<<<<<<< HEAD:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
========
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
>>>>>>>> 72e2f563068f93f72e04e8f34f0f8d712a94500d:heladeriaconico/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
=======
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
>>>>>>>> 063a35d6d06b7e1b990ea7bad0e3ba5959b6597a:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
                .addComponent(jScrollPane2)
========
<<<<<<< HEAD
<<<<<<<< HEAD:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
========
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
>>>>>>>> 72e2f563068f93f72e04e8f34f0f8d712a94500d:heladeriaconico/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
=======
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
>>>>>>>> 063a35d6d06b7e1b990ea7bad0e3ba5959b6597a:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
<<<<<<< HEAD
<<<<<<<< HEAD:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
========
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
>>>>>>>> 72e2f563068f93f72e04e8f34f0f8d712a94500d:heladeriaconico/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
=======
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
========
<<<<<<< HEAD
<<<<<<<< HEAD:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
========
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
>>>>>>>> 72e2f563068f93f72e04e8f34f0f8d712a94500d:heladeriaconico/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
=======
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
>>>>>>>> 063a35d6d06b7e1b990ea7bad0e3ba5959b6597a:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
=======
                .addContainerGap()
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        cDao = new CategoriaDAO();
        CategoriaTO to = new CategoriaTO();
        to.setNombre(txtNombre.getText());
        int fila = jTable1.getSelectedRow();
        if (fila != -1) {
            try {
                int resultado = cDao.update(to);
                if (resultado != 0) {
                    modelo = (DefaultTableModel) jTable1.getModel();
                    Object nuevo[] = {fila + 1, to.getNombre()};
                    modelo.removeRow(fila);
                    modelo.insertRow(fila, nuevo);
                    resetForm();
                    JOptionPane.showMessageDialog(this, "Registro completado");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        } else {
            try {
                if (cDao.create(to) != 0) {
                    modelo = (DefaultTableModel) jTable1.getModel();
                    Object nuevo[] = {modelo.getRowCount() + 1, to.getNombre()};
                    modelo.addRow(nuevo);
                    resetForm();
                    JOptionPane.showMessageDialog(this, "Re registro");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        cDao = new CategoriaDAO();
=======
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        paintForm();

    }//GEN-LAST:event_jTable1MouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        resetForm();
        btnRegistrar.setText("REGISTRAR");
        txtDni.setEditable(true);
        jTable1.getSelectionModel().clearSelection();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        cDao = new ClienteDAO();
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
        if (jTable1.getSelectedRowCount() > 0) {
            try {
                modelo = (DefaultTableModel) jTable1.getModel();
                int rowx = jTable1.getSelectedRow();
                Object valor = jTable1.getValueAt(rowx, 1);

                msg = new MsgBox();
                if (msg.showConfirmCustom("Esta seguro de eliminar este registrtro DNI: " + valor + "?", "Mensaje de Confirmación", "") == 0) {
<<<<<<< HEAD
=======

>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
                    modelo.removeRow(rowx);
                    cDao.delete(valor.toString());
                    resetForm();
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un item");
        }
<<<<<<< HEAD
    }//GEN-LAST:event_btnEliminarActionPerformed

<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        paintForm();
    }//GEN-LAST:event_jTable1MouseClicked
========
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
<<<<<<<< HEAD:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
=======

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
        cDao = new CategoriaDAO();
        CategoriaTO to = new CategoriaTO();
        to.setNombre(txtNombre.getText());
========
        // TODO add your handling code here:
        cDao = new ClienteDAO();
        ClienteTO to = new ClienteTO();
        to.setDniruc(txtDni.getText());
        to.setNombresrs(txtNombre.getText());
        to.setTipo(cbxTipo.getSelectedItem().toString());
<<<<<<< HEAD
>>>>>>>> 72e2f563068f93f72e04e8f34f0f8d712a94500d:heladeriaconico/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
=======
>>>>>>>> 063a35d6d06b7e1b990ea7bad0e3ba5959b6597a:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
        int fila = jTable1.getSelectedRow();
        if (fila != -1) {
            try {
                int resultado = cDao.update(to);
                if (resultado != 0) {
                    modelo = (DefaultTableModel) jTable1.getModel();
                    Object nuevo[] = {fila + 1, to.getNombre()};
                    modelo.removeRow(fila);
                    modelo.insertRow(fila, nuevo);
                    resetForm();
                    JOptionPane.showMessageDialog(this, "Registro completado");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        } else {
            try {
                if (cDao.create(to) != 0) {
                    modelo = (DefaultTableModel) jTable1.getModel();
<<<<<<< HEAD
<<<<<<<< HEAD:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
                    Object nuevo[] = {modelo.getRowCount() + 1, to.getNombre()};
========
                    Object nuevo[] = {modelo.getRowCount() + 1, to.getDniruc(), to.getNombresrs(), to.getTipo()};
>>>>>>>> 72e2f563068f93f72e04e8f34f0f8d712a94500d:heladeriaconico/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
=======
<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
                    Object nuevo[] = {modelo.getRowCount() + 1, to.getNombre()};
========
                    Object nuevo[] = {modelo.getRowCount() + 1, to.getDniruc(), to.getNombresrs(), to.getTipo()};
>>>>>>>> 063a35d6d06b7e1b990ea7bad0e3ba5959b6597a:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
                    modelo.addRow(nuevo);
                    resetForm();
                    JOptionPane.showMessageDialog(this, "Re registro");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
<<<<<<< HEAD
>>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        resetForm();
        btnRegistrar.setText("REGISTRAR");
        txtNombre.setEditable(true);
        jTable1.getSelectionModel().clearSelection();
    }//GEN-LAST:event_btnNuevoActionPerformed

<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
========
<<<<<<<< HEAD:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
=======

    }//GEN-LAST:event_btnRegistrarActionPerformed

<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        cDao = new CategoriaDAO();
        if (jTable1.getSelectedRowCount() > 0) {
            try {
                modelo = (DefaultTableModel) jTable1.getModel();
                int rowx = jTable1.getSelectedRow();
                Object valor = jTable1.getValueAt(rowx, 1);

                msg = new MsgBox();
                if (msg.showConfirmCustom("Esta seguro de eliminar este registrtro DNI: " + valor + "?", "Mensaje de Confirmación", "") == 0) {
                    modelo.removeRow(rowx);
                    cDao.delete(valor.toString());
                    resetForm();
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un item");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        paintForm();
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        resetForm();
        btnRegistrar.setText("REGISTRAR");
        txtNombre.setEditable(true);
        jTable1.getSelectionModel().clearSelection();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        jTextField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String cadena = (jTextField1.getText());
                System.out.println("v:" + cadena);
                jTextField1.setText(cadena);
                repaint();
                trsfiltro.setRowFilter(RowFilter.regexFilter(jTextField1.getText()));
            } 
<<<<<<< HEAD
========
    private void txtDatofiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDatofiltroKeyTyped
>>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        jTextField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String cadena = (jTextField1.getText());
                System.out.println("v:" + cadena);
                jTextField1.setText(cadena);
                repaint();
<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
                trsfiltro.setRowFilter(RowFilter.regexFilter(jTextField1.getText()));
            } 
========
                trsfiltro.setRowFilter(RowFilter.regexFilter(txtDatofiltro.getText()));
            }
>>>>>>>> 72e2f563068f93f72e04e8f34f0f8d712a94500d:heladeriaconico/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
=======
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
        });
        System.out.println("llego");
        trsfiltro = new TableRowSorter(jTable1.getModel());
        jTable1.setRowSorter(trsfiltro);
<<<<<<< HEAD
<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
    }//GEN-LAST:event_jTextField1KeyTyped
========
<<<<<<<< HEAD:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
    }//GEN-LAST:event_jTextField1KeyTyped
========
    }//GEN-LAST:event_txtDatofiltroKeyTyped
>>>>>>>> 72e2f563068f93f72e04e8f34f0f8d712a94500d:heladeriaconico/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
=======
    }//GEN-LAST:event_jTextField1KeyTyped
========
    private void txtDatofiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDatofiltroKeyTyped
        // TODO add your handling code here:
        txtDatofiltro.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String cadena = (txtDatofiltro.getText());
                System.out.println("v:" + cadena);
                txtDatofiltro.setText(cadena);
                repaint();
                trsfiltro.setRowFilter(RowFilter.regexFilter(txtDatofiltro.getText()));
           
                        }
    }) ;
System.out.println("llego");
        trsfiltro = new TableRowSorter(jTable1.getModel());
        jTable1.setRowSorter(trsfiltro);
    }//GEN-LAST:event_txtDatofiltroKeyTyped
>>>>>>>> 063a35d6d06b7e1b990ea7bad0e3ba5959b6597a:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
    private pe.edu.upeu.app.component.FondoPanel fondoPanel1;
    private pe.edu.upeu.app.component.FondoPanel fondoPanel2;
<<<<<<< HEAD
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
========
<<<<<<<< HEAD:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
    private pe.edu.upeu.app.component.FondoPanel fondoPanel1;
========
    private javax.swing.JComboBox<String> cbxTipo;
    private pe.edu.upeu.app.component.FondoPanel fondoPanel1;
    private javax.swing.JButton jButton1;
>>>>>>>> 72e2f563068f93f72e04e8f34f0f8d712a94500d:heladeriaconico/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
<<<<<<<< HEAD:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
=======
========
    private javax.swing.JComboBox<String> cbxTipo;
    private pe.edu.upeu.app.component.FondoPanel fondoPanel1;
>>>>>>>> 063a35d6d06b7e1b990ea7bad0e3ba5959b6597a:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
========
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
<<<<<<< HEAD
>>>>>>>> 72e2f563068f93f72e04e8f34f0f8d712a94500d:heladeriaconico/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
=======
>>>>>>>> 063a35d6d06b7e1b990ea7bad0e3ba5959b6597a:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
<<<<<<< HEAD
========
<<<<<<<< HEAD:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtNombre;
    public javax.swing.JLabel txtNombre2;
========
    private javax.swing.JScrollPane jScrollPane1;
>>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtNombre;
<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
    private javax.swing.JLabel txtNombre2;
========
>>>>>>>> 72e2f563068f93f72e04e8f34f0f8d712a94500d:heladeriaconico/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a:SysVentasGUIG1/src/main/java/pe/edu/upeu/app/gui/MainCategoria.java
=======
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JLabel txtNombre2;
========
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDatofiltro;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
>>>>>>>> 063a35d6d06b7e1b990ea7bad0e3ba5959b6597a:heladeria/src/main/java/pe/edu/upeu/app/gui/MainCliente.java
>>>>>>> d5db0bc43394776e0f8364de9eb62d3604c7248a
    // End of variables declaration//GEN-END:variables
}
