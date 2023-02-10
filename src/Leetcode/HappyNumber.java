package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int num= 19;
        System.out.println(isHappy(num));
    }

    public static int digitSquareSum(int num){
        int sum = 0;
        while(num > 0){
            sum += (num%10)*(num%10);
            num = num/ 10;
        }
        return sum;
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while(n != 1 ){
            if(!set.contains(n)){
                set.add(n);
            }
            else
                return false;

            n = digitSquareSum(n);

        }
        return true;
    }
    }




/*
202. Happy Number
Easy
7.9K
996
Companies
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.



Example 1:

Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
Example 2:

Input: n = 2
Output: false
 */