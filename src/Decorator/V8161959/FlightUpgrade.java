/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator.V8161959;

/**
 *
 * @author v8161959
 */
public abstract class FlightUpgrade extends Flight{
    protected Flight f;

    public FlightUpgrade(Flight f) {
        this.f = f;
    }

    public double getCost() {
        return f.getCost() + this.total;
    }
    
}
