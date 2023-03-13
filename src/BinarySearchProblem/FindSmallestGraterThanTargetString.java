package BinarySearchProblem;

public class FindSmallestGraterThanTargetString {
    public static void main(String[] args) {
        char[] str = {'c','f','g'};
        char k = 'a';
        System.out.println(test(str,k));
    }
    public static char test(char[] str,char k){
      int start = 0;
      int end = str.length-1;
      while (start<end){
          int mid = start+(end-start)/2;
          if(str[mid]<=k){
              start = mid+1;
          }
          else {
              end = mid-1;
          }
      }
      if(start<str.length){
          return str[start];
      }
      else {
          return str[0];
      }
    }
}





/*
744. Find Smallest Letter Greater Than Target
Easy
2.7K
2K
Companies
You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.



Example 1:

Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
Example 2:

Input: letters = ["c","f","j"], target = "c"
Output: "f"
Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
Example 3:

Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].
 */