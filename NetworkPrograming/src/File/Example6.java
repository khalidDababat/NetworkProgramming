package File;

import java.io.File;

public class Example6 {

    public static void main(String[] args) {

        File f = null;
        String[] paths;

        try {

            // create new file
            f = new File("C:\\Users\\hp\\Desktop\\MyFiles");

            // array of files and directory
            paths = f.list(); 
            System.out.println(paths.length);

            // for each name in the path array
            for (String path : paths) {

                // prints filename and directory name
                System.out.println(path);
            }

        } catch (Exception e) {
            // if any error occurs
            e.printStackTrace();
        }

    }

}
