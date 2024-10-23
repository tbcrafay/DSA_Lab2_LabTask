/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dsa_lab2_2023f;

/**
 *
 * @author 2023f-bse-071
 */
import java.util.*;

public class DSA_Lab2_2023f {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector<Integer> vec = new Vector<Integer>();
        for(int i = 1;i<=10;i++){
            vec.add(i);
            
        }
        System.out.println("Integers:" + vec);
        Integer sum = 0;
        for(int i =0; i < vec.size();i++){
            sum += vec.get(i);
        }
        System.out.println("sum:" + sum);
    }
    
}
