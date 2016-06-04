/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignpatterns.creational.singleton;

/**
 * 
 * @author luchonetvv
 * @version 1.0
 */
public class SingletonSyncronized {
    
    private static SingletonSyncronized singletonSyncronized;
    
    private SingletonSyncronized() { }
    
    public static synchronized SingletonSyncronized getSingletonSyncronized() {
        if (singletonSyncronized == null) {
            singletonSyncronized = new SingletonSyncronized();
        }
        
        return singletonSyncronized;
    }
    
}