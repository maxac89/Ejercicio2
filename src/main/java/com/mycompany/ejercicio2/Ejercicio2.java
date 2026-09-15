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
        int ptasNum = sc.nextInt();
        
        System.out.println(ptasNum + " pesetas son " + ptasNum / 166.386 + " euros.");
    }
}
