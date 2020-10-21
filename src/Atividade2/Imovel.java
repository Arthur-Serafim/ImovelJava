/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade2;

/**
 *
 * @author 123
 */
public class Imovel {
    private String nome;
    private float imposto;
    private int mesesAtraso;

    public Imovel(String nome, float imposto, int mesesAtraso){
        this.imposto = imposto;
        this.mesesAtraso = mesesAtraso;
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getImposto() {
        return imposto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }

    public int getMesesAtraso() {
        return mesesAtraso;
    }

    public void setMesesAtraso(int mesesAtraso) {
        this.mesesAtraso = mesesAtraso;
    }
    
}
