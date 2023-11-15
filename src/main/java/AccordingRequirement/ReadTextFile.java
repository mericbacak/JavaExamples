package AccordingRequirement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

;


public class ReadTextFile {
    public static void main(String[] args) {
        try {
            int rowcount=0;
            String data;
            File myObj = new File("src/main/Files/KSMpidList25k.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNext()) {
                data = myReader.next();
                System.out.println(data+",");
                rowcount++;
            }
            myReader.close();
            System.out.println("dosyadaki pid sayısı "+rowcount);
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
