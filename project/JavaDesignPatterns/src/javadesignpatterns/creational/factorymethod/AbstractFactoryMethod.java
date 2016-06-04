/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignpatterns.creational.factorymethod;

/**
 *
 * @author luchonetvv
 * @version 1.0
 */
public abstract class AbstractFactoryMethod {
    
    private String message;

    public AbstractFactoryMethod(String message) {
        this.message = message;
    }
    
    public abstract void trace();
    
}