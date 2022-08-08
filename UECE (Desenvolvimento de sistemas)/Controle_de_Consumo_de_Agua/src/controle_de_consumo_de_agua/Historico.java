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
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Pedro
 */
public class Historico extends javax.swing.JFrame {
    
    Usuario u1 = new Usuario();
    /**
     * Creates new form Historico
     */
    public Historico() {
        initComponents();
    }
    public Historico(int id, String nome, String senha, int idade, String sexo, double peso, boolean amamentando, boolean gestante, int dian, int mesn, int anon, int quantidade){
        initComponents();
        lblUsuario.setText("Usuário: " + nome);
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

        btgExcluirOne = new javax.swing.ButtonGroup();
        btgExcluirAll = new javax.swing.ButtonGroup();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        painelImagemFundo1 = new controle_de_consumo_de_agua.PainelImagemFundo();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHistorico = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblData = new javax.swing.JLabel();
        lblDia = new javax.swing.JLabel();
        lblMes = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        lblHistorico = new javax.swing.JLabel();
        lblInstrucao = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();
        btnExcluirHistorico = new javax.swing.JButton();
        btnExibirHistorico = new javax.swing.JButton();
        btnExcluirDaTabela = new javax.swing.JButton();
        lblCerteza = new javax.swing.JLabel();
        rbtNao = new javax.swing.JRadioButton();
        rbtSim = new javax.swing.JRadioButton();
        btnConfirmar = new javax.swing.JButton();
        rbtNao1 = new javax.swing.JRadioButton();
        btnConfirmar1 = new javax.swing.JButton();
        rbtSim1 = new javax.swing.JRadioButton();
        lblCerteza1 = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/controle_de_consumo_de_agua/CCADrop.png"))); // NOI18N
        jInternalFrame1.setVisible(true);

        painelImagemFundo1.setBackground(new java.awt.Color(102, 102, 102));
        painelImagemFundo1.setLayout(null);

        tblHistorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Dia", "Mes", "Ano", "Quantidade(ml)", "Vezes", "Meta(M.E.)", "Meta(C.L.)"
            }
        ));
        jScrollPane1.setViewportView(tblHistorico);

        painelImagemFundo1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 88, 1010, 149);

        btnVoltar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        painelImagemFundo1.add(btnVoltar);
        btnVoltar.setBounds(110, 489, 95, 37);

        btnPesquisar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        painelImagemFundo1.add(btnPesquisar);
        btnPesquisar.setBounds(750, 331, 133, 37);

        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnExcluir.setText("Excluir todo o histórico");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        painelImagemFundo1.add(btnExcluir);
        btnExcluir.setBounds(669, 397, 273, 37);

        lblData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblData.setText("Data:");
        painelImagemFundo1.add(lblData);
        lblData.setBounds(457, 283, 42, 22);

        lblDia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDia.setText("Dia:");
        painelImagemFundo1.add(lblDia);
        lblDia.setBounds(457, 311, 24, 17);

        lblMes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMes.setText("Mês:");
        painelImagemFundo1.add(lblMes);
        lblMes.setBounds(523, 311, 28, 17);

        lblAno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAno.setText("Ano:");
        painelImagemFundo1.add(lblAno);
        lblAno.setBounds(594, 311, 29, 17);

        txtDia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        painelImagemFundo1.add(txtDia);
        txtDia.setBounds(457, 338, 34, 28);

        txtMes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        painelImagemFundo1.add(txtMes);
        txtMes.setBounds(523, 338, 40, 28);

        txtAno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        painelImagemFundo1.add(txtAno);
        txtAno.setBounds(594, 338, 73, 28);

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblUsuario.setText("Usuário:");
        painelImagemFundo1.add(lblUsuario);
        lblUsuario.setBounds(68, 268, 280, 29);

        lblHistorico.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblHistorico.setText("Histórico");
        painelImagemFundo1.add(lblHistorico);
        lblHistorico.setBounds(420, 20, 138, 44);

        lblInstrucao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInstrucao.setText("Insira a data do dia a ser exibido na tabela.");
        painelImagemFundo1.add(lblInstrucao);
        lblInstrucao.setBounds(457, 255, 343, 22);

        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Senha", "Idade", "Sexo", "Peso", "Amamentando", "Gestante", "DiaNascimento", "MesNascimento", "AnoNascimento", "QuantidadeDiaria"
            }
        ));
        jScrollPane3.setViewportView(tblUsuario);

        painelImagemFundo1.add(jScrollPane3);
        jScrollPane3.setBounds(1071, 575, 917, 0);

        btnExcluirHistorico.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnExcluirHistorico.setText("Excluir do histórico");
        btnExcluirHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirHistoricoActionPerformed(evt);
            }
        });
        painelImagemFundo1.add(btnExcluirHistorico);
        btnExcluirHistorico.setBounds(343, 397, 231, 37);

        btnExibirHistorico.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnExibirHistorico.setText("Exibir todo o histórico");
        btnExibirHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibirHistoricoActionPerformed(evt);
            }
        });
        painelImagemFundo1.add(btnExibirHistorico);
        btnExibirHistorico.setBounds(33, 397, 261, 37);

        btnExcluirDaTabela.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnExcluirDaTabela.setText("Excluir da tabela");
        btnExcluirDaTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirDaTabelaActionPerformed(evt);
            }
        });
        painelImagemFundo1.add(btnExcluirDaTabela);
        btnExcluirDaTabela.setBounds(53, 331, 207, 37);

        lblCerteza.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCerteza.setText("Tem certeza?");
        lblCerteza.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblCertezaPropertyChange(evt);
            }
        });
        painelImagemFundo1.add(lblCerteza);
        lblCerteza.setBounds(343, 445, 82, 17);

        btgExcluirOne.add(rbtNao);
        rbtNao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtNao.setText("Não tenho certeza");
        rbtNao.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                rbtNaoPropertyChange(evt);
            }
        });
        painelImagemFundo1.add(rbtNao);
        rbtNao.setBounds(500, 464, 137, 25);

        btgExcluirOne.add(rbtSim);
        rbtSim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtSim.setText("Sim, tenho certeza");
        rbtSim.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                rbtSimPropertyChange(evt);
            }
        });
        painelImagemFundo1.add(rbtSim);
        rbtSim.setBounds(343, 464, 139, 25);

        btnConfirmar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        btnConfirmar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                btnConfirmarPropertyChange(evt);
            }
        });
        painelImagemFundo1.add(btnConfirmar);
        btnConfirmar.setBounds(450, 510, 93, 25);

        btgExcluirAll.add(rbtNao1);
        rbtNao1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtNao1.setText("Não tenho certeza");
        rbtNao1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                rbtNao1PropertyChange(evt);
            }
        });
        painelImagemFundo1.add(rbtNao1);
        rbtNao1.setBounds(826, 464, 137, 25);

        btnConfirmar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConfirmar1.setText("Confirmar");
        btnConfirmar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmar1ActionPerformed(evt);
            }
        });
        btnConfirmar1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                btnConfirmar1PropertyChange(evt);
            }
        });
        painelImagemFundo1.add(btnConfirmar1);
        btnConfirmar1.setBounds(770, 510, 93, 25);

        btgExcluirAll.add(rbtSim1);
        rbtSim1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtSim1.setText("Sim, tenho certeza");
        rbtSim1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                rbtSim1PropertyChange(evt);
            }
        });
        painelImagemFundo1.add(rbtSim1);
        rbtSim1.setBounds(669, 464, 139, 25);

        lblCerteza1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCerteza1.setText("Tem certeza?");
        lblCerteza1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblCerteza1PropertyChange(evt);
            }
        });
        painelImagemFundo1.add(lblCerteza1);
        lblCerteza1.setBounds(669, 445, 82, 17);

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle_de_consumo_de_agua/CCAWater.jpg"))); // NOI18N
        painelImagemFundo1.add(lblImage);
        lblImage.setBounds(0, 0, 1020, 550);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(painelImagemFundo1, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelImagemFundo1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
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

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        lblCerteza1.setVisible(true);
        rbtSim1.setVisible(true);
        rbtNao1.setVisible(true);
        btnConfirmar1.setVisible(true);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        try{
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
            dispose();}
        catch(Exception a){
            JOptionPane.showMessageDialog(this, "Erro!");
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try{
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
            
            int dia = Integer.parseInt(txtDia.getText());
            int mes = Integer.parseInt(txtMes.getText());
            int ano = Integer.parseInt(txtAno.getText());
            
            if(dia > 31 || mes > 12 || ano > u1.getAnoatual()){
                JOptionPane.showMessageDialog(this, "Data inválida!");
                return;
            }
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cca", "root", "");
            
            String sql = "select * from "+nome+"_cca;";
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                int diat = rs.getInt("dia");
                int mest = rs.getInt("mes");
                int anot = rs.getInt("ano");
                String metame = rs.getString("metame");
                String metacl = rs.getString("metacl");
                int qtd = rs.getInt("quantidade");
                String name = rs.getString("nome");
                int vezes = rs.getInt("vezes");
                if((dia == diat) && (mes == mest) && (ano == anot)){
                    u1.setRows(u1.getRows() + 1);
                    DefaultTableModel model = (DefaultTableModel)tblHistorico.getModel();
                    model.addRow(new Object[]{
                    String.valueOf(name),
                    String.valueOf(diat),
                    String.valueOf(mest),
                    String.valueOf(anot),
                    qtd,
                    vezes,
                    String.valueOf(metame),
                    String.valueOf(metacl)
                    });
                }
            }
            con.close();
            lblCerteza.setVisible(false);
            rbtSim.setVisible(false);
            rbtNao.setVisible(false);
            btnConfirmar.setVisible(false);
            lblCerteza1.setVisible(false);
            rbtSim1.setVisible(false);
            rbtNao1.setVisible(false);
            btnConfirmar1.setVisible(false);
        }
        catch(Exception a){
            JOptionPane.showMessageDialog(this, "Erro!");}
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExibirHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibirHistoricoActionPerformed
        try{
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
            
            String sql = "select * from "+nome+"_cca;";
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                int diat = rs.getInt("dia");
                int mest = rs.getInt("mes");
                int anot = rs.getInt("ano");
                
                String data = diat + "/" + mest + "/" + anot;
                String metame = rs.getString("metame");
                String metacl = rs.getString("metacl");
                int qtd = rs.getInt("quantidade");
                String name = rs.getString("nome");
                int vezes = rs.getInt("vezes");
                
                u1.setRows(u1.getRows() + 1);
                    
                DefaultTableModel model = (DefaultTableModel)tblHistorico.getModel();
                model.addRow(new Object[]{
                String.valueOf(name),
                String.valueOf(diat),
                String.valueOf(mest),
                String.valueOf(anot),
                qtd,
                vezes,
                String.valueOf(metame),
                String.valueOf(metacl)
                });
            }
            con.close();
            lblCerteza.setVisible(false);
            rbtSim.setVisible(false);
            rbtNao.setVisible(false);
            btnConfirmar.setVisible(false);
            lblCerteza1.setVisible(false);
            rbtSim1.setVisible(false);
            rbtNao1.setVisible(false);
            btnConfirmar1.setVisible(false);
        }
        
        catch(Exception a){
            JOptionPane.showMessageDialog(this, "Erro!");}
    }//GEN-LAST:event_btnExibirHistoricoActionPerformed

    private void btnExcluirDaTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirDaTabelaActionPerformed
        try{
            ((DefaultTableModel) tblHistorico.getModel()).removeRow(tblHistorico.getSelectedRow());
            u1.setRows(u1.getRows() - 1);
            lblCerteza.setVisible(false);
            rbtSim.setVisible(false);
            rbtNao.setVisible(false);
            btnConfirmar.setVisible(false);
            lblCerteza1.setVisible(false);
            rbtSim1.setVisible(false);
            rbtNao1.setVisible(false);
            btnConfirmar1.setVisible(false);
            }
        catch(Exception z){
            JOptionPane.showMessageDialog(this, "Selecione a linha a ser apagada!");}
    }//GEN-LAST:event_btnExcluirDaTabelaActionPerformed

    private void lblCertezaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblCertezaPropertyChange
        lblCerteza.setVisible(false);
    }//GEN-LAST:event_lblCertezaPropertyChange

    private void rbtSimPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rbtSimPropertyChange
        rbtSim.setVisible(false);
    }//GEN-LAST:event_rbtSimPropertyChange

    private void rbtNaoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rbtNaoPropertyChange
        rbtNao.setVisible(false);
    }//GEN-LAST:event_rbtNaoPropertyChange

    private void btnConfirmarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_btnConfirmarPropertyChange
        btnConfirmar.setVisible(false);
    }//GEN-LAST:event_btnConfirmarPropertyChange

    private void lblCerteza1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblCerteza1PropertyChange
        lblCerteza1.setVisible(false);
    }//GEN-LAST:event_lblCerteza1PropertyChange

    private void rbtSim1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rbtSim1PropertyChange
        rbtSim1.setVisible(false);
    }//GEN-LAST:event_rbtSim1PropertyChange

    private void rbtNao1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rbtNao1PropertyChange
        rbtNao1.setVisible(false);
    }//GEN-LAST:event_rbtNao1PropertyChange

    private void btnConfirmar1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_btnConfirmar1PropertyChange
        btnConfirmar1.setVisible(false);
    }//GEN-LAST:event_btnConfirmar1PropertyChange

    private void btnExcluirHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirHistoricoActionPerformed
            lblCerteza.setVisible(true);
            rbtSim.setVisible(true);
            rbtNao.setVisible(true);
            btnConfirmar.setVisible(true);
    }//GEN-LAST:event_btnExcluirHistoricoActionPerformed

    private void btnConfirmar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmar1ActionPerformed
        try{
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
            
            String sql = "truncate table "+nome+"_cca;";
            if(rbtSim1.isSelected() == true){
                Statement stmt = con.createStatement();
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Histórico excluido.");
                ((DefaultTableModel) tblHistorico.getModel()).removeRow(u1.getRows());
                u1.setRows(0);
            }
            if(rbtNao1.isSelected() == true){
                lblCerteza1.setVisible(false);
                rbtSim1.setVisible(false);
                rbtNao1.setVisible(false);
                btnConfirmar1.setVisible(false);
                JOptionPane.showMessageDialog(this, "Dados não excluidos.");
            }
            con.close();
        }
        catch(Exception a){
        }
    }//GEN-LAST:event_btnConfirmar1ActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        try{
            int dia = Integer.parseInt(tblHistorico.getValueAt(tblHistorico.getSelectedRow(), 1).toString());
            int mes = Integer.parseInt(tblHistorico.getValueAt(tblHistorico.getSelectedRow(), 2).toString());
            int ano = Integer.parseInt(tblHistorico.getValueAt(tblHistorico.getSelectedRow(), 3).toString());
            String nome = tblUsuario.getValueAt(0, 1).toString();
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cca", "root", "");
            
            String sql = "delete from " + nome + "_cca where dia = '" + dia + "' and mes = '" + mes + "' and ano = '"+ ano + "';";
            if(rbtSim.isSelected() == true){
                Statement stmt = con.createStatement();
                stmt.executeUpdate(sql);
                u1.setRows(u1.getRows() - 1);
                JOptionPane.showMessageDialog(this, "Item excluido.");
                ((DefaultTableModel) tblHistorico.getModel()).removeRow(tblHistorico.getSelectedRow());}
            if(rbtNao.isSelected() == true){
                lblCerteza.setVisible(false);
                rbtSim.setVisible(false);
                rbtNao.setVisible(false);
                btnConfirmar.setVisible(false);
                JOptionPane.showMessageDialog(this, "Dado não excluido.");
            }
            con.close();
        }
        catch(Exception a){
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(Historico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Historico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Historico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Historico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgExcluirAll;
    private javax.swing.ButtonGroup btgExcluirOne;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnConfirmar1;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExcluirDaTabela;
    private javax.swing.JButton btnExcluirHistorico;
    private javax.swing.JButton btnExibirHistorico;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblCerteza;
    private javax.swing.JLabel lblCerteza1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblHistorico;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblInstrucao;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblUsuario;
    private controle_de_consumo_de_agua.PainelImagemFundo painelImagemFundo1;
    private javax.swing.JRadioButton rbtNao;
    private javax.swing.JRadioButton rbtNao1;
    private javax.swing.JRadioButton rbtSim;
    private javax.swing.JRadioButton rbtSim1;
    private javax.swing.JTable tblHistorico;
    private javax.swing.JTable tblUsuario;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtMes;
    // End of variables declaration//GEN-END:variables
}