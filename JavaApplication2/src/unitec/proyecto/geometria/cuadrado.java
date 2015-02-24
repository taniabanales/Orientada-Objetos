/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.proyecto.geometria;


public class cuadrado {
     private float lado;
    
    public cuadrado(){
        
    }

    public cuadrado(float lado) {
        this.lado = lado;
    }
   
    
    public float calcularArea(){
        float area=lado*lado;
        return area;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
     
        
        this.lado = lado;
    }
    
}
