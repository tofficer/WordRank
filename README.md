# WordRank

		//intuition: rank is equal to the sum of this equation for char at position i for i = 0 to n-1:
		//number of chars in s[i+1 to n-1] that come before char at i in the dictionary
		//multiplied by the number of permutations that are possible at position i
		
		//permuations are factorial of the length of substring from s[i+1 to n-1] 
		//(ie all the possible chars that come after char at i)
		//divided by the factorial of repeat characters including the char at i
		//(ie for i=0 and s= AABBCCC, number of permuations = 6!/(2!2!3!) 
