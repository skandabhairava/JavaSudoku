import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class datapack_loader
{
    //static String mod = "";
    static int easy_num = 0;
    static int mid_num = 0;
    static int high_num = 0;
    static int mid_tries = 0;
    
    public static void main() throws FileNotFoundException {
        File file = new File(".datapack \\datapack .txt");
        Scanner scan = new Scanner(file);
        String curr_line = "";
        while(scan.hasNextLine()){
            curr_line = scan.nextLine();
            if (curr_line.equals("---")) {
                break;
            }
            if (curr_line.contains("easy_num")) {
                easy_num = Integer.parseInt(curr_line.substring(11));
                if (easy_num >= 81 || easy_num < 0) {
                    easy_num = 0;
                }
                //System.out.print(easy_num);
            }
            if (curr_line.contains("mid_num")) {
                mid_num = Integer.parseInt(curr_line.substring(10));
                if (mid_num >= 81 || mid_num < 0) {
                    mid_num = 0;
                }
            }
            if (curr_line.contains("high_num")) {
                high_num = Integer.parseInt(curr_line.substring(11));
                if (high_num >= 81 || high_num < 0) {
                    high_num = 0;
                }
            }
            if (curr_line.contains("mid_tries")) {
                mid_tries = Integer.parseInt(curr_line.substring(12));
                if (mid_tries < -1) {
                    mid_tries = -1;
                }
            }
            //mod = mod + curr_line + "\n";
        }
        
        //System.out.println(easy_num + " " + mid_num + " " + high_num + " " + mid_tries);
        //System.out.println(mod);
    }
    public static int val(int ch) {
        switch (ch) {
            case 0:
                return easy_num;
            case 1:
                return mid_num;
            case 2:
                return high_num;
            case 3:
                return mid_tries;
            default:
                return 0;
        }
    }
}
