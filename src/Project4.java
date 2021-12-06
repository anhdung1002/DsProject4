public class Project4{
    public static void main(String[] args) {
        
        int inputArray [] = {4, 5, 6, 7, 8, 9, 54, 3, 23, 1, 3, 6};

        for(int i = 0; i < inputArray.length; i++){
        consoleLog(inputArray[i] + " ", true);
        }
        consoleLog("");

        
        Quicksort.Exec("TRUE");


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