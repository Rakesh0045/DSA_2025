/*

Given an array arr[] of distinct positive numbers. Split the array into the minimum number of subsets (or subsequences) such that each subset contains consecutive numbers.

Examples:

Input: arr = [100, 56, 5, 6, 102, 58, 101, 57, 7, 103, 59]
Output: 3
Explanation: [5, 6, 7], [56, 57, 58, 59], [100, 101, 102, 103] are 3 subsequences in which numbers are consecutive.


Input: arr = [10, 100, 105]
Output: 3
Explanation: [10], [100] and [105] are 3 subset in which numbers are consecutive.

 */

import java.util.Arrays;
import java.util.Scanner;

public class SplitArrayToSubset {
    static int minSubsets(int arr[]) {
        // Your code here
        Arrays.sort(arr);
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != 1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Subsets: " + minSubsets(arr));

    }
}
