package Cadastro;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Cadastro extends javax.swing.JFrame {

    Cadastrar c1 = new Cadastrar();
    
    public Cadastro() {
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

        pnlPainel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCadastro = new javax.swing.JTable();
        lblCadastro = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEstadocivil = new javax.swing.JLabel();
        lblEtnia = new javax.swing.JLabel();
        lblCEP = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        lblNomedamae = new javax.swing.JLabel();
        lblNaturalidade = new javax.swing.JLabel();
        lblRG = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblNomedopai = new javax.swing.JLabel();
        lblProfissao = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblLogradouro = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblEscolaridade = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();
        lblComplemento = new javax.swing.JLabel();
        lblObrigatorio = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtNomedamae = new javax.swing.JTextField();
        txtNomedopai = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtEstadocivil = new javax.swing.JTextField();
        txtNaturalidade = new javax.swing.JTextField();
        txtProfissao = new javax.swing.JTextField();
        txtEscolaridade = new javax.swing.JTextField();
        txtEtnia = new javax.swing.JTextField();
        txtRG = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtCEP = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtLogradouro = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPainel.setBackground(new java.awt.Color(0, 51, 102));

        tblCadastro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Nome da mãe", "Nome do pai", "Sexo", "Estado Civil", "Naturalidade", "Profissão", "Escolaridade", "Etnia", "RG", "CPF", "Salário", "CEP", "Cidade", "Logradouro", "Complemento", "Celular", "Número", "Bairro"
            }
        ));
        jScrollPane1.setViewportView(tblCadastro);

        lblCadastro.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblCadastro.setText("Cadastro");

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNome.setText("Nome*:");

        lblEstadocivil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEstadocivil.setText("Estado Civil*:");

        lblEtnia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEtnia.setText("Etnia:");

        lblCEP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCEP.setText("CEP*:");

        lblCelular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCelular.setText("Celular*:");

        lblNomedamae.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomedamae.setText("Nome da mãe*:");

        lblNaturalidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNaturalidade.setText("Naturalidade*:");

        lblRG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRG.setText("RG*:");

        lblCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCidade.setText("Cidade*:");

        lblNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNumero.setText("Número*:");

        lblNomedopai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomedopai.setText("Nome do pai:");

        lblProfissao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblProfissao.setText("Profissão*:");

        lblCPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCPF.setText("CPF*:");

        lblLogradouro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLogradouro.setText("Logradouro:");

        lblBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBairro.setText("Bairro*:");

        lblSexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSexo.setText("Sexo*:");

        lblEscolaridade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEscolaridade.setText("Escolaridade*:");

        lblSalario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSalario.setText("Salário*:");

        lblComplemento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblComplemento.setText("Complemento:");

        lblObrigatorio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblObrigatorio.setText("* Obrigatório.");

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtNomedamae.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtNomedopai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtSexo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtEstadocivil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtNaturalidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtProfissao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtEscolaridade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtEtnia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtRG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtSalario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtCEP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtLogradouro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtComplemento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtCelular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnSalvar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPainelLayout = new javax.swing.GroupLayout(pnlPainel);
        pnlPainel.setLayout(pnlPainelLayout);
        pnlPainelLayout.setHorizontalGroup(
            pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPainelLayout.createSequentialGroup()
                .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPainelLayout.createSequentialGroup()
                        .addGap(573, 573, 573)
                        .addComponent(lblCadastro))
                    .addGroup(pnlPainelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(pnlPainelLayout.createSequentialGroup()
                .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPainelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCelular)
                            .addComponent(lblCEP)
                            .addGroup(pnlPainelLayout.createSequentialGroup()
                                .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPainelLayout.createSequentialGroup()
                                        .addComponent(lblEstadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(pnlPainelLayout.createSequentialGroup()
                                        .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNome)
                                            .addComponent(lblEtnia)
                                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEstadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(40, 40, 40)))
                                .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlPainelLayout.createSequentialGroup()
                                        .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNomedamae, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblNomedamae)
                                            .addComponent(lblNaturalidade)
                                            .addComponent(txtNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblRG))
                                        .addGap(45, 45, 45)
                                        .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCPF)
                                            .addComponent(txtNomedopai, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblNomedopai)
                                            .addComponent(lblProfissao)
                                            .addComponent(txtProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(pnlPainelLayout.createSequentialGroup()
                                        .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCidade)
                                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblNumero)
                                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(99, 99, 99)
                                        .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblLogradouro)
                                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblBairro)
                                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(txtEtnia, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSexo)
                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEscolaridade)
                            .addComponent(txtEscolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSalario)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblComplemento)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlPainelLayout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addGap(52, 52, 52)
                                .addComponent(btnExcluir))))
                    .addGroup(pnlPainelLayout.createSequentialGroup()
                        .addGap(543, 543, 543)
                        .addComponent(lblObrigatorio)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlPainelLayout.setVerticalGroup(
            pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPainelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblCadastro)
                .addGap(31, 31, 31)
                .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblNomedamae)
                    .addComponent(lblSexo)
                    .addComponent(lblNomedopai))
                .addGap(9, 9, 9)
                .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomedopai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomedamae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlPainelLayout.createSequentialGroup()
                        .addComponent(lblEstadocivil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEscolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRG)
                            .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblEtnia)
                                .addComponent(lblSalario)
                                .addComponent(lblCPF)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEtnia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(pnlPainelLayout.createSequentialGroup()
                        .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNaturalidade)
                            .addComponent(lblProfissao)
                            .addComponent(lblEscolaridade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)))
                .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPainelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblCEP))
                    .addGroup(pnlPainelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCidade)
                            .addComponent(lblLogradouro)
                            .addComponent(lblComplemento))))
                .addGap(12, 12, 12)
                .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCelular)
                    .addComponent(lblNumero)
                    .addComponent(lblBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(lblObrigatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        try {
        
        if (txtNome.getText().equals("") || 
            txtNomedamae.getText().equals("") || 
            txtSexo.getText().equals("") || 
            txtEstadocivil.getText().equals("") ||
            txtNaturalidade.getText().equals("") || 
            txtProfissao.getText().equals("") || 
            txtEscolaridade.getText().equals("") ||  
            txtRG.getText().equals("") ||
            txtCPF.getText().equals("") || 
            txtSalario.getText().equals("") || 
            txtCEP.getText().equals("") ||
            txtCidade.getText().equals("") || 
            txtCelular.getText().equals("") ||
            txtNumero.getText().equals("") ||
            txtBairro.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Todos os campos com '*' precisam ser preenchidos!");
        }
        else {
        DefaultTableModel model = (DefaultTableModel) tblCadastro.getModel();      
        c1.setEscolaridade(txtEscolaridade.getText());
        c1.setSalario(Double.parseDouble(txtSalario.getText()));
        c1.setSexo(txtSexo.getText());
        
        double rg = Double.parseDouble(txtRG.getText());
        double cpf = Double.parseDouble(txtCPF.getText());
        double numero = Double.parseDouble(txtNumero.getText());
        double celular = Double.parseDouble(txtCelular.getText());
        double cep = Double.parseDouble(txtCEP.getText());
        model.addRow(new Object[]{
        
            String.valueOf(txtNome.getText()),
            String.valueOf(txtNomedamae.getText()),
            String.valueOf(txtNomedopai.getText()),
            String.valueOf(txtSexo.getText()),
            String.valueOf(txtEstadocivil.getText()),
            String.valueOf(txtNaturalidade.getText()),
            String.valueOf(txtProfissao.getText()),
            String.valueOf(txtEscolaridade.getText()),
            String.valueOf(txtEtnia.getText()),
            String.valueOf(rg),
            String.valueOf(cpf),
            String.valueOf(c1.CalcularSalario()),
            String.valueOf(cep),
            String.valueOf(txtCidade.getText()),
            String.valueOf(txtLogradouro.getText()),
            String.valueOf(txtComplemento.getText()),
            String.valueOf(celular),
            String.valueOf(numero),
            String.valueOf(txtBairro.getText())
        });
        JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");}
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this, "Há algum dado inválido.");}
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        ((DefaultTableModel) tblCadastro.getModel()).removeRow((tblCadastro.getSelectedRow()));
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblEscolaridade;
    private javax.swing.JLabel lblEstadocivil;
    private javax.swing.JLabel lblEtnia;
    private javax.swing.JLabel lblLogradouro;
    private javax.swing.JLabel lblNaturalidade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomedamae;
    private javax.swing.JLabel lblNomedopai;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblObrigatorio;
    private javax.swing.JLabel lblProfissao;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JPanel pnlPainel;
    private javax.swing.JTable tblCadastro;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEscolaridade;
    private javax.swing.JTextField txtEstadocivil;
    private javax.swing.JTextField txtEtnia;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNaturalidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomedamae;
    private javax.swing.JTextField txtNomedopai;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtProfissao;
    private javax.swing.JTextField txtRG;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}
