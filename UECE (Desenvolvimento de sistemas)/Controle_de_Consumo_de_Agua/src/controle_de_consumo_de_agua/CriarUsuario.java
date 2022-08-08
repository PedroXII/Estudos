/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle_de_consumo_de_agua;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class CriarUsuario extends javax.swing.JFrame {
    
    Usuario u1 = new Usuario();

    /**
     * Creates new form CriarUsuario
     */
    public CriarUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgSexo = new javax.swing.ButtonGroup();
        btgGestante = new javax.swing.ButtonGroup();
        btgAmamentando = new javax.swing.ButtonGroup();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        painelImagemFundo2 = new controle_de_consumo_de_agua.PainelImagemFundo();
        btnSalvar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblCriarUsuario = new javax.swing.JLabel();
        lblNomeUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblConfirmarSenha = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtConfirmarSenha = new javax.swing.JPasswordField();
        txtSenha = new javax.swing.JPasswordField();
        lblAviso = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblNascimento = new javax.swing.JLabel();
        lblGestante = new javax.swing.JLabel();
        lblDia = new javax.swing.JLabel();
        lblMes = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        lblAmamentando = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        rbtSimAmamentando = new javax.swing.JRadioButton();
        rbtNaoAmamentando = new javax.swing.JRadioButton();
        rbtSimGestante = new javax.swing.JRadioButton();
        rbtNaoGestante = new javax.swing.JRadioButton();
        rbtMasculino = new javax.swing.JRadioButton();
        rbtFeminino = new javax.swing.JRadioButton();
        lblPeso = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/controle_de_consumo_de_agua/CCADrop.png"))); // NOI18N
        jInternalFrame1.setVisible(true);

        painelImagemFundo2.setBackground(new java.awt.Color(102, 102, 102));
        painelImagemFundo2.setLayout(null);

        btnSalvar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        painelImagemFundo2.add(btnSalvar);
        btnSalvar.setBounds(201, 521, 97, 37);

        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        painelImagemFundo2.add(btnVoltar);
        btnVoltar.setBounds(381, 521, 95, 37);

        lblCriarUsuario.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblCriarUsuario.setText("Criar Usuário");
        painelImagemFundo2.add(lblCriarUsuario);
        lblCriarUsuario.setBounds(222, 11, 206, 44);

        lblNomeUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNomeUsuario.setText("Nome do usuário:");
        painelImagemFundo2.add(lblNomeUsuario);
        lblNomeUsuario.setBounds(32, 89, 141, 22);

        lblSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSenha.setText("Senha:");
        painelImagemFundo2.add(lblSenha);
        lblSenha.setBounds(32, 151, 54, 22);

        lblConfirmarSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblConfirmarSenha.setText("Confirmar senha:");
        painelImagemFundo2.add(lblConfirmarSenha);
        lblConfirmarSenha.setBounds(32, 213, 135, 22);

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        painelImagemFundo2.add(txtNome);
        txtNome.setBounds(32, 117, 256, 28);

        txtConfirmarSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtConfirmarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmarSenhaActionPerformed(evt);
            }
        });
        painelImagemFundo2.add(txtConfirmarSenha);
        txtConfirmarSenha.setBounds(32, 244, 256, 28);

        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        painelImagemFundo2.add(txtSenha);
        txtSenha.setBounds(32, 179, 256, 28);

        lblAviso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAviso.setText("Atenção! Não use dados sensiveis, pois esse programa não tem criptografia.");
        painelImagemFundo2.add(lblAviso);
        lblAviso.setBounds(32, 481, 601, 22);

        lblSexo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSexo.setText("Sexo:");
        painelImagemFundo2.add(lblSexo);
        lblSexo.setBounds(370, 89, 44, 22);

        lblNascimento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNascimento.setText("Nascimento:");
        painelImagemFundo2.add(lblNascimento);
        lblNascimento.setBounds(370, 163, 97, 22);

        lblGestante.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblGestante.setText("Gestante:");
        painelImagemFundo2.add(lblGestante);
        lblGestante.setBounds(30, 310, 75, 22);

        lblDia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDia.setText("Dia:");
        painelImagemFundo2.add(lblDia);
        lblDia.setBounds(370, 187, 24, 17);

        lblMes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMes.setText("Mês:");
        painelImagemFundo2.add(lblMes);
        lblMes.setBounds(417, 187, 28, 17);

        lblAno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAno.setText("Ano:");
        painelImagemFundo2.add(lblAno);
        lblAno.setBounds(464, 187, 29, 17);

        lblAmamentando.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAmamentando.setText("Amamentando:");
        painelImagemFundo2.add(lblAmamentando);
        lblAmamentando.setBounds(32, 409, 120, 22);

        txtDia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        painelImagemFundo2.add(txtDia);
        txtDia.setBounds(370, 210, 29, 23);

        txtMes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        painelImagemFundo2.add(txtMes);
        txtMes.setBounds(417, 210, 29, 23);

        txtAno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        painelImagemFundo2.add(txtAno);
        txtAno.setBounds(464, 210, 59, 23);

        btgAmamentando.add(rbtSimAmamentando);
        rbtSimAmamentando.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtSimAmamentando.setText("Sim, estou amamentando.");
        rbtSimAmamentando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtSimAmamentandoActionPerformed(evt);
            }
        });
        painelImagemFundo2.add(rbtSimAmamentando);
        rbtSimAmamentando.setBounds(32, 438, 187, 25);

        btgAmamentando.add(rbtNaoAmamentando);
        rbtNaoAmamentando.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtNaoAmamentando.setText("Não estou amamentando.");
        rbtNaoAmamentando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNaoAmamentandoActionPerformed(evt);
            }
        });
        painelImagemFundo2.add(rbtNaoAmamentando);
        rbtNaoAmamentando.setBounds(248, 438, 185, 25);

        btgGestante.add(rbtSimGestante);
        rbtSimGestante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtSimGestante.setText("Sim, sou gestante.");
        rbtSimGestante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtSimGestanteActionPerformed(evt);
            }
        });
        painelImagemFundo2.add(rbtSimGestante);
        rbtSimGestante.setBounds(30, 350, 139, 25);

        btgGestante.add(rbtNaoGestante);
        rbtNaoGestante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtNaoGestante.setText("Não sou gestante.");
        rbtNaoGestante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNaoGestanteActionPerformed(evt);
            }
        });
        painelImagemFundo2.add(rbtNaoGestante);
        rbtNaoGestante.setBounds(200, 350, 137, 25);

        btgSexo.add(rbtMasculino);
        rbtMasculino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtMasculino.setText("Masculino");
        rbtMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtMasculinoActionPerformed(evt);
            }
        });
        painelImagemFundo2.add(rbtMasculino);
        rbtMasculino.setBounds(370, 113, 83, 25);

        btgSexo.add(rbtFeminino);
        rbtFeminino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtFeminino.setText("Feminino");
        rbtFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtFemininoActionPerformed(evt);
            }
        });
        painelImagemFundo2.add(rbtFeminino);
        rbtFeminino.setBounds(481, 113, 79, 25);

        lblPeso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPeso.setText("Peso(kg):");
        painelImagemFundo2.add(lblPeso);
        lblPeso.setBounds(370, 250, 76, 22);

        txtPeso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        painelImagemFundo2.add(txtPeso);
        txtPeso.setBounds(370, 280, 86, 28);

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle_de_consumo_de_agua/CCAWater.jpg"))); // NOI18N
        painelImagemFundo2.add(lblImage);
        lblImage.setBounds(0, 0, 660, 590);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(painelImagemFundo2, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelImagemFundo2, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtConfirmarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmarSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmarSenhaActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Login enter = new Login();
        enter.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void rbtMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtMasculinoActionPerformed
    if(rbtMasculino.isSelected()){
        u1.setSexo("Masculino");
        u1.setAmamentando(false);
        u1.setGestante(false);
        rbtSimAmamentando.setVisible(false);
        rbtNaoAmamentando.setVisible(false);
        lblAmamentando.setVisible(false);
        rbtSimGestante.setVisible(false);
        rbtNaoGestante.setVisible(false);
        lblGestante.setVisible(false);}
    }//GEN-LAST:event_rbtMasculinoActionPerformed

    private void rbtFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtFemininoActionPerformed
        if(rbtFeminino.isSelected()){
            u1.setSexo("Feminino");
            rbtSimAmamentando.setVisible(true);
            rbtNaoAmamentando.setVisible(true);
            lblAmamentando.setVisible(true);
            rbtSimGestante.setVisible(true);
            rbtNaoGestante.setVisible(true);
            lblGestante.setVisible(true);
            if(rbtSimAmamentando.isSelected()){
                u1.setAmamentando(true);}
            if(rbtNaoAmamentando.isSelected()){
                u1.setAmamentando(false);}
            if(rbtSimGestante.isSelected()){
                u1.setGestante(true);}
            if(rbtNaoGestante.isSelected()){
                u1.setGestante(false);}
        }
    }//GEN-LAST:event_rbtFemininoActionPerformed

    private void rbtSimGestanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtSimGestanteActionPerformed
        u1.setGestante(true);
    }//GEN-LAST:event_rbtSimGestanteActionPerformed

    private void rbtNaoGestanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNaoGestanteActionPerformed
        u1.setGestante(false);
    }//GEN-LAST:event_rbtNaoGestanteActionPerformed

    private void rbtSimAmamentandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtSimAmamentandoActionPerformed
        u1.setAmamentando(true);
    }//GEN-LAST:event_rbtSimAmamentandoActionPerformed

    private void rbtNaoAmamentandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNaoAmamentandoActionPerformed
        u1.setAmamentando(false);
    }//GEN-LAST:event_rbtNaoAmamentandoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try{
            boolean name_block = false;
            boolean prec_pregnancy = false;
            
            Class.forName("com.mysql.jdbc.Driver");

            String table = "create table if not exists cca_user (id int auto_increment not null, nome varchar(30) not null, senha varchar(20) not null, idade int(3) not null, sexo enum('Masculino', 'Feminino') not null, peso decimal(5,2) not null, amamentando boolean not null, gestante boolean not null, dian int(2) not null, mesn int(2) not null, anon int (4) not null, primary key (id)) default charset = utf8;";
            String sql = "select * from cca_user;";
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cca", "root", "");
        
            Statement stmt = con.createStatement();
            stmt.executeUpdate(table);
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                String nome = rs.getString("nome");
                if(txtNome.getText().equalsIgnoreCase(nome)){
                name_block = true;}
            }
            
            u1.setAnon(Integer.parseInt(txtAno.getText()));
            u1.setMesn(Integer.parseInt(txtMes.getText()));
            u1.setDian(Integer.parseInt(txtDia.getText()));
            
            if (u1.IdadeC() <= 13 && (rbtSimGestante.isSelected() == true || rbtSimAmamentando.isSelected() == true || u1.isGestante() == true || u1.isAmamentando() == true)){
                prec_pregnancy = true;}
            
            if(prec_pregnancy == true){
                JOptionPane.showMessageDialog(this, "A garota é muito jovem para engravidar ou amamentar.");}

            if((Integer.parseInt(txtDia.getText()) <= 31 && Integer.parseInt(txtDia.getText()) > 0 && !txtDia.getText().equals ("")) &&
               (Integer.parseInt(txtMes.getText()) <= 12 && Integer.parseInt(txtMes.getText()) > 0 && !txtMes.getText().equals ("")) &&
               (Integer.parseInt(txtAno.getText()) >= 1800 && Integer.parseInt(txtAno.getText()) > 0 && !txtAno.getText().equals ("")) &&
               ((u1.getAnoatual() > Integer.parseInt(txtAno.getText())) || (u1.getAnoatual() == Integer.parseInt(txtAno.getText()) && (u1.getDiaatual() >= Integer.parseInt(txtDia.getText()) && u1.getMesatual() >= Integer.parseInt(txtMes.getText())))) &&     
               ((rbtMasculino.isSelected() == true) ||
                (rbtFeminino.isSelected() == true && rbtSimGestante.isSelected() == true && rbtSimAmamentando.isSelected() == true && rbtNaoAmamentando.isSelected() == false && rbtNaoGestante.isSelected() == false) ||
                (rbtFeminino.isSelected() == true && rbtSimGestante.isSelected() == true && rbtSimAmamentando.isSelected() == false && rbtNaoAmamentando.isSelected() == true && rbtNaoGestante.isSelected() == false) ||
                (rbtFeminino.isSelected() == true && rbtSimGestante.isSelected() == false && rbtSimAmamentando.isSelected() == true && rbtNaoAmamentando.isSelected() == false && rbtNaoGestante.isSelected() == true) ||
                (rbtFeminino.isSelected() == true && rbtSimGestante.isSelected() == false && rbtSimAmamentando.isSelected() == false && rbtNaoAmamentando.isSelected() == true && rbtNaoGestante.isSelected() == true)) &&
                (txtSenha.getText().equals(txtConfirmarSenha.getText())) &&
               (!txtPeso.getText().equals("")) &&
               (!txtNome.getText().equals("")) &&
               (!txtSenha.getText().equals("")) &&
                 name_block == false &&
                 prec_pregnancy == false
               ){
                u1.setNome(txtNome.getText());
                u1.setSenha(txtSenha.getText());
                u1.setPeso(Double.parseDouble(txtPeso.getText()));
                u1.setDian(Integer.parseInt(txtDia.getText()));
                u1.setAnon(Integer.parseInt(txtAno.getText()));
                u1.setMesn(Integer.parseInt(txtMes.getText()));
                u1.Idade();
                String add_user = "insert into cca_user values(default, '"+ u1.getNome() +"', '"+ u1.getSenha() +"', '"+ u1.IdadeC() +"', '"+ u1.getSexo() +"', '"+ u1.getPeso() +"', "+ u1.isAmamentando() +", "+ u1.isGestante() +", '"+ u1.getDian() +"', '"+ u1.getMesn() +"', '"+ u1.getAnon() +"');";
                String add_table = "create table " + txtNome.getText() + "_cca(nome varchar(30) not null, quantidade int(6), vezes int(3), metacl varchar(10) not null, metame varchar(10) not null, dia int(2) not null, mes int(2) not null, ano int(4) not null)default charset = utf8;";
                stmt.executeUpdate(add_user);
                stmt.executeUpdate(add_table);
                JOptionPane.showMessageDialog(this, "Usuário criado com sucesso!");
            }
            if (name_block == true){
                JOptionPane.showMessageDialog(this, "O nome do usuário já existe!");}
            
            if (!txtSenha.getText().equals(txtConfirmarSenha.getText())){
                JOptionPane.showMessageDialog(this, "As senhas estão diferentes!");
            }
            if((txtDia.getText().equals ("")) ||
               (txtMes.getText().equals ("")) ||
               (txtAno.getText().equals ("")) ||
               (rbtMasculino.isSelected() == false && rbtFeminino.isSelected() == false) ||
               (rbtFeminino.isSelected() == true &&
               ((rbtSimGestante.isSelected() == false && rbtNaoGestante.isSelected() == false) ||
               (rbtSimAmamentando.isSelected() == false && rbtNaoAmamentando.isSelected() == false))) ||
               (txtSenha.getText().equals("")) ||
               (txtPeso.getText().equals("")) ||
               (txtNome.getText().equals("")) ||
               (txtConfirmarSenha.getText().equals(""))){
                JOptionPane.showMessageDialog(this, "Preencha todos os dados!");}
            
            if((Integer.parseInt(txtDia.getText()) <= 0 || Integer.parseInt(txtDia.getText()) > 31) ||
               (Integer.parseInt(txtMes.getText()) <= 0 || Integer.parseInt(txtMes.getText()) > 12) ||
               (Integer.parseInt(txtAno.getText()) <= 1800 || u1.getAnoatual() < Integer.parseInt(txtAno.getText())) ||
               (u1.getAnoatual() == Integer.parseInt(txtAno.getText()) && (u1.getDiaatual() < Integer.parseInt(txtDia.getText()) && u1.getMesatual() < Integer.parseInt(txtMes.getText())))){
               JOptionPane.showMessageDialog(this, "Data inválida!");}
            
            if(Integer.parseInt(txtAno.getText()) <= 1800){
                JOptionPane.showMessageDialog(this, "O menor ano permitido é 1801.");}
            
            con.close();
        }
        catch(Exception a){
            JOptionPane.showMessageDialog(this, "Erro, confira se todos os dados foram \npreenchidos corretamente e tente novamente!");}
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(CriarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgAmamentando;
    private javax.swing.ButtonGroup btgGestante;
    private javax.swing.ButtonGroup btgSexo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel lblAmamentando;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblConfirmarSenha;
    private javax.swing.JLabel lblCriarUsuario;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblGestante;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSexo;
    private controle_de_consumo_de_agua.PainelImagemFundo painelImagemFundo2;
    private javax.swing.JRadioButton rbtFeminino;
    private javax.swing.JRadioButton rbtMasculino;
    private javax.swing.JRadioButton rbtNaoAmamentando;
    private javax.swing.JRadioButton rbtNaoGestante;
    private javax.swing.JRadioButton rbtSimAmamentando;
    private javax.swing.JRadioButton rbtSimGestante;
    private javax.swing.JTextField txtAno;
    private javax.swing.JPasswordField txtConfirmarSenha;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}