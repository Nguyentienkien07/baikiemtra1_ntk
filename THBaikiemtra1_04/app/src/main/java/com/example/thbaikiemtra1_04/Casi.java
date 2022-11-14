package com.example.thbaikiemtra1_04;

public class Casi {
    private int resourceId;
    private String name, nghedanh, quocgia, sao;

    public Casi(int resourceId, String name, String nghedanh, String quocgia, String sao) {
        this.resourceId = resourceId;
        this.name = name;
        this.nghedanh = nghedanh;
        this.quocgia = quocgia;
        this.sao = sao;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNghedanh() {
        return nghedanh;
    }

    public void setNghedanh(String nghedanh) {
        this.nghedanh = nghedanh;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public String getSao() {
        return sao;
    }

    public void setSao(String sao) {
        this.sao = sao;
    }
}
