import java.io.*;
public class Project4{
    public static void main(String[] args) throws IOException{
        String path = "/Users/andynguyen/John Hopkins Classes/Data Structure/Project 4/DsProject4/Input";
        int folders [] =  {50, 1000};

        Sorts.Exec(path, folders);






        // Open reader
        // int inputArrayTest [] = CreateInput.Exec(new FileReader(args[0]));

        // SortStatistics quickFirstIndex = QuickSortMedianOfThree.Exec(inputArrayTest);

        // consoleLog("Number of compares: " + quickFirstIndex.getNumCompare());
        // consoleLog("Number of swaps: " + quickFirstIndex.getNumSwap());







        // SortStatistics heap = HeapSort.Exec(inputArrayTest, inputArrayTest.length);
        // consoleLog(heap.getNumSwap());
        // consoleLog(heap.getNumCompare());



        // for(int i = 0; i < inputArrayTest.length; i++){
        // consoleLog(inputArrayTest[i] + " ", true);
        // }
        // consoleLog("");

        


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