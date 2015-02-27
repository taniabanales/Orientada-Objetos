/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.proyecto.geometria;

import java.util.*;

/**
 *
 * @author T-301
 */
public class GenerarSuperficies {
    public static  ArrayList<Superficies> obtenerfiguras()throws Exception{
     ArrayList<Superficies>figuritas=new ArrayList<Superficies>();
     
     //Primero creamos cuadrados
     cuadrado cu1=new cuadrado(12);
     cuadrado cu2=new cuadrado(14);
     cuadrado cu3=new cuadrado(13);
     //Crear dos rectangulos 
     //Crear dos traingulos
     Rectangulo rec1=new Rectangulo(5,2);
     
     Triangulo tri1=new Triangulo(8,3);
     Triangulo tri2=new Triangulo(2,5);
     
     Circulo ci1=new Circulo(16);
     Circulo ci2=new Circulo(9);

//Agregarlos al ArrayList
     figuritas.add(cu1);
     figuritas.add(cu2);
     figuritas.add(cu3);
     
     figuritas.add(rec1);
    
     figuritas.add(tri1);
     figuritas.add(tri2);
     
     figuritas.add(ci1);
     figuritas.add(ci2);
    
     return figuritas;
    }
    
}