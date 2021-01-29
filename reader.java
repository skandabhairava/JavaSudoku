import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class reader
{
    static int[][] board = new int[9][9];
    public static void main() throws FileNotFoundException {
        File file = new File("saved.txt");
        Scanner scan = new Scanner(file);
        String curr_line = "";
        String[] splited = {};
        int i = 0;
        while(scan.hasNextLine()){
            curr_line = scan.nextLine();
            board[i] = Arrays.stream(curr_line.split(" ")).mapToInt(Integer::parseInt).toArray();
            i++;
        }
    }
    public static int[][] sendboard() {
        return board;
    }
}
