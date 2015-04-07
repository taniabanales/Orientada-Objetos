/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal;

import java.io.*;
/**
 *
 * @author TANIA
 */
public class PersistenciaUsuario {
 
    public void guardar (Usuario u) throws Exception{
       //paso 1
        File file=new File ("D:\\archivaldo.yo");
        
        //Paso2
        FileOutputStream fos=new FileOutputStream(file);
        
        //Paso 3 llenarlo con algo ese algo en este caso es un Usuario
        
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(u);
        oos.close();
    }
    
    public Usuario leer() throws Exception{
        File file=new File ("D:\\archivaldo.yo");
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Usuario u=new Usuario();
        u=(Usuario)ois.readObject();
       return u;
       
        
    }
}

