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
public class Gato extends Felino implements Mascota {
    
     @Override
     public void comiendo(){
        System.out.println("El perro esta comiendo");
    }

    @Override
    public void befriendly() {
          System.out.println("El gato es amigable");
    }

    @Override
    public void play() {
       System.out.println("El gato es jugueton");
    }
    
}
