/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduardoguevara_jorgegarcialab.pkg3;

/**
 *
 * @author edujg
 */
public class Juguetes extends Productos {

    private String type;

    public Juguetes() {
        super();
    }

    public Juguetes(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Juguetes{" + "type=" + type + '}';
    }

}
