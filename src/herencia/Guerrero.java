/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Greta
 */
public class Guerrero extends Humano{

   public int CantidadDeEspadas;
    
    public void estocadadefuego(){
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
      Guerrero jugador1 = new Guerrero();
      
      jugador1.nombre = "Greta";
      jugador1.equipo = 3;
      jugador1.magia = "fuego";
      jugador1.vida = 100;
      
      jugador1.Atacar();
      jugador1.Curacion();
      
    }
    
}
