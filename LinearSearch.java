/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linear.search;

/**
 *
 * @author zainn
 */
public class LinearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr ={4,6,2,8,10};
        int target = 8;
        boolean found = false;
        
        for (int i=0; i<arr.length;i++){
            if(arr[i] ==target){
           System.out.println("Element " + target +"found at index " +i);
            found = true;
            break;
        }
       }
    if(found == false){
        System.out.println("Element " + target + "not found in the array.");
    }   
}
}
