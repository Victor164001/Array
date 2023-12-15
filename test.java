import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class test{
    /**
 * @param args
 */
public static void main(String[]args)
    {

        Scanner in =new Scanner(System.in);
        int[] arr = new int[]{1,6,8,1,6}; 
       // System.out.println(arr[3]);
        int n = arr.length;
        boolean duplicateFound = false;

        for(int i=0; i<n;i++){
          for(int j=i+1;j<n;j++){
               if(arr[i] == arr[j]){
          
                    duplicateFound = true;
                    break;
               }
          }
        }
        if(duplicateFound){
          System.out.println("True");
        }
        else{
          System.out.println("False");
        }

    }
}