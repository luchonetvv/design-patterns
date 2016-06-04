/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignpatterns.creational.abstractfactory;

import javadesignpatterns.creational.abstractfactory.pizzamanagua.PizzaEstiloManagua;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author luchonetvv
 * @version 1.0
 */
public class PizzaEstiloManaguaTest {
    
    public PizzaEstiloManaguaTest() {
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

    /**
     * Test of preparar method, of class PizzaEstiloManagua.
     */
    @Test
    public void testPreparar() {
        System.out.println("preparar");
        PizzaEstiloManagua instance = new PizzaEstiloManagua();
        instance.preparar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
