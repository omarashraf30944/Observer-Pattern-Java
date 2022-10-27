/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pc.observer;

/**
 *
 * @author omar
 */
public interface iSubject {
    public void registerObserver(iObserver o);
    public void removeObserver(iObserver o);
    public void notifyObserver();
}
