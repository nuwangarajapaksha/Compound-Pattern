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
public class MexicanSubmarineMaker extends SubmarineMaker{

    public MexicanSubmarineMaker(Submarine submarine) {
        super(submarine);
    }

    @Override
    public Submarine prepare() {
        this.submarine.setSubmarine("Mexican Submarine");
        this.submarine.addSubmarineCost(200.0);
        return this.submarine;
    }
    
}
