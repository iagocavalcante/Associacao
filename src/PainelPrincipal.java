
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Iago
 */
public class PainelPrincipal extends javax.swing.JFrame {

    JLabel logo = new JLabel();
    Aluno aluno = new Aluno();
    JFileChooser escolherFoto;
    String caminho;
    File arquivo;
    JFrame abrirFrame;
    JPanel abrirPanel;
    ResultSet rs;
    Connection con;
    Statement stm;

    public PainelPrincipal() {
        initComponents();
        this.setResizable(false);
        ImageIcon imagem = new ImageIcon(getClass().getClassLoader().getResource("img/logo.jpg"));
        logo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        logo.setBounds(400, 30, 150, 150);
        logo.setIcon(imagem);
        panelPrincipal.add(logo);
        this.setTitle("Associação FSAT");
        Image faviIcon = createFaviIcon("biblioteca_icon15x15.png");
        setIconImage(faviIcon);
        btEditar.setVisible(false);
        btSalvar.setVisible(false);
        btVoltar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Abrir = new javax.swing.JFrame();
        PanelAbrir = new javax.swing.JPanel();
        lbConsultar = new javax.swing.JLabel();
        btConsultar = new javax.swing.JButton();
        txConsultar = new javax.swing.JTextField();
        AbrirHistoricoProjeto1 = new javax.swing.JFrame();
        panelHistoricoProjeto = new javax.swing.JPanel();
        jScroll = new javax.swing.JScrollPane();
        atHtProjeto = new javax.swing.JTextArea();
        btAbrirProjeto = new javax.swing.JButton();
        btEditarProjeto = new javax.swing.JButton();
        lbAlunoProj = new javax.swing.JLabel();
        lbNomeAlu = new javax.swing.JLabel();
        btAtualizarHtProj = new javax.swing.JButton();
        AbrirHistoricoRendimento1 = new javax.swing.JFrame();
        panelRendimento = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        atRendimento = new javax.swing.JTextArea();
        btAbrirAluno = new javax.swing.JButton();
        btEditarRendimento = new javax.swing.JButton();
        lbAluno = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        btAtualizar = new javax.swing.JButton();
        panelPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lbNomeProjeto = new javax.swing.JLabel();
        txNomeProjeto = new javax.swing.JTextField();
        lbInicio = new javax.swing.JLabel();
        txInicio = new javax.swing.JTextField();
        lbFIm = new javax.swing.JLabel();
        txFim = new javax.swing.JTextField();
        lbNomeAluno = new javax.swing.JLabel();
        txNomeAluno = new javax.swing.JTextField();
        lbRg = new javax.swing.JLabel();
        txRg = new javax.swing.JFormattedTextField();
        lbDtNascimento = new javax.swing.JLabel();
        txDtNascimento = new javax.swing.JTextField();
        lbSexo = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox();
        lbIdade = new javax.swing.JLabel();
        txIdade = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lbNomePai = new javax.swing.JLabel();
        txNomePai = new javax.swing.JTextField();
        lbNomeMae = new javax.swing.JLabel();
        txNomeMae = new javax.swing.JTextField();
        lbContatoPai = new javax.swing.JLabel();
        txContatoPai = new javax.swing.JFormattedTextField();
        lbContatoMae = new javax.swing.JLabel();
        txContatoMae = new javax.swing.JFormattedTextField();
        lbEndereco = new javax.swing.JLabel();
        txEndereco = new javax.swing.JTextField();
        lbNumeroCasa = new javax.swing.JLabel();
        txNumeroCasa = new javax.swing.JTextField();
        lbBairro = new javax.swing.JLabel();
        txBairro = new javax.swing.JTextField();
        lbNomeEscola = new javax.swing.JLabel();
        txNomeEscola = new javax.swing.JTextField();
        lbSerie = new javax.swing.JLabel();
        txSerie = new javax.swing.JTextField();
        lbRendimentoEscolar = new javax.swing.JLabel();
        txRendimentoEscolar = new javax.swing.JTextField();
        lbSemestre = new javax.swing.JLabel();
        txSemestre = new javax.swing.JTextField();
        lbFoto = new javax.swing.JLabel();
        lbfoto1 = new javax.swing.JLabel();
        btFoto = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btEditar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        lbCPF = new javax.swing.JLabel();
        txCPF = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        mArquivo = new javax.swing.JMenu();
        mAbrirFicha = new javax.swing.JMenuItem();
        mDeletarFicha = new javax.swing.JMenuItem();
        mSair = new javax.swing.JMenuItem();
        mConsulta = new javax.swing.JMenu();
        AbrirHistoricoProjeto = new javax.swing.JMenuItem();
        AbrirHistoricoRendimento = new javax.swing.JMenuItem();

        lbConsultar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lbConsultar.setText("Consultar Ficha por ID ou RG do Aluno");

        btConsultar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAbrirLayout = new javax.swing.GroupLayout(PanelAbrir);
        PanelAbrir.setLayout(PanelAbrirLayout);
        PanelAbrirLayout.setHorizontalGroup(
            PanelAbrirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAbrirLayout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(lbConsultar)
                .addGap(75, 75, 75))
            .addGroup(PanelAbrirLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(PanelAbrirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txConsultar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelAbrirLayout.setVerticalGroup(
            PanelAbrirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAbrirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbConsultar)
                .addGap(18, 18, 18)
                .addComponent(txConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btConsultar)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AbrirLayout = new javax.swing.GroupLayout(Abrir.getContentPane());
        Abrir.getContentPane().setLayout(AbrirLayout);
        AbrirLayout.setHorizontalGroup(
            AbrirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbrirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AbrirLayout.setVerticalGroup(
            AbrirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbrirLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(PanelAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AbrirHistoricoProjeto1.setResizable(false);

        panelHistoricoProjeto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Histórico de Projetos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 1, 18))); // NOI18N

        atHtProjeto.setEditable(false);
        atHtProjeto.setColumns(20);
        atHtProjeto.setRows(5);
        jScroll.setViewportView(atHtProjeto);

        btAbrirProjeto.setText("Abrir");
        btAbrirProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbrirProjetoActionPerformed(evt);
            }
        });

