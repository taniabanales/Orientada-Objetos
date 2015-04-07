/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal;

/**
 *
 * @author TANIA
 */
public class proyectoFinal {

   
    public static void main(String[] args) {
       //Creamos un usuario
    Usuario u=new Usuario();
    u.setEmail("tan.banales@outllok.com");
    u.setNombre("Tania");
    u.setSueldo(40000);
    //Lo guardamos
    PersistenciaUsuario pu=new PersistenciaUsuario();
    try{
        
        pu.guardar(u);
        System.out.println("Usuario guardado con exito");
    }catch (Exception e){
        System.out.println(e.getMessage());
    
    }
    
    }
    
}
