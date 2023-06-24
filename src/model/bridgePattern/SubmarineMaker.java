/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bridgePattern;

import model.decoratorPattern.Submarine;

/**
 *
 * @author NUWAA
 */
public abstract class SubmarineMaker {
    
    protected Submarine submarine;

    public SubmarineMaker(Submarine submarine) {
        this.submarine = submarine;
    }
    
    public abstract Submarine prepare();
    
}
