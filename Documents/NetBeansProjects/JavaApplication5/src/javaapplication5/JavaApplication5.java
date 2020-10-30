/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import entidades.*;
import java.util.Scanner;

/**
 *
 * @author lbbprof01
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int i = 111;
        int j;
        double d;
        char k ;
        System.out.println(53663565);
        
        
        String noombre = "nooombre";
        Cliente c1  = new Cliente();
        c1.setId(i);
        c1.setNombre(noombre);
        System.out.println(c1.toString());
        
        Scanner in = new Scanner(System.in);
        System.out.println("Dame la edad del cliente:");
        int edad = in.nextInt();
        System.out.println(edad);

        Cliente c2 = new Cliente(c1);
        Cliente c3 = new Cliente("Rim", "347217882", 22);
        Cliente c4 = new Cliente();
        
        String s = "Mi mensaje";
        String s2;
        System.out.println(s);
        String mistring; 
        System.out.println(i);
        
        
        System.out.println(c1);
        
        /* System.out.println(c1.getDireccion());
        System.out.println(c1.isMayoredad()); */
        

        //   Cliente c2 = new Cliente(c);
        // System.out.println(c2.getEdad());
        //    Cliente c3 = new Cliente("Luis de Blas", "72140289KL");
    }

}
