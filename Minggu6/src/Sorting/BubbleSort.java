package Sorting;

/**
 *
 * @author Ellisa
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    static void bubbleSort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for(int i=0; i<n; i++){
            for(int j=1; j<(n-i); j++){
                System.out.println(" A : " + arr[j-1] +" > "+" B : "+arr[j]);
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = {3,60,35,2,45,320,5};
        
        System.out.println("Array Before Bubble Sort");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        } 
            System.out.println();
            
            bubbleSort (arr);//sorting array elements using bubble sort
            
            System.out.println("Array After Bubble Sort");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
    
