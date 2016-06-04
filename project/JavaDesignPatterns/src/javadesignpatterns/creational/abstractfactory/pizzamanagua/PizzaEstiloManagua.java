/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignpatterns.creational.abstractfactory.pizzamanagua;

import java.util.logging.Level;
import java.util.logging.Logger;
import javadesignpatterns.creational.abstractfactory.AbstractFactoryPizza;

/**
 *
 * @author luchonetvv
 * @version 1.0
 */
public class PizzaEstiloManagua extends AbstractFactoryPizza {

    @Override
    public void preparar() {
        Logger.getLogger(PizzaEstiloManagua.class.getSimpleName()).log(Level.INFO,
                "Pizza prepara el artesano Estilo MANAGUA.");
    }
    
}