Intuition

Check all the substring one by one to see if it has no duplicate character.

Algorithm

Suppose we have a function boolean allUnique(String substring) which will return true if the characters in the substring are all unique,
otherwise false. We can iterate through all the possible substrings of the given string s and call the function allUnique.
If it turns out to be true, then we update our answer of the maximum length of substring without duplicate characters.
#Complexity Analysis

Time complexity : O(n^3)O(n 
3
 ).

To verify if characters within index range [i, j)[i,j) are all unique, we need to scan all of them. Thus, it costs O(j - i)O(j−i) time.

For a given i, the sum of time costed by each j \in [i+1, n]j∈[i+1,n] is

\sum_{i+1}^{n}O(j - i) ∑ 
i+1
n
​	
 O(j−i)

Thus, the sum of all the time consumption is:

O\left(\sum_{i = 0}^{n - 1}\left(\sum_{j = i + 1}^{n}(j - i)\right)\right) = O\left(\sum_{i = 0}^{n - 1}\frac{(1 + n - i)(n - i)}{2}\right) = O(n^3) O(∑ 
i=0
n−1
​	
 (∑ 
j=i+1
n
​	
 (j−i)))=O(∑ 
i=0
n−1
​	
  
2
(1+n−i)(n−i)
​	
 )=O(n 
3
 )

Space complexity : O(min(n, m))O(min(n,m)). We need O(k)O(k) space for checking a substring has no duplicate characters, where kk is the size of the Set. The size of the Set is upper bounded by the size of the string nn and the size of the charset/alphabet mm. 
