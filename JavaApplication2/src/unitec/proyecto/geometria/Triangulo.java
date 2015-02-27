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
public class Triangulo implements Superficies {

    float base;
    float altura;

    
    public Triangulo() {
    }
    
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }



    public Triangulo(float base) {
        this.base = base;
         this.altura = altura;
    }
    
    public float calcularArea(){
        System.out.print("El area del triangulo es:");
        return (base*altura)/2f;  
        
    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
}
