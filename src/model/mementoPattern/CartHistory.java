/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.mementoPattern;

import java.util.Stack;

/**
 *
 * @author NUWAA
 */
public class CartHistory {

    private Stack<Cart.CartMemento> undoHistory = new Stack<>();
    private Stack<Cart.CartMemento> redoHistory = new Stack<>();

    public void saveHistory(Cart cart) {
        undoHistory.push(cart.saveState());
    }

    public void undo(Cart cart) {
        if (!undoHistory.isEmpty()) {
            Cart.CartMemento poped = undoHistory.pop();
            cart.restoreState(poped);
            redoHistory.push(poped);
        } else {
            System.out.println("Nothing left to Undo");
        }
    }

    public void redo(Cart cart) {
        if (!redoHistory.isEmpty()) {
            Cart.CartMemento poped = redoHistory.pop();
            cart.restoreState(poped);
            undoHistory.push(poped);
        } else {
            System.out.println("Nothing left to Redo");
        }
    }
}
