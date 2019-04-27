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
public class C extends B {

    private final int z;

    public C(int z) {
        super(z + 5);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

}
