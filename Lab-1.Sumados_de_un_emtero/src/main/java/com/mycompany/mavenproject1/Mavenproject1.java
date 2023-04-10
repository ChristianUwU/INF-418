/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.LinkedList;

/**
 *
 * @author Christian
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        LinkedList<Integer> L2 = new LinkedList();
        //sumados(L2, 10, 1);
        //sumadosIguales(L2, 10, 1);
        sumadosDiferentes(L2, 10, 1);
    }

    /////////////////////////EJERCICIO 1///////////////////////////
    public static void sumados(LinkedList<Integer> l1, int n, int i){
        int sum = sumar(l1);
        if (sum > n) {
            return;
        }if (sum == n) {
            System.out.println(l1);
            return;
        }for (int k = i; k < n; k++) {
            l1.add(k);
            sumados(l1, n, k);
            l1.removeLast();
        }
    }

    public static int sumar(LinkedList<Integer> l1) {
        int suma = 0;
        for (int i = 0; i < l1.size(); i++) {
            suma += l1.get(i);
        }
        return suma;
    }
    
    //////////////////////////EJERCICIO 2/////////////////////////////
    public static void sumadosIguales(LinkedList<Integer> L1, int n, int i){
        int sum = sumar(L1);
        if (sum > n) {
            return;
        }
        if (sum == n && sumaIguales(L1)) {
            System.out.println(L1);
            return;
        }
        for (int k = i; k <= n; k++) {
            L1.add(k);
            sumadosIguales(L1, n, k);
            L1.removeLast();
        }
    }
    public static boolean sumaIguales(LinkedList<Integer> L1){
        int a = L1.get(0);
        for (int i = 1; i < L1.size(); i++) {
            if (a != L1.get(i)) {
                return false;
            }
        }
        return true;
    }
    
    //////////////////////////EJERCICIO 3/////////////////////////////
    public static void sumadosDiferentes(LinkedList<Integer> L1, int n, int i){
        int sum = sumar(L1);
        if (sum > n) {
            return;
        }
        if (sum == n && sumaDiferentes(L1)) {
            System.out.println(L1);
            return;
        }
        for (int k = i; k <= n; k++) {
            L1.add(k);
            sumadosDiferentes(L1, n, k);
            L1.removeLast();
        }
    }
    public static boolean sumaDiferentes(LinkedList<Integer> L1){
        int j = 0;
        for (int i = 1; i < L1.size(); i++) {
            int a = L1.get(j);
            if (a == L1.get(i)) {
                return false;
            }
            j++;
        }
        return true;
    }
    
    //////////////////////////EJERCICIO 4/////////////////////////////
    public static void factoresN(LinkedList<Integer> L1, int n, int i){
        
    }
}
