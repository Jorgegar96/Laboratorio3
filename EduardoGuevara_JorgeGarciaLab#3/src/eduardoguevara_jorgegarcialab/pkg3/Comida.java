/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduardoguevara_jorgegarcialab.pkg3;

import java.util.Date;

/**
 *
 * @author edujg
 */
public class Comida extends Productos {

    //o Comida, tienen una fecha de caducidad.
    private Date vence;

    public Comida() {
        super();
    }

    public Comida(Date vence) {
        this.vence = vence;
    }

    public Date getVence() {
        return vence;
    }

    public void setVence(Date vence) {
        this.vence = vence;
    }

    @Override
    public String toString() {
        return "Comida{" + "vence=" + vence + '}';
    }

}
