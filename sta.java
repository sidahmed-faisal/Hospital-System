import java.util.*;
public class sta{
	Scanner in = new Scanner(System.in);
	public static int count=0;
    public static int i=0;
public static int[] insert(int arr[]){
		        Scanner in = new Scanner(System.in);
	int x;
	for( x = count; x <count+1; x++){
	arr[x]=in.nextInt();
	}
	/*int n, pos, x;
	        Scanner in = new Scanner(System.in);
	        n = 10;
	         arr = new int[n+1];
	        System.out.print("Enter the position where you want to insert element:");
	        pos = in.nextInt();
	        System.out.print("Enter the element you want to insert:");
	        x = in.nextInt();
	        count++;
	        for(int i = (n-1); i >= (pos-1); i--)
	        {
	            arr[i+1] = arr[i];
	        }
	        arr[pos-1] = x;
	        System.out.print("After inserting:");
	        for(int i = 0; i < n; i++)
	        {
	            System.out.print(arr[i]+",");

	        }
        System.out.print(arr[n]);
**/
return arr;	}


public static void insertionSort(int[] list) {
for (int i = 1; i < list.length; i++) {
/** Insert list[i] into a sorted sublist list[0..i-1] so that
6 list[0..i] is sorted. */
int currentElement = list[i];
int k;
for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
 list[k + 1] = list[k];}// Insert the current element into list[k + 1]
 list[k + 1] = currentElement;

 }for (int m = 1; m < list.length; m++) {
System.out.println("after sorting  "+list[m]);}}

public int binarySearch(int[]inputArr,int key) {
        int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
				System.out.println("found");
                return mid;
            }
            if (key < inputArr[mid]) {
            	end = mid - 1;
				System.out.println("found");
            } else {
            	start = mid + 1;
            					System.out.println("found");
            }
        }
        return -1;

}

}
