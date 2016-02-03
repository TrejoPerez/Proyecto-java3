/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author T-101
 */
public class probarEntidades {
    public static void main(String[] args) {
        try {
            /*
            //Paso 1->Generar el session factory, todo esto es un candado y se tiene nque liberar
            //el candado para poder hacer acciones SQL
            SessionFactory fuck =HibernateUtilidades.getSessionFactory();
            Session sesion = fuck.openSession();
            Transaction tranza = sesion.beginTransaction();
            //Ahora si veran lo que nunca en su vida han visto
            Usuario usuario = new Usuario("Campos", "yomero");
            //Guardar usuario
            //Save=Ayuda a insertar al usuario con el constructor de java
            sesion.save(usuario);
            tranza.commit();
            sesion.close();
            */    
            //Cuando se ejecuta este constructor, se realiza la transaccion
            DAOUsuario dao = new DAOUsuario();
            
            
            
            /*Usuario u = new Usuario("juan","Campos");
            dao.guardar(u);*/
            
            
            
            
            System.out.println("Transaccion exitosa: "+ dao.buscarPorId(1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
   
    }
}
