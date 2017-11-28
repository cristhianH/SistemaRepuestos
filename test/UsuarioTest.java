/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.ParseException;
import java.util.ArrayList;
import modelo.Usuario;
import modelo.UsuarioDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rodrigo
 */
public class UsuarioTest {
    
    public UsuarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    public void insertar(){
        Usuario usuario = new Usuario("Arturh","12345","A");
	UsuarioDAO usuarioDAO = new UsuarioDAO();
        Assert.assertTrue(usuarioDAO.insertUsuario(usuario));
    }
    public void modificarContraseña(){
        Usuario usuario = new Usuario("Arturh","12345","A");
	UsuarioDAO usuarioDAO = new UsuarioDAO();
        Assert.assertTrue(usuarioDAO.modificarContraseña(usuario,"contraAntigua","contraNueva"));
    }
     public void modificarUsuario(){
        Usuario usuario = new Usuario("Arturh","12345","A");
	UsuarioDAO usuarioDAO = new UsuarioDAO();
        Assert.assertTrue(usuarioDAO.modificarContraseña(usuario,"campo","informacion"));
    }
    public void eliminar(){
        Usuario usuario = new Usuario("Arturh","12345","A");
	UsuarioDAO usuarioDAO = new UsuarioDAO();
        Assert.assertTrue(usuarioDAO.eliminarUsuario(usuario));
    }
    public void listar(){
        ArrayList<Usuario> users=new ArrayList<Usuario>();
        Assert.assertNotNull(users);
    }
}
