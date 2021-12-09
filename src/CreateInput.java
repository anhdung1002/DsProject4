import java.io.*;

public class CreateInput {
    
    public static int [] Exec(FileReader inputFile) throws IOException {
        // Populate the array from the inputFile
        BufferedReader reader = new BufferedReader(inputFile);
        String input = reader.readLine();
        reader.close();
        String inputArr [] = input.split("\s.\s*");

        int size = inputArr.length;
        int intArray [] = new int [size];
        for(int i = 0; i < size; i++){
            intArray[i] = Integer.parseInt(inputArr[i]);
        }
        return intArray;
    }



}