        btEditarProjeto.setText("Editar");
        btEditarProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarProjetoActionPerformed(evt);
            }
        });

        lbAlunoProj.setText("Aluno :");

        lbNomeAlu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btAtualizarHtProj.setText("Salvar");
        btAtualizarHtProj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarHtProjActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHistoricoProjetoLayout = new javax.swing.GroupLayout(panelHistoricoProjeto);
        panelHistoricoProjeto.setLayout(panelHistoricoProjetoLayout);
        panelHistoricoProjetoLayout.setHorizontalGroup(
            panelHistoricoProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHistoricoProjetoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHistoricoProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScroll)
                    .addGroup(panelHistoricoProjetoLayout.createSequentialGroup()
                        .addComponent(lbAlunoProj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbNomeAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 174, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelHistoricoProjetoLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(btAbrirProjeto)
                .addGap(18, 18, 18)
                .addComponent(btEditarProjeto)
                .addGap(18, 18, 18)
                .addComponent(btAtualizarHtProj)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelHistoricoProjetoLayout.setVerticalGroup(
            panelHistoricoProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHistoricoProjetoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHistoricoProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbAlunoProj)
                    .addComponent(lbNomeAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelHistoricoProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEditarProjeto)
                    .addComponent(btAbrirProjeto)
                    .addComponent(btAtualizarHtProj))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AbrirHistoricoProjeto1Layout = new javax.swing.GroupLayout(AbrirHistoricoProjeto1.getContentPane());
        AbrirHistoricoProjeto1.getContentPane().setLayout(AbrirHistoricoProjeto1Layout);
        AbrirHistoricoProjeto1Layout.setHorizontalGroup(
            AbrirHistoricoProjeto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbrirHistoricoProjeto1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelHistoricoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        AbrirHistoricoProjeto1Layout.setVerticalGroup(
            AbrirHistoricoProjeto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AbrirHistoricoProjeto1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelHistoricoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelRendimento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rendimento Escolar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 1, 18))); // NOI18N

        atRendimento.setEditable(false);
        atRendimento.setColumns(20);
        atRendimento.setRows(5);
        jScrollPane2.setViewportView(atRendimento);

        btAbrirAluno.setText("Abrir");
        btAbrirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbrirAlunoActionPerformed(evt);
            }
        });

        btEditarRendimento.setText("Editar");
        btEditarRendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarRendimentoActionPerformed(evt);
            }
        });

        lbAluno.setText("Aluno :");

        lbNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btAtualizar.setText("Salvar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRendimentoLayout = new javax.swing.GroupLayout(panelRendimento);
        panelRendimento.setLayout(panelRendimentoLayout);
        panelRendimentoLayout.setHorizontalGroup(
            panelRendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRendimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(panelRendimentoLayout.createSequentialGroup()
                        .addComponent(lbAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 174, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelRendimentoLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(btAbrirAluno)
                .addGap(18, 18, 18)
                .addComponent(btEditarRendimento)
                .addGap(18, 18, 18)
                .addComponent(btAtualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRendimentoLayout.setVerticalGroup(
            panelRendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRendimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbAluno)
                    .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEditarRendimento)
                    .addComponent(btAbrirAluno)
                    .addComponent(btAtualizar))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AbrirHistoricoRendimento1Layout = new javax.swing.GroupLayout(AbrirHistoricoRendimento1.getContentPane());
        AbrirHistoricoRendimento1.getContentPane().setLayout(AbrirHistoricoRendimento1Layout);
        AbrirHistoricoRendimento1Layout.setHorizontalGroup(
            AbrirHistoricoRendimento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(AbrirHistoricoRendimento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelRendimento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AbrirHistoricoRendimento1Layout.setVerticalGroup(
            AbrirHistoricoRendimento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
            .addGroup(AbrirHistoricoRendimento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelRendimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ASSOCIAÇÃO FILHOS DE SANTO ANTÔNIO DO TAUÁ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 927, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FICHA DE INSCRIÇÃO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 18), new java.awt.Color(51, 51, 51))); // NOI18N

        lbNomeProjeto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNomeProjeto.setText("Nome do Projeto : ");

        lbInicio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbInicio.setText("Início :");

        lbFIm.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbFIm.setText("Fim:");

        lbNomeAluno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNomeAluno.setText("Nome Completo : ");

        lbRg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbRg.setText("RG :");

        try {
            txRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbDtNascimento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbDtNascimento.setText("Data de Nascimento :");

        lbSexo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbSexo.setText("Sexo :");

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));
        cbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexoActionPerformed(evt);
            }
        });

        lbIdade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbIdade.setText("Idade :");

        try {
            txIdade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txIdadeActionPerformed(evt);
            }
        });

        jSeparator1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DADOS DOS RESPONSÁVEIS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        lbNomePai.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNomePai.setText("Nome do Pai : ");

        lbNomeMae.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNomeMae.setText("Nome da Mãe : ");

        lbContatoPai.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbContatoPai.setText("Contato Pai :");

        try {
            txContatoPai.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbContatoMae.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbContatoMae.setText("Contato Mãe :");

        try {
            txContatoMae.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbEndereco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbEndereco.setText("Endereço : ");

        lbNumeroCasa.setText("N° :");

        lbBairro.setText("Bairro :");

        lbNomeEscola.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNomeEscola.setText("Nome da Escola :");

        lbSerie.setText("Série :");

        lbRendimentoEscolar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbRendimentoEscolar.setText("Rendimento Escolar :");

        lbSemestre.setText("Semestre :");

        lbFoto.setBackground(new java.awt.Color(153, 0, 255));
        lbFoto.setToolTipText("Selecione uma imagem jpg");
        lbFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbfoto1.setText("Foto :");

        btFoto.setText("Selecioanar Foto");
        btFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFotoActionPerformed(evt);
            }
        });

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar ");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        jLabel1.setText("*");

        jLabel2.setText("*");

        jLabel3.setText("*");

        jLabel5.setText("*");

        jLabel6.setText("*");

        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("ENTRAR APENAS COM NÚMEROS");

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        lbCPF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbCPF.setText("CPF :");

        try {
            txCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel8.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNomeProjeto)
                            .addComponent(txNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNomeAluno)
                            .addComponent(txNomeProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbDtNascimento))
                                .addGap(89, 89, 89)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbSexo)
                                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbIdade)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbInicio)
                                    .addComponent(txInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txRg, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5))
                                    .addComponent(lbRg))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbCPF)
                                    .addComponent(lbFIm)
                                    .addComponent(txFim, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(txCPF))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbfoto1)
                            .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbEndereco))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(lbNumeroCasa))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbBairro)
                                            .addComponent(txBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbNomePai)
                                            .addComponent(txNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbContatoPai)
                                            .addComponent(txContatoPai))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txRendimentoEscolar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbRendimentoEscolar))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbSemestre)
                                            .addComponent(txSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbNomeMae)
                                            .addComponent(txEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lbContatoMae)
                                                .addGap(0, 84, Short.MAX_VALUE))
                                            .addComponent(txContatoMae)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txNomeEscola, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbNomeEscola))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbSerie)
                                            .addComponent(txSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(btCadastrar)
                                                .addGap(18, 18, 18)
                                                .addComponent(btLimpar)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btVoltar)
                                        .addGap(181, 181, 181)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNomeProjeto)
                            .addComponent(lbInicio)
                            .addComponent(lbFIm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbRg)
                                .addComponent(lbCPF))
                            .addComponent(lbNomeAluno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txNomeProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDtNascimento)
                            .addComponent(lbSexo)
                            .addComponent(lbIdade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(96, 96, 96))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbfoto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btFoto)
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbContatoMae)
                                .addGap(26, 26, 26))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbNomePai)
                                        .addComponent(lbContatoPai))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txContatoPai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbNomeMae)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txContatoMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbEndereco)
                                    .addComponent(lbNumeroCasa)
                                    .addComponent(lbBairro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbRendimentoEscolar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txRendimentoEscolar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbSemestre)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNomeEscola)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txNomeEscola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbSerie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCadastrar)
                            .addComponent(btLimpar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btEditar)
                            .addComponent(btSalvar)
                            .addComponent(btVoltar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(50, 50, 50))))
        );

        jScrollPane1.setViewportView(jPanel1);

        mArquivo.setText("Arquivo");

        mAbrirFicha.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mAbrirFicha.setText("Abrir Ficha");
        mAbrirFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAbrirFichaActionPerformed(evt);
            }
        });
        mArquivo.add(mAbrirFicha);

        mDeletarFicha.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        mDeletarFicha.setText("Deletar Ficha");
        mDeletarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDeletarFichaActionPerformed(evt);
            }
        });
        mArquivo.add(mDeletarFicha);

        mSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        mSair.setText("Sair");
        mSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSairActionPerformed(evt);
            }
        });
        mArquivo.add(mSair);

        menu.add(mArquivo);

        mConsulta.setText("Consulta");

        AbrirHistoricoProjeto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_MASK));
        AbrirHistoricoProjeto.setText("Histórico Participação Projeto");
        AbrirHistoricoProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirHistoricoProjetoActionPerformed(evt);
            }
        });
        mConsulta.add(AbrirHistoricoProjeto);

        AbrirHistoricoRendimento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_MASK));
        AbrirHistoricoRendimento.setText("Histórico Rendimento Escolar");
        AbrirHistoricoRendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirHistoricoRendimentoActionPerformed(evt);
            }
        });
        mConsulta.add(AbrirHistoricoRendimento);

        menu.add(mConsulta);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSexoActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txBairro.setText("");
        txContatoMae.setText("");
        txContatoPai.setText("");
        txDtNascimento.setText("");
        txEndereco.setText("");
        txFim.setText("");
        txIdade.setText("");
        txInicio.setText("");
        txNomeAluno.setText("");
        txNomeEscola.setText("");
        txNomeMae.setText("");
        txNomePai.setText("");
        txNomeProjeto.setText("");
        txNumeroCasa.setText("");
        txRendimentoEscolar.setText("");
        txRg.setText("");
        txSemestre.setText("");
        txSerie.setText("");
        lbFoto.setIcon(null);
        txCPF.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void AbrirHistoricoProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirHistoricoProjetoActionPerformed
        AbrirHistoricoProjeto1.setVisible(true);
        AbrirHistoricoProjeto1.setSize(600, 320);
        AbrirHistoricoProjeto1.setLocation(450, 200);
        AbrirHistoricoProjeto1.setResizable(false);
    }//GEN-LAST:event_AbrirHistoricoProjetoActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        Cadastrar();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFotoActionPerformed
        escolherFoto = new JFileChooser();
        escolherFoto.setFileFilter(new FileNameExtensionFilter("Arquivos de imagem", "jpg"));
        caminho = "";
        arquivo = null;
        int retorno = escolherFoto.showSaveDialog(null);
        if (retorno == JFileChooser.APPROVE_OPTION) {
            caminho = escolherFoto.getSelectedFile().getAbsolutePath();
        }
        if (!caminho.equals("")) {
            arquivo = new File(caminho.toString().replace("\\", "/"));
        } else {
            try {
                throw new FileNotFoundException();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PainelPrincipal.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            BufferedImage fotoBuff = ImageIO.read(new File(arquivo.getAbsolutePath().replace("\\", "/")));
            Image foto = fotoBuff.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
            lbFoto.setIcon(new ImageIcon(foto));
        } catch (IOException ex) {
            Logger.getLogger(PainelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btFotoActionPerformed

    private void mAbrirFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAbrirFichaActionPerformed
        Abrir.setVisible(true);
        Abrir.setSize(400, 200);
        Abrir.setResizable(false);
        Abrir.setLocation(550, 200);
        lbConsultar.setText("Consultar ficha por ID ou Rg :");
        btConsultar.setText("Consultar");
    }//GEN-LAST:event_mAbrirFichaActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        if (btConsultar.getText().equals("Deletar")) {
            Deletar();
        }
        if (btConsultar.getText().equals("Consultar")) {
            Consultar();
        }
        if (btConsultar.getText().equals("Pesquisar")) {
            Pesquisar();
        }if (btConsultar.getText().equals("Abrir Projeto")) {
            AbrirProjeto();
        } else {
            Abrir();
        }
    }//GEN-LAST:event_btConsultarActionPerformed

    private void txIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txIdadeActionPerformed

    }//GEN-LAST:event_txIdadeActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        txNomeProjeto.setEditable(true);
        txInicio.setEditable(true);
        txFim.setEditable(true);
        txNomeAluno.setEditable(true);
        txDtNascimento.setEditable(true);
        txIdade.setEditable(true);
        txNomePai.setEditable(true);
        txNomeMae.setEditable(true);
        txContatoMae.setEditable(true);
        txContatoPai.setEditable(true);
        txEndereco.setEditable(true);
        txNumeroCasa.setEditable(true);
        txBairro.setEditable(true);
        txNomeEscola.setEditable(true);
        txRendimentoEscolar.setEditable(true);
        txSemestre.setEditable(true);
        txRg.setEditable(true);
        txSerie.setEditable(true);
        btFoto.setVisible(true);
        txCPF.setEditable(true);
    }//GEN-LAST:event_btEditarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        Atualizar();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        btFoto.setVisible(true);
        btCadastrar.setVisible(true);
        btLimpar.setVisible(true);
        btEditar.setVisible(false);
        btSalvar.setVisible(false);
        btVoltar.setVisible(false);
        txBairro.setText("");
        txContatoMae.setText("");
        txContatoPai.setText("");
        txDtNascimento.setText("");
        txEndereco.setText("");
        txFim.setText("");
        txIdade.setText("");
        txInicio.setText("");
        txNomeAluno.setText("");
        txNomeEscola.setText("");
        txNomeMae.setText("");
        txNomePai.setText("");
        txNomeProjeto.setText("");
        txNumeroCasa.setText("");
        txRendimentoEscolar.setText("");
        txRg.setText("");
        txSemestre.setText("");
        txSerie.setText("");
        txCPF.setText("");
        lbFoto.setIcon(null);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void mDeletarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDeletarFichaActionPerformed
        Abrir.setVisible(true);
        Abrir.setSize(400, 200);
        Abrir.setResizable(false);
        Abrir.setLocation(550, 200);
        lbConsultar.setText("Deletar ficha por ID ou Rg :");
        btConsultar.setText("Deletar");
    }//GEN-LAST:event_mDeletarFichaActionPerformed

    private void mSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mSairActionPerformed

    private void AbrirHistoricoRendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirHistoricoRendimentoActionPerformed
        AbrirHistoricoRendimento1.setVisible(true);
        AbrirHistoricoRendimento1.setSize(600, 320);
        AbrirHistoricoRendimento1.setLocation(450, 200);
        AbrirHistoricoRendimento1.setResizable(false);
    }//GEN-LAST:event_AbrirHistoricoRendimentoActionPerformed

    private void btAbrirAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbrirAlunoActionPerformed
        Abrir.setVisible(true);
        Abrir.setSize(400, 200);
        Abrir.setResizable(false);
        Abrir.setLocation(550, 200);
        lbConsultar.setText("Consultar Aluno por Id ou RG :");
        btConsultar.setText("Abrir");
    }//GEN-LAST:event_btAbrirAlunoActionPerformed

    private void btEditarRendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarRendimentoActionPerformed
        atRendimento.setEditable(true);
        JOptionPane.showMessageDialog(AbrirHistoricoRendimento1, "Área de texto agora pode ser editada!");
    }//GEN-LAST:event_btEditarRendimentoActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        Salvar();
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btAbrirProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbrirProjetoActionPerformed
        Abrir.setVisible(true);
        Abrir.setSize(400, 200);
        Abrir.setResizable(false);
        Abrir.setLocation(550, 200);
        lbConsultar.setText("Consultar Aluno por Id ou RG :");
        btConsultar.setText("Abrir Projeto");
    }//GEN-LAST:event_btAbrirProjetoActionPerformed

    private void btEditarProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarProjetoActionPerformed
        atHtProjeto.setEditable(true);
        JOptionPane.showMessageDialog(AbrirHistoricoProjeto1, "Área de texto agora pode ser editada!");
    }//GEN-LAST:event_btEditarProjetoActionPerformed

    private void btAtualizarHtProjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarHtProjActionPerformed
        SalvarProjeto();
    }//GEN-LAST:event_btAtualizarHtProjActionPerformed

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
            java.util.logging.Logger.getLogger(PainelPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Abrir;
    private javax.swing.JMenuItem AbrirHistoricoProjeto;
    private javax.swing.JFrame AbrirHistoricoProjeto1;
    private javax.swing.JMenuItem AbrirHistoricoRendimento;
    private javax.swing.JFrame AbrirHistoricoRendimento1;
    private javax.swing.JPanel PanelAbrir;
    private javax.swing.JTextArea atHtProjeto;
    private javax.swing.JTextArea atRendimento;
    private javax.swing.JButton btAbrirAluno;
    private javax.swing.JButton btAbrirProjeto;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btAtualizarHtProj;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btEditarProjeto;
    private javax.swing.JButton btEditarRendimento;
    private javax.swing.JButton btFoto;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox cbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScroll;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbAluno;
    private javax.swing.JLabel lbAlunoProj;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbConsultar;
    private javax.swing.JLabel lbContatoMae;
    private javax.swing.JLabel lbContatoPai;
    private javax.swing.JLabel lbDtNascimento;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbFIm;
    private javax.swing.JLabel lbFoto;
    private javax.swing.JLabel lbIdade;
    private javax.swing.JLabel lbInicio;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNomeAlu;
    private javax.swing.JLabel lbNomeAluno;
    private javax.swing.JLabel lbNomeEscola;
    private javax.swing.JLabel lbNomeMae;
    private javax.swing.JLabel lbNomePai;
    private javax.swing.JLabel lbNomeProjeto;
    private javax.swing.JLabel lbNumeroCasa;
    private javax.swing.JLabel lbRendimentoEscolar;
    private javax.swing.JLabel lbRg;
    private javax.swing.JLabel lbSemestre;
    private javax.swing.JLabel lbSerie;
    private javax.swing.JLabel lbSexo;
    private javax.swing.JLabel lbfoto1;
    private javax.swing.JMenuItem mAbrirFicha;
    private javax.swing.JMenu mArquivo;
    private javax.swing.JMenu mConsulta;
    private javax.swing.JMenuItem mDeletarFicha;
    private javax.swing.JMenuItem mSair;
    private javax.swing.JMenuBar menu;
    private javax.swing.JPanel panelHistoricoProjeto;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelRendimento;
    private javax.swing.JTextField txBairro;
    private javax.swing.JFormattedTextField txCPF;
    private javax.swing.JTextField txConsultar;
    private javax.swing.JFormattedTextField txContatoMae;
    private javax.swing.JFormattedTextField txContatoPai;
    private javax.swing.JTextField txDtNascimento;
    private javax.swing.JTextField txEndereco;
    private javax.swing.JTextField txFim;
    private javax.swing.JFormattedTextField txIdade;
    private javax.swing.JTextField txInicio;
    private javax.swing.JTextField txNomeAluno;
    private javax.swing.JTextField txNomeEscola;
    private javax.swing.JTextField txNomeMae;
    private javax.swing.JTextField txNomePai;
    private javax.swing.JTextField txNomeProjeto;
    private javax.swing.JTextField txNumeroCasa;
    private javax.swing.JTextField txRendimentoEscolar;
    private javax.swing.JFormattedTextField txRg;
    private javax.swing.JTextField txSemestre;
    private javax.swing.JTextField txSerie;
    // End of variables declaration//GEN-END:variables
    private void Pesquisar() {
        con = null;
        aluno.setConsulta(Integer.parseInt(txConsultar.getText()));
        if (con == null) {
            try {
                con = ConexaoDB.getConexao();
                stm = con.createStatement();
                String sql;
                sql = "SELECT nome_aluno, nome_projeto FROM inscricao WHERE idAluno = '" + aluno.getConsulta() + "' OR rg = '" + aluno.getConsulta() + "';";
                rs = stm.executeQuery(sql);//sadfasdfasdfasdfasdfsafddsf
                rs.next();
                System.out.println(rs.getString("nome_aluno"));
                if (rs.first()) { //deu merda
                    Abrir.setVisible(false);
                    AbrirHistoricoProjeto1.setFocusableWindowState(true);
                } else {
                    JOptionPane.showMessageDialog(AbrirHistoricoRendimento1, "ID ou RG não encontrados!!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void Deletar() {
        con = null;
        if (con == null) {
            try {
                con = ConexaoDB.getConexao();
                stm = con.createStatement();
                String sql;
                sql = "DELETE FROM inscricao WHERE idAluno = '" + aluno.getConsulta() + "' OR rg = '" + aluno.getConsulta() + "';";
                stm.execute(sql);
                JOptionPane.showMessageDialog(this, "Dados deletados com sucesso!");
                Abrir.setVisible(false);
                txConsultar.setText("");
                lbConsultar.setText("Consultar ficha por ID ou Rg :");
                btConsultar.setText("Consultar");

                txBairro.setText("");
                txContatoMae.setText("");
                txContatoPai.setText("");
                txDtNascimento.setText("");
                txEndereco.setText("");
                txFim.setText("");
                txIdade.setText("");
                txInicio.setText("");
                txNomeAluno.setText("");
                txNomeEscola.setText("");
                txNomeMae.setText("");
                txNomePai.setText("");
                txNomeProjeto.setText("");
                txNumeroCasa.setText("");
                txRendimentoEscolar.setText("");
                txRg.setText("");
                txSemestre.setText("");
                txSerie.setText("");
                lbFoto.setIcon(null);
                txCPF.setText("");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void Atualizar() {
        con = null;
        aluno.setNomeAluno(txNomeAluno.getText());
        aluno.setNomeEscola(txNomeEscola.getText());
        aluno.setNomeMae(txNomeMae.getText());
        aluno.setNomePai(txNomePai.getText());
        aluno.setNomeProjeto(txNomeProjeto.getText());
        aluno.setBairro(txBairro.getText());
        aluno.setDtFim(txFim.getText());
        aluno.setDtInicio(txInicio.getText());
        aluno.setDtNascimento(txDtNascimento.getText());
        aluno.setEndereco(txEndereco.getText());
        aluno.setIdade(Integer.parseInt(txIdade.getText()));
        aluno.setRendimentoEscolar(txRendimentoEscolar.getText());
        aluno.setRg(Integer.parseInt(txRg.getText()));
        aluno.setSemestre(txSemestre.getText());
        aluno.setSexo(cbSexo.getSelectedItem().toString());
        aluno.setTelMae(Integer.parseInt(txContatoMae.getText()));
        aluno.setTelPai(Integer.parseInt(txContatoPai.getText()));
        aluno.setCpf(txCPF.getText());
        aluno.setnCasa(txNumeroCasa.getText());
        aluno.setSerie(txSerie.getText());
        aluno.setFoto(arquivo.getAbsolutePath().replace("\\", "/").toString());
        if (con == null) {
            try {
                con = ConexaoDB.getConexao();
                stm = con.createStatement();
                String sql;
                sql = "UPDATE inscricao SET nome_projeto = '" + aluno.getNomeProjeto() + "',"
                        + "dt_inicio = '" + aluno.getDtInicio() + "',"
                        + "dt_fim = '" + aluno.getDtFim() + "',"
                        + "nome_aluno = '" + aluno.getNomeAluno() + "',"
                        + "dt_nascimento = '" + aluno.getDtNascimento() + "',"
                        + "sexo = '" + aluno.getSexo() + "',"
                        + "idade = '" + aluno.getIdade() + "',"
                        + "nm_pai = '" + aluno.getNomePai() + "',"
                        + "nm_mae = '" + aluno.getNomeMae() + "',"
                        + "contatoMae = '" + aluno.getTelMae() + "',"
                        + "contatoPai = '" + aluno.getTelPai() + "',"
                        + "endereco = '" + aluno.getEndereco() + "',"
                        + "nCasa = '" + aluno.getnCasa() + "',"
                        + "bairro = '" + aluno.getBairro() + "',"
                        + "nm_escola = '" + aluno.getNomeEscola() + "',"
                        + "serie = '" + aluno.getSerie() + "',"
                        + "rendimento_escolar = '" + aluno.getRendimentoEscolar() + "',"
                        + "semestre = '" + aluno.getSemestre() + "',"
                        + "foto = '" + aluno.getFoto() + "',"
                        + "rg = '" + aluno.getRg() + "', "
                        + "cpf = '" + aluno.getCpf() + "' WHERE idAluno = '" + aluno.getConsulta() + "' OR idAluno = '" + aluno.getConsulta() + "'";
                stm.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Dados Atualizados com sucesso");

                txBairro.setText("");
                txContatoMae.setText("");
                txContatoPai.setText("");
                txDtNascimento.setText("");
                txEndereco.setText("");
                txFim.setText("");
                txIdade.setText("");
                txInicio.setText("");
                txNomeAluno.setText("");
                txNomeEscola.setText("");
                txNomeMae.setText("");
                txNomePai.setText("");
                txNomeProjeto.setText("");
                txNumeroCasa.setText("");
                txRendimentoEscolar.setText("");
                txRg.setText("");
                txSemestre.setText("");
                txSerie.setText("");
                lbFoto.setIcon(null);
                txConsultar.setText("");
                txCPF.setText("");

            } catch (SQLException e) {
                e.printStackTrace();

            }
        }
    }

    public void Consultar() {
        con = null;
        aluno.setConsulta(Integer.parseInt(txConsultar.getText()));
        if (con == null) {
            try {
                con = ConexaoDB.getConexao();
                stm = con.createStatement();
                String sql;
                sql = "SELECT * FROM inscricao WHERE idAluno = " + aluno.getConsulta() + " OR rg = " + aluno.getConsulta() + ";";
                rs = stm.executeQuery(sql);
                rs.next();
                if (rs.isFirst()) {
                    txNomeProjeto.setText(rs.getString("nome_projeto"));
                    txInicio.setText(rs.getString("dt_inicio"));
                    txFim.setText(rs.getString("dt_fim"));
                    txNomeAluno.setText(rs.getString("nome_aluno"));
                    txDtNascimento.setText(rs.getString("dt_nascimento"));
                    cbSexo.setSelectedItem(rs.getString("sexo"));
                    txIdade.setText(rs.getString("idade"));
                    txNomePai.setText(rs.getString("nm_pai"));
                    txNomeMae.setText(rs.getString("nm_mae"));
                    txContatoMae.setText(rs.getString("contatoMae"));
                    txContatoPai.setText(rs.getString("contatoPai"));
                    txEndereco.setText(rs.getString("endereco"));
                    txNumeroCasa.setText(rs.getString("nCasa"));
                    txBairro.setText(rs.getString("bairro"));
                    txNomeEscola.setText(rs.getString("nm_escola"));
                    txRendimentoEscolar.setText(rs.getString("rendimento_escolar"));
                    txSemestre.setText(rs.getString("semestre"));
                    txRg.setText(rs.getString("rg"));
                    txSerie.setText(rs.getString("serie"));
                    txCPF.setText(rs.getString("cpf"));
                    lbFoto.setIcon(new ImageIcon(rs.getString("foto")));
                    Abrir.setVisible(false);

                    txNomeProjeto.setEditable(false);
                    txInicio.setEditable(false);
                    txFim.setEditable(false);
                    txNomeAluno.setEditable(false);
                    txDtNascimento.setEditable(false);
                    txIdade.setEditable(false);
                    txNomePai.setEditable(false);
                    txNomeMae.setEditable(false);
                    txContatoMae.setEditable(false);
                    txContatoPai.setEditable(false);
                    txEndereco.setEditable(false);
                    txNumeroCasa.setEditable(false);
                    txBairro.setEditable(false);
                    txNomeEscola.setEditable(false);
                    txRendimentoEscolar.setEditable(false);
                    txSemestre.setEditable(false);
                    txRg.setEditable(false);
                    txSerie.setEditable(false);
                    txCPF.setEditable(false);

                    btFoto.setVisible(false);
                    btLimpar.setVisible(false);
                    btCadastrar.setVisible(false);
                    btEditar.setVisible(true);
                    btSalvar.setVisible(true);
                    btVoltar.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "ID ou Rg não cadastrados no banco!");
                }
            } catch (SQLException sqlex) {
                sqlex.printStackTrace();
            }
        }
    }

    public void Cadastrar() {
        //VERIFICANDO CAMPOS VÁZIOS 
        if (txBairro.getText().equals("") || txContatoMae.getText().equals("") || txContatoPai.getText().equals("")
                || txDtNascimento.getText().equals("") || txEndereco.getText().equals("") || txFim.getText().equals("")
                || txFim.getText().equals("") || txIdade.getText().equals("") || txNomeAluno.getText().equals("")
                || txNomeEscola.getText().equals("") || txNomeMae.getText().equals("") || txNomePai.getText().equals("")
                || txNomeProjeto.getText().equals("") || txNumeroCasa.getText().equals("") || txRendimentoEscolar.getText().equals("")
                || txRg.getText().equals("") || txSemestre.getText().equals("") || txSerie.getText().equals("") || txCPF.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Existem campos a serem preenchidos ! ");
        }
        con = null;
        //SETANDO OS CAMPOS DA FICHA DE INSCRIÇÃO
        aluno.setNomeAluno(txNomeAluno.getText());
        aluno.setNomeEscola(txNomeEscola.getText());
        aluno.setNomeMae(txNomeMae.getText());
        aluno.setNomePai(txNomePai.getText());
        aluno.setNomeProjeto(txNomeProjeto.getText());
        aluno.setBairro(txBairro.getText());
        aluno.setDtFim(txFim.getText());
        aluno.setDtInicio(txInicio.getText());
        aluno.setDtNascimento(txDtNascimento.getText());
        aluno.setEndereco(txEndereco.getText());
        aluno.setIdade(Integer.parseInt(txIdade.getText()));
        aluno.setRendimentoEscolar(txRendimentoEscolar.getText());
        aluno.setRg(Integer.parseInt(txRg.getText()));
        aluno.setSemestre(txSemestre.getText());
        aluno.setSexo(cbSexo.getSelectedItem().toString());
        aluno.setTelMae(Integer.parseInt(txContatoMae.getText()));
        aluno.setTelPai(Integer.parseInt(txContatoPai.getText()));
        aluno.setnCasa(txNumeroCasa.getText());
        aluno.setSerie(txSerie.getText());
        aluno.setCpf(txCPF.getText());
        aluno.setFoto(arquivo.getAbsolutePath().replace("\\", "/").toString());

        if (con == null) {
            try {
                con = ConexaoDB.getConexao();
                stm = con.createStatement();

                //INICIALIZANDO OS VALORES PARA ARMAZENAR NO BANCO 
                String sql;
                sql = "INSERT INTO inscricao (idAluno, nome_projeto, dt_inicio, dt_fim, nome_aluno, dt_nascimento, sexo, idade, nm_pai, nm_mae,"
                        + "contatoMae, contatoPai, endereco, nCasa, bairro, nm_escola, serie, rendimento_escolar, semestre, ht_projetos, ht_escolar, foto, rg, cpf) "
                        + "VALUES(null,"
                        + "'" + aluno.getNomeProjeto() + "',"
                        + "'" + aluno.getDtInicio() + "',"
                        + "'" + aluno.getDtFim() + "',"
                        + "'" + aluno.getNomeAluno() + "',"
                        + "'" + aluno.getDtNascimento() + "',"
                        + "'" + aluno.getSexo() + "',"
                        + "'" + aluno.getIdade() + "',"
                        + "'" + aluno.getNomePai() + "',"
                        + "'" + aluno.getNomeMae() + "',"
                        + "'" + aluno.getTelMae() + "',"
                        + "'" + aluno.getTelPai() + "',"
                        + "'" + aluno.getEndereco() + "',"
                        + "'" + aluno.getnCasa() + "',"
                        + "'" + aluno.getBairro() + "',"
                        + "'" + aluno.getNomeEscola() + "',"
                        + "'" + aluno.getSerie() + "',"
                        + "'" + aluno.getRendimentoEscolar() + "',"
                        + "'" + aluno.getSemestre() + "',"
                        + "'" + aluno.getNomeProjeto() + "',"
                        + "'" + aluno.getRendimentoEscolar() + "',"
                        + "'" + aluno.getFoto() + "',"
                        + "'" + aluno.getRg() + ""
                        + "', '" + aluno.getCpf() + "')";
                stm.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Dados cadastrados com sucesso!");

                //LIMPAR CAMPOS APÓS CADASTRO
                txBairro.setText("");
                txContatoMae.setText("");
                txContatoPai.setText("");
                txDtNascimento.setText("");
                txEndereco.setText("");
                txFim.setText("");
                txIdade.setText("");
                txInicio.setText("");
                txNomeAluno.setText("");
                txNomeEscola.setText("");
                txNomeMae.setText("");
                txNomePai.setText("");
                txNomeProjeto.setText("");
                txNumeroCasa.setText("");
                txRendimentoEscolar.setText("");
                txRg.setText("");
                txSemestre.setText("");
                txSerie.setText("");
                txCPF.setText("");
                lbFoto.setIcon(null);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    public static Image createFaviIcon(String fileName) {
        URL url = Image.class.getResource("/img/logo.png");
        Image faviIcon = Toolkit.getDefaultToolkit().getImage(url);
        return faviIcon;
    }

    private void Abrir() {
        con = null;
        aluno.setConsulta(Integer.parseInt(txConsultar.getText()));
        if (con == null) {
            try {
                con = ConexaoDB.getConexao();
                stm = con.createStatement();
                String sql;
                sql = "SELECT nome_aluno, ht_escolar FROM inscricao WHERE idAluno = '" + aluno.getConsulta() + "' OR rg = '" + aluno.getConsulta() + "';";
                rs = stm.executeQuery(sql);
                rs.next();
                if (rs.first()) {
                    lbNome.setText(rs.getString("nome_aluno"));
                    atRendimento.setText(rs.getString("ht_escolar"));
                    Abrir.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Aluno não Cadastrado !!");
                }
            } catch (SQLException e) {

            }
        }
    }

    private void Salvar() {
        con = null;
        aluno.setRendimentoEscolar(atRendimento.getText());
        if (con == null) {
            try {
                con = ConexaoDB.getConexao();
                stm = con.createStatement();
                String sql;
                sql = "UPDATE inscricao SET ht_escolar = '" + aluno.getRendimentoEscolar() + "';";
                stm.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Rendimento Escolar do Aluno: \n" + lbNome.getText() + " "
                        + "Atualizado com sucesso!");

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void SalvarProjeto() {
        con = null;
        aluno.setHtProjeto(atHtProjeto.getText());
        if (con == null) {
            try {
                con = ConexaoDB.getConexao();
                stm = con.createStatement();
                String sql;
                sql = "UPDATE inscricao SET ht_projetos = '" + aluno.getHtProjeto()+ "';";
                stm.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Histórico de Projetos do Aluno: \n" + lbNomeAlu.getText() + " "
                        + "Atualizado com sucesso!");

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void AbrirProjeto() {
        con = null;
        aluno.setConsulta(Integer.parseInt(txConsultar.getText()));
        if (con == null) {
            try {
                con = ConexaoDB.getConexao();
                stm = con.createStatement();
                String sql;
                sql = "SELECT nome_aluno, ht_projetos FROM inscricao WHERE idAluno = '" + aluno.getConsulta() + "' OR rg = '" + aluno.getConsulta() + "';";
                rs = stm.executeQuery(sql);
                rs.next();
                if (rs.first()) {
                    lbNomeAlu.setText(rs.getString("nome_aluno"));
                    atHtProjeto.setText(rs.getString("ht_projetos"));
                    Abrir.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Aluno não Cadastrado !!");
                }
            } catch (SQLException e) {

            }
        }
    }
}
