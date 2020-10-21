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
public class Principal {
    public static void main(String[] args) {
        Imovel imovel1 = new Imovel("Jardim Marilândia", 3,5);
        Municipio  vilaVelha = new Municipio();
        vilaVelha.addImovel(imovel1);
        System.out.println(vilaVelha.getImovel("Jardim Marilândia").getNome());
        System.out.println(vilaVelha.imposto(imovel1));
    }
}
