package br.com.blackdrop.entity;

public class ModeloBifasico {

    /*
    * Kro_max                 1.0                # Permeabilidade máxima do óleo em mD
    Krw_max                 0.6                # Permeabilidade máxima da água em mD
    Sor                     0.3                # Saturação Residual do óleo
    Swi                     0.3               # Saturação Inicial da água
    Eo                      2.0                # Expoente
    Ew                      2.0                # Expoente
    Rho_o			940.0		   # kg/m³
    Rho_w			1000.0		   # kg/m³
    Mi_o                    5.0               # Viscosidade óleo em cP
    Mi_w                    1.0                # Viscosidade água em cP
    Bo			1.0		   # Fator volume-formação do óleo
    Bw			1.2		   # Fator volume-formação da água
    * */

    private float kroMax;

    private float krwMax;

    private float sor;

    private float swi;

    private float eo;

    private float ew;

    private float rhoO;

    private float rhoW;

    private float miO;

    private float miW;

    private float bo;

    private float bw;

    public ModeloBifasico() {
    }

    public ModeloBifasico(float kroMax, float krwMax, float sor, float swi, float eo, float ew, float rhoO, float rhoW,
                          float miO, float miW, float bo, float bw) {
        this.kroMax = kroMax;
        this.krwMax = krwMax;
        this.sor = sor;
        this.swi = swi;
        this.eo = eo;
        this.ew = ew;
        this.rhoO = rhoO;
        this.rhoW = rhoW;
        this.miO = miO;
        this.miW = miW;
        this.bo = bo;
        this.bw = bw;
    }

    public float getKroMax() {
        return kroMax;
    }

    public void setKroMax(float kroMax) {
        this.kroMax = kroMax;
    }

    public float getKrwMax() {
        return krwMax;
    }

    public void setKrwMax(float krwMax) {
        this.krwMax = krwMax;
    }

    public float getSor() {
        return sor;
    }

    public void setSor(float sor) {
        this.sor = sor;
    }

    public float getSwi() {
        return swi;
    }

    public void setSwi(float swi) {
        this.swi = swi;
    }

    public float getEo() {
        return eo;
    }

    public void setEo(float eo) {
        this.eo = eo;
    }

    public float getEw() {
        return ew;
    }

    public void setEw(float ew) {
        this.ew = ew;
    }

    public float getRhoO() {
        return rhoO;
    }

    public void setRhoO(float rhoO) {
        this.rhoO = rhoO;
    }

    public float getRhoW() {
        return rhoW;
    }

    public void setRhoW(float rhoW) {
        this.rhoW = rhoW;
    }

    public float getMiO() {
        return miO;
    }

    public void setMiO(float miO) {
        this.miO = miO;
    }

    public float getMiW() {
        return miW;
    }

    public void setMiW(float miW) {
        this.miW = miW;
    }

    public float getBo() {
        return bo;
    }

    public void setBo(float bo) {
        this.bo = bo;
    }

    public float getBw() {
        return bw;
    }

    public void setBw(float bw) {
        this.bw = bw;
    }
}
