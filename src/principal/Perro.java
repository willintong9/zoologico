/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author lds
 */
public class Perro extends Canino implements Mascota {

    @Override
    public void comiendo() {
        System.out.println("El perro esta comiendo");

    }

    @Override

    public void diambular() {

        System.out.println("El perro esta diambulando");
    }

    @Override
    public void befriendly() {
        System.out.println("El perro es amigable");
    }

    @Override
    public void play() {
       System.out.println("El perro es jugueton");
    }
    

}
