import java.io.*;
import java.util.*;

public class InsertionSorting {
	
	public static void main(String args[]){
			Scanner sn = new Scanner(System.in);
			System.out.println("Please enter the size of the array");
			int size = sn.nextInt();
			int arr[] = new int[size];
			for(int x =0;x<size;x++){
				arr[x]=sn.nextInt();
			}
			System.out.println("The array is : ");
			for(int x =0;x<size;x++){
				System.out.println(arr[x]);
			}
			//Sorting using a insertion sort using a two variables for swapping
			int i,j,y,z;
			i=1;
			while(i<size){
				j=i;
				while(j>0 && arr[j-1]>arr[j]){
					y=arr[j-1];
					arr[j-1]= arr[j];
					arr[j]=y;
					j--;
				}
				i++;
			}
			System.out.println("The Sorted array is : ");
			for(int x =0;x<size;x++){
				System.out.println(arr[x]);
			}
			
		//Sorting using a insertion sort using a single variable for swapping	
			/*int temp,temp2,temp3;
			temp=1;
			while(temp<size){
				temp3 = arr[temp];
				temp2=temp-1;
				while(temp2>=0 && arr[temp2]>temp3){
					arr[temp2+1]= arr[temp2];
					System.out.println(arr[temp]);
					temp2--;
					}
				arr[temp2+1]= temp3;
				temp++;
			}
			System.out.println("The Sorted array using one variable is : ");
			for(int x =0;x<size;x++){
				System.out.println(arr[x]);
			}*/
	}

}
