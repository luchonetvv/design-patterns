/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignpatterns.creational.singleton;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author luchonetvv
 * @version 1.0
 */
public class Singleton {
    
    private static Singleton singleton;
    
    protected Singleton() { }
    
    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
            Logger.getLogger(Singleton.class.getSimpleName()).log(Level.INFO,
                    "Se ha iniciado una instancia de Singleton.");
        } else {
            Logger.getLogger(Singleton.class.getSimpleName()).log(Level.INFO,
                        "Se ha devuelto una instancia existente de Singleton.");
        }
        return singleton;
    }
    
}