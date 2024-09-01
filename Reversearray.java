/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reversearray;

/**
 *
 * @author zainn
 */
public class Reversearray {

 public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int[] reversedArray = reverseArray(arr);

        // Print the reversed array
        for (int i : reversedArray) {
            System.out.print(i + " ");
        }
    }

    public static int[] reverseArray(int[] inputArray) {
        int[] reversedArray = new int[inputArray.length];
        int j = 0;

        for (int i = inputArray.length - 1; i >= 0; i--) {
            reversedArray[j] = inputArray[i];
            j++;
        }

        return reversedArray;
    }
}