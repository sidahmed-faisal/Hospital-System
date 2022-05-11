import java.util.*;
public class data extends sta{
 public static void main(String[]args){
Scanner in = new Scanner(System.in);
 System.out.println("menu:\n1-size\n2-insert\n3-sort\n4-find\n5-deleten\n6-display");
 data obj = new data();
 int x =in.nextInt();
		        int arr[] = new int[10];
 	           int[]temp=new int[10];


 do{
 switch(x){
   case 1:{
System.out.println("the size is "+count);


}

break;
   case 2:{
temp=obj.insert(arr);
count++;
	for( int i=0;i<temp.length;i++){
		System.out.println(temp[i]);
		}
}
break;
 case 3:{
obj.insertionSort(temp);
}
break;
 case 4:{
System.out.println("enter the key you want to search");
int key = in.nextInt();
obj.binarySearch(temp,key);
}
}
    System.out.println("menu:\n1-size\n2-insert\n3-sort\n4-find\n5-deleten\n6-display");
   	x=in.nextInt();
			}while(x!=7);

	 }
	}