# WordRank

Given an array of Strings, return the lexicographic rank of each String s in a dictionary where each word in the dictionary 
contains exactly set of Characters that make up s.

Algorithm intuition: the rank of String s is equivalent to summing over for i = 0 to n-1:  
Let c be the character at position i. Then multiply the number of chars that come after c in s but have a lexicographic rank
better than c times the number of permutations of the substring s[i..n-1] given the chars that make up s[i..n-1].  
  		
The number of permuations of s[i..n-1] = factorial(n-i-1) / the factorial of the count of every character in s[i..n-1]  
for example: given s = AABBCCC and i=0, number of permutations = 6!/(2!2!3!)  

Note: must use BigInteger because the factorial can easily cause overflow for int and long data types
