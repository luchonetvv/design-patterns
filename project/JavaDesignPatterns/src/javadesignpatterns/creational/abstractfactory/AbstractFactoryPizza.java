/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignpatterns.creational.abstractfactory;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luchonetvv
 * @version 1.0
 */
public abstract class AbstractFactoryPizza {
    
    public void empacar() {
        Logger.getLogger(AbstractFactoryPizza.class.getSimpleName()).log(Level.INFO,
                "Empacando Pizza.");
    }
    
    public abstract void preparar();
    
}
