import java.io.*;

public class Sorts {

    public static void Exec(String dir) throws IOException{
    // Open each file  from a directory

    int folderOrder [] = {50};
    String folderPath = dir + "/" + folderOrder[0];
    File folder = new File(folderPath);
    File [] listOfFiles = folder.listFiles();
    
    int size =  0;
    for(int i = 0; i < listOfFiles.length; i++){
        if(listOfFiles[i].getName().endsWith(".dat"))
            size++;
    }
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
        int inputArray [] = CreateInput.Exec(new FileReader(listOfDatFiles[i]));
        SortStatistics qsFirstIdx =  QuickSortFirstIndex.Exec(inputArray);
        System.out.println("Number of compares: " + qsFirstIdx.getNumCompare());;
        System.out.println("Number of swaps: " + qsFirstIdx.getNumSwap());
    }




    }




}
