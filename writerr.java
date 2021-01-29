import java.io.FileWriter;
import java.io.IOException;

public class writerr
{
    static String fin = "";
    static int[][] board = new int[9][9];
    public static void ent_val(int[][] b){
        board = b;
    }
    public static void write() {
        try(FileWriter fileWriter =
        new FileWriter("saved.txt", false) ){
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (j == 8) {
                        fin = fin + String.valueOf(board[i][j]);
                        //System.out.print(String.valueOf(template[i][j]));
                    }else{
                        fin = fin + String.valueOf(board[i][j]) + " ";
                        //System.out.print(String.valueOf(template[i][j]) + " ");
                    }
                
                }
                fileWriter.write(fin + "\r\n");
                fin = "";
            }
            //fileWriter.write("data 1");
            //fileWriter.write("data 2");
            
        }catch(IOException e) {
            
        }
    }
}
