package Sorting;

/**
 *
 * @author Ellisa
 */
public class BubbleSortDescending {
    static void bubbleSortDesc(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                System.out.println(" A : " + arr[j-1] +" < "+" B : "+arr[j]);
                if (arr[j - 1] < arr[j]) {
                    //swap the elements!
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }
    
    public static void main(String[] args) {
    
        //create an int array we want to sort using bubble sort algorithm
        int arr[] = {3, 60, 35, 2, 45, 320, 5};
 
        //print array before sorting using bubble sort algorithm
        System.out.println("Array before bubble sort : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
 
        //sort an array in descending order using bubble sort algorithm
        bubbleSortDesc(arr);
        
        //print array after sorting using bubble sort algorithm
        System.out.println("Array after bubble sort descending : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

