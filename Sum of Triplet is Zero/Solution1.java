
import java.util.*;
class Test {
	   
	       
	    public List<List<Integer>> threeSum(int[] nums) 
	    {
	    	List<List <Integer> > list = new ArrayList<List<Integer>>() ;
	    	Arrays.sort(nums);
	      
	    	for(int i = 0;i < nums.length-1;i++)
	    	{
	    	  int Start = i+1,value = nums[i],End = nums.length-1;
	    		while(Start<End)
	    		{
	    			int sum = nums[Start]+nums[End]+value;
	    			if(sum==0)
	    		  {
	    				System.out.println("Test1");
	    			  List<Integer> TempList = new ArrayList<Integer>();
	    			  
	    			  TempList.add(nums[Start]);
	    			  TempList.add(nums[End]);
	    			  TempList.add(value);
	    			  //System.out.println("nums[i]="+nums[i]+"nums[j]="+nums[j]+"else="+(-nums[i]-nums[j]));
	    			  Collections.sort(TempList);
	    				 //List<Integer> TempList1 = new ArrayList<Integer>(TempList);
	    			  if(!list.contains(TempList))
	    					 list.add(TempList);
	    			  Start++;End--;
	    			  	    		  
	    			  }
	    			else
	    			{
	    				if(sum<0)
	    					Start++;
	    				else
	    					End--;
	    			}
	    			}
	    		  
	    	  }
	    	
	    	return list;
	        
	    }
       public static void main(String args[]) {
    	 Test obj1 = new Test();
    	 int[] Input1 = {-1, 0, 1, 2, -1, -4}; 
    	 System.out.println(obj1.threeSum(Input1))		 ;
    	   
		
	}	
} 
	

