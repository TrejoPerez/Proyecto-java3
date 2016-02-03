package modell;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class DAOUsuario {

    SessionFactory fuck;
    Session sesion;
    Transaction tranza;

    public DAOUsuario() {
        fuck = HibernateUtilidades.getSessionFactory();
        sesion = fuck.openSession();
        tranza = sesion.beginTransaction();
    }

    public void cerrarTransaccion() {
        sesion.close();
        tranza.commit();
    }

    //Primer operacion CRUD
    public void guardar(Usuario objeto) throws Exception {
        //persist=guardar el objeto
        sesion.persist(objeto);
        cerrarTransaccion();
    }

    public void actualizar(Usuario objeto) throws Exception {
        sesion.update(objeto);
        cerrarTransaccion();
    }

    public void borrar(Usuario objeto) throws Exception {
        sesion.delete(objeto);
        cerrarTransaccion();
    }

    public Usuario buscarPorId(Integer id) throws Exception {
        Usuario objeto = (Usuario) sesion.createCriteria(Usuario.class).add(Restrictions.idEq(id)).uniqueResult();
        cerrarTransaccion();
        return objeto;
    }

    public ArrayList<Usuario> buscarTodos() throws Exception {
        ArrayList<Usuario> objetos = (ArrayList<Usuario>) sesion.createCriteria(Usuario.class).list();
        cerrarTransaccion();
        return objetos;
    }
}
