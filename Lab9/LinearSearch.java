
public class LinearSearch {
	static int count = 0;
	public static int search(int arr[], int x) { 
		
	    int n = arr.length; 
	    for(int i = 0; i < n; i++) { 
	    	count++;
	        if(arr[i] == x) 
	        	
	            return i; 
	      
	        
	    } 
	    return -1; 
	} 
	public static void main(String args[])
    {
        int arr[] = {5, 11, 17, 22, 36, 43, 62, 71, 83, 97 };
        int x = 71;
 
        int result = LinearSearch.search(arr, x);
        if (result == -1)
            System.out.print("Element is not present in array");
        else
        	System.out.println(count+" elements are visited. Value is found at index: "+result);
    }

}

