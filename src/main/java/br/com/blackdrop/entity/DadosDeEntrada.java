package br.com.blackdrop.entity;

public class DadosDeEntrada {

    /*
    * TipoDeFluxo		2.0		# 1 para Monofásico (1D) - 2 para Bifásico (3D)
    Porosidade		0.25
    Permeabilidade 		500.0		# Permeabilidade da Rocha em mD
    Compressibilidade	1.0E-5		# kPa^-1 Rocha [cr] - Monofásico
    CompressWater		0.0		# kPa^-1 Água [cw] - Bifásico
    CompressOil		0.0		# kPa^-1 Óleo [co] - Bifásico
    Viscosidade		1.0		# cP para caso 1D
    LaminaDagua		1400.0		# m
    Nx			5.0		# Número de Blocos na direção x
    Ny			3.0		# Número de Blocos na direção y
    Nz			5.0		# Número de Blocos na direção z
    QuantidadeDePocos	1.0
    DeltaX			100.0		# m
    DeltaY			100.0		# m
    DeltaZ			100.0		# m
    PressaoInicial 		10000.0		# kPa
    DeltaT			0.1		# Tamanho do Passo de Tempo em Dias
    TempoFinal		5.0		# Tempo máximo de Simulação em Dias
    FronteiraEsquerda	0.0		# 0 para controle de Pressao - 1 para Vazão (1D)
    FronteiraDireita	0.0		# 0 para controle de Pressao - 1 para Vazão (1D)
    * */

    private byte tipoDeFluxo;

    private float porosidade;

    private float permeabilidade;

    private String compressibilidade;

    private float compressWater;

    private float compressOil;

    private float viscosidade;

    private float laminaDagua;

    private float nX;

    private float nY;

    private float nZ;

    private int quantidadeDePocos;

    private float deltaX;

    private float deltaY;

    private float deltaZ;

    private float pressaoInicial;

    private float deltaT;

    private float tempoFinal;

    private byte fronteiraEsquerda;

    private byte fronteiraDireita;

    private ModeloBifasico modeloBifasico;

    private Poco poco;

    public DadosDeEntrada() {
    }

    public DadosDeEntrada(byte tipoDeFluxo, float porosidade, float permeabilidade, String compressibilidade,
                          float compressWater, float compressOil, float viscosidade, float laminaDagua,
                          float nX, float nY, float nZ, int quantidadeDePocos, float deltaX, float deltaY,
                          float deltaZ, float pressaoInicial, float deltaT, float tempoFinal, byte fronteiraEsquerda,
                          byte fronteiraDireita, ModeloBifasico modeloBifasico, Poco poco) {
        this.tipoDeFluxo = tipoDeFluxo;
        this.porosidade = porosidade;
        this.permeabilidade = permeabilidade;
        this.compressibilidade = compressibilidade;
        this.compressWater = compressWater;
        this.compressOil = compressOil;
        this.viscosidade = viscosidade;
        this.laminaDagua = laminaDagua;
        this.nX = nX;
        this.nY = nY;
        this.nZ = nZ;
        this.quantidadeDePocos = quantidadeDePocos;
        this.deltaX = deltaX;
        this.deltaY = deltaY;
        this.deltaZ = deltaZ;
        this.pressaoInicial = pressaoInicial;
        this.deltaT = deltaT;
        this.tempoFinal = tempoFinal;
        this.fronteiraEsquerda = fronteiraEsquerda;
        this.fronteiraDireita = fronteiraDireita;
        this.modeloBifasico = modeloBifasico;
        this.poco = poco;
    }

    public byte getTipoDeFluxo() {
        return tipoDeFluxo;
    }

    public void setTipoDeFluxo(byte tipoDeFluxo) {
        this.tipoDeFluxo = tipoDeFluxo;
    }

    public float getPorosidade() {
        return porosidade;
    }

    public void setPorosidade(float porosidade) {
        this.porosidade = porosidade;
    }

    public float getPermeabilidade() {
        return permeabilidade;
    }

    public void setPermeabilidade(float permeabilidade) {
        this.permeabilidade = permeabilidade;
    }

    public String getCompressibilidade() {
        return compressibilidade;
    }

