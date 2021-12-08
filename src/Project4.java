public class Project4{
    public static void main(String[] args) {
        
        int inputArray [] = {100, 100, 100, 80, 80, 30, 30, 90, 30, 40, 50, 70};

        // QuickSortFirstIndex.Exec(inputArray);
        QuickSortPartition50.Exec(inputArray);

        for(int i = 0; i < inputArray.length; i++){
        consoleLog(inputArray[i] + " ", true);
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