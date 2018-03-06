/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estocmed.telas;

import estocmed.logs.Log;
import estocmed.logs.LogDAO;
import estocmed.setor.Setor;
import estocmed.setor.SetorDAO;
import estocmed.setor.SetorTableModel;
import estocmed.usuario.Usuario;
import estocmed.util.Util;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Adriano Lima
 */
public class CadastroSetor extends javax.swing.JDialog {

    Setor setor;
    SetorDAO setorDAO;
    Log log = new Log();
    LogDAO logDAO = new LogDAO();
    Usuario usuario = new Usuario();

    /**
     * Creates new form TelaCadastroUsuario
     *
     * @param usuario
     */
    public CadastroSetor(Usuario usuario) {
        initComponents();
        btExcluir.setEnabled(false);
        this.usuario = usuario;
        getRootPane().setDefaultButton(btSalvar);
        setor = new Setor();
        setorDAO = new SetorDAO(this.usuario);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btVoltar = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jcLocal = new javax.swing.JComboBox<>();
        btSalvar = new javax.swing.JButton();
        jlNomeUsuario4 = new javax.swing.JLabel();
        txtNomeSetor = new javax.swing.JTextField();
        jlNomeUsuario3 = new javax.swing.JLabel();
        jLObrigatorioNome2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(602, 421));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        btVoltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/voltar.png"))); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.setContentAreaFilled(false);
        btVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btVoltar);
        btVoltar.setBounds(20, 340, 90, 70);

        btPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/pesquisar.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.setContentAreaFilled(false);
        btPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPesquisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btPesquisar);
        btPesquisar.setBounds(270, 340, 100, 73);

        btExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/excluir.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setContentAreaFilled(false);
        btExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir);
        btExcluir.setBounds(380, 340, 80, 70);

        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/limpar.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setContentAreaFilled(false);
        btLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLimpar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar);
        btLimpar.setBounds(160, 340, 80, 70);

        jcLocal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcLocal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "Prédio Principal", "Prédio Anexo", "Clínica Escola" }));
        jcLocal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 44, 143), 1, true));
        jcLocal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jcLocal);
        jcLocal.setBounds(70, 240, 240, 30);

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/Salvar.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setContentAreaFilled(false);
        btSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvar);
        btSalvar.setBounds(500, 340, 80, 70);

        jlNomeUsuario4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlNomeUsuario4.setText("Local:");
        getContentPane().add(jlNomeUsuario4);
        jlNomeUsuario4.setBounds(70, 220, 90, 20);

        txtNomeSetor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNomeSetor.setForeground(new java.awt.Color(51, 0, 51));
        txtNomeSetor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 44, 143), 1, true));
        txtNomeSetor.setMaximumSize(new java.awt.Dimension(8, 200));
        txtNomeSetor.setMinimumSize(new java.awt.Dimension(8, 200));
        txtNomeSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeSetorActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeSetor);
        txtNomeSetor.setBounds(70, 160, 470, 30);

        jlNomeUsuario3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlNomeUsuario3.setText("Setor:");
        getContentPane().add(jlNomeUsuario3);
        jlNomeUsuario3.setBounds(70, 140, 90, 20);

        jLObrigatorioNome2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome2.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome2.setText("*");
        getContentPane().add(jLObrigatorioNome2);
        jLObrigatorioNome2.setBounds(540, 150, 20, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/CadastroSetor.png"))); // NOI18N
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(2, 0, 600, 420);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        List<Setor> lista;
        lista = setorDAO.listar();
        SetorTableModel itm = new SetorTableModel(lista);
        Object objetoRetorno = PesquisaGenerica.exibeTela(itm, "Destino");
        if (objetoRetorno != null) {
            setor = setorDAO.consultarObjetoId("idSetor", objetoRetorno);
            txtNomeSetor.setText(setor.getNomeSetor());
            jcLocal.setSelectedItem(setor.getLocalSetor());
            btExcluir.setEnabled(true);
        }

    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed

        if (setor.getIdSetor() != 0) {
            setorDAO.excluir(setor);
        }
        btLimparActionPerformed(null);

    }//GEN-LAST:event_btExcluirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        Util.limparCamposGenerico(this);
        jcLocal.setSelectedIndex(0);
        btExcluir.setEnabled(false);
        setor = new Setor();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        if (txtNomeSetor.getText().equals("") || jcLocal.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Prencha todos os campos !!");
        } else {
            setor.setNomeSetor(txtNomeSetor.getText());
            setor.setLocalSetor(jcLocal.getSelectedItem().toString());
            setorDAO.salvar(setor);
            Util.limparCamposGenerico(this);

        }
        setor = new Setor();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();

    }//GEN-LAST:event_btVoltarActionPerformed

    private void txtNomeSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeSetorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeSetorActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CadastroSetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroSetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroSetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroSetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroSetor dialog = new CadastroSetor(null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLObrigatorioNome2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> jcLocal;
    private javax.swing.JLabel jlNomeUsuario3;
    private javax.swing.JLabel jlNomeUsuario4;
    private javax.swing.JTextField txtNomeSetor;
    // End of variables declaration//GEN-END:variables
}
