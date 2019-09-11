/*
 * Created by JFormDesigner on Mon Oct 29 14:51:08 BRST 2018
 */

package br.com.blackdrop.gui;

import br.com.blackdrop.entity.DadosDeEntrada;
import br.com.blackdrop.entity.ModeloBifasico;
import br.com.blackdrop.entity.Poco;
import br.com.blackdrop.service.DadosService;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author Leandro Costa
 */
public class Main extends JFrame {

    public Main() {
        initComponents();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main main = new Main();
            main.setLocationRelativeTo(null);
            main.setVisible(true);
        });
    }

    private void thisWindowOpened(WindowEvent e) {
        iniciaComboBoxes();
    }

    private void iniciaComboBoxes() {
        //comboBoxTipoDeFluxo
        cbxTipoDeFluxo.addItem("Monofásico (1D)"); //0
        cbxTipoDeFluxo.addItem("Bifásico (3D)");   //1

        //comboBoxFronteiraEsquerda
        cbxFronteiraEsquerda.addItem("Controle de Pressão");   //0
        cbxFronteiraEsquerda.addItem("Vazão (1D)");            //1

        //comboBoxFronteiraDireita
        cbxFronteiraDireita.addItem("Controle de Pressão");   //0
        cbxFronteiraDireita.addItem("Vazão (1D)");            //1

        //comboBoxTipoPoco
        cbxTipoPoco.addItem("Produtor");   //0
        cbxTipoPoco.addItem("Injetor");    //1

        //comboBoxDirecaoPoco
        cbxDirecaoPoco.addItem("I");   //0
        cbxDirecaoPoco.addItem("J");   //1
        cbxDirecaoPoco.addItem("K");   //2

        //comboBoxTipoControle
        cbxTipoControle.addItem("Pressão");    //0
        cbxTipoControle.addItem("Vazão");      //1
    }

    private void comboBoxTipoDeFluxoItemStateChanged(ItemEvent e) {
        if (cbxTipoDeFluxo.getSelectedIndex() == 0) {
            limparCampos3D();
            desabilitarCampos3D();
        } else {
            habilitarCampos3D();
        }
    }

    private void limparCampos3D() {
        //Direção
        txtNy.setText("");
        txtNz.setText("");
        //Delta
        txtDeltaY.setText("");
        txtDeltaZ.setText("");
        //Modelo Bifásico
        txtKro_max.setText("");
        txtKrw_max.setText("");
        txtSor.setText("");
        txtSwi.setText("");
        txtEo.setText("");
        txtEw.setText("");
        txtRho_o.setText("");
        txtRho_w.setText("");
        txtMi_o.setText("");
        txtMi_w.setText("");
        txtBo.setText("");
        txtBw.setText("");
        //Posição
        txtPosicaoY.setText("");
        txtPosicaoZ.setText("");
    }

    private void desabilitarCampos3D() {
        //Direção
        labelNy.setEnabled(false);
        labelNz.setEnabled(false);
        txtNy.setEnabled(false);
        txtNz.setEnabled(false);
        //Delta
        labelDeltaY.setEnabled(false);
        labelDeltaZ.setEnabled(false);
        txtDeltaY.setEnabled(false);
        txtDeltaZ.setEnabled(false);
        //Modelo Bifásico
        panelModeloBifasico.setEnabled(false);
        labelKro_max.setEnabled(false);
        labelKro_max2.setEnabled(false);
        labelKrw_max.setEnabled(false);
        labelKrw_max2.setEnabled(false);
        labelSor.setEnabled(false);
        labelSwi.setEnabled(false);
        labelEo.setEnabled(false);
        labelEw.setEnabled(false);
        labelRho_o.setEnabled(false);
        labelRho_o2.setEnabled(false);
        labelRho_w.setEnabled(false);
        labelRho_w2.setEnabled(false);
        labelMi_o.setEnabled(false);
        labelMi_o2.setEnabled(false);
        labelMi_w.setEnabled(false);
        labelMi_w2.setEnabled(false);
        labelBo.setEnabled(false);
        labelBw.setEnabled(false);
        txtKro_max.setEnabled(false);
        txtKrw_max.setEnabled(false);
        txtSor.setEnabled(false);
        txtSwi.setEnabled(false);
        txtEo.setEnabled(false);
        txtEw.setEnabled(false);
        txtRho_o.setEnabled(false);
        txtRho_w.setEnabled(false);
        txtMi_o.setEnabled(false);
        txtMi_w.setEnabled(false);
        txtBo.setEnabled(false);
        txtBw.setEnabled(false);
        //Posição
        labelNy2.setEnabled(false);
        labelNz2.setEnabled(false);
        txtPosicaoY.setEnabled(false);
        txtPosicaoZ.setEnabled(false);
    }

    private void habilitarCampos3D() {

        //Direção
        labelNy.setEnabled(true);
        labelNz.setEnabled(true);
        txtNy.setEnabled(true);
        txtNz.setEnabled(true);
        //Delta
        labelDeltaY.setEnabled(true);
        labelDeltaZ.setEnabled(true);
        txtDeltaY.setEnabled(true);
        txtDeltaZ.setEnabled(true);
        //Modelo Bifásico
        panelModeloBifasico.setEnabled(true);
        labelKro_max.setEnabled(true);
        labelKro_max2.setEnabled(true);
        labelKrw_max.setEnabled(true);
        labelKrw_max2.setEnabled(true);
        labelSor.setEnabled(true);
        labelSwi.setEnabled(true);
        labelEo.setEnabled(true);
        labelEw.setEnabled(true);
        labelRho_o.setEnabled(true);
        labelRho_o2.setEnabled(true);
        labelRho_w.setEnabled(true);
        labelRho_w2.setEnabled(true);
        labelMi_o.setEnabled(true);
        labelMi_o2.setEnabled(true);
        labelMi_w.setEnabled(true);
        labelMi_w2.setEnabled(true);
        labelBo.setEnabled(true);
        labelBw.setEnabled(true);
        txtKro_max.setEnabled(true);
        txtKrw_max.setEnabled(true);
        txtSor.setEnabled(true);
        txtSwi.setEnabled(true);
        txtEo.setEnabled(true);
        txtEw.setEnabled(true);
        txtRho_o.setEnabled(true);
        txtRho_w.setEnabled(true);
        txtMi_o.setEnabled(true);
        txtMi_w.setEnabled(true);
        txtBo.setEnabled(true);
        txtBw.setEnabled(true);
        //Posição
        labelNy2.setEnabled(true);
        labelNz2.setEnabled(true);
        txtPosicaoY.setEnabled(true);
        txtPosicaoZ.setEnabled(true);
    }

    private void buttonSalvarActionPerformed(ActionEvent e) {
        DadosService service = new DadosService();
        DadosDeEntrada dadosDeEntrada = new DadosDeEntrada();
        ModeloBifasico modeloBifasico = null;
        Poco poco = new Poco();
        String validacao = validarCamposVazios();
        if (validacao == null) {
            try {
                if (cbxTipoDeFluxo.getSelectedIndex() == 1) {
                    modeloBifasico = new ModeloBifasico(Float.valueOf(txtKro_max.getText()), Float.valueOf(txtKrw_max.getText()),
                            Float.valueOf(txtSor.getText()), Float.valueOf(txtSwi.getText()), Float.valueOf(txtEo.getText()),
                            Float.valueOf(txtEw.getText()), Float.valueOf(txtRho_o.getText()), Float.valueOf(txtRho_w.getText()),
                            Float.valueOf(txtMi_o.getText()), Float.valueOf(txtMi_w.getText()), Float.valueOf(txtBo.getText()),
                            Float.valueOf(txtBw.getText()));

                    dadosDeEntrada.setnY(Float.parseFloat(txtNy.getText()));
                    dadosDeEntrada.setnZ(Float.parseFloat(txtNz.getText()));
                    dadosDeEntrada.setDeltaY(Float.parseFloat(txtDeltaY.getText()));
                    dadosDeEntrada.setDeltaZ(Float.parseFloat(txtDeltaZ.getText()));
                    poco.setPosition(txtPosicaoX.getText());
                } else {
                    poco.setPosition(txtPosicaoX.getText() + " " + txtPosicaoY.getText() + " " + txtPosicaoZ.getText());
                }
                poco.setWellName(txtNomePoco.getText());
                poco.setWellType((byte) (cbxTipoPoco.getSelectedIndex() == 0 ? 0 : 1));
                if (cbxDirecaoPoco.getSelectedIndex() == 0) {
                    poco.setDirection('I');
                } else if (cbxDirecaoPoco.getSelectedIndex() == 1) {
                    poco.setDirection('J');
                } else {
                    poco.setDirection('K');
                }
                poco.setWellRadius(Float.parseFloat(txtRaio.getText()));
                poco.setSkinFact(Byte.parseByte(txtSkinFact.getText()));
                poco.setControlType((byte) (cbxTipoControle.getSelectedIndex() == 0 ? 0 : 1));
                poco.setValue(Integer.parseInt(txtValor.getText()));

                dadosDeEntrada.setTipoDeFluxo((byte) (cbxTipoDeFluxo.getSelectedIndex() == 0 ? 1 : 2));
                dadosDeEntrada.setPorosidade(Float.parseFloat(txtPorosidade.getText()));
                dadosDeEntrada.setPermeabilidade(Float.parseFloat(txtPermeabilidade.getText()));
                dadosDeEntrada.setCompressibilidade(txtCompressibilidade.getText());
                dadosDeEntrada.setCompressWater(Float.parseFloat(txtCompressaoAgua.getText()));
                dadosDeEntrada.setCompressOil(Float.parseFloat(txtCompressaoOleo.getText()));
                dadosDeEntrada.setViscosidade(Float.parseFloat(txtViscosidade.getText()));
                dadosDeEntrada.setLaminaDagua(Float.parseFloat(txtLaminaDAgua.getText()));
                dadosDeEntrada.setnX(Float.parseFloat(txtNx.getText()));
                dadosDeEntrada.setQuantidadeDePocos(Integer.parseInt(txtQuantidadeDePoços.getText()));
                dadosDeEntrada.setDeltaX(Float.parseFloat(txtDeltaX.getText()));
                dadosDeEntrada.setPressaoInicial(Float.parseFloat(txtPressaoInicial.getText()));
                dadosDeEntrada.setDeltaT(Float.parseFloat(txtDeltaT.getText()));
                dadosDeEntrada.setTempoFinal(Float.parseFloat(txtTempoFinal.getText()));
                dadosDeEntrada.setFronteiraEsquerda((byte) (cbxFronteiraEsquerda.getSelectedIndex() == 0 ? 0 : 1));
                dadosDeEntrada.setFronteiraDireita((byte) (cbxFronteiraDireita.getSelectedIndex() == 0 ? 0 : 1));
                dadosDeEntrada.setPoco(poco);
                dadosDeEntrada.setModeloBifasico(modeloBifasico);

                service.save(dadosDeEntrada);
                JOptionPane.showMessageDialog(Main.this, "Arquivo gerado com sucesso");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(Main.this, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(Main.this, validacao);
        }
    }

    private String validarCamposVazios() {
        String validacao = null;

        if ("".equals(txtPorosidade.getText())) { validacao = "Campo Porosidade obrigatório"; }

        else if ("".equals(txtPermeabilidade.getText())) { validacao = "Campo Permeabilidade obrigatório"; }

        else if ("".equals(txtCompressibilidade.getText())) { validacao = "Campo Compressibilidade obrigatório"; }

        else if ("".equals(txtCompressaoAgua.getText())) { validacao = "Campo Compressão D'Água obrigatório"; }

        else if ("".equals(txtCompressaoOleo.getText())) { validacao = "Campo Compressão do Óleo obrigatório"; }

        else if ("".equals(txtViscosidade.getText())) { validacao = "Campo Viscosidade obrigatório"; }

        else if ("".equals(txtLaminaDAgua.getText())) { validacao = "Campo Lamina D'Água obrigatório"; }

        else if ("".equals(txtQuantidadeDePoços.getText())) { validacao = "Campo Quantidade de Poços obrigatório"; }

        else if ("".equals(txtPressaoInicial.getText())) { validacao = "Campo Pressão Inicial obrigatório"; }

        else if ("".equals(txtDeltaT.getText())) { validacao = "Campo Delta T obrigatório"; }

        else if ("".equals(txtTempoFinal.getText())) { validacao = "Campo Tempo Final obrigatório"; }

        else if ("".equals(txtNx.getText())) { validacao = "Campo Direção X obrigatório"; }

        else if ("".equals(txtDeltaX.getText())) { validacao = "Campo Delta X obrigatório"; }

        else if ("".equals(txtNomePoco.getText())) { validacao = "Campo Nome Poço obrigatório"; }

        else if ("".equals(txtRaio.getText())) { validacao = "Campo Raio obrigatório"; }

        else if ("".equals(txtValor.getText())) { validacao = "Campo Valor obrigatório"; }

        else if ("".equals(txtSkinFact.getText())) { validacao = "Campo Skin Fact obrigatório"; }

        if (cbxTipoDeFluxo.getSelectedIndex() == 1) {

            if ("".equals(txtKro_max.getText())) { validacao = "Campo Kro_max obrigatório"; }

            else if ("".equals(txtKrw_max.getText())) { validacao = "Campo Krw_max obrigatório"; }

            else if ("".equals(txtSor.getText())) { validacao = "Campo Sor obrigatório"; }

            else if ("".equals(txtSwi.getText())) { validacao = "Campo Swi obrigatório"; }

            else if ("".equals(txtEo.getText())) { validacao = "Campo Eo obrigatório"; }

            else if ("".equals(txtEw.getText())) { validacao = "Campo Ew obrigatório"; }

            else if ("".equals(txtRho_o.getText())) { validacao = "Campo Rho_o obrigatório"; }

            else if ("".equals(txtRho_w.getText())) { validacao = "Campo Rho_w obrigatório"; }

            else if ("".equals(txtMi_o.getText())) { validacao = "Campo Mi_o obrigatório"; }

            else if ("".equals(txtMi_w.getText())) { validacao = "Campo Mi_w obrigatório"; }

            else if ("".equals(txtBo.getText())) { validacao = "Campo Bo obrigatório"; }

            else if ("".equals(txtBw.getText())) { validacao = "Campo Bw obrigatório"; }

            else if ("".equals(txtNy.getText())) { validacao = "Campo Direção Y obrigatório"; }

            else if ("".equals(txtNz.getText())) { validacao = "Campo Direção Z obrigatório"; }

            else if ("".equals(txtDeltaY.getText())) { validacao = "Campo Delta Y obrigatório"; }

            else if ("".equals(txtDeltaZ.getText())) { validacao = "Campo Delta Z obrigatório"; }

            else if ("".equals(txtPosicaoZ.getText())) { validacao = "Campo Posição Z obrigatório"; }

            else if ("".equals(txtPosicaoX.getText())) { validacao = "Campo Posição X obrigatório"; }

            else if ("".equals(txtPosicaoY.getText())) { validacao = "Campo Posição Y obrigatório"; }
        }
        return validacao;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Leandro Costa
        panelReservatorio = new JPanel();
        labelTipoDeFluxo = new JLabel();
        cbxTipoDeFluxo = new JComboBox();
        labelPorosidade = new JLabel();
        txtPorosidade = new JTextField();
        labelPermeabilidade = new JLabel();
        txtPermeabilidade = new JTextField();
        labelCompressibilidade = new JLabel();
        txtCompressibilidade = new JTextField();
        labelCompressaoAgua = new JLabel();
        txtCompressaoAgua = new JTextField();
        labelCompressaoOleo = new JLabel();
        txtCompressaoOleo = new JTextField();
        labelViscosidade = new JLabel();
        txtViscosidade = new JTextField();
        labelLaminaDAgua = new JLabel();
        txtLaminaDAgua = new JTextField();
        labelQuantidadeDePoços = new JLabel();
        txtQuantidadeDePoços = new JTextField();
        labelPressaoInicial = new JLabel();
        txtPressaoInicial = new JTextField();
        labelDeltaT = new JLabel();
        txtDeltaT = new JTextField();
        labelTempoFinal = new JLabel();
        txtTempoFinal = new JTextField();
        labelFronteiraEsquerda = new JLabel();
        cbxFronteiraEsquerda = new JComboBox();
        labelFronteiraDireita = new JLabel();
        cbxFronteiraDireita = new JComboBox();
        labelDirecao = new JLabel();
        txtNx = new JTextField();
        labelNx = new JLabel();
        labelNy = new JLabel();
        txtNy = new JTextField();
        labelNz = new JLabel();
        txtNz = new JTextField();
        txtDeltaZ = new JTextField();
        labelDeltaZ = new JLabel();
        txtDeltaY = new JTextField();
        labelDeltaY = new JLabel();
        txtDeltaX = new JTextField();
        labelDeltaX = new JLabel();
        labelDelta = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        panelModeloBifasico = new JPanel();
        labelKro_max = new JLabel();
        txtKro_max = new JTextField();
        labelKrw_max = new JLabel();
        txtKrw_max = new JTextField();
        labelSor = new JLabel();
        txtRho_o = new JTextField();
        labelSwi = new JLabel();
        labelKro_max2 = new JLabel();
        labelKrw_max2 = new JLabel();
        txtMi_o = new JTextField();
        txtEo = new JTextField();
        txtMi_w = new JTextField();
        txtSor = new JTextField();
        txtSwi = new JTextField();
        txtEw = new JTextField();
        txtBo = new JTextField();
        txtBw = new JTextField();
        labelMi_o = new JLabel();
        labelMi_w = new JLabel();
        labelRho_o = new JLabel();
        labelRho_o2 = new JLabel();
        labelRho_w = new JLabel();
        labelMi_o2 = new JLabel();
        labelMi_w2 = new JLabel();
        labelEo = new JLabel();
        labelEw = new JLabel();
        labelBo = new JLabel();
        labelBw = new JLabel();
        txtRho_w = new JTextField();
        labelRho_w2 = new JLabel();
        panelPoco = new JPanel();
        labelNomePoco = new JLabel();
        txtNomePoco = new JTextField();
        labelTipoPoco = new JLabel();
        cbxTipoPoco = new JComboBox();
        txtPosicaoZ = new JTextField();
        labelNz2 = new JLabel();
        txtPosicaoY = new JTextField();
        labelNy2 = new JLabel();
        txtPosicaoX = new JTextField();
        labelPosicaoX = new JLabel();
        labelPosicaoPoco = new JLabel();
        labelDirecaoPoco = new JLabel();
        cbxDirecaoPoco = new JComboBox();
        labelTipoControle = new JLabel();
        cbxTipoControle = new JComboBox();
        labelRaioPoco = new JLabel();
        txtRaio = new JTextField();
        label1 = new JLabel();
        txtValor = new JTextField();
        labelValor = new JLabel();
        label9 = new JLabel();
        labelSkinFact = new JLabel();
        txtSkinFact = new JTextField();
        buttonSimular = new JButton();

        //======== this ========
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                thisWindowOpened(e);
            }
        });
        Container contentPane = getContentPane();

        //======== panelReservatorio ========
        {
            panelReservatorio.setBorder(new TitledBorder("Reservat\u00f3rio"));

            // JFormDesigner evaluation mark
            panelReservatorio.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panelReservatorio.getBorder())); panelReservatorio.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //---- labelTipoDeFluxo ----
            labelTipoDeFluxo.setText("Tipo de Fluxo");

            //---- cbxTipoDeFluxo ----
            cbxTipoDeFluxo.addItemListener(e -> comboBoxTipoDeFluxoItemStateChanged(e));

            //---- labelPorosidade ----
            labelPorosidade.setText("Porosidade");

            //---- labelPermeabilidade ----
            labelPermeabilidade.setText("Permeabilidade");

            //---- labelCompressibilidade ----
            labelCompressibilidade.setText("Compressibilidade");

            //---- labelCompressaoAgua ----
            labelCompressaoAgua.setText("Compress\u00e3o d'\u00c1gua");

            //---- labelCompressaoOleo ----
            labelCompressaoOleo.setText("Compress\u00e3o do \u00d3leo");

            //---- labelViscosidade ----
            labelViscosidade.setText("Viscosidade");

            //---- labelLaminaDAgua ----
            labelLaminaDAgua.setText("Lamina d'\u00c1gua");

            //---- labelQuantidadeDePoços ----
            labelQuantidadeDePoços.setText("Quantidade de Po\u00e7os");

            //---- labelPressaoInicial ----
            labelPressaoInicial.setText("Press\u00e3o Inicial");

            //---- labelDeltaT ----
            labelDeltaT.setText("Delta T");

            //---- labelTempoFinal ----
            labelTempoFinal.setText("Tempo Final");

            //---- labelFronteiraEsquerda ----
            labelFronteiraEsquerda.setText("Fronteira Esquerda");

            //---- labelFronteiraDireita ----
            labelFronteiraDireita.setText("Fronteira Direita");

            //---- labelDirecao ----
            labelDirecao.setText("Dire\u00e7\u00e3o");

            //---- labelNx ----
            labelNx.setText("X:");

            //---- labelNy ----
            labelNy.setText("Y:");

            //---- labelNz ----
            labelNz.setText("Z:");

            //---- labelDeltaZ ----
            labelDeltaZ.setText("Z:");

            //---- labelDeltaY ----
            labelDeltaY.setText("Y:");

            //---- labelDeltaX ----
            labelDeltaX.setText("X:");

            //---- labelDelta ----
            labelDelta.setText("Delta");

            //---- label2 ----
            label2.setText("mD");

            //---- label3 ----
            label3.setText("%");

            //---- label4 ----
            label4.setText("1/psi");

            //---- label5 ----
            label5.setText("kPa^-1");

            //---- label6 ----
            label6.setText("1/psi");

            //---- label7 ----
            label7.setText("cP");

            //---- label8 ----
            label8.setText("m");

            //---- label10 ----
            label10.setText("kPa");

            //---- label11 ----
            label11.setText("Dias");

            //---- label12 ----
            label12.setText("Dias");

            GroupLayout panelReservatorioLayout = new GroupLayout(panelReservatorio);
            panelReservatorio.setLayout(panelReservatorioLayout);
            panelReservatorioLayout.setHorizontalGroup(
                panelReservatorioLayout.createParallelGroup()
                    .addGroup(panelReservatorioLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panelReservatorioLayout.createParallelGroup()
                            .addGroup(panelReservatorioLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelReservatorioLayout.createSequentialGroup()
                                    .addGroup(panelReservatorioLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(labelPermeabilidade, GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPermeabilidade, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(panelReservatorioLayout.createSequentialGroup()
                                    .addComponent(txtPorosidade, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label3))
                                .addComponent(labelTipoDeFluxo)
                                .addComponent(labelPorosidade)
                                .addComponent(labelCompressibilidade)
                                .addGroup(panelReservatorioLayout.createSequentialGroup()
                                    .addComponent(txtCompressibilidade, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label4))
                                .addGroup(panelReservatorioLayout.createSequentialGroup()
                                    .addComponent(txtCompressaoAgua, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label5))
                                .addComponent(labelCompressaoAgua)
                                .addComponent(labelCompressaoOleo)
                                .addGroup(panelReservatorioLayout.createSequentialGroup()
                                    .addComponent(txtCompressaoOleo, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label6))
                                .addGroup(panelReservatorioLayout.createSequentialGroup()
                                    .addComponent(txtViscosidade, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label7))
                                .addComponent(labelViscosidade)
                                .addComponent(cbxTipoDeFluxo))
                            .addComponent(labelLaminaDAgua)
                            .addGroup(panelReservatorioLayout.createSequentialGroup()
                                .addComponent(txtLaminaDAgua, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label8)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(panelReservatorioLayout.createParallelGroup()
                            .addGroup(panelReservatorioLayout.createSequentialGroup()
                                .addComponent(labelNx)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelReservatorioLayout.createParallelGroup()
                                    .addComponent(labelDirecao)
                                    .addGroup(panelReservatorioLayout.createSequentialGroup()
                                        .addComponent(txtNx, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelNy)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNy, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelNz)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNz, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelReservatorioLayout.createSequentialGroup()
                                .addComponent(labelDeltaX)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDeltaX, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelDeltaY)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDeltaY, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelDeltaZ)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDeltaZ, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelReservatorioLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(panelReservatorioLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelQuantidadeDePoços)
                                    .addComponent(labelPressaoInicial)
                                    .addComponent(labelDeltaT)
                                    .addComponent(labelTempoFinal)
                                    .addComponent(labelFronteiraDireita)
                                    .addGroup(panelReservatorioLayout.createSequentialGroup()
                                        .addComponent(txtPressaoInicial, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label10))
                                    .addGroup(panelReservatorioLayout.createSequentialGroup()
                                        .addComponent(txtDeltaT, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label11))
                                    .addGroup(panelReservatorioLayout.createSequentialGroup()
                                        .addComponent(txtTempoFinal, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label12))
                                    .addComponent(txtQuantidadeDePoços, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelFronteiraEsquerda)
                                    .addComponent(labelDelta)
                                    .addComponent(cbxFronteiraEsquerda, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(cbxFronteiraDireita, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))
                        .addGap(25, 25, 25))
            );
            panelReservatorioLayout.setVerticalGroup(
                panelReservatorioLayout.createParallelGroup()
                    .addGroup(panelReservatorioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelReservatorioLayout.createParallelGroup()
                            .addGroup(panelReservatorioLayout.createSequentialGroup()
                                .addComponent(labelQuantidadeDePoços)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantidadeDePoços, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelPressaoInicial)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelReservatorioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPressaoInicial, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label10))
                                .addGap(18, 18, 18)
                                .addComponent(labelDeltaT)
                                .addGap(4, 4, 4)
                                .addGroup(panelReservatorioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDeltaT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label11))
                                .addGap(18, 18, 18)
                                .addComponent(labelTempoFinal)
                                .addGap(4, 4, 4)
                                .addGroup(panelReservatorioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTempoFinal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label12))
                                .addGap(18, 18, 18)
                                .addComponent(labelFronteiraEsquerda)
                                .addGap(4, 4, 4)
                                .addComponent(cbxFronteiraEsquerda, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelFronteiraDireita)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxFronteiraDireita, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelDirecao)
                                .addGap(4, 4, 4)
                                .addGroup(panelReservatorioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelNy)
                                    .addComponent(txtNy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelNz)
                                    .addComponent(txtNz, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelNx)
                                    .addComponent(txtNx, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(labelDelta)
                                .addGap(6, 6, 6)
                                .addGroup(panelReservatorioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelDeltaX)
                                    .addComponent(txtDeltaX, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelDeltaY)
                                    .addComponent(txtDeltaY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelDeltaZ)
                                    .addComponent(txtDeltaZ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelReservatorioLayout.createSequentialGroup()
                                .addComponent(labelTipoDeFluxo)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxTipoDeFluxo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelPorosidade)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelReservatorioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPorosidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label3))
                                .addGap(18, 18, 18)
                                .addComponent(labelPermeabilidade)
                                .addGap(4, 4, 4)
                                .addGroup(panelReservatorioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPermeabilidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2))
                                .addGap(18, 18, 18)
                                .addComponent(labelCompressibilidade)
                                .addGap(4, 4, 4)
                                .addGroup(panelReservatorioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCompressibilidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label4))
                                .addGap(18, 18, 18)
                                .addComponent(labelCompressaoAgua)
                                .addGap(4, 4, 4)
                                .addGroup(panelReservatorioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCompressaoAgua, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label5))
                                .addGap(18, 18, 18)
                                .addComponent(labelCompressaoOleo)
                                .addGap(6, 6, 6)
                                .addGroup(panelReservatorioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCompressaoOleo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label6))
                                .addGap(18, 18, 18)
                                .addComponent(labelViscosidade)
                                .addGap(4, 4, 4)
                                .addGroup(panelReservatorioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtViscosidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label7))
                                .addGap(18, 18, 18)
                                .addComponent(labelLaminaDAgua)
                                .addGap(6, 6, 6)
                                .addGroup(panelReservatorioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLaminaDAgua, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label8))))
                        .addContainerGap(29, Short.MAX_VALUE))
            );
        }

        //======== panelModeloBifasico ========
        {
            panelModeloBifasico.setBorder(new TitledBorder("Modelo Bifasico"));

            //---- labelKro_max ----
            labelKro_max.setText("Kro_max");

            //---- labelKrw_max ----
            labelKrw_max.setText("Krw_max");

            //---- labelSor ----
            labelSor.setText("Sor");

            //---- labelSwi ----
            labelSwi.setText("Swi");

            //---- labelKro_max2 ----
            labelKro_max2.setText("mD");

            //---- labelKrw_max2 ----
            labelKrw_max2.setText("mD");

            //---- labelMi_o ----
            labelMi_o.setText("Mi_o");

            //---- labelMi_w ----
            labelMi_w.setText("Mi_w");

            //---- labelRho_o ----
            labelRho_o.setText("Rho_o");

            //---- labelRho_o2 ----
            labelRho_o2.setText("kg/m\u00b3");

            //---- labelRho_w ----
            labelRho_w.setText("Rho_w");

            //---- labelMi_o2 ----
            labelMi_o2.setText("cP");

            //---- labelMi_w2 ----
            labelMi_w2.setText("cP");

            //---- labelEo ----
            labelEo.setText("Eo");

            //---- labelEw ----
            labelEw.setText("Ew");

            //---- labelBo ----
            labelBo.setText("Bo");

            //---- labelBw ----
            labelBw.setText("Bw");

            //---- labelRho_w2 ----
            labelRho_w2.setText("kg/m\u00b3");

            GroupLayout panelModeloBifasicoLayout = new GroupLayout(panelModeloBifasico);
            panelModeloBifasico.setLayout(panelModeloBifasicoLayout);
            panelModeloBifasicoLayout.setHorizontalGroup(
                panelModeloBifasicoLayout.createParallelGroup()
                    .addGroup(panelModeloBifasicoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(panelModeloBifasicoLayout.createParallelGroup()
                            .addGroup(panelModeloBifasicoLayout.createSequentialGroup()
                                .addGroup(panelModeloBifasicoLayout.createParallelGroup()
                                    .addComponent(labelKro_max)
                                    .addComponent(txtKro_max, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelKro_max2))
                            .addGroup(panelModeloBifasicoLayout.createSequentialGroup()
                                .addGroup(panelModeloBifasicoLayout.createParallelGroup()
                                    .addComponent(labelKrw_max)
                                    .addComponent(txtKrw_max, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelKrw_max2))
                            .addGroup(panelModeloBifasicoLayout.createSequentialGroup()
                                .addComponent(txtRho_o, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelRho_o2))
                            .addComponent(labelRho_o)
                            .addGroup(panelModeloBifasicoLayout.createSequentialGroup()
                                .addComponent(txtRho_w, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelRho_w2))
                            .addComponent(labelRho_w))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addGroup(panelModeloBifasicoLayout.createParallelGroup()
                            .addComponent(txtSor, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSwi, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelModeloBifasicoLayout.createSequentialGroup()
                                .addComponent(txtMi_o, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelMi_o2))
                            .addGroup(panelModeloBifasicoLayout.createSequentialGroup()
                                .addComponent(txtMi_w, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelMi_w2))
                            .addComponent(labelMi_o)
                            .addComponent(labelMi_w)
                            .addComponent(labelSor)
                            .addComponent(labelSwi))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addGroup(panelModeloBifasicoLayout.createParallelGroup()
                            .addComponent(labelEo)
                            .addGroup(panelModeloBifasicoLayout.createParallelGroup()
                                .addComponent(txtEo, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEw, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtBo, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtBw, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelEw)
                            .addComponent(labelBo)
                            .addComponent(labelBw))
                        .addGap(33, 33, 33))
            );
            panelModeloBifasicoLayout.setVerticalGroup(
                panelModeloBifasicoLayout.createParallelGroup()
                    .addGroup(panelModeloBifasicoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelModeloBifasicoLayout.createParallelGroup()
                            .addGroup(panelModeloBifasicoLayout.createSequentialGroup()
                                .addComponent(labelKro_max)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelModeloBifasicoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtKro_max, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelKro_max2))
                                .addGap(18, 18, 18)
                                .addComponent(labelKrw_max)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelModeloBifasicoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtKrw_max, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelKrw_max2))
                                .addGap(18, 18, 18)
                                .addComponent(labelRho_o)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelModeloBifasicoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtRho_o, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelRho_o2))
                                .addGap(18, 18, 18)
                                .addComponent(labelRho_w))
                            .addGroup(panelModeloBifasicoLayout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(labelSwi)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelModeloBifasicoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSwi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRho_w, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelRho_w2)))
                            .addGroup(panelModeloBifasicoLayout.createSequentialGroup()
                                .addGroup(panelModeloBifasicoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelMi_o)
                                    .addComponent(labelEo))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelModeloBifasicoLayout.createParallelGroup()
                                    .addGroup(panelModeloBifasicoLayout.createSequentialGroup()
                                        .addGroup(panelModeloBifasicoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtMi_o, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelMi_o2))
                                        .addGap(18, 18, 18)
                                        .addComponent(labelMi_w)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelModeloBifasicoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtMi_w, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelMi_w2))
                                        .addGap(16, 16, 16)
                                        .addComponent(labelSor)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelModeloBifasicoLayout.createSequentialGroup()
                                        .addComponent(txtEo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(labelEw)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEw, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(labelBo)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(labelBw)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBw, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(18, Short.MAX_VALUE))
            );
        }

        //======== panelPoco ========
        {
            panelPoco.setBorder(new TitledBorder("Po\u00e7o"));

            //---- labelNomePoco ----
            labelNomePoco.setText("Nome");

            //---- labelTipoPoco ----
            labelTipoPoco.setText("Tipo");

            //---- labelNz2 ----
            labelNz2.setText("Z:");

            //---- labelNy2 ----
            labelNy2.setText("Y:");

            //---- labelPosicaoX ----
            labelPosicaoX.setText("X:");

            //---- labelPosicaoPoco ----
            labelPosicaoPoco.setText("Posi\u00e7\u00e3o");

            //---- labelDirecaoPoco ----
            labelDirecaoPoco.setText("Dire\u00e7\u00e3o");

            //---- labelTipoControle ----
            labelTipoControle.setText("Tipo de Controle");

            //---- labelRaioPoco ----
            labelRaioPoco.setText("Raio");

            //---- label1 ----
            label1.setText("m");

            //---- labelValor ----
            labelValor.setText("Valor");

            //---- label9 ----
            label9.setText("kPa ou m\u00b3");

            //---- labelSkinFact ----
            labelSkinFact.setText("Skin Fact");

            //---- buttonSimular ----
            buttonSimular.setText("Simular");
            buttonSimular.addActionListener(e -> buttonSalvarActionPerformed(e));

            GroupLayout panelPocoLayout = new GroupLayout(panelPoco);
            panelPoco.setLayout(panelPocoLayout);
            panelPocoLayout.setHorizontalGroup(
                panelPocoLayout.createParallelGroup()
                    .addGroup(panelPocoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(panelPocoLayout.createParallelGroup()
                            .addGroup(panelPocoLayout.createSequentialGroup()
                                .addGroup(panelPocoLayout.createParallelGroup()
                                    .addGroup(panelPocoLayout.createSequentialGroup()
                                        .addComponent(txtNomePoco)
                                        .addGap(38, 38, 38))
                                    .addComponent(labelNomePoco)
                                    .addComponent(labelRaioPoco)
                                    .addGroup(panelPocoLayout.createSequentialGroup()
                                        .addGroup(panelPocoLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addGroup(panelPocoLayout.createSequentialGroup()
                                                .addComponent(labelPosicaoX)
                                                .addGap(6, 6, 6)
                                                .addComponent(txtPosicaoX, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtRaio, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6)
                                        .addGroup(panelPocoLayout.createParallelGroup()
                                            .addGroup(panelPocoLayout.createSequentialGroup()
                                                .addComponent(labelNy2)
                                                .addGap(6, 6, 6)
                                                .addComponent(txtPosicaoY, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(labelNz2)
                                                .addGap(6, 6, 6)
                                                .addComponent(txtPosicaoZ, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panelPocoLayout.createSequentialGroup()
                                                .addComponent(label1)
                                                .addGap(18, 18, 18)
                                                .addGroup(panelPocoLayout.createParallelGroup()
                                                    .addComponent(labelValor)
                                                    .addGroup(panelPocoLayout.createSequentialGroup()
                                                        .addComponent(txtValor, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(label9)))))))
                                .addGap(36, 36, 36))
                            .addGroup(panelPocoLayout.createSequentialGroup()
                                .addGroup(panelPocoLayout.createParallelGroup()
                                    .addGroup(panelPocoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtSkinFact, GroupLayout.Alignment.LEADING)
                                        .addComponent(labelSkinFact, GroupLayout.Alignment.LEADING))
                                    .addComponent(labelPosicaoPoco))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(panelPocoLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panelPocoLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelTipoControle)
                                .addComponent(labelTipoPoco)
                                .addComponent(cbxTipoPoco, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(labelDirecaoPoco)
                                .addComponent(cbxDirecaoPoco, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(cbxTipoControle, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                            .addComponent(buttonSimular, GroupLayout.Alignment.TRAILING))
                        .addGap(38, 38, 38))
            );
            panelPocoLayout.setVerticalGroup(
                panelPocoLayout.createParallelGroup()
                    .addGroup(panelPocoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelPocoLayout.createParallelGroup()
                            .addGroup(panelPocoLayout.createSequentialGroup()
                                .addComponent(labelNomePoco)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomePoco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelPosicaoPoco)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelPocoLayout.createParallelGroup()
                                    .addComponent(txtPosicaoX, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPosicaoY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPosicaoZ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelPocoLayout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(panelPocoLayout.createParallelGroup()
                                            .addComponent(labelPosicaoX)
                                            .addComponent(labelNy2)
                                            .addComponent(labelNz2))))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelPocoLayout.createParallelGroup()
                                    .addGroup(panelPocoLayout.createSequentialGroup()
                                        .addComponent(labelRaioPoco)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelPocoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtRaio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label1)
                                            .addComponent(txtValor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label9)))
                                    .addComponent(labelValor))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelSkinFact)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSkinFact, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPocoLayout.createSequentialGroup()
                                .addComponent(labelTipoPoco)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxTipoPoco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelDirecaoPoco)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxDirecaoPoco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelTipoControle)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxTipoControle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(buttonSimular)))
                        .addContainerGap(15, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panelReservatorio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(panelModeloBifasico, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelPoco, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(panelReservatorio, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(panelModeloBifasico, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(panelPoco, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGap(12, 12, 12))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Leandro Costa
    private JPanel panelReservatorio;
    private JLabel labelTipoDeFluxo;
    private JComboBox cbxTipoDeFluxo;
    private JLabel labelPorosidade;
    private JTextField txtPorosidade;
    private JLabel labelPermeabilidade;
    private JTextField txtPermeabilidade;
    private JLabel labelCompressibilidade;
    private JTextField txtCompressibilidade;
    private JLabel labelCompressaoAgua;
    private JTextField txtCompressaoAgua;
    private JLabel labelCompressaoOleo;
    private JTextField txtCompressaoOleo;
    private JLabel labelViscosidade;
    private JTextField txtViscosidade;
    private JLabel labelLaminaDAgua;
    private JTextField txtLaminaDAgua;
    private JLabel labelQuantidadeDePoços;
    private JTextField txtQuantidadeDePoços;
    private JLabel labelPressaoInicial;
    private JTextField txtPressaoInicial;
    private JLabel labelDeltaT;
    private JTextField txtDeltaT;
    private JLabel labelTempoFinal;
    private JTextField txtTempoFinal;
    private JLabel labelFronteiraEsquerda;
    private JComboBox cbxFronteiraEsquerda;
    private JLabel labelFronteiraDireita;
    private JComboBox cbxFronteiraDireita;
    private JLabel labelDirecao;
    private JTextField txtNx;
    private JLabel labelNx;
    private JLabel labelNy;
    private JTextField txtNy;
    private JLabel labelNz;
    private JTextField txtNz;
    private JTextField txtDeltaZ;
    private JLabel labelDeltaZ;
    private JTextField txtDeltaY;
    private JLabel labelDeltaY;
    private JTextField txtDeltaX;
    private JLabel labelDeltaX;
    private JLabel labelDelta;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JPanel panelModeloBifasico;
    private JLabel labelKro_max;
    private JTextField txtKro_max;
    private JLabel labelKrw_max;
    private JTextField txtKrw_max;
    private JLabel labelSor;
    private JTextField txtRho_o;
    private JLabel labelSwi;
    private JLabel labelKro_max2;
    private JLabel labelKrw_max2;
    private JTextField txtMi_o;
    private JTextField txtEo;
    private JTextField txtMi_w;
    private JTextField txtSor;
    private JTextField txtSwi;
    private JTextField txtEw;
    private JTextField txtBo;
    private JTextField txtBw;
    private JLabel labelMi_o;
    private JLabel labelMi_w;
    private JLabel labelRho_o;
    private JLabel labelRho_o2;
    private JLabel labelRho_w;
    private JLabel labelMi_o2;
    private JLabel labelMi_w2;
    private JLabel labelEo;
    private JLabel labelEw;
    private JLabel labelBo;
    private JLabel labelBw;
    private JTextField txtRho_w;
    private JLabel labelRho_w2;
    private JPanel panelPoco;
    private JLabel labelNomePoco;
    private JTextField txtNomePoco;
    private JLabel labelTipoPoco;
    private JComboBox cbxTipoPoco;
    private JTextField txtPosicaoZ;
    private JLabel labelNz2;
    private JTextField txtPosicaoY;
    private JLabel labelNy2;
    private JTextField txtPosicaoX;
    private JLabel labelPosicaoX;
    private JLabel labelPosicaoPoco;
    private JLabel labelDirecaoPoco;
    private JComboBox cbxDirecaoPoco;
    private JLabel labelTipoControle;
    private JComboBox cbxTipoControle;
    private JLabel labelRaioPoco;
    private JTextField txtRaio;
    private JLabel label1;
    private JTextField txtValor;
    private JLabel labelValor;
    private JLabel label9;
    private JLabel labelSkinFact;
    private JTextField txtSkinFact;
    private JButton buttonSimular;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
