/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import modelo.Cliente;
import modelo.ClienteDAO;
import modelo.Proveedor;
import modelo.ProveedorDAO;
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
public class ProveedorTest {
    
    public ProveedorTest() {
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
    public void insertarProveedor(){
        Proveedor proveedor = new Proveedor("123","AQP","hanter","88888","aqp@gmail.com","982636","ven001","7777");
	ProveedorDAO proveedorDAO = new ProveedorDAO();
        Assert.assertTrue(proveedorDAO.insertarProveedor(proveedorDAO));
    }
     public void modificarProveedor(){
        Proveedor proveedor = new Proveedor("123","AQP","hanter","88888","aqp@gmail.com","982636","ven001","7777");
	ProveedorDAO proveedorDAO = new ProveedorDAO();
        Assert.assertTrue(proveedorDAO.modificarProveedor(proveedor,"campo","informacion"));
    }
    public void eliminarProveedor(){
        Proveedor proveedor = new Proveedor("123","AQP","hanter","88888","aqp@gmail.com","982636","ven001","7777");
	ProveedorDAO proveedorDAO = new ProveedorDAO();
        Assert.assertTrue(proveedorDAO.eliminarProveedor(proveedor));
    }
    public void listarProveedores(){
        ArrayList<Proveedor> proveedores=new ArrayList<Proveedor>();
        Assert.assertNotNull(proveedores);
    }
}
