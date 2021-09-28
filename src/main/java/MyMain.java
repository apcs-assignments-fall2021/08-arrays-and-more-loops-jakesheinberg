import java.util.Arrays;

public class MyMain {

    // Rotates all values in an array to the left
    // Ex. rotateLeft([1, 2, 3, 4, 5]) => [2, 3, 4, 5, 1]
    public static int[] rotateLeft(int[] arr) {
        int index=0;
        int firstNum = arr[0];
        for(int i=1;  i<=arr.length-1; i++ ){
            arr[index] = arr[i];
            index++;
            }arr[arr.length-1]=firstNum;
        return arr;
    }

    // Rotates all values in an array to the right
    // Ex. rotateRight([1, 2, 3, 4, 5]) => [5, 1, 2, 3, 4]
    public static int[] rotateRight(int[] arr) {
        int index=arr.length-1;
        int lastNum = arr[arr.length-1];
        for(int i=arr.length-2;  i>=0; i-- ){
            arr[index] = arr[i];
            index--;
        }arr[0]=lastNum;
        return arr;
    }

    // Replaces all duplicate values with -1
    // Ex. duplicateReplacer([1, 2, 1, 2, 1, 1]) => [1, 2, -1, -1, -1, -1]
    public static int[] duplicateReplacer(int[] arr) {
        int tracker = 0;
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[i]==arr[j] && i!=j){
                    arr[j]=-1;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
