import java.util.HashSet;
import java.util.Scanner;
public class Commonelementarray {
    public static void main(String args[])
    {
        int[] arr1={7,4,6,9,5,8,5};
        int[] arr2={1,3,4,2,6,8,1};
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0; i<arr1.length; i++)
        {
            for(int j=0; j<arr2.length; j++)
            {
                if(arr1[i]==arr2[j])
                {
                    hs.add(arr1[i]);
                }
            }
        }
        for(int no:hs)
        {
            System.out.println(no+ " ");
        }
    }
}