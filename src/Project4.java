import java.io.*;
public class Project4{
    public static void main(String[] args) throws IOException{
        
        // Open reader
        int inputArrayTest [] = CreateInput.Exec(new FileReader(args[0]));
        // int inputArray [] = {100, 100, 80, 30, 30, 90, 65, 40, 70};

        // QuickSortFirstIndex.Exec(inputArray);
        HeapSort.Exec(inputArrayTest, inputArrayTest.length);

        for(int i = 0; i < inputArrayTest.length; i++){
        consoleLog(inputArrayTest[i] + " ", true);
        }
        consoleLog("");

        
        // Quicksort.Exec("TRUE");


    }






















    public static void consoleLog(Object input){
        System.out.println(input);
    }
    public static void consoleLog(Object input, boolean noLineFeed){
        if(noLineFeed == true){
            System.out.print(input);
        }
    }


}