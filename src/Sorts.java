import java.io.*;

public class Sorts {

    public static void Exec(String dir, int [] folderOrder) throws IOException{
        // Open each file  from a directory
        for(int m  = 0; m < folderOrder.length; m++){
            String folderPath = dir + "/" + folderOrder[m];
            File folder = new File(folderPath);
            File [] listOfFiles = folder.listFiles();
            // Count number of .dat files
            int size =  0;
            for(int i = 0; i < listOfFiles.length; i++){
                if(listOfFiles[i].getName().endsWith(".dat"))
                    size++;
            }
            // Create .dat file array
            File [] listOfDatFiles = new File  [size];
            int j = 0;
            for(int i = 0; i < listOfFiles.length; i++){
                if(listOfFiles[i].getName().endsWith(".dat")){
                    listOfDatFiles[j]  =  listOfFiles[i];
                    j++;
                }
            }

            // Run 5 sorting algorithms  against the data
            for(int  i = 0; i < listOfDatFiles.length; i++){
                System.out.println("Filename: " + listOfDatFiles[i].getName());
                int inputArray [] = CreateInput.Exec(new FileReader(listOfDatFiles[i]));
                SortStatistics qsFirstIdx =  QuickSortFirstIndex.Exec(inputArray);
                if(m == 0){
                    printResults(qsFirstIdx, true);
                }
                else
                {
                    printResults(qsFirstIdx, false);
                }
            }

        } 
    }

    public static void printResults(SortStatistics results,  boolean printArray){
        if(printArray == true){
            int resultsArray [] = results.getReturnArray();
            for(int i = 0; i < resultsArray.length; i++){
                System.out.print(resultsArray[i] + " ");
            }
            System.out.println("");
        }
        System.out.println("Number of compares: " + results.getNumCompare());;
        System.out.println("Number of swaps: " + results.getNumSwap());
        System.out.println("");
    }



}
