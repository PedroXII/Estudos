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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pedro
 */
public class AtualizarDados extends javax.swing.JFrame {
    
    Usuario u1 = new Usuario();

    /**
     * Creates new form CriarUsuario
     */
    public AtualizarDados() {
        initComponents();
    }
    public AtualizarDados(int id, String nome, String senha, int idade, String sexo, double peso, boolean amamentando, boolean gestante, int dian, int mesn, int anon, int quantidade){
        initComponents();
        DefaultTableModel model = (DefaultTableModel)tblUsuario.getModel();
        model.addRow(new Object[]{
            id,
            String.valueOf(nome),
            String.valueOf(senha),
            idade,
            String.valueOf(sexo),
            peso,
            amamentando,
            gestante,
            dian,
            mesn,
            anon,
            quantidade
        });
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
        lblAtualizarDados = new javax.swing.JLabel();
        lblNovoNome = new javax.swing.JLabel();
        lblSenhaAntiga = new javax.swing.JLabel();
        lblConfirmarSenha = new javax.swing.JLabel();
        txtNovoNome = new javax.swing.JTextField();
        txtConfirmarSenha = new javax.swing.JPasswordField();
        txtSenhaAntiga = new javax.swing.JPasswordField();
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
        lblSenhaNova = new javax.swing.JLabel();
        txtSenhaNova = new javax.swing.JPasswordField();
        btnExcluirUsuario = new javax.swing.JButton();
        lblInstrucao = new javax.swing.JLabel();
        txtDeletar = new javax.swing.JTextField();
        btnDeletar = new javax.swing.JButton();
        lblSenhaDeletar = new javax.swing.JLabel();
        lblDeletar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();
        txtSenhaDeletar = new javax.swing.JPasswordField();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/controle_de_consumo_de_agua/CCADrop.png"))); // NOI18N
        jInternalFrame1.setVisible(true);

        painelImagemFundo2.setBackground(new java.awt.Color(102, 102, 102));
        painelImagemFundo2.setImg(new ImageIcon("src/controle_de_consumo_de_agua/CCADrop.png"));
        painelImagemFundo2.setLayout(null);

        btnSalvar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        painelImagemFundo2.add(btnSalvar);
        btnSalvar.setBounds(99, 428, 97, 37);

        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        painelImagemFundo2.add(btnVoltar);
        btnVoltar.setBounds(405, 428, 95, 37);

        lblAtualizarDados.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblAtualizarDados.setText("Atualizar Dados");
        lblAtualizarDados.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblAtualizarDadosPropertyChange(evt);
            }
        });
        painelImagemFundo2.add(lblAtualizarDados);
        lblAtualizarDados.setBounds(188, 11, 247, 44);

        lblNovoNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNovoNome.setText("Novo nome:");
        painelImagemFundo2.add(lblNovoNome);
        lblNovoNome.setBounds(10, 61, 97, 22);

        lblSenhaAntiga.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSenhaAntiga.setText("Senha antiga:");
        painelImagemFundo2.add(lblSenhaAntiga);
        lblSenhaAntiga.setBounds(10, 123, 108, 22);

        lblConfirmarSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblConfirmarSenha.setText("Confirmar senha:");
        painelImagemFundo2.add(lblConfirmarSenha);
        lblConfirmarSenha.setBounds(10, 247, 135, 22);

        txtNovoNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNovoNome.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtNovoNomePropertyChange(evt);
            }
        });
        painelImagemFundo2.add(txtNovoNome);
        txtNovoNome.setBounds(10, 89, 256, 28);

        txtConfirmarSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtConfirmarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmarSenhaActionPerformed(evt);
            }
        });
        painelImagemFundo2.add(txtConfirmarSenha);
        txtConfirmarSenha.setBounds(10, 278, 256, 28);

        txtSenhaAntiga.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        painelImagemFundo2.add(txtSenhaAntiga);
        txtSenhaAntiga.setBounds(10, 151, 256, 28);

        lblAviso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAviso.setText("Atenção! Não use dados sensiveis, pois esse programa não tem criptografia.");
        painelImagemFundo2.add(lblAviso);
        lblAviso.setBounds(10, 400, 601, 22);

        lblSexo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSexo.setText("Sexo:");
        painelImagemFundo2.add(lblSexo);
        lblSexo.setBounds(348, 61, 44, 22);

        lblNascimento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNascimento.setText("Nascimento:");
        painelImagemFundo2.add(lblNascimento);
        lblNascimento.setBounds(348, 128, 97, 22);

        lblGestante.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblGestante.setText("Gestante:");
        painelImagemFundo2.add(lblGestante);
        lblGestante.setBounds(299, 282, 75, 22);

        lblDia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDia.setText("Dia:");
        painelImagemFundo2.add(lblDia);
        lblDia.setBounds(348, 152, 24, 17);

        lblMes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMes.setText("Mês:");
        painelImagemFundo2.add(lblMes);
        lblMes.setBounds(395, 152, 28, 17);

        lblAno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAno.setText("Ano:");
        painelImagemFundo2.add(lblAno);
        lblAno.setBounds(442, 152, 29, 17);

        lblAmamentando.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAmamentando.setText("Amamentando:");
        painelImagemFundo2.add(lblAmamentando);
        lblAmamentando.setBounds(10, 317, 120, 22);

        txtDia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        painelImagemFundo2.add(txtDia);
        txtDia.setBounds(348, 175, 29, 23);

        txtMes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        painelImagemFundo2.add(txtMes);
        txtMes.setBounds(395, 175, 29, 23);

        txtAno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        painelImagemFundo2.add(txtAno);
        txtAno.setBounds(442, 175, 59, 23);

        btgAmamentando.add(rbtSimAmamentando);
        rbtSimAmamentando.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtSimAmamentando.setText("Sim, estou amamentando.");
        rbtSimAmamentando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtSimAmamentandoActionPerformed(evt);
            }
        });
        painelImagemFundo2.add(rbtSimAmamentando);
        rbtSimAmamentando.setBounds(10, 357, 187, 25);

        btgAmamentando.add(rbtNaoAmamentando);
        rbtNaoAmamentando.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtNaoAmamentando.setText("Não estou amamentando.");
        rbtNaoAmamentando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNaoAmamentandoActionPerformed(evt);
            }
        });
        painelImagemFundo2.add(rbtNaoAmamentando);
        rbtNaoAmamentando.setBounds(226, 357, 185, 25);

        btgGestante.add(rbtSimGestante);
        rbtSimGestante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtSimGestante.setText("Sim, sou gestante.");
        rbtSimGestante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtSimGestanteActionPerformed(evt);
            }
        });
        painelImagemFundo2.add(rbtSimGestante);
        rbtSimGestante.setBounds(299, 311, 139, 25);

        btgGestante.add(rbtNaoGestante);
        rbtNaoGestante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtNaoGestante.setText("Não sou gestante.");
        rbtNaoGestante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNaoGestanteActionPerformed(evt);
            }
        });
        painelImagemFundo2.add(rbtNaoGestante);
        rbtNaoGestante.setBounds(474, 311, 137, 25);

        btgSexo.add(rbtMasculino);
        rbtMasculino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtMasculino.setText("Masculino");
        rbtMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtMasculinoActionPerformed(evt);
            }
        });
        painelImagemFundo2.add(rbtMasculino);
        rbtMasculino.setBounds(348, 85, 83, 25);

        btgSexo.add(rbtFeminino);
        rbtFeminino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtFeminino.setText("Feminino");
        rbtFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtFemininoActionPerformed(evt);
            }
        });
        painelImagemFundo2.add(rbtFeminino);
        rbtFeminino.setBounds(459, 85, 79, 25);

        lblPeso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPeso.setText("Peso(kg):");
        painelImagemFundo2.add(lblPeso);
        lblPeso.setBounds(348, 209, 76, 22);

        txtPeso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        painelImagemFundo2.add(txtPeso);
        txtPeso.setBounds(348, 237, 86, 28);

        lblSenhaNova.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSenhaNova.setText("Senha nova:");
        painelImagemFundo2.add(lblSenhaNova);
        lblSenhaNova.setBounds(10, 185, 98, 22);

        txtSenhaNova.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        painelImagemFundo2.add(txtSenhaNova);
        txtSenhaNova.setBounds(10, 213, 256, 28);

        btnExcluirUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnExcluirUsuario.setText("Excluir usuário");
        btnExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirUsuarioActionPerformed(evt);
            }
        });
        painelImagemFundo2.add(btnExcluirUsuario);
        btnExcluirUsuario.setBounds(212, 476, 185, 37);

        lblInstrucao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInstrucao.setText("Digite \"Deletar\", sua senha e clique no botão Deletar.");
        lblInstrucao.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblInstrucaoPropertyChange(evt);
            }
        });
        painelImagemFundo2.add(lblInstrucao);
        lblInstrucao.setBounds(141, 519, 419, 22);

        txtDeletar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDeletar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtDeletarPropertyChange(evt);
            }
        });
        painelImagemFundo2.add(txtDeletar);
        txtDeletar.setBounds(31, 568, 147, 28);

        btnDeletar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        btnDeletar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                btnDeletarPropertyChange(evt);
            }
        });
        painelImagemFundo2.add(btnDeletar);
        btnDeletar.setBounds(508, 567, 87, 31);

        lblSenhaDeletar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSenhaDeletar.setText("Digite sua senha:");
        lblSenhaDeletar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblSenhaDeletarPropertyChange(evt);
            }
        });
        painelImagemFundo2.add(lblSenhaDeletar);
        lblSenhaDeletar.setBounds(260, 544, 104, 17);

        lblDeletar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDeletar.setText("Digite \"Deletar\".");
        lblDeletar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblDeletarPropertyChange(evt);
            }
        });
        painelImagemFundo2.add(lblDeletar);
        lblDeletar.setBounds(31, 544, 97, 17);

        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Senha", "Idade", "Sexo", "Peso", "Amamentando", "Gestante", "DiaNascimento", "MesNascimento", "AnoNascimento", "QuantidadeDiaria"
            }
        ));
        jScrollPane1.setViewportView(tblUsuario);

        painelImagemFundo2.add(jScrollPane1);
        jScrollPane1.setBounds(30, 610, 580, 0);

        txtSenhaDeletar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSenhaDeletar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtSenhaDeletarPropertyChange(evt);
            }
        });
        painelImagemFundo2.add(txtSenhaDeletar);
        txtSenhaDeletar.setBounds(260, 568, 140, 28);

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle_de_consumo_de_agua/CCAWater.jpg"))); // NOI18N
        painelImagemFundo2.add(lblImage);
        lblImage.setBounds(0, 0, 670, 630);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(painelImagemFundo2, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelImagemFundo2, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtConfirmarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmarSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmarSenhaActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        int id = Integer.parseInt(tblUsuario.getValueAt(0, 0).toString());
        String nome = tblUsuario.getValueAt(0, 1).toString();
        String senha = tblUsuario.getValueAt(0, 2).toString();
        int idade = Integer.parseInt(tblUsuario.getValueAt(0, 3).toString());
        String sexo = tblUsuario.getValueAt(0, 4).toString();
        double peso = Double.parseDouble(tblUsuario.getValueAt(0, 5).toString());
        boolean amamentando = Boolean.parseBoolean(tblUsuario.getValueAt(0, 6).toString());
        boolean gestante = Boolean.parseBoolean(tblUsuario.getValueAt(0, 7).toString());
        int dian = Integer.parseInt(tblUsuario.getValueAt(0, 8).toString());
        int mesn = Integer.parseInt(tblUsuario.getValueAt(0, 9).toString());
        int anon = Integer.parseInt(tblUsuario.getValueAt(0, 10).toString());
        int quantidade = Integer.parseInt(tblUsuario.getValueAt(0, 11).toString());
        
        new SelecionarMetodo(id, nome, senha, idade, sexo, peso, amamentando, gestante, dian, mesn, anon, quantidade).setVisible(true);
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
            
            int id = Integer.parseInt(tblUsuario.getValueAt(0, 0).toString());
            String nome = tblUsuario.getValueAt(0, 1).toString();
            String senha = tblUsuario.getValueAt(0, 2).toString();
            int idade = Integer.parseInt(tblUsuario.getValueAt(0, 3).toString());
            String sexo = tblUsuario.getValueAt(0, 4).toString();
            double peso = Double.parseDouble(tblUsuario.getValueAt(0, 5).toString());
            boolean amamentando = Boolean.parseBoolean(tblUsuario.getValueAt(0, 6).toString());
            boolean gestante = Boolean.parseBoolean(tblUsuario.getValueAt(0, 7).toString());
            int dian = Integer.parseInt(tblUsuario.getValueAt(0, 8).toString());
            int mesn = Integer.parseInt(tblUsuario.getValueAt(0, 9).toString());
            int anon = Integer.parseInt(tblUsuario.getValueAt(0, 10).toString());
            int quantidade = Integer.parseInt(tblUsuario.getValueAt(0, 11).toString());
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cca", "root", "");
        
            String sql = "select * from cca_user;";
        
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                String nomedb = rs.getString("nome");
                if((txtNovoNome.getText().equalsIgnoreCase(nomedb)) && (!nomedb.equals(nome))){
                name_block = true;}
            }
            
            u1.setAnon(Integer.parseInt(txtAno.getText()));
            u1.setMesn(Integer.parseInt(txtMes.getText()));
            u1.setDian(Integer.parseInt(txtDia.getText()));
            
            if (u1.IdadeC() <= 13 && (rbtSimGestante.isSelected() == true || rbtSimAmamentando.isSelected() == true || u1.isGestante() == true || u1.isAmamentando() == true)){
                prec_pregnancy = true;}
            
            if(prec_pregnancy == true){
                JOptionPane.showMessageDialog(this, "A garota é muito jovem para engravidar ou amamentar.");}

            if (name_block == true){
                JOptionPane.showMessageDialog(this, "O nome do usuário já existe!");}
            
            if (!txtSenhaNova.getText().equals(txtConfirmarSenha.getText())){
                JOptionPane.showMessageDialog(this, "As senhas estão diferentes!");
            }
            if((txtDia.getText().equals ("")) ||
               (txtMes.getText().equals ("")) ||
               (txtAno.getText().equals ("")) ||
               (rbtMasculino.isSelected() == false && rbtFeminino.isSelected() == false) ||
               (rbtFeminino.isSelected() == true &&
               ((rbtSimGestante.isSelected() == false && rbtNaoGestante.isSelected() == false) ||
               (rbtSimAmamentando.isSelected() == false && rbtNaoAmamentando.isSelected() == false))) ||
               (txtSenhaAntiga.getText().equals("")) ||
               (txtPeso.getText().equals("")) ||
               (txtNovoNome.getText().equals("")) ||
               (txtConfirmarSenha.getText().equals(""))){
                JOptionPane.showMessageDialog(this, "Preencha todos os dados!");}
            
            if((Integer.parseInt(txtDia.getText()) <= 0 || Integer.parseInt(txtDia.getText()) > 31) ||
               (Integer.parseInt(txtMes.getText()) <= 0 || Integer.parseInt(txtMes.getText()) > 12) ||
               (Integer.parseInt(txtAno.getText()) <= 1800 || u1.getAnoatual() < Integer.parseInt(txtAno.getText())) ||
               (u1.getAnoatual() == Integer.parseInt(txtAno.getText()) && (u1.getDiaatual() < Integer.parseInt(txtDia.getText()) && u1.getMesatual() < Integer.parseInt(txtMes.getText())))){
               JOptionPane.showMessageDialog(this, "Data inválida!");}
            
            if(Integer.parseInt(txtAno.getText()) <= 1800){
                JOptionPane.showMessageDialog(this, "O menor ano permitido é 1801.");}
            
            if(!txtSenhaAntiga.getText().equals(senha)){
                JOptionPane.showMessageDialog(this, "Senha antiga incorreta!");
            }
            
            if((Integer.parseInt(txtDia.getText()) <= 31 && Integer.parseInt(txtDia.getText()) > 0 && !txtDia.getText().equals ("")) &&
               (Integer.parseInt(txtMes.getText()) <= 12 && Integer.parseInt(txtMes.getText()) > 0 && !txtMes.getText().equals ("")) &&
               (Integer.parseInt(txtAno.getText()) >= 1800 && Integer.parseInt(txtAno.getText()) > 0 && !txtAno.getText().equals ("")) &&
               ((rbtMasculino.isSelected() == true) ||
                (rbtFeminino.isSelected() == true && rbtSimGestante.isSelected() == true && rbtSimAmamentando.isSelected() == true && rbtNaoAmamentando.isSelected() == false && rbtNaoGestante.isSelected() == false) ||
                (rbtFeminino.isSelected() == true && rbtSimGestante.isSelected() == true && rbtSimAmamentando.isSelected() == false && rbtNaoAmamentando.isSelected() == true && rbtNaoGestante.isSelected() == false) ||
                (rbtFeminino.isSelected() == true && rbtSimGestante.isSelected() == false && rbtSimAmamentando.isSelected() == true && rbtNaoAmamentando.isSelected() == false && rbtNaoGestante.isSelected() == true) ||
                (rbtFeminino.isSelected() == true && rbtSimGestante.isSelected() == false && rbtSimAmamentando.isSelected() == false && rbtNaoAmamentando.isSelected() == true && rbtNaoGestante.isSelected() == true)) &&
               ((u1.getAnoatual() > Integer.parseInt(txtAno.getText())) || (u1.getAnoatual() == Integer.parseInt(txtAno.getText()) && (u1.getDiaatual() >= Integer.parseInt(txtDia.getText()) && u1.getMesatual() >= Integer.parseInt(txtMes.getText())))) &&     
                (txtSenhaAntiga.getText().equals(senha)) &&
               (!txtPeso.getText().equals("")) &&
               (!txtNovoNome.getText().equals("")) &&
                 name_block == false &&
                 prec_pregnancy == false
               ){
                u1.setId(id);
                u1.setNome(txtNovoNome.getText());
                u1.setNome_antigo(nome);
                u1.setSenha(txtSenhaNova.getText());
                u1.setPeso(Double.parseDouble(txtPeso.getText()));
                u1.setDian(Integer.parseInt(txtDia.getText()));
                u1.setAnon(Integer.parseInt(txtAno.getText()));
                u1.setMesn(Integer.parseInt(txtMes.getText()));
                u1.Idade();
                u1.IdadeC();
                String update_user = "update cca_user set nome = '"+ u1.getNome() +"', senha = '"+ u1.getSenha() +"', idade = '"+ u1.IdadeC() +"', sexo = '"+ u1.getSexo() +"', peso = '"+ u1.getPeso() +"', amamentando = "+ u1.isAmamentando() +", gestante = "+ u1.isGestante() +", dian = '"+ u1.getDian() +"', mesn = '"+ u1.getMesn() +"', anon = '"+ u1.getAnon() +"' where id = '"+ id +"';";
                String update_table_name = "alter table " + u1.getNome_antigo() + "_cca rename to "+ u1.getNome() +"_cca;";
                stmt.executeUpdate(update_user);
                stmt.executeUpdate(update_table_name);
                
                ((DefaultTableModel)tblUsuario.getModel()).removeRow(0);
                DefaultTableModel model = (DefaultTableModel)tblUsuario.getModel();
                model.addRow(new Object[]{
                    u1.getId(),
                    String.valueOf(u1.getNome()),
                    String.valueOf(u1.getSenha()),
                    u1.IdadeC(),
                    String.valueOf(u1.getSexo()),
                    u1.getPeso(),
                    u1.isAmamentando(),
                    u1.isGestante(),
                    u1.getDian(),
                    u1.getMesn(),
                    u1.getAnon(),
                    quantidade
                });
                JOptionPane.showMessageDialog(this, "Usuário atualizado com sucesso!");
                con.close();
            }
            
            lblInstrucao.setVisible(false);
            txtDeletar.setVisible(false);
            btnDeletar.setVisible(false);
            lblDeletar.setVisible(false);
            txtDeletar.setVisible(false);
            lblSenhaDeletar.setVisible(false);
            txtSenhaDeletar.setVisible(false);
            con.close();
        }
        catch(Exception a){
            JOptionPane.showMessageDialog(this, "Erro, confira se todos os dados foram \npreenchidos corretamente e tente novamente!");}
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirUsuarioActionPerformed
        lblInstrucao.setVisible(true);
        txtDeletar.setVisible(true);
        btnDeletar.setVisible(true);
        lblDeletar.setVisible(true);
        txtDeletar.setVisible(true);
        lblSenhaDeletar.setVisible(true);
        txtSenhaDeletar.setVisible(true);
    }//GEN-LAST:event_btnExcluirUsuarioActionPerformed

    private void lblInstrucaoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblInstrucaoPropertyChange
        lblInstrucao.setVisible(false);
    }//GEN-LAST:event_lblInstrucaoPropertyChange

    private void txtDeletarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtDeletarPropertyChange
        txtDeletar.setVisible(false);
    }//GEN-LAST:event_txtDeletarPropertyChange

    private void btnDeletarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_btnDeletarPropertyChange
        btnDeletar.setVisible(false);
    }//GEN-LAST:event_btnDeletarPropertyChange

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cca", "root", "");
        Statement stmt = con.createStatement();
        
        int id = Integer.parseInt(tblUsuario.getValueAt(0, 0).toString());
        String nome = tblUsuario.getValueAt(0, 1).toString();
        String senha = tblUsuario.getValueAt(0, 2).toString();
        
        String sql = "select * from cca_user;";
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
                String nomedb = rs.getString("nome");
                String senhadb = rs.getString("senha");
                if(nome.equals(nomedb)){
                    u1.setSenha(senhadb);
                }
            }
        if (txtDeletar.getText().equals("Deletar") && senha.equals(txtSenhaDeletar.getText())){
        
            String delete_user = "delete from cca_user where id = '"+ id +"' limit 1;";
            String delete_table = "drop table "+ nome +"_cca;";
            
            stmt.executeUpdate(delete_user);
            stmt.executeUpdate(delete_table);
            JOptionPane.showMessageDialog(this, "USUÁRIO EXCLUIDO!");
            con.close();
            Login exit = new Login();
            exit.setVisible(true);
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "Insira 'Deletar' e a senha para excluir o usuario");
        }
    }
    catch(Exception a){
    }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void lblSenhaDeletarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblSenhaDeletarPropertyChange
        lblSenhaDeletar.setVisible(false);
    }//GEN-LAST:event_lblSenhaDeletarPropertyChange

    private void lblDeletarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblDeletarPropertyChange
        lblDeletar.setVisible(false);
    }//GEN-LAST:event_lblDeletarPropertyChange

    private void txtNovoNomePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtNovoNomePropertyChange
        
    }//GEN-LAST:event_txtNovoNomePropertyChange

    private void lblAtualizarDadosPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblAtualizarDadosPropertyChange

    }//GEN-LAST:event_lblAtualizarDadosPropertyChange

    private void txtSenhaDeletarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtSenhaDeletarPropertyChange
        txtSenhaDeletar.setVisible(false);
    }//GEN-LAST:event_txtSenhaDeletarPropertyChange

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
            java.util.logging.Logger.getLogger(AtualizarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizarDados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgAmamentando;
    private javax.swing.ButtonGroup btgGestante;
    private javax.swing.ButtonGroup btgSexo;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnExcluirUsuario;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAmamentando;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblAtualizarDados;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblConfirmarSenha;
    private javax.swing.JLabel lblDeletar;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblGestante;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblInstrucao;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lblNovoNome;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblSenhaAntiga;
    private javax.swing.JLabel lblSenhaDeletar;
    private javax.swing.JLabel lblSenhaNova;
    private javax.swing.JLabel lblSexo;
    private controle_de_consumo_de_agua.PainelImagemFundo painelImagemFundo2;
    private javax.swing.JRadioButton rbtFeminino;
    private javax.swing.JRadioButton rbtMasculino;
    private javax.swing.JRadioButton rbtNaoAmamentando;
    private javax.swing.JRadioButton rbtNaoGestante;
    private javax.swing.JRadioButton rbtSimAmamentando;
    private javax.swing.JRadioButton rbtSimGestante;
    private javax.swing.JTable tblUsuario;
    private javax.swing.JTextField txtAno;
    private javax.swing.JPasswordField txtConfirmarSenha;
    private javax.swing.JTextField txtDeletar;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNovoNome;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JPasswordField txtSenhaAntiga;
    private javax.swing.JPasswordField txtSenhaDeletar;
    private javax.swing.JPasswordField txtSenhaNova;
    // End of variables declaration//GEN-END:variables
}
