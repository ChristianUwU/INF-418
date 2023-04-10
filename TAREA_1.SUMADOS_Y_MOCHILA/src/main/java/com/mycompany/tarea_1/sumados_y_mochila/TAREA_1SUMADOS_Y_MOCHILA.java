/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tarea_1.sumados_y_mochila;

import java.util.LinkedList;

/**
 *
 * @author Christian
 */
public class TAREA_1SUMADOS_Y_MOCHILA {

    public static void main(String[] args) {
        LinkedList<Integer> L2 = new LinkedList();
        //sumados(L2, 10, 1);
        //sumadosDiferentes(L2, 10, 1);
        //sumadosIguales(L2, 10, 1);
        //sumadosPrimos(L2, 10, 1);
        //sumadosEntreAyB(L2, 10, 1, 2, 8);
        factores(L2, 10, 1);
    }

    //Encontrar los sumandos posibles en una Lista.//
    public static void sumados(LinkedList<Integer> L1, int n, int i) {
        int sum = sumar(L1);
        if (sum > n) {
            return;
        }
        if (sum == n) {
            System.out.println(L1);
            return;
        }
        for (int k = i; k < n; k++) {
            L1.add(k);
            sumados(L1, n, k);
            L1.removeLast();
        }
    }

    public static int sumar(LinkedList<Integer> l1) {
        int suma = 0;
        for (int i = 0; i < l1.size(); i++) {
            suma += l1.get(i);
        }
        return suma;
    }

    //Encontrar todos los sumandos posibles diferentes en una Lista.//
    public static void sumadosDiferentes(LinkedList<Integer> L1, int n, int i) {
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

    public static boolean sumaDiferentes(LinkedList<Integer> L1) {
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

    //Encontrar todos los sumandos posibles iguales en una Lista.//
    public static void sumadosIguales(LinkedList<Integer> L1, int n, int i) {
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

    public static boolean sumaIguales(LinkedList<Integer> L1) {
        int a = L1.get(0);
        for (int i = 1; i < L1.size(); i++) {
            if (a != L1.get(i)) {
                return false;
            }
        }
        return true;
    }

    //Encontrar todos los sumandos primos posibles en una Lista.//
    public static void sumadosPrimos(LinkedList<Integer> L1, int n, int i) {
        int sum = sumar(L1);
        if (sum > n) {
            return;
        }
        if (sum == n && listaPrimos(L1)) {
            System.out.println(L1);
            return;
        }
        for (int k = i; k <= n; k++) {
            L1.add(k);
            sumadosPrimos(L1, n, k);
            L1.removeLast();
        }
    }

    public static boolean listaPrimos(LinkedList<Integer> L1) {
        for (int i = 0; i < L1.size(); i++) {
            if (!numeroPrimo(L1.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean numeroPrimo(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        return c == 2;
    }

    //Encontrar todos los sumandos entre a y b inclusive en una Lista.//
    public static void sumadosEntreAyB(LinkedList<Integer> L1, int n, int i, int a, int b) {
        int sum = sumar(L1);
        if (sum > n) {
            return;
        }
        if (sum == n && entreAyB(L1, a, b)) {
            System.out.println(L1);
            return;
        }
        for (int k = i; k <= n; k++) {
            L1.add(k);
            sumadosEntreAyB(L1, n, k, a, b);
            L1.removeLast();
        }
    }

    public static boolean entreAyB(LinkedList<Integer> L1, int a, int b) {
        for (int i = 0; i < L1.size(); i++) {
            if (L1.get(i) < a || L1.get(i) > b) {
                return false;
            }
        }
        return true;
    }

    //Dado un entero N, encontrar todos los factores posibles, enteros positivos de N.//
    //Encontrar los factores posibles en una Lista.//
    public static void factores(LinkedList<Integer> L1, int n, int i) {
        int Mul = multiplos(L1);
        if (Mul > n || L1.size() == 2 && Mul == 1) {
            return;
        }
        if (Mul == n) {
            System.out.println(L1);
            return;
        }
        for (int k = i; k <= n; k++) {
            L1.add(k);
            factores(L1, n, i++);
            L1.removeLast();
        }
    }

    public static int multiplos(LinkedList<Integer> L1) {
        int Mul = 1;
        for (int i = 0; i < L1.size(); i++) {
            Mul *= L1.get(i);
        }
        return Mul;
    }
}
