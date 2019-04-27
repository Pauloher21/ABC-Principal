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
public class ABC_Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A objA = new A(10);
        B objB = new B(10);
        C objC = new C(10);
        System.out.println("ObjA.x=" + objA.getX());
        System.out.println("ObjB.x=" + objB.getX());
        System.out.println("ObjB.Y=" + objB.getY());
        System.out.println("ObjC.x=" + objC.getX());
        System.out.println("ObjC.y=" + objC.getY());
        System.out.println("ObjC.Z=" + objC.getZ());
    }

}
