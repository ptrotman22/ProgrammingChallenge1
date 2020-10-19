import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProgrammingChallenge {
    public static void main(String[] args) throws IOException{

        //List<String> list = Arrays.asList();
    }
    public static void Organizer(ArrayList<String> file){
        ArrayList<String> data = new ArrayList<>();
        data = (ArrayList<String>)file.clone();

        int split = data.size();

        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));

        }

    }
    public static ArrayList File() throws FileNotFoundException {
        // New Arraylist to contain file info
        ArrayList<String> file = new ArrayList<>();

        Charset utf8 = StandardCharsets.UTF_8;
        Scanner s = new Scanner(new File("test.txt"));

        // Grabs each word from file and puts it into Arraylist
        // Use s.hasNextLine() & s.nextLine() to grab a line instead
        while (s.hasNext()){
            file.add(s.next());
        }
        s.close();



        return file;
    }
}
