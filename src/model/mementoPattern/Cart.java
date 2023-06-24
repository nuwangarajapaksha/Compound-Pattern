/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.mementoPattern;

import java.util.Vector;

/**
 *
 * @author NUWAA
 */
public class Cart {

    private Vector<Vector> cartData;

    public Vector getModel() {
        return cartData;
    }

    public void setCart(Vector model) {
        this.cartData = model;
    }

    public CartMemento saveState() {
        return new CartMemento(cartData);
    }

    public void restoreState(CartMemento memento) {
        cartData = memento.getCart();
    }

    public static class CartMemento {

        private final Vector model;

        public CartMemento(Vector model) {
            this.model = model;
        }

        public Vector getCart() {
            return model;
        }

    }

}
