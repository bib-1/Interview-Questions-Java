import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FindingStringInFile {
    public static boolean containsString(String filename, String str) throws FileNotFoundException {
        File file = new File(filename);
        Scanner sc = new Scanner(file);

        while(sc.hasNext()){
            if(sc.next().trim().equals(str)){
                sc.close();
                return true;
            }
        }

        sc.close();

        return false;
    }

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println(containsString("C:/Users/bibek/Desktop/bibek", "Ram"));
    }
}
