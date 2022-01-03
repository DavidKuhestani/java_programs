package question1;
import java.io.*;
import java.util.*;

public class q1 {
    public static void main(String[] args) throws IOException {
        File sourceFile = new File(args[0]);
        Scanner input = new Scanner(sourceFile);
        //checking if user provided argument
        if(args.length != 1){
            System.out.println("Incorrect argument count provided");
            System.exit(1);
        }

        //checking if file exists
        if(!sourceFile.exists()){
            System.out.println(args[0]+ "does not exists");
            System.exit(2);
        }

        var characters = 0;	// Number of character
        var lines = 0;			// Number of lines

        while (input.hasNext()) {
            lines++;
            String line = input.nextLine();
            characters += line.length();
        }

        //Word counter
        String line;
        int count = 0;

        //creating variables again to count words
        FileReader file = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(file);

        while((line = br.readLine()) != null) {
            //Splits each line into words
            String words[] = line.split(" ");
            //Counts each word
            count = count + words.length;
        }


        // Display results
        System.out.println("File " + sourceFile.getName() + " has:");
        System.out.println(characters + " characters");
        System.out.println(count + " words");
        System.out.println(lines + " lines");


    }
}

