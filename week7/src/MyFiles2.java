import java.io.File;

import static java.lang.System.out;

public class MyFiles2 {

    public static void main(String[] args) {

       File dir =new File("NewFolder");

       if(dir.exists()){
//           we're going to be happy!
//           this is where we are going to call out our array

        String[] files =dir.list();
//        a new key word, named assert
           assert files != null;
           out.println(files.length + " files found");
//           length means count of files
//           we would like to see files!! with a for loop
           for(int i = 0; i < files.length; i++) {

               out.println(files[i]);
           }

       } else {
//     we're going to be sad!
           out.println("Directory does not exists");
       }

        out.println();
    }

}
