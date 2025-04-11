import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Readfile {
    public void read() {
        try {
            File f = new File("done.txt");
            Scanner sc = new Scanner(f);

            // Read the entire file line by line
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close(); // Close scanner after reading all lines
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

class Writefile {
    public void write() {
        File file = new File("done.txt");
        try {
            file.createNewFile(); 
            FileWriter f = new FileWriter("done.txt", true);
            f.write("write something\n");  
            f.write("Mara kawya\n");      
            f.close();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

public class Filee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Writefile f = new Writefile();
        f.write();

        Readfile r = new Readfile();
        r.read();

        sc.close();
    }
}
