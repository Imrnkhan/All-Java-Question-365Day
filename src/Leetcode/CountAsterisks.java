package Leetcode;

public class CountAsterisks {
    public static void main(String[] args) {
        String str = "l|*e*et|c**o|*de|";
        System.out.println(test(str));
    }
    public static int test(String str) {
        int count =  0;
        int ans = 0;
        for(int i =0;i<str.length();i++){
            if(count%2==0){
                if(str.charAt(i)=='*'){
                    ans++;
                }
            }
            if(str.charAt(i)=='|'){
                count++;
            }
        }
        return ans;
    }
}


/*
2315. Count Asterisks
Easy
436
66
Companies
You are given a string s, where every two consecutive vertical bars '|' are grouped into a pair. In other words, the 1st and 2nd '|' make a pair, the 3rd and 4th '|' make a pair, and so forth.

Return the number of '*' in s, excluding the '*' between each pair of '|'.

Note that each '|' will belong to exactly one pair.



Example 1:

Input: s = "l|*e*et|c**o|*de|"
Output: 2
Explanation: The considered characters are underlined: "l|*e*et|c**o|*de|".
The characters between the first and second '|' are excluded from the answer.
Also, the characters between the third and fourth '|' are excluded from the answer.
There are 2 asterisks considered. Therefore, we return 2.
Example 2:

Input: s = "iamprogrammer"
Output: 0
Explanation: In this example, there are no asterisks in s. Therefore, we return 0.
Example 3:

Input: s = "yo|uar|e**|b|e***au|tifu|l"
Output: 5
Explanation: The considered characters are underlined: "yo|uar|e**|b|e***au|tifu|l". There are 5 asterisks considered. Therefore, we return 5.
 */