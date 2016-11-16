/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.cl.madreSeguros.persistencia;

import javax.ejb.ApplicationException;

/**
 *
 * @author Nicolas
 */

@ApplicationException(rollback = true)
class ExcepcionesVarias extends Exception {

    public ExcepcionesVarias(String mensaje) {
        super(mensaje);
    }
    
}
