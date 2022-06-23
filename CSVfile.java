package BankAccountProject;

//-------- Project by Akashay Anand ------------------

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
// import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSVfile {

    public static List<String[]> read(String file) {
        List<String[]> data = new LinkedList<String[]>();
        String dataRow;
        try {
            BufferedReader br =  new BufferedReader(new FileReader(file));  // [Note-1]
            while ((dataRow = br.readLine()) != null){
                String[] dataRecords = dataRow.split(",");
                data.add(dataRecords);
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Could Not Find File");
            ex.printStackTrace();
        } catch (IOException ex){
            System.out.println("Could Not Read File");
            ex.printStackTrace();
        }
        return data;
    }
    // public static List<String[]> write(String file){



    //     return 0;
    // }
}

/*
 * [Note-1]: BufferedReader class is meant to just read String or text data while the Scanner class is meant to both read and parse text data into Java primitive types like int, short, float, double, long, and along with that String as well.
 * Another difference is Scanner is newer than BufferedReader, only introduced in Java 5, while BufferedReader is present in Java from JDK 1.1 version. This means, you have access to BufferedReader in almost all JDK versions mainly Java 1.4 but Scanner is only available after Java 5.
 * BuffredReader has a significantly large 'buffer (8KB)' than Scanner (1KB), which means if you are reading long String from a file, you should use BufferedReader but for short input and input other than String, you can use Scanner class
 * Another major difference between BufferedReader and Scanner class is that BufferedReader is synchronized while Scanner is not. This means, you cannot share Scanner between multiple threads but you can share the BufferedReader object
 * This synchronization also makes BufferedReader a little bit slower in the single-thread environment as compared to Scanner, but the speed difference is compensated by Scanner's use of 'regex', which eventually makes BufferedReader faster for reading String
 * 
 * Though both BufferedReader and Scanner can be used to read a file, Scanner is usually used to read user input and BufferedReader is commonly used to read a file line by line in Java.
 * One reason for this is Scanner's ability to read String, int, float, or any other data type and BufferedReader's larger buffer size which can hold big lines from a file in memory.
 */

 
/*
 * Buffer memory: 
 * 
 * regex:  
 * 
 *  BufferedReader is synchronized..? meaning..?
 * 
 */