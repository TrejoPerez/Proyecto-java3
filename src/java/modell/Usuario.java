/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;


import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author T-101
 * TODO ESTE CODIGO ES JAVAX PERSISTANCE
 * Entity esta mapeando a la tabla usuario
 */
@Entity
@Table(name = "USUARIO")
public class Usuario {
    //Este seria el principio de la entidad
    @Id
    @GeneratedValue
    @Column(name="ID_USUARIO")
    private Integer id;
    
    @Column(name="LOGIN")
    private String login;
    @Column(name="PASSWORD")
    private String password;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.login);
        hash = 17 * hash + Objects.hashCode(this.password);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", login=" + login + ", password=" + password + '}';
    }
    
    //Este sirve para poder borrar, buscar y actualizar por id
    public Usuario(Integer id) {
        this.id = id;
    }
    //Este sirve apra guardar algo
    public Usuario(String login, String password) {
        this.login = login;
        this.password = password;
    }
    //Sirve para hacer una busqueda por todos
    public Usuario() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
