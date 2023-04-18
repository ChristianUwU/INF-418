/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.lab.combinatoriaypermutaciones;

import java.util.LinkedList;

/**
 *
 * @author Christian
 */
public class Lab3CombinatoriaYPermutaciones {

    public static void main(String[] args) {

        LinkedList<Integer> L1 = new LinkedList();
        LinkedList<Integer> L2 = new LinkedList();
        L1.add(1);
        L1.add(2);
        L1.add(3);
        L1.add(4);
        L1.add(3);
        L1.add(4);
        //combiSR(L1, L2, 3, 0);
        //combiCR(L1, L2, 3, 0);
        permuSR(L1, L2, 3);
    }

    public static void combiSR(LinkedList<Integer> L1, LinkedList<Integer> L2, int r, int i){
        if (L2.size() == r) {
            System.out.println(L2);
            return;
        }
        int k = i;
        while (k < L1.size()) {            
            L2.add(L1.get(k));
            combiSR(L1, L2, r, k+1);
            L2.removeLast();
            k++;
        }
    }
    
    public static void combiCR(LinkedList<Integer> L1, LinkedList<Integer> L2, int r, int i) {
        if (L2.size() == r) {
            System.out.println(L2);
            return;
        }
        int k = i;
        while (k < L1.size()) {
            L2.add(L1.get(k));
            combiCR(L1, L2, r, k);
            L2.removeLast();
            k++;
        }
    }
    public static void permuSR(LinkedList<Integer> L1, LinkedList<Integer> L2, int r){
        if (L2.size() == r) {
            System.out.println(L2);
            return;
        }
        int k = 0;
        while (k < L1.size()) {            
            if (!L2.contains(L1.get(k))) {
                L2.add(L1.get(k));
                permuSR(L1, L2, r);
                L2.removeLast();
            }
            k++;
        }
    }
    public static void permuCR(LinkedList<Integer> L1, LinkedList<Integer> L2, int r){
        if (L2.size() == r) {
            System.out.println(L2);
            return;
        }
        int k = 0;
        while (k < L1.size()) {            
            L2.add(L1.get(k));
            permuCR(L1, L2, r);
            L2.removeLast();
            k++;
        }
    }
}
