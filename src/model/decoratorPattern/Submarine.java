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
public abstract class Submarine {

    String submarine;
    String description;
    double cost;

    public void setSubmarine(String submarine) {
        this.submarine = submarine;
    }

    public String getDescription() {
        return submarine + " " + description;
    }

    public abstract double getCost();

    public void addSubmarineCost(double submarineCost) {
        this.cost = this.cost + submarineCost;
    }

}
