import java.io.*;

public class CreateInput {
    
    public static int [] Exec(FileReader inputFile) throws IOException {
        // Populate the array from the inputFile
        BufferedReader reader = new BufferedReader(inputFile);

            String inputArr [] = new String [10000]; 
            int i = 0;
            while(reader.ready()){
                inputArr[i] = reader.readLine();
                i++;
            }
            reader.close();


            if(i > 5){
                int intArray [] = new int [i];
                for(int k = 0; k < i; k++){
                    intArray[k] = Integer.parseInt(inputArr[k]);
                }
                return intArray;

            }
            else{
                String input = inputArr[0];
                    input = input.trim();
                    String tempArr [] = input.split("\s\s*");
                    int size = tempArr.length;
                int intArray [] = new int [size];
                for(int k = 0; k < size; k++){
                    intArray[k] = Integer.parseInt(tempArr[k]);
                }
                return intArray;
            }

    }
}
