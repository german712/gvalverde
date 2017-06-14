/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorais;

/**
 *
 * @author walte
 */
public class Suma implements Calculadora{
 
    double suma;
    @Override
    public double calcula(double x, double y) {
       return this.suma = x+y;
        
    }
    
}
