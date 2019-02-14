Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"
# SOLUTION USING BRUTEFORCE>
The obvious brute force solution is to pick all possible starting and ending positions for a substring, and verify if it is a palindrome.

Complexity Analysis

Time complexity : O(n^3)O(n 
3
 ). Assume that nn is the length of the input string, there are a total of \binom{n}{2} = \frac{n(n-1)}{2}( 2n​)= 2n(n−1)​	
  such substrings (excluding the trivial solution where a character itself is a palindrome). Since verifying each substring takes O(n)O(n) time, the run time complexity is O(n^3)O(n 3).

Space complexity : O(1)O(1). 
