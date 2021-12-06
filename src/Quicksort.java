public class Quicksort {

    public static void Exec(String testText) {

        consoleLog("This is from Quicksort Class" + testText);
        
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
