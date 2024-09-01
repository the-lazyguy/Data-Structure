/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package middleinsertion;

/**
 *
 * @author User
 */
public class Middleinsertion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[]={100,200,300,400,500};
        for(int i=0; i<arr.length; i++){
            System.out.println("element at index"+i+":"+arr[i]);
        }
        int newelement = 250;
        int position=2;
        for(int i = arr.length - 1; i > 2; i--){
          arr[i]=arr[i-1];
        }
        arr[position] = newelement;
        System.out.println("\n array after insertion at the middle");
        for(int i=0; i<arr.length; i++){
            System.out.println("Element at index" +i+":"+arr[i]);
        }
    }
    
}
