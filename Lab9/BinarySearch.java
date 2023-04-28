
public class BinarySearch {
	static int count=0;
	int binarySearch(int arr[], int x) { 
		int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            if (arr[m] == x) {
            	count++;
                return m;
            }
            
             if (arr[m] < x) {
            	count++;
                l = m + 1;
            }
 
            else {
            	count++;
                r = m - 1;
            }
        }
        return -1;
    } 
	public static void main(String[] args) {
		BinarySearch binarysearch = new BinarySearch();
		int arr[] = { 5, 11, 17, 22, 36, 43, 62, 71, 83, 97 };
        int n = arr.length;
        int x = 71;
        int result = binarysearch.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element is not present");
        else
            System.out.println(count+" elements are visited. Value is found at index: "+result);

	}
   

}
