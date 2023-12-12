import java.util.Arrays;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        ary();
    }

    static void ary()
    {
        Scanner in= new Scanner(System.in);
        int a= in.nextInt();

        int[] arr= new int[]{12,15,68,82,46};
        int n= arr.length;

        for(int i=0;i<n;i++){
            if (arr[i]== 82) {

                int c = i+1;
                System.out.println(a+" is at the position of= "+c);
            }
            else{
                System.out.println("value dose not exisist");
                break;
            }
        }
    }

   
}
