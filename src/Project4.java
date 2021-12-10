import java.io.*;
public class Project4{
    public static void main(String[] args) throws IOException{
        String path = args[0];
        int folders [] =  {50, 1000, 2000, 5000, 10000, 99999};
        Sorts.Exec(path, folders);
    }
}