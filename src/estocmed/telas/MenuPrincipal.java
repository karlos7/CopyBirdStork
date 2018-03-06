/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estocmed.telas;

import estocmed.usuario.Usuario;
import estocmed.usuario.UsuarioDAO;
import estocmed.util.Util;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adriano Lima
 */
public class MenuPrincipal extends javax.swing.JFrame {

    Usuario usuario;
    UsuarioDAO usuarioDAO = new UsuarioDAO();

    public MenuPrincipal(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        jlUsuario.setText(usuario.getLoginUsuario());
        if (usuario.getTipoUsuario().equalsIgnoreCase("Funcionário")) {
            subUsuario.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btLogout = new javax.swing.JButton();
        jlUsuario = new javax.swing.JLabel();
        jlNome3 = new javax.swing.JLabel();
        jlHome = new javax.swing.JLabel();
        jMenu = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        subTipoProduto = new javax.swing.JMenuItem();
        subFornecedor = new javax.swing.JMenuItem();
        subCidade = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        subSetor = new javax.swing.JMenuItem();
        subCurso = new javax.swing.JMenuItem();
        subUsuario = new javax.swing.JMenuItem();
        menuSaida = new javax.swing.JMenu();
        subProdutoConsumo = new javax.swing.JMenuItem();
        subUsuario2 = new javax.swing.JMenuItem();
        saidaProdutoDeConsumo = new javax.swing.JMenuItem();
        subDevolverEstoqueConsumo = new javax.swing.JMenuItem();
        menuSaida1 = new javax.swing.JMenu();
        subProdutoPermanente = new javax.swing.JMenuItem();
        subEstoquePermanente3 = new javax.swing.JMenuItem();
        saidaProdutoPermanente1 = new javax.swing.JMenuItem();
        subDevolverEstoquePermanente = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 559));
        setUndecorated(true);
        getContentPane().setLayout(null);

        btLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/logout.png"))); // NOI18N
        btLogout.setText("Sair");
        btLogout.setToolTipText("Sair");
        btLogout.setContentAreaFilled(false);
        btLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btLogout);
        btLogout.setBounds(810, 360, 80, 73);

        jlUsuario.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jlUsuario.setText("???");
        getContentPane().add(jlUsuario);
        jlUsuario.setBounds(340, 400, 480, 30);

        jlNome3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jlNome3.setText("Usuário:");
        getContentPane().add(jlNome3);
        jlNome3.setBounds(240, 400, 100, 30);

        jlHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/Tela Inicial.png"))); // NOI18N
        getContentPane().add(jlHome);
        jlHome.setBounds(0, 0, 900, 445);

        jMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu.setForeground(new java.awt.Color(51, 204, 0));
        jMenu.setBorderPainted(false);
        jMenu.setMaximumSize(new java.awt.Dimension(900, 200));
        jMenu.setMinimumSize(new java.awt.Dimension(900, 200));

        menuCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/MaisM.png"))); // NOI18N
        menuCadastros.setText("Cadastro");
        menuCadastros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuCadastros.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        menuCadastros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuCadastros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        subTipoProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/add12-12.png"))); // NOI18N
        subTipoProduto.setText("Tipo de Produto");
        subTipoProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subTipoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subTipoProdutoActionPerformed(evt);
            }
        });
        menuCadastros.add(subTipoProduto);

        subFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/add12-12.png"))); // NOI18N
        subFornecedor.setText("Fornecedor");
        subFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subFornecedorActionPerformed(evt);
            }
        });
        menuCadastros.add(subFornecedor);

        subCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/add12-12.png"))); // NOI18N
        subCidade.setText("Cidade");
        subCidade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subCidadeActionPerformed(evt);
            }
        });
        menuCadastros.add(subCidade);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/add12-12.png"))); // NOI18N
        jMenuItem3.setText("Destino");
        jMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuCadastros.add(jMenuItem3);

        subSetor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/add12-12.png"))); // NOI18N
        subSetor.setText("Setor");
        subSetor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subSetorActionPerformed(evt);
            }
        });
        menuCadastros.add(subSetor);

        subCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/add12-12.png"))); // NOI18N
        subCurso.setText("Curso");
        subCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subCursoActionPerformed(evt);
            }
        });
        menuCadastros.add(subCurso);

        subUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/add12-12.png"))); // NOI18N
        subUsuario.setText("Usuário");
        subUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subUsuarioActionPerformed(evt);
            }
        });
        menuCadastros.add(subUsuario);

        jMenu.add(menuCadastros);

        menuSaida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/Produtos2.png"))); // NOI18N
        menuSaida.setText("Consumo");
        menuSaida.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuSaida.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        menuSaida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuSaida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuSaida.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        subProdutoConsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/add12-12.png"))); // NOI18N
        subProdutoConsumo.setText("Cadastro Produto de Consumo");
        subProdutoConsumo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subProdutoConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subProdutoConsumoActionPerformed(evt);
            }
        });
        menuSaida.add(subProdutoConsumo);

        subUsuario2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/add12-12.png"))); // NOI18N
        subUsuario2.setText("Cadastro Estoque Consumo");
        subUsuario2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subUsuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subUsuario2ActionPerformed(evt);
            }
        });
        menuSaida.add(subUsuario2);

        saidaProdutoDeConsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/add12-12.png"))); // NOI18N
        saidaProdutoDeConsumo.setText("Saída Produto Consumo");
        saidaProdutoDeConsumo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        saidaProdutoDeConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saidaProdutoDeConsumoActionPerformed(evt);
            }
        });
        menuSaida.add(saidaProdutoDeConsumo);

        subDevolverEstoqueConsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/add12-12.png"))); // NOI18N
        subDevolverEstoqueConsumo.setText("Devolver Produtos Consumo");
        subDevolverEstoqueConsumo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subDevolverEstoqueConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subDevolverEstoqueConsumoActionPerformed(evt);
            }
        });
        menuSaida.add(subDevolverEstoqueConsumo);

        jMenu.add(menuSaida);

        menuSaida1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/Produtos2.png"))); // NOI18N
        menuSaida1.setText("Permanente");
        menuSaida1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuSaida1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        menuSaida1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuSaida1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuSaida1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        subProdutoPermanente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/add12-12.png"))); // NOI18N
        subProdutoPermanente.setText("Cadastro Produto Permanente");
        subProdutoPermanente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subProdutoPermanente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subProdutoPermanenteActionPerformed(evt);
            }
        });
        menuSaida1.add(subProdutoPermanente);

        subEstoquePermanente3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/add12-12.png"))); // NOI18N
        subEstoquePermanente3.setText("Cadastro Estoque Permanente");
        subEstoquePermanente3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subEstoquePermanente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subEstoquePermanente3ActionPerformed(evt);
            }
        });
        menuSaida1.add(subEstoquePermanente3);

        saidaProdutoPermanente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/add12-12.png"))); // NOI18N
        saidaProdutoPermanente1.setText("Saída Produto Permanente");
        saidaProdutoPermanente1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        saidaProdutoPermanente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saidaProdutoPermanente1ActionPerformed(evt);
            }
        });
        menuSaida1.add(saidaProdutoPermanente1);

        subDevolverEstoquePermanente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/add12-12.png"))); // NOI18N
        subDevolverEstoquePermanente.setText("Devolver Produtos Permanente");
        subDevolverEstoquePermanente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subDevolverEstoquePermanente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subDevolverEstoquePermanenteActionPerformed(evt);
            }
        });
        menuSaida1.add(subDevolverEstoquePermanente);

        jMenu.add(menuSaida1);

        menuRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/relatorioM.png"))); // NOI18N
        menuRelatorio.setText("Relatórios");
        menuRelatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuRelatorio.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        menuRelatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuRelatorio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelatorioActionPerformed(evt);
            }
        });
        jMenu.add(menuRelatorio);

        setJMenuBar(jMenu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogoutActionPerformed
        TelaAutenticacao telaAutenticar = new TelaAutenticacao();
        telaAutenticar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btLogoutActionPerformed

    private void subUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subUsuarioActionPerformed
        CadastroUsuario cu = new CadastroUsuario(null, rootPaneCheckingEnabled);
        cu.setVisible(true);

    }//GEN-LAST:event_subUsuarioActionPerformed

    private void subProdutoConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subProdutoConsumoActionPerformed
        CadastroProdutoConsumo cp = new CadastroProdutoConsumo(null, rootPaneCheckingEnabled, this.usuario);
        cp.setVisible(true);
    }//GEN-LAST:event_subProdutoConsumoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        CadastroDestino cd = new CadastroDestino(this.usuario);
        cd.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void subFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subFornecedorActionPerformed
        CadastroFornecedor cf = new CadastroFornecedor(this.usuario);
        cf.setVisible(true);
    }//GEN-LAST:event_subFornecedorActionPerformed

    private void menuRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuRelatorioActionPerformed

    private void subUsuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subUsuario2ActionPerformed
        CadastroEstoqueConsumo ce = new CadastroEstoqueConsumo(null, rootPaneCheckingEnabled, this.usuario);
        ce.setVisible(true);
    }//GEN-LAST:event_subUsuario2ActionPerformed

    private void saidaProdutoDeConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saidaProdutoDeConsumoActionPerformed
        CadastroSaidaConsumo cs = new CadastroSaidaConsumo(this, true, this.usuario);
        cs.setVisible(true);
    }//GEN-LAST:event_saidaProdutoDeConsumoActionPerformed

    private void subCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subCidadeActionPerformed
        CadastroCidades cc = new CadastroCidades(this, true, this.usuario);
        cc.setVisible(true);
    }//GEN-LAST:event_subCidadeActionPerformed

    private void subProdutoPermanenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subProdutoPermanenteActionPerformed
        CadastroProdutoPermanente cpp = new CadastroProdutoPermanente(null, rootPaneCheckingEnabled, this.usuario);
        cpp.setVisible(true);
    }//GEN-LAST:event_subProdutoPermanenteActionPerformed

    private void subSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subSetorActionPerformed
        CadastroSetor cs = new CadastroSetor(this.usuario);
        cs.setVisible(true);
    }//GEN-LAST:event_subSetorActionPerformed

    private void subTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subTipoProdutoActionPerformed
        CadastroTipoProduto ctp = new CadastroTipoProduto(this.usuario);
        ctp.setVisible(true);
    }//GEN-LAST:event_subTipoProdutoActionPerformed

    private void subDevolverEstoqueConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subDevolverEstoqueConsumoActionPerformed
        CadastroDevolucaoConsumo cdc = new CadastroDevolucaoConsumo(null, rootPaneCheckingEnabled, this.usuario);
        cdc.setVisible(true);
    }//GEN-LAST:event_subDevolverEstoqueConsumoActionPerformed

    private void saidaProdutoPermanente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saidaProdutoPermanente1ActionPerformed
       CadastroSaidaPermanente csp = new CadastroSaidaPermanente(null, rootPaneCheckingEnabled, this.usuario);
       csp.setVisible(true);
    }//GEN-LAST:event_saidaProdutoPermanente1ActionPerformed

    private void subEstoquePermanente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subEstoquePermanente3ActionPerformed
        CadastroEstoquePermanente cep = new CadastroEstoquePermanente(null, rootPaneCheckingEnabled, this.usuario);
        cep.setVisible(true);
    }//GEN-LAST:event_subEstoquePermanente3ActionPerformed

    private void subDevolverEstoquePermanenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subDevolverEstoquePermanenteActionPerformed
        CadastroDevolucaoPermanente cdp = new CadastroDevolucaoPermanente(null, rootPaneCheckingEnabled, this.usuario);
        cdp.setVisible(true);
    }//GEN-LAST:event_subDevolverEstoquePermanenteActionPerformed

    private void subCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subCursoActionPerformed
        CadastroCurso cc = new CadastroCurso(this.usuario);
        cc.setVisible(true);
    }//GEN-LAST:event_subCursoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogout;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JLabel jlHome;
    private javax.swing.JLabel jlNome3;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenu menuRelatorio;
    private javax.swing.JMenu menuSaida;
    private javax.swing.JMenu menuSaida1;
    private javax.swing.JMenuItem saidaProdutoDeConsumo;
    private javax.swing.JMenuItem saidaProdutoPermanente1;
    private javax.swing.JMenuItem subCidade;
    private javax.swing.JMenuItem subCurso;
    private javax.swing.JMenuItem subDevolverEstoqueConsumo;
    private javax.swing.JMenuItem subDevolverEstoquePermanente;
    private javax.swing.JMenuItem subEstoquePermanente3;
    private javax.swing.JMenuItem subFornecedor;
    private javax.swing.JMenuItem subProdutoConsumo;
    private javax.swing.JMenuItem subProdutoPermanente;
    private javax.swing.JMenuItem subSetor;
    private javax.swing.JMenuItem subTipoProduto;
    private javax.swing.JMenuItem subUsuario;
    private javax.swing.JMenuItem subUsuario2;
    // End of variables declaration//GEN-END:variables
}