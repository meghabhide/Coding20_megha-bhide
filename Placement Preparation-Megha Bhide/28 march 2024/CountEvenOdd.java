import java.util.Scanner;
public class CountEvenOdd {
    public static void main(String []args)
    {
        int[] arr={8,5,6,7,9,2,3,4,6,1,0};
        int evenc=0, oddc=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2==0)
            {
                evenc++;
            }
            else{
                oddc++;
            }
        }
        System.out.println("Count of Even Number:" +evenc);
        System.out.println("Count of Odd Number:" +oddc);
    }
}