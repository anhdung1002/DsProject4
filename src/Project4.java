public class Project4{
    public static void main(String[] args) {
        
        int inputArray [] = {10, 80, 30, 90, 40, 50, 70};

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