package question2;
import java.io.*;
import java.util.Date;

public class q2 {
    public static void main(String[] args){

        //date variable
        Date dateCreated = new Date();
        //file from command line
        File f = new File(args[0]);

        // create the destination file object
        File dest = new File(args[0] + " " + dateCreated);

        //checking if file exists
        if(f.exists()){
            // check if the file can be renamed
            // to the abstract path name
            if (f.renameTo(dest)) {

                // display that the file is renamed
                System.out.println("Success. New file is: " + dest);


            }
            else {
                // display that the file cannot be renamed
                System.out.println("File cannot be renamed");
            }
        }
        else{
            System.out.println("File does not exist");
        }
        }

}
