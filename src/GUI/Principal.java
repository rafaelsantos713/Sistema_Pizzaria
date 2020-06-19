/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Utilitarios.FundoTela;
import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author hugov
 */
public class Principal extends javax.swing.JFrame {

    FundoTela tela;
    ClienteTela clientetela;
    FuncionarioTela functela;
    
    
    public Principal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(new GridLayout());
        tela = new FundoTela("/Icones/pizzafundo.jpg");
        getContentPane().add(tela);
        
        menu_cliente.setIcon(new ImageIcon(getClass().getResource("/Icones/ico_clientes.png")));
        menuFuncionarios.setIcon(new ImageIcon(getClass().getResource("/Icones/ico_func.png")));
        menuCardapio.setIcon(new ImageIcon(getClass().getResource("/Icones/ico_cardapio.png")));
        menuEntregador.setIcon(new ImageIcon(getClass().getResource("/Icones/ico_boy.png")));
        MenuCadastro.setIcon(new ImageIcon(getClass().getResource("/Icones/inserir-32.png")));
        MenuCaixa.setIcon(new ImageIcon(getClass().getResource("/Icones/ico_caixa.png")));
        MenuRel.setIcon(new ImageIcon(getClass().getResource("/Icones/ico_rel.png")));
        MenuSair.setIcon(new ImageIcon(getClass().getResource("/Icones/ico_sair.png")));
        
       ImageIcon icone = new ImageIcon(getClass().getResource("/Icones/ico_cardapio.png"));
       setIconImage(icone.getImage());
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCadastro = new javax.swing.JMenu();
        menu_cliente = new javax.swing.JMenuItem();
        menuFuncionarios = new javax.swing.JMenuItem();
        menuCardapio = new javax.swing.JMenuItem();
        menuEntregador = new javax.swing.JMenuItem();
        MenuCaixa = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        MenuRel = new javax.swing.JMenu();
        MenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pizzaria Freitas");

        MenuCadastro.setText("Cadastro");
        MenuCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menu_cliente.setText("Clientes");
        menu_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_clienteActionPerformed(evt);
            }
        });
        MenuCadastro.add(menu_cliente);

        menuFuncionarios.setText("Funcionários");
        menuFuncionarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFuncionariosActionPerformed(evt);
            }
        });
        MenuCadastro.add(menuFuncionarios);

        menuCardapio.setText("Cardápio");
        menuCardapio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuCadastro.add(menuCardapio);

        menuEntregador.setText("Entregador");
        menuEntregador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuCadastro.add(menuEntregador);

        jMenuBar1.add(MenuCadastro);

        MenuCaixa.setText("Caixa");
        MenuCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem5.setText("Pedido");
        MenuCaixa.add(jMenuItem5);

        jMenuBar1.add(MenuCaixa);

        MenuRel.setText("Relatórios");
        MenuRel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.add(MenuRel);

        MenuSair.setText("Sair");
        MenuSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.add(MenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_clienteActionPerformed
       clientetela = new ClienteTela();
       tela.add(clientetela);
       clientetela.setVisible(true);
    }//GEN-LAST:event_menu_clienteActionPerformed

    private void menuFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFuncionariosActionPerformed
       functela = new FuncionarioTela();
       tela.add(functela);
       functela.setVisible(true);
    }//GEN-LAST:event_menuFuncionariosActionPerformed

 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenu MenuCaixa;
    private javax.swing.JMenu MenuRel;
    private javax.swing.JMenu MenuSair;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem menuCardapio;
    private javax.swing.JMenuItem menuEntregador;
    private javax.swing.JMenuItem menuFuncionarios;
    private javax.swing.JMenuItem menu_cliente;
    // End of variables declaration//GEN-END:variables
}
