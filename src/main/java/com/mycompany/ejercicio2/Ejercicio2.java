/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author UsuarioM
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Ingrese el número de pesetas a convertir a euros");
        float pesetas = sc.nextFloat();
        
        float euros = pesetas / 166.386f;
        
        System.out.println(pesetas + " pesetas son " + euros + " euros.");
    }
}
