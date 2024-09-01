/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deletion;

/**
 *
 * @author zainn
 */


  public class Deletion {

    public static void main(String[] args) {
        int arr[] = {8, 16, 24, 32, 40};
        System.out.println("Array before deletion");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " : " + arr[i]);
        }
        
        int deleteIndex = 2;
        
        for (int i = deleteIndex; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0; 
        
        System.out.println("Array after deletion");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " : " + arr[i]);
        }
    }
  }

