package br.com.blackdrop.entity;

public class Poco {

    /*
    * wellName	Poco1	#
    wellType	0	# 0 para Produtor - 1 para Injetor
    Position	1 1 1	# "x" para 1D ou "x y z" para 3D
    Direction	K	# I, J ou K.
    WellRadius	0.15	# Raio do Poco em metros
    SkinFact	0	#
    ControlType	1	# 0 para Pressao - 1 para Vazao
    Value		1000	# kPa or m³
    * */

    private String wellName;

    private byte wellType;

    private String position;

    private char direction;

    private float wellRadius;

    private byte skinFact;

    private byte controlType;

    private int value;

    public Poco() {
    }

    public Poco(String wellName, byte wellType, String position, char direction, float wellRadius, byte skinFact,
                byte controlType, int value) {
        this.wellName = wellName;
        this.wellType = wellType;
        this.position = position;
        this.direction = direction;
        this.wellRadius = wellRadius;
        this.skinFact = skinFact;
        this.controlType = controlType;
        this.value = value;
    }

    public String getWellName() {
        return wellName;
    }

    public void setWellName(String wellName) {
        this.wellName = wellName;
    }

    public byte getWellType() {
        return wellType;
    }

    public void setWellType(byte wellType) {
        this.wellType = wellType;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public float getWellRadius() {
        return wellRadius;
    }

    public void setWellRadius(float wellRadius) {
        this.wellRadius = wellRadius;
    }

    public byte getSkinFact() {
        return skinFact;
    }

    public void setSkinFact(byte skinFact) {
        this.skinFact = skinFact;
    }

    public byte getControlType() {
        return controlType;
    }

    public void setControlType(byte controlType) {
        this.controlType = controlType;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
