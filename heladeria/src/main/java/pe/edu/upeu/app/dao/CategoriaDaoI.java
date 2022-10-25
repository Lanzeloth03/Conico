/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.app.dao;

import java.util.List;
import pe.edu.upeu.app.modelo.CategoriaTO;

/**
 *
<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/dao/CategoriaDaoI.java
 * @author HP
========
 * @author LABORATORIO_2
>>>>>>>> 063a35d6d06b7e1b990ea7bad0e3ba5959b6597a:heladeria/src/main/java/pe/edu/upeu/app/dao/ClienteDaoI.java
 */
public interface CategoriaDaoI {

    public int create(CategoriaTO d);

    public int update(CategoriaTO d);

    public int delete(String id) throws Exception;

    public List<CategoriaTO> listCmb(String filter);

<<<<<<<< HEAD:heladeria/src/main/java/pe/edu/upeu/app/dao/CategoriaDaoI.java
    public List<CategoriaTO> listarClientes();
========
    public List listarClientes();
>>>>>>>> 063a35d6d06b7e1b990ea7bad0e3ba5959b6597a:heladeria/src/main/java/pe/edu/upeu/app/dao/ClienteDaoI.java

    public CategoriaTO buscarClientes(String nombre);

    public void reportarCliente();

}
