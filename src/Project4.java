import java.io.*;
public class Project4{
    public static void main(String[] args) throws IOException{
        
        // Open reader
        int inputArrayTest [] = CreateInput.Exec(new FileReader(args[0]));
        // int inputArray [] = {100, 100, 80, 30, 30, 90, 65, 40, 70};

        // QuickSortFirstIndex.Exec(inputArray);
        SortStatistics heap = HeapSort.Exec(inputArrayTest, inputArrayTest.length);
        consoleLog(heap.getNumSwap());

        for(int i = 0; i < inputArrayTest.length; i++){
        consoleLog(inputArrayTest[i] + " ", true);
        }
        consoleLog("");

        


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