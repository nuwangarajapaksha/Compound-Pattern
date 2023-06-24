/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.decoratorPattern;

/**
 *
 * @author NUWAA
 */
public class SoftBun extends Submarine{
    
    public SoftBun(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return this.cost;
    }
    
}
