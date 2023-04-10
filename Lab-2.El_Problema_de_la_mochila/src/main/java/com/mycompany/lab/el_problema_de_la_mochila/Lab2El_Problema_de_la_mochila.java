/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab.el_problema_de_la_mochila;

import java.util.LinkedList;

/**
 *
 * @author Christian
 */
public class Lab2El_Problema_de_la_mochila {

    public static void main(String[] args) {
        LinkedList<Integer> L1 = new LinkedList();
        LinkedList<Integer> L2 = new LinkedList();
        L1.add(2);
        L1.add(4);
        L1.add(1);
        L1.add(6);
        // mochila(L1, L2, 8, 0);
    }
    public static void mochila(LinkedList<Integer> L1, LinkedList<Integer> L2, int max, int i){
        int sum = sumar(L2);
        if (sum > max) {
            return;
        }
        System.out.println(L2);
        for (int k = i; k < L1.size(); k++) {
            L2.add(L1.get(k));
            mochila(L1, L2, max, k+1);
            L2.removeLast();
        }
    }
    public static int sumar(LinkedList<Integer> L1){
        int sum = 0;
        for (int i = 0; i < L1.size(); i++) {
            sum += L1.get(i);
        }
        return sum;
    }
}
