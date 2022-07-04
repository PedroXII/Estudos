package controle_de_consumo_de_agua;

import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    Usuario u1 = new Usuario();
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        painelImagemFundo1 = new controle_de_consumo_de_agua.PainelImagemFundo();
        lblCCA = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        btbCriarUsuario = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/controle_de_consumo_de_agua/CCADrop.png"))); // NOI18N
        jInternalFrame1.setVisible(true);

        painelImagemFundo1.setBackground(new java.awt.Color(102, 102, 102));
        painelImagemFundo1.setLayout(null);

        lblCCA.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblCCA.setText("Controle de Consumo de Água");
        painelImagemFundo1.add(lblCCA);
        lblCCA.setBounds(67, 48, 485, 44);

        lblLogin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblLogin.setText("Login");
        painelImagemFundo1.add(lblLogin);
        lblLogin.setBounds(281, 140, 56, 29);

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNome.setText("Nome:");
        painelImagemFundo1.add(lblNome);
        lblNome.setBounds(197, 188, 52, 22);

        lblSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSenha.setText("Senha:");
        painelImagemFundo1.add(lblSenha);
        lblSenha.setBounds(197, 255, 54, 22);

        btnEntrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        painelImagemFundo1.add(btnEntrar);
        btnEntrar.setBounds(270, 334, 79, 31);

        btbCriarUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btbCriarUsuario.setText("Criar usuário");
        btbCriarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbCriarUsuarioActionPerformed(evt);
            }
        });
        painelImagemFundo1.add(btbCriarUsuario);
        btbCriarUsuario.setBounds(255, 409, 109, 25);

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        painelImagemFundo1.add(txtNome);
        txtNome.setBounds(196, 221, 227, 28);

        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        painelImagemFundo1.add(txtSenha);
        txtSenha.setBounds(196, 288, 227, 28);

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle_de_consumo_de_agua/CCAWater.jpg"))); // NOI18N
        painelImagemFundo1.add(lblImage);
        lblImage.setBounds(0, 0, 620, 490);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(painelImagemFundo1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelImagemFundo1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btbCriarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbCriarUsuarioActionPerformed
        CriarUsuario c1 = new CriarUsuario();
        c1.setVisible(true);
        dispose();
    }//GEN-LAST:event_btbCriarUsuarioActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cca", "root", "");
            
            int dia = u1.getDiaatual();
            int mes = u1.getMesatual();
            int ano = u1.getAnoatual();
            
            String sql = "select * from cca_user;";
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String senha = rs.getString("senha");
                int idade = rs.getInt("idade");
                String sexo = rs.getString("sexo");
                double peso = rs.getDouble("peso");
                boolean amamentando = rs.getBoolean("amamentando");
                boolean gestante =rs.getBoolean("amamentando");
                int dian = rs.getInt("dian");
                int mesn = rs.getInt("mesn");
                int anon = rs.getInt("anon");
                
                u1.setDian(dian);
                u1.setMesn(mesn);
                u1.setAnon(anon);
                u1.Idade();
                
                if (txtNome.getText().equals(nome) && txtSenha.getText().equals(senha)){
                    String update = "update cca_user set idade = '" + u1.IdadeC() + "' where nome = '" + txtNome.getText() + "';";
                    String qtd = "select * from "+ txtNome.getText() +"_cca;";
                    String start = "insert into " + txtNome.getText() + "_cca values('"+ txtNome.getText() +"', '0', '0', 'none', 'none', '0', '0', '0');";
                    String end = "delete from " + txtNome.getText() + "_cca where ano = '0' and dia = '0' and mes = '0' and metacl = 'none' and metame = 'none' limit 1;";
                    
                    stmt.executeUpdate(start);
                    rs = stmt.executeQuery(qtd);
                    while(rs.next()){
                        int diat = rs.getInt("dia");
                        int mest = rs.getInt("mes");
                        int anot = rs.getInt("ano");
                        int quantidade = rs.getInt("quantidade");
                        if(diat == dia && mest == mes && anot == ano){
                            u1.setQuantidade(quantidade);
                        }
                    }
                    stmt.executeUpdate(end);
                    stmt.executeUpdate(update);
                    new SelecionarMetodo(id, nome, senha, idade, sexo, peso, amamentando, gestante, dian, mesn, anon, u1.getQuantidade()).setVisible(true);
                    con.close();
                    dispose();
                }
            }
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorreto!");
            con.close();
        }
        catch(Exception a){
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbCriarUsuario;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel lblCCA;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private controle_de_consumo_de_agua.PainelImagemFundo painelImagemFundo1;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
