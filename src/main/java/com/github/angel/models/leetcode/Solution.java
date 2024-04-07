/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.github.angel.models.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author aguero
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(313));

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
        int count = 0;
       
         
        

        return count;
    }

}
