package br.com.blackdrop.service;

import br.com.blackdrop.entity.DadosDeEntrada;
import br.com.blackdrop.entity.ModeloBifasico;
import br.com.blackdrop.entity.Poco;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ResourceBundle;

public class DadosService {

    private static final String NOME_ARQUIVO = "DadosDeEntrada.txt";
    ResourceBundle path = ResourceBundle.getBundle("path");

    private boolean validarMonoFasico(DadosDeEntrada dadosDeEntrada, Poco poco) {
        //Validar dados aqui
        return true;
    }

    private boolean validarBifasico(DadosDeEntrada dadosDeEntrada, ModeloBifasico modeloBifasico, Poco poco) {
        //Validar dados bifasicos aqui
        return true;
    }

    public void save(DadosDeEntrada dadosDeEntrada) throws Exception {
        boolean eValido;
        if (dadosDeEntrada.getModeloBifasico() == null) {
            eValido = validarMonoFasico(dadosDeEntrada, dadosDeEntrada.getPoco());
        } else {
            eValido = validarBifasico(dadosDeEntrada, dadosDeEntrada.getModeloBifasico(), dadosDeEntrada.getPoco());
        }
        if (eValido) {
            try {
                gerarArquivo(dadosDeEntrada);
            } catch (Exception e) {
                throw new Exception(e.getMessage());
            }
        }
    }

    private void gerarArquivo(DadosDeEntrada dadosDeEntrada) throws IOException {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(path.getString("diretorio") + NOME_ARQUIVO, "UTF-8");
            writer.println(dadosDeEntrada.getTipoDeFluxo() + "#");
            writer.println(dadosDeEntrada.getPorosidade() + "#");
            writer.println(dadosDeEntrada.getPermeabilidade() + "#");
            writer.println(dadosDeEntrada.getCompressibilidade() + "#");
            writer.println(dadosDeEntrada.getCompressWater() + "#");
            writer.println(dadosDeEntrada.getCompressOil() + "#");
            writer.println(dadosDeEntrada.getViscosidade() + "#");
            writer.println(dadosDeEntrada.getLaminaDagua() + "#");
            writer.println(dadosDeEntrada.getnX() + "#");

            if (dadosDeEntrada.getModeloBifasico() != null) {
                writer.println(dadosDeEntrada.getnY() + "#");
                writer.println(dadosDeEntrada.getnZ() + "#");
            }
            writer.println(dadosDeEntrada.getQuantidadeDePocos() + "#");
            writer.println(dadosDeEntrada.getDeltaX() + "#");

            if (dadosDeEntrada.getModeloBifasico() != null) {
                writer.println(dadosDeEntrada.getDeltaY() + "#");
                writer.println(dadosDeEntrada.getDeltaZ() + "#");
            }
            writer.println(dadosDeEntrada.getPressaoInicial() + "#");
            writer.println(dadosDeEntrada.getDeltaT() + "#");
            writer.println(dadosDeEntrada.getTempoFinal() + "#");
            writer.println(dadosDeEntrada.getFronteiraEsquerda() + "#");
            writer.println(dadosDeEntrada.getFronteiraDireita() + "#");

            if (dadosDeEntrada.getModeloBifasico() != null) {
                writer.println(dadosDeEntrada.getModeloBifasico().getKroMax() + "#");
                writer.println(dadosDeEntrada.getModeloBifasico().getKrwMax() + "#");
                writer.println(dadosDeEntrada.getModeloBifasico().getSor() + "#");
                writer.println(dadosDeEntrada.getModeloBifasico().getSwi() + "#");
                writer.println(dadosDeEntrada.getModeloBifasico().getEo() + "#");
                writer.println(dadosDeEntrada.getModeloBifasico().getEw() + "#");
                writer.println(dadosDeEntrada.getModeloBifasico().getRhoO() + "#");
                writer.println(dadosDeEntrada.getModeloBifasico().getRhoW() + "#");
                writer.println(dadosDeEntrada.getModeloBifasico().getMiO() + "#");
                writer.println(dadosDeEntrada.getModeloBifasico().getMiW() + "#");
                writer.println(dadosDeEntrada.getModeloBifasico().getBo() + "#");
                writer.println(dadosDeEntrada.getModeloBifasico().getBw() + "#");
            }
            writer.println(dadosDeEntrada.getPoco().getWellName() + "#");
            writer.println(dadosDeEntrada.getPoco().getWellType() + "#");
            writer.println(dadosDeEntrada.getPoco().getPosition() + "#");
            writer.println(dadosDeEntrada.getPoco().getDirection() + "#");
            writer.println(dadosDeEntrada.getPoco().getWellRadius() + "#");
            writer.println(dadosDeEntrada.getPoco().getSkinFact() + "#");
            writer.println(dadosDeEntrada.getPoco().getControlType() + "#");
            writer.println(dadosDeEntrada.getPoco().getValue());
        } catch (IOException io) {
            throw new IOException(io.getMessage());
        } finally {
            writer.close();
        }
    }
}
