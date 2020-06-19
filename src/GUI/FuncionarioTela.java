
package GUI;



import Beans.FuncionarioBeans;
import Controller.FuncionarioController;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;


public class FuncionarioTela extends javax.swing.JInternalFrame {

    MaskFormatter FormatoTel;
    SimpleDateFormat FormatoData;
    Date DataAtual;
    FuncionarioBeans FuncionarioB;
    FuncionarioController FuncC;
    DefaultTableModel Modelo;
   
    
    public FuncionarioTela() {
        initComponents();
      
        habilitarCampos(false);
        
        FormatoData = new SimpleDateFormat("dd/MM/yyyy");
        
        
        FuncionarioB = new FuncionarioBeans();
        FuncC = new FuncionarioController();
        
        Modelo = (DefaultTableModel)tb_clientes.getModel();
      
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        txt_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_data = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_clientes = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        btn_novo = new javax.swing.JButton();
        btn_Save = new javax.swing.JButton();
        btn_Save1 = new javax.swing.JButton();
        cb_cargo = new javax.swing.JComboBox();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro Funcionários");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Código");

        txt_codigo.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Cargo");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Data");

        txt_data.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Buscar");

        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarKeyReleased(evt);
            }
        });

        tb_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Cargo", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_clientesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb_clientesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tb_clientes);

        btn_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/inserir.png"))); // NOI18N
        btn_novo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });
        btn_novo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btn_novoKeyReleased(evt);
            }
        });

        btn_Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/salvar.png"))); // NOI18N
        btn_Save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });

        btn_Save1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/editar.png"))); // NOI18N
        btn_Save1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Save1ActionPerformed(evt);
            }
        });

        cb_cargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione um cargo", "Atendente", "Entregador", "Caixa", "Gerente", "Administrador" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(26, 26, 26)
                                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Save1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_novo)
                    .addComponent(btn_Save)
                    .addComponent(btn_Save1))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        setBounds(20, 20, 500, 524);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        DataAtual = new Date();
        txt_data.setText(FormatoData.format(DataAtual));
        habilitarCampos(true);
        FuncC.controleDeCodigo();
        txt_codigo.setText(FuncC.controleDeCodigo());
    }//GEN-LAST:event_btn_novoActionPerformed

    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased
        Modelo.setNumRows(0);
        FuncC.controlePesquisa(txt_buscar.getText(), Modelo);
    }//GEN-LAST:event_txt_buscarKeyReleased

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
        popularClienteBeans();
        FuncC.verificarDados(FuncionarioB);
        LimparCampos();
    }//GEN-LAST:event_btn_SaveActionPerformed

    private void tb_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_clientesMouseClicked
        
        
    }//GEN-LAST:event_tb_clientesMouseClicked

    private void tb_clientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_clientesMousePressed
        habilitarCampos(true);
        FuncionarioB = FuncC.controlePreencherCampos(Integer.parseInt(Modelo.getValueAt(tb_clientes.getSelectedRow(), 0).toString()));
       txt_codigo.setText(FuncionarioB.getCodigo() + "");
       txt_nome.setText(FuncionarioB.getNome());
       
       txt_data.setText(FuncionarioB.getDataCad());
    }//GEN-LAST:event_tb_clientesMousePressed

    private void btn_Save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Save1ActionPerformed
        DataAtual = new Date ();
        txt_data.setText(FormatoData.format(DataAtual));
        habilitarCampos(true);
        FuncC.controleDeCodigo();
        txt_codigo.setText(FuncC.controleDeCodigo());
        
    }//GEN-LAST:event_btn_Save1ActionPerformed

    private void btn_novoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_novoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_novoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Save;
    private javax.swing.JButton btn_Save1;
    private javax.swing.JButton btn_novo;
    private javax.swing.JComboBox cb_cargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tb_clientes;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_data;
    private javax.swing.JTextField txt_nome;
    // End of variables declaration//GEN-END:variables

final void habilitarCampos(boolean valor){
   
    txt_nome.setEnabled(valor);
    txt_data.setEnabled(valor);
    cb_cargo.setEnabled(valor);
    
}

final void popularClienteBeans(){
    FuncionarioB.setNome(txt_nome.getText());
    FuncionarioB.setCargo(cb_cargo.getSelectedItem().toString());
    FuncionarioB.setDataCad(txt_data.getText());
    
    
}

final void LimparCampos(){
    
    txt_codigo.setText("");
    txt_nome.setText("");
    cb_cargo.setSelectedIndex(0);
    txt_data.setText("");
    
    
    
}

}
