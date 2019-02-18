class Solution {
 public boolean isPalindrome(int x) {
          ;
           if(x<0||(x!=0 && x%10==0))
	        {
	            return false;
	            
	        }
	        if(x==0)
	        	return true;
	        int reverse=0;
	        while(x>reverse )
	        {
	        	if(reverse!= x/10)
                    reverse=reverse*10+x%10;
                
                x=x/10;
	        	
	        }
	        if(reverse!=x)
	        {
	        return false;
            }
     return true;
	        
}}
