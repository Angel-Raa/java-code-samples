/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.github.angel.models.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author aguero
 */
public class Solution {
    public static void main(String[] args) {
        int[] numbers = new int[] { 3, 3, 4 };
        System.out.println(majorityElement(numbers));

    }

    static public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");

    }

    static public boolean isPalindromeString(int x) {
        if (x < 0) {
            return false;
        }
        String tmp = Integer.toString(x);
        StringBuilder builder = new StringBuilder((tmp));
        String re = builder.reverse().toString();
        Integer reserse = Integer.parseInt(re);
        Integer or = Integer.parseInt(tmp);
        return reserse == or;
    }

    static public boolean isPalindrome(int x) {
        if (x < 0) {
            return false; // Los números negativos no son palíndromos
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }

    static public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0; // Si el arreglo está vacío, no hay elementos únicos
        }

        int uniqueElements = 1; // Contador para los elementos únicos, inicializado en 1 para contar el primer
                                // elemento único

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueElements] = nums[i]; // Mueve el elemento único al lugar correspondiente en el arreglo
                uniqueElements++; // Incrementa el contador de elementos únicos
            }
        }

        return uniqueElements;
    }

    static public int majorityElement(int[] nums) {
        int candidate = 0; // Inicializamos el candidato a elemento mayoritario
        int count = 0; // Contador para el candidato
    
        for (int num : nums) { // Recorremos el arreglo
            if (count == 0) { // Si el contador es 0, asignamos el número actual como candidato
                candidate = num;
            }
    
            if (num == candidate) { // Si el número actual es igual al candidato, aumentamos el contador
                count++;
            } else { // Si el número actual es diferente al candidato, reducimos el contador
                count--;
            }
        }
    
        // En este punto, candidate contiene el posible elemento mayoritario
        // Verificamos si realmente es el elemento mayoritario contando su frecuencia
        int frequency = 0;
        for (int num : nums) {
            if (num == candidate) {
                frequency++;
            }
        }
    
        // Si la frecuencia del candidato es mayor que la mitad del tamaño del arreglo, entonces es el elemento mayoritario
        if (frequency > nums.length / 2) {
            return candidate;
        } else {
            return -1; // No hay elemento mayoritario
        }
    }
    

}
