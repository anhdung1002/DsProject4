import java.io.BufferedReader;

public class CreateInput {
    
    public static int [] name(BufferedReader inputFile) {
        // Populate the array from the inputFile
        int size = 100;
        int intArray [] = new int [size];
        for(int i = 1; i < size; i++){
            intArray[i] = i;
        }
// 
        return intArray;
    }



}
