import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in .nextInt();
        int[] arr = new int[size-1];
        for(int i=0;i<size-1;i++)
            arr[i] = in.nextInt();
        System.out.println(missingNumberFinder(arr, size));
    }
    static int missingNumberFinder(int array[], int n) {
        // write your code here
        Set<Integer> set = new HashSet<>();

        //iterate over each element in array and add it to the set
        for (int i: array){
            set.add(i);
        }

        //iterate from 1 to n
        for(int i=1; i<= n; i++){
            /*
            check if that ith value is in the set or not the ith value which is not in
            the set will be the missing number
             */
            if(!set.contains(i)) return i;
        }
        return 0;
    }
}
