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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro n = new Perro();
        
        n.befriendly();
        n.comiendo();
        n.diambular();
        n.play();

        Gato g = new Gato();
                
        g.befriendly();
        g.comiendo();
        g.play();

    }

}
