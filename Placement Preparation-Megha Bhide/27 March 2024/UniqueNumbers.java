import java.util.*;
public class UniqueNumbers {
    public static void main(String[] args) {
        int[] array = {9,5,3,2,6,2,3,4,2,6,3,3,4};
        System.out.println("Original Array:");
        printArray(array);
        
        System.out.println("\nUnique Numbers:");
        printUniqueNumbers(array);
    }
     public static void printUniqueNumbers(int[] arr) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }
        for (int uniqueNum : uniqueSet) {
            System.out.print(uniqueNum + " ");
        }
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
