/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.github.angel.stream;

/**
 *
 * @author aguero
 */
@FunctionalInterface
public interface Consumidor<T> {
    void consumidor(T t);
    
    @Override
    boolean equals(Object obj);

    

}
