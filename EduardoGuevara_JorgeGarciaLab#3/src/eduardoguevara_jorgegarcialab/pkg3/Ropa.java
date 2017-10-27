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
public class Ropa extends Productos {

    private String talla;
    private char sexo;

    public Ropa() {
        super();
    }

    public Ropa(String talla, char sexo) {
        this.talla = talla;
        this.sexo = sexo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Ropa{" + "talla=" + talla + ", sexo=" + sexo + '}';
    }

}
