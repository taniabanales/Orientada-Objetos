/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.proyecto.geometria;

/**
 *
 * @author T-107
 */
public class Triangulo  {

    float base;
    float altura;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }


    public Triangulo() {
    }

    public Triangulo(float base) {
        this.base = base;
         this.altura = altura;
    }
    
    public float calularArea(){
        return (base*altura)/2f;
        
        
        
    }
    
}
