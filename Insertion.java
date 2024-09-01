/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertion;

/**
 *
 * @author User
 */
public class Insertion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[]={12,24,36,48,60};
        for(int i=0; i<arr.length; i++){
            System.out.println("element at index"+i+":"+arr[i]);
        }
        int newelement = 6;
        for(int i = arr.length - 1; i > 0; i--){
          arr[i]=arr[i-1];
        }
        arr[0] = newelement;
        System.out.println("\n arrayafter insertion at the start");
        for(int i=0; i<arr.length; i++){
            System.out.println("Element at index" +i+":"+arr[i]);
        }
    }
    
}
