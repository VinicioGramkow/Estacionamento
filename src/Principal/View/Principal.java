package Principal.View;

import Principal.Model.Funcionario;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import Principal.Controller.TicketController;

/**
 *
 * @author Débora
 */
public class Principal extends javax.swing.JFrame {

    /*ArrayList<valor> valores        = new ArrayList<valor>();
    ExportaImportaArquivosJson json = new ExportaImportaArquivosJson();*/
    SimpleDateFormat date           = new SimpleDateFormat("dd/MM/yyyy");
    //ArrayList<vagas> vaga           = new ArrayList<vagas>();
    Date dia                        = new Date();
    String data                     = date.format(dia);
    ViewLogin log = new ViewLogin();
    String nomeFuncionario;

    public String nome() {
        return log.pegaNome();
    }

    public Funcionario pegaFun() {
        return log.fun;
    }
    /*public double valorTotal() throws FileNotFoundException {

        ArrayList<valorTotal> valorTotal = new ArrayList<valorTotal>();

        valorTotal = json.importaRelatorioMensalDiario(valorTotal);

        Calendar mesComp = Calendar.getInstance();
        Calendar diaComp = Calendar.getInstance();

        Date hoje = new Date();
        Calendar dta = Calendar.getInstance();
        dta.setTime(hoje);

        double valorT = 0;

        for (valorTotal valor : valorTotal) {
            mesComp.setTime(valor.getDate());
            diaComp.setTime(valor.getDate());

            if ((mesComp.get(Calendar.MONTH) == dta.get(Calendar.MONTH)) && (diaComp.get(Calendar.DAY_OF_MONTH) == dta.get(Calendar.DAY_OF_MONTH))) {
                valorT += valor.getValor();
            }
        }
        
        return valorT;
    }
 
    public int vagasDisponiveis() throws IOException {
        try {
            vaga = json.importaVagas(vaga);
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
        int cont = 0;

        for (vagas va : vaga) {
            if ((va.getLivre().equals("livre")) && (va.isPermicao() == true)) {
                cont++;
            }
        }
        return cont;
    }

    public int vagasOcupadas() throws IOException {

        try {
            vaga = json.importaVagas(vaga);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int cont = 0;

        for (vagas va : vaga) {
            if (!va.getLivre().equals("livre")) {
                cont++;
            }
        }
        return cont;
    }*/

    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        textdia = new javax.swing.JLabel();
        vagaDsiponivelText = new javax.swing.JTextField();
        vagasOcupadastext = new javax.swing.JTextField();
        RelatorioLabel = new javax.swing.JTabbedPane();
        guiaCadastros = new javax.swing.JPanel();
        botaoCadVeiculo = new javax.swing.JButton();
        BotaoCadCliente = new javax.swing.JButton();
        botaoCadVagas = new javax.swing.JButton();
        cadValorHora = new javax.swing.JButton();
        guiaRelatorios = new javax.swing.JPanel();
        BotaoRelatUsuarios = new javax.swing.JButton();
        botaoLevMarcas = new javax.swing.JButton();
        botaoFatMensal = new javax.swing.JButton();
        historioValoresGuia = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        caixaHistoricoValor = new javax.swing.JTextArea();
        botaoAtualizarValorHistorico = new javax.swing.JButton();
        valorTotaltext = new javax.swing.JTextField();
        botaoGeraTicket = new javax.swing.JButton();
        TextFunconario = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        entradaCarro = new javax.swing.JTextArea();
        jToggleButton1 = new javax.swing.JToggleButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(875, 466));
        setMinimumSize(new java.awt.Dimension(875, 466));

        textdia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textdia.setText("Dia " + data);

        vagaDsiponivelText.setEditable(false);
        vagaDsiponivelText.setBackground(new java.awt.Color(102, 255, 51));
        vagaDsiponivelText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        vagaDsiponivelText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        vagaDsiponivelText.setText("Vagas Disponíveis");

        vagasOcupadastext.setEditable(false);
        vagasOcupadastext.setBackground(new java.awt.Color(255, 0, 0));
        vagasOcupadastext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        vagasOcupadastext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        vagasOcupadastext.setText("Vagas Ocupadas");

        RelatorioLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botaoCadVeiculo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoCadVeiculo.setText("Cadastrar Veiculo");
        botaoCadVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadVeiculoActionPerformed(evt);
            }
        });

        BotaoCadCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoCadCliente.setText("Cadastrar Cliente");
        BotaoCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadClienteActionPerformed(evt);
            }
        });

        botaoCadVagas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoCadVagas.setText("Cadastrar Vagas");
        botaoCadVagas.setMaximumSize(new java.awt.Dimension(141, 25));
        botaoCadVagas.setMinimumSize(new java.awt.Dimension(141, 25));
        botaoCadVagas.setPreferredSize(new java.awt.Dimension(141, 25));
        botaoCadVagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadVagasActionPerformed(evt);
            }
        });

        cadValorHora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cadValorHora.setText("Cadastrar Valor/Hora");
        cadValorHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadValorHoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout guiaCadastrosLayout = new javax.swing.GroupLayout(guiaCadastros);
        guiaCadastros.setLayout(guiaCadastrosLayout);
        guiaCadastrosLayout.setHorizontalGroup(
            guiaCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiaCadastrosLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(guiaCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCadVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadValorHora, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCadVagas, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        guiaCadastrosLayout.setVerticalGroup(
            guiaCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiaCadastrosLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(botaoCadVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(BotaoCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(botaoCadVagas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(cadValorHora, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        RelatorioLabel.addTab("CADASTROS", guiaCadastros);

        BotaoRelatUsuarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoRelatUsuarios.setText("Relatorio Usuarios");
        BotaoRelatUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRelatUsuariosActionPerformed(evt);
            }
        });

        botaoFatDiario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoFatDiario.setText("Faturamento Diario");
        botaoFatDiario.setMaximumSize(new java.awt.Dimension(141, 25));
        botaoFatDiario.setMinimumSize(new java.awt.Dimension(141, 25));
        botaoFatDiario.setPreferredSize(new java.awt.Dimension(141, 25));
        botaoFatDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFatDiarioActionPerformed(evt);
            }
        });

        botaoLevMarcas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoLevMarcas.setText("Levantamento Marcas");
        botaoLevMarcas.setMaximumSize(new java.awt.Dimension(141, 25));
        botaoLevMarcas.setMinimumSize(new java.awt.Dimension(141, 25));
        botaoLevMarcas.setPreferredSize(new java.awt.Dimension(141, 25));
        botaoLevMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLevMarcasActionPerformed(evt);
            }
        });

        botaoFatMensal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoFatMensal.setText("Faturamento Mensal");
        botaoFatMensal.setMaximumSize(new java.awt.Dimension(141, 25));
        botaoFatMensal.setMinimumSize(new java.awt.Dimension(141, 25));
        botaoFatMensal.setPreferredSize(new java.awt.Dimension(141, 25));
        botaoFatMensal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFatMensalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout guiaRelatoriosLayout = new javax.swing.GroupLayout(guiaRelatorios);
        guiaRelatorios.setLayout(guiaRelatoriosLayout);
        guiaRelatoriosLayout.setHorizontalGroup(
            guiaRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiaRelatoriosLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(guiaRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoFatMensal, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addComponent(botaoLevMarcas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoFatDiario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoRelatUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        guiaRelatoriosLayout.setVerticalGroup(
            guiaRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiaRelatoriosLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(BotaoRelatUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(botaoFatDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(botaoFatMensal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(botaoLevMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        RelatorioLabel.addTab("RELATORIOS", guiaRelatorios);

        caixaHistoricoValor.setEditable(false);
        caixaHistoricoValor.setColumns(20);
        caixaHistoricoValor.setRows(5);
        jScrollPane1.setViewportView(caixaHistoricoValor);

        botaoAtualizarValorHistorico.setText("ATUALIZAR HISTORICO");
        botaoAtualizarValorHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarValorHistoricoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout historioValoresGuiaLayout = new javax.swing.GroupLayout(historioValoresGuia);
        historioValoresGuia.setLayout(historioValoresGuiaLayout);
        historioValoresGuiaLayout.setHorizontalGroup(
            historioValoresGuiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historioValoresGuiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(historioValoresGuiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAtualizarValorHistorico))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        historioValoresGuiaLayout.setVerticalGroup(
            historioValoresGuiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, historioValoresGuiaLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(botaoAtualizarValorHistorico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        RelatorioLabel.addTab("HISTORICO VALORES", historioValoresGuia);

        valorTotaltext.setEditable(false);
        valorTotaltext.setBackground(new java.awt.Color(255, 255, 255));
        valorTotaltext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valorTotaltext.setText("VALOR TOTAL R$");

        botaoGeraTicket.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoGeraTicket.setText("Gerar Ticket");
        botaoGeraTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
		botaoGeraTicketActionPerformed(evt);
            }
        });

        TextFunconario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TextFunconario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TextFunconario.setText(nome());

        entradaCarro.setEditable(false);
        entradaCarro.setBackground(new java.awt.Color(230, 230, 254));
        entradaCarro.setColumns(20);
        entradaCarro.setRows(5);
        //jScrollPane2.setViewportView(mostraTicketMenu());

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 0, 0));
        jToggleButton1.setText("X");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RelatorioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vagasOcupadastext, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vagaDsiponivelText, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(botaoGeraTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(valorTotaltext, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(textdia, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TextFunconario, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFunconario)
                    .addComponent(textdia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RelatorioLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vagaDsiponivelText, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(vagasOcupadastext, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(valorTotaltext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(botaoGeraTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addGap(33, 33, 33))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
       /* sistemaNovo sistema = new sistemaNovo();
        sistema.setVisible(true);
        dispose();*/
    }


    /*private JTextArea mostraTicketMenu() {
       
    	ControllerTicket ticket = new ControllerTicket();
        entradaCarro.setText(ticket.ticketEntrada);
        return entradaCarro;
    }*/

    private void botaoCadVeiculoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoCadVeiculoActionPerformed

        /*// INICIA FRAME CADASTRO VEICULO
        CadVeiculo cadastroVeiculo = new CadVeiculo();
        cadastroVeiculo.setVisible(true);
        dispose();*/
    }

    private void BotaoCadClienteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BotaoCadClienteActionPerformed
        ViewCliente cadastroCliente = new ViewCliente();
        cadastroCliente.setVisible(true);
        dispose();
    }

    private void botaoCadVagasActionPerformed(java.awt.event.ActionEvent evt){// GEN-FIRST:event_botaoCadVagasActionPerformed
       /* cadVagas cadVagas = new cadVagas();
        cadVagas.setVisible(true);
        dispose();*/

    }

    private void cadValorHoraActionPerformed(java.awt.event.ActionEvent evt){

        /*try {
            valores = json.importaJsonValores(valores);
            valor valor = new valor();

            Date horarioDia = new Date();
            String horaDia = date.format(horarioDia);

            String valorPego = JOptionPane.showInputDialog("Valor");
            valor.setValor(Double.parseDouble(valorPego));
            valor.setData(horaDia);
            valor.setCodigo(valores.size() + 1);
            valores.add(valor);

            json.exportaValores(valores);
        } catch (java.lang.NullPointerException e) {
            menuPrincipal menu = new menuPrincipal();
            menu.setVisible(true);
            dispose();
        }*/

    }

    private void botaoGeraTicketActionPerformed(java.awt.event.ActionEvent evt){
        /*ControllerTicket Ticket = new ControllerTicket();
        Ticket.geraTicket();*/

    }

    private void BotaoRelatUsuariosActionPerformed(java.awt.event.ActionEvent evt) {

        // GERA RELATORIO DOS CLIENTES QUE MAIS UTILIZAM
        /*RelatorioClientes relatorio = new RelatorioClientes();
        relatorio.setVisible(true);
        dispose();*/
    }

    private void botaoFatDiarioActionPerformed(java.awt.event.ActionEvent evt) {

        /*RelatorioDiario diario = new RelatorioDiario();
        diario.setVisible(true);
        dispose();*/
    }

    private void botaoFatMensalActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoFatMensalActionPerformed
        /*RelatorioMensal mensal = new RelatorioMensal();
        mensal.setVisible(true);
        dispose();*/
    }

    private void botaoLevMarcasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botaoLevMarcasActionPerformed
        // GERA O LEVANTAMENTO DE MARCA
        /*relatorioMarca relatMarca = new relatorioMarca();
        relatMarca.setVisible(true);
        dispose();*/
    }

    private void botaoAtualizarValorHistoricoActionPerformed(java.awt.event.ActionEvent evt){
           /* throws FileNotFoundException {// GEN-FIRST:event_botaoAtualizarValorHistoricoActionPerformed

        valores = json.importaJsonValores(valores);

        for (valor v : valores) {
            caixaHistoricoValor.setText("   " + v.getCodigo() + "            " + v.getData() + "          R$"
                    + v.getValor() + "\n" + caixaHistoricoValor.getText());
        }
        caixaHistoricoValor.setText("Codigo           Dia                  Valor \n" + caixaHistoricoValor.getText());*/
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadCliente;
    private javax.swing.JButton BotaoRelatUsuarios;
    private javax.swing.JTabbedPane RelatorioLabel;
    private javax.swing.JLabel TextFunconario;
    private javax.swing.JButton botaoAtualizarValorHistorico;
    private javax.swing.JButton botaoCadVagas;
    private javax.swing.JButton botaoCadVeiculo;
    private javax.swing.JButton botaoFatDiario;
    private javax.swing.JButton botaoFatMensal;
    private javax.swing.JButton botaoGeraTicket;
    private javax.swing.JButton botaoLevMarcas;
    private javax.swing.JButton cadValorHora;
    private javax.swing.JTextArea caixaHistoricoValor;
    private javax.swing.JTextArea entradaCarro;
    private javax.swing.JPanel guiaCadastros;
    private javax.swing.JPanel guiaRelatorios;
    private javax.swing.JPanel historioValoresGuia;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel textdia;
    private javax.swing.JTextField vagaDsiponivelText;
    private javax.swing.JTextField vagasOcupadastext;
    private javax.swing.JTextField valorTotaltext;
    // End of variables declaration//GEN-END:variables
}
