import java.util.Scanner;
class reversenumber {
    public static void main(String args[])
    {
        int rem,rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int no=sc.nextInt();
        while(no !=0)
        {
            rem=no%10;
            rev=rev*10+rem;
            no=no/10;
        }
        System.out.println("The reverse of the given number is:" + rev);
    }
}