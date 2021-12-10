import java.io.*;

public class Sorts {

    public static void Exec(String dir, int [] folderOrder) throws IOException{
        // Open each file  from a directory
        for(int m  = 0; m < folderOrder.length; m++){
            // Output folder
            String outFolderPath = dir + "/Output/" + folderOrder[m];
            // Input folder
            String folderPath = dir + "/Input/" + folderOrder[m];
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
                new File(outFolderPath).mkdir();
                FileWriter outWriter = new FileWriter(outFolderPath + "/" + listOfDatFiles[i].getName() + "_results.txt");

                System.out.println("Filename: " + listOfDatFiles[i].getName());
                outWriter.write("Filename: " + listOfDatFiles[i].getName() + "\n\n");
                int inputArray [] = CreateInput.Exec(new FileReader(listOfDatFiles[i]));

                // Quick Sort with First Index Pivot
                SortStatistics qsFirstIdx =  QuickSortFirstIndex.Exec(inputArray);
                outWriter.write("Quick Sort with First Index Pivot\n");
                if(m == 0)
                    printResults(outWriter, qsFirstIdx, true);
                else
                printResults(outWriter, qsFirstIdx, false);

                // Quick Sort then Insertion Sort with Parition of 50
                SortStatistics qsPartition50 =  QuickSortFirstIndex.Exec(inputArray);
                outWriter.write("Quick Sort then Insertion Sort with Parition of 50\n");
                if(m == 0)
                    printResults(outWriter, qsPartition50, true);
                else
                printResults(outWriter, qsPartition50, false);

                // Quick Sort then Insertion Sort with Parition of 100
                SortStatistics qsPartition100 =  QuickSortFirstIndex.Exec(inputArray);
                outWriter.write("Quick Sort then Insertion Sort with Parition of 100\n");
                if(m == 0)
                    printResults(outWriter, qsPartition100, true);
                else
                printResults(outWriter, qsPartition100, false);

                // Quick Sort with Median of Three as Pivot
                SortStatistics qsMedianOfThree =  QuickSortFirstIndex.Exec(inputArray);
                outWriter.write("Quick Sort with Median of Three as Pivot\n");
                if(m == 0)
                    printResults(outWriter, qsMedianOfThree, true);
                else
                printResults(outWriter, qsMedianOfThree, false);

                // Heap Sort
                SortStatistics heap =  QuickSortFirstIndex.Exec(inputArray);
                outWriter.write("Heap Sort\n");
                if(m == 0)
                    printResults(outWriter, heap, true);
                else
                printResults(outWriter, heap, false);
                
                outWriter.close();
            }

        } 
    }

    public static void printResults(FileWriter writer, SortStatistics results,  boolean printArray) throws IOException{
        if(printArray == true){
            int resultsArray [] = results.getReturnArray();
            for(int i = 0; i < resultsArray.length; i++){
                System.out.print(resultsArray[i] + " ");
                writer.write(resultsArray[i] + " ");
            }
            System.out.println("");
            writer.write("\n");
        }
        System.out.println("Number of compares: " + results.getNumCompare());
        writer.write("Number of compares: " + results.getNumCompare() + "\n");
        System.out.println("Number of swaps: " + results.getNumSwap());
        writer.write("Number of swaps: " + results.getNumSwap() + "\n");
        System.out.println("");
        writer.write("\n");
    }



}
