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
public abstract class ToppingDecorator extends Submarine{

    @Override
    public abstract String getDescription();

    
    @Override
    public abstract double getCost();

}
