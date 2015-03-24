/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paca.barrio;

/**
 *
 * @author T-107
 */
import java.util.*;
public class ModeloGalerias {
    
    public static ArrayList<Galerias> generarGalerias(){
        ArrayList<Galerias> arreglo=new ArrayList<Galerias>();
        Galerias g1=new Galerias("peces", "tortuga con pez", "/paca/barrio/uno.jpg");
        Galerias g2=new Galerias("Titulo 2", "Mi descripcion 2", "/paca/barrio/dos.jpg");
        Galerias g3=new Galerias("Titulo 3", "Mi descripcion 3", "/paca//barrio/tres.jpg");
        
        arreglo.add(g1);
        arreglo.add(g2);
        arreglo.add(g3);
        return arreglo;
        
    }
    
}
