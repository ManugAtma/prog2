import java.util.*;

public class Arrayelement {

    static byte[] haeufigstesElem(byte[] arr) {

        int max = Arrayelement.findMaxOccurence(arr);
       
        byte[] maxNumbers = new byte[arr.length];
        int index = 0;
 
        int counter = 1;
        for (int i = 0; i < arr.length - 1; i++) {  
            if (arr[i] != arr[i + 1]) {
                counter = 1;
            } else {
                counter++;
                if (counter == max) {
                    maxNumbers[index] = arr[i];
                    index++;
                }
            }
        }
        byte[] result = Arrays.copyOfRange(maxNumbers, 0, index);
        return result;
    }


    static int findMaxOccurence (byte[] arr){
        
        Arrays.sort(arr);
        int counter = 1;
        int max = 1;
        for (int i = 0; i < arr.length - 1; i++) {  
            if (arr[i] != arr[i + 1]) {
                counter = 1;
            } else {
                counter++;
                if (counter > max) {
                    max = counter;
                }
            }
        }
        return max;
    }
}
