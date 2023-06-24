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
public class Cheese extends ToppingDecorator{
    
    Submarine submarine;
    
    public Cheese(Submarine submarine, double cost) {
        this.submarine = submarine;
        this.cost = cost;         
    }

    @Override
    public String getDescription() {
        return submarine.getDescription()+" / Cheese";
    }

    @Override
    public double getCost() {
        return submarine.getCost()+this.cost;
    }

    
    
}
