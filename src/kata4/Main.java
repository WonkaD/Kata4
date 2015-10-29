package kata4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String nameFile = "emails.txt";
        ArrayList<String> mailArray = MailListReader.read(nameFile);
        System.out.println(mailArray.size());
        
        Histogram <String> histogram = MailHistogramBuilder.build(mailArray);
        
        new HistogramDisplay(histogram).execute();
        
    }


}
