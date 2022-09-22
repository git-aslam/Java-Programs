/* String & Array
2. Convert the array.
Input : {2,2,0,4,0,8}
Output : 4 4 8 0 0 0 */

import java.util.Scanner;

public class ArrayArrangement{

   public static void main(String[] args){
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int arr[]=new int[n];
     
       for(int i=0;i<n;i++)
           arr[i]=s.nextInt();

      int temp[]=new int[n];
      int k=0;
	
	for(int i=0;i<arr.length-1;i++)
          if(arr[i]==arr[i+1]){
              arr[i]=arr[i]+arr[i+1];
              arr[i+1]=0;
             }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)
               temp[k++]=arr[i];
        }

        for(int i=0;i<n;i++)
             System.out.print(temp[i]+" ");
}
}