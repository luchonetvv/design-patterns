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
public class SingletonSyncronizedFragment {
    
    private volatile static SingletonSyncronizedFragment singletonSyncronizedFragment;
    
    private SingletonSyncronizedFragment() { }
    
    public static SingletonSyncronizedFragment getSingletonSyncronizedFragment() {
        if (singletonSyncronizedFragment == null) {
            synchronized(SingletonSyncronizedFragment.class) {
                if (singletonSyncronizedFragment == null) {
                    singletonSyncronizedFragment = new SingletonSyncronizedFragment();
                }
            }
        }
        
        return singletonSyncronizedFragment;
    }
    
}