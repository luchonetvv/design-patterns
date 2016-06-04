/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignpatterns.creational.factorymethod;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luchonetvv
 * @version 1.0
 */
public class XMLTraceFactoryInterface extends AbstractFactoryMethodInterface {

    public XMLTraceFactoryInterface(String message) {
        super(message);
    }

    @Override
    public void trace(FactoryInterface factoryInterface) {
        Logger.getLogger(JDBCTraceFactory.class.getSimpleName()).log(Level.INFO,
                "Acceso a base de datos via XML utilizando Interface.");
    }
    
}