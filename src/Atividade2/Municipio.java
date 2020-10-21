/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 123
 */
public class Municipio {
    private Map<String, Imovel> imoveis = new HashMap<>();

    public void addImovel(Imovel imovel){
        this.imoveis.put(imovel.getNome(), imovel);
    }
   public Imovel getImovel(String nome){
       return this.imoveis.get(nome);
   }
    
   public double imposto(Imovel imposto){
        float atraso = imposto.getMesesAtraso();
       
        if(atraso <= 5){ 
            return 1;
        } else if(atraso <= 8){
            return 2.3;
        } else if (atraso <= 10){
            return 3;
        } else if (atraso <= 12){
            return 5.4;
        } else {
            return 10;
        }
    }
}
