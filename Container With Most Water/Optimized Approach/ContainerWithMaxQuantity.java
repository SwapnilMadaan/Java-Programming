import java.lang.*;
class  ContainerWithMaxQuantity{
    public int maxArea(int[] Height) {
		
		int MaxContainer=0,start=0 ,end=Height.length-1;
	     
	    
         while(start<end)
         {
	    	 	 MaxContainer=Math.max(MaxContainer,Math.min(Height[start],Height[end])*(end-start));
	    		
	    if (Height[start]<Height[end]) 
            start++;
           else
             end--;
         }
	    
		return MaxContainer;
	     
    }
}
