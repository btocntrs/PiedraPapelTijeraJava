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
                public RESULTADO contra(GESTO gesto) {
                    switch (gesto) {
                        case TIJERA:
                            return RESULTADO.GANA;
                        case PAPEL:
                            return RESULTADO.PIERDE;

                    }
                    return RESULTADO.EMPATA;
                }
            }, PAPEL {

                @Override
                public RESULTADO contra(GESTO gesto) {
                    switch (gesto) {
                        case PIEDRA:
                            return RESULTADO.GANA;
                        case TIJERA:
                            return RESULTADO.PIERDE;

                    }
                    return RESULTADO.EMPATA;
                }
            }, TIJERA {

                @Override
                public RESULTADO contra(GESTO gesto) {
                    switch (gesto) {
                        case PAPEL:
                            return RESULTADO.GANA;
                        case PIEDRA:
                            return RESULTADO.PIERDE;

                    }
                    return RESULTADO.EMPATA;
                }

            };

    //Metodo abstracto que implementan todos los enum
    public abstract RESULTADO contra(GESTO gesto);

    public enum RESULTADO {

        GANA, PIERDE, EMPATA;
    }

}
