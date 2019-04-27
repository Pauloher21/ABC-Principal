/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc_principal;

/**
 *
 * @author PH21
 */
public class B extends A {

    private final int y;

    public B(int y) {
        super(y + 5);
        this.y = y;
        System.out.println("y=" + y);
    }

    public int getY() {
        return y;
    }

}
