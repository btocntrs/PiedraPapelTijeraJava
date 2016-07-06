/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btocntrs.piedrapapeltijera;

/**
 *
 * @author Rider
 */
public enum GESTO {
    
    PIEDRA {

        @Override
        public boolean ganaContra(GESTO gesto) {
            return gesto == TIJERA; //Piedra gana contra Tijera
        }
    }, PAPEL {

        @Override
        public boolean ganaContra(GESTO gesto) {
            return gesto == PIEDRA;//Papel gana contra Piedra
        }
    }, TIJERA {

        @Override
        public boolean ganaContra(GESTO gesto) {
            return gesto == PAPEL;//Tijera gana contre Papel
        }
    };
    
    //Metodo abstracto que implementan todos los enum
    public abstract boolean ganaContra(GESTO gesto);
    
}