    public void setCompressibilidade(String compressibilidade) {
        this.compressibilidade = compressibilidade;
    }

    public float getCompressWater() {
        return compressWater;
    }

    public void setCompressWater(float compressWater) {
        this.compressWater = compressWater;
    }

    public float getCompressOil() {
        return compressOil;
    }

    public void setCompressOil(float compressOil) {
        this.compressOil = compressOil;
    }

    public float getViscosidade() {
        return viscosidade;
    }

    public void setViscosidade(float viscosidade) {
        this.viscosidade = viscosidade;
    }

    public float getLaminaDagua() {
        return laminaDagua;
    }

    public void setLaminaDagua(float laminaDagua) {
        this.laminaDagua = laminaDagua;
    }

    public float getnX() {
        return nX;
    }

    public void setnX(float nX) {
        this.nX = nX;
    }

    public float getnY() {
        return nY;
    }

    public void setnY(float nY) {
        this.nY = nY;
    }

    public float getnZ() {
        return nZ;
    }

    public void setnZ(float nZ) {
        this.nZ = nZ;
    }

    public int getQuantidadeDePocos() {
        return quantidadeDePocos;
    }

    public void setQuantidadeDePocos(int quantidadeDePocos) {
        this.quantidadeDePocos = quantidadeDePocos;
    }

    public float getDeltaX() {
        return deltaX;
    }

    public void setDeltaX(float deltaX) {
        this.deltaX = deltaX;
    }

    public float getDeltaY() {
        return deltaY;
    }

    public void setDeltaY(float deltaY) {
        this.deltaY = deltaY;
    }

    public float getDeltaZ() {
        return deltaZ;
    }

    public void setDeltaZ(float deltaZ) {
        this.deltaZ = deltaZ;
    }

    public float getPressaoInicial() {
        return pressaoInicial;
    }

    public void setPressaoInicial(float pressaoInicial) {
        this.pressaoInicial = pressaoInicial;
    }

    public float getDeltaT() {
        return deltaT;
    }

    public void setDeltaT(float deltaT) {
        this.deltaT = deltaT;
    }

    public float getTempoFinal() {
        return tempoFinal;
    }

    public void setTempoFinal(float tempoFinal) {
        this.tempoFinal = tempoFinal;
    }

    public byte getFronteiraEsquerda() {
        return fronteiraEsquerda;
    }

    public void setFronteiraEsquerda(byte fronteiraEsquerda) {
        this.fronteiraEsquerda = fronteiraEsquerda;
    }

    public byte getFronteiraDireita() {
        return fronteiraDireita;
    }

    public void setFronteiraDireita(byte fronteiraDireita) {
        this.fronteiraDireita = fronteiraDireita;
    }

    public ModeloBifasico getModeloBifasico() {
        return modeloBifasico;
    }

    public void setModeloBifasico(ModeloBifasico modeloBifasico) {
        this.modeloBifasico = modeloBifasico;
    }

    public Poco getPoco() {
        return poco;
    }

    public void setPoco(Poco poco) {
        this.poco = poco;
    }

    @Override
    public String toString() {
        return "DadosDeEntrada{" +
                "tipoDeFluxo=" + tipoDeFluxo +
                ", porosidade=" + porosidade +
                ", permeabilidade=" + permeabilidade +
                ", compressibilidade='" + compressibilidade + '\'' +
                ", compressWater=" + compressWater +
                ", compressOil=" + compressOil +
                ", viscosidade=" + viscosidade +
                ", laminaDagua=" + laminaDagua +
                ", nX=" + nX +
                ", nY=" + nY +
                ", nZ=" + nZ +
                ", quantidadeDePocos=" + quantidadeDePocos +
                ", deltaX=" + deltaX +
                ", deltaY=" + deltaY +
                ", deltaZ=" + deltaZ +
                ", pressaoInicial=" + pressaoInicial +
                ", deltaT=" + deltaT +
                ", tempoFinal=" + tempoFinal +
                ", fronteiraEsquerda=" + fronteiraEsquerda +
                ", fronteiraDireita=" + fronteiraDireita +
                ", modeloBifasico=" + modeloBifasico +
                ", poco=" + poco +
                '}';
    }
}
