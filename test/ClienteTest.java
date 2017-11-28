/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import modelo.Cliente;
import modelo.ClienteDAO;
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
public class ClienteTest {
    
    public ClienteTest() {
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
        Cliente usuario = new Cliente("123","Alba","Liliana","766543234","direccion","982636","alab@gmail.com");
	ClienteDAO clienteDAO = new ClienteDAO();
        Assert.assertTrue(clienteDAO.insertCliente(clienteDAO));
    }
     public void modificarCliente(){
        Cliente usuario = new Cliente("123","Alba","Liliana","766543234","direccion","982636","alab@gmail.com");
	ClienteDAO clienteDAO = new ClienteDAO();
        Assert.assertTrue(clienteDAO.modificarCliente(usuario,"campo","informacion"));
    }
    public void eliminarCliente(){
        Cliente usuario = new Cliente("123","Alba","Liliana","766543234","direccion","982636","alab@gmail.com");
	ClienteDAO clienteDAO = new ClienteDAO();
        Assert.assertTrue(clienteDAO.eliminarCliente(usuario));
    }
    public void listar(){
        ArrayList<Cliente> clientes=new ArrayList<Cliente>();
        Assert.assertNotNull(clientes);
    }
}
