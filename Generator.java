import java.util.Random;
import java.util.Arrays;

public class Generator { // GEN
    public static int[][] generate(int no) {
        int[][] template = {{0, 0, 0, 0, 0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0, 0, 0, 0, 0}};
                           
        int[][] a = new int[9][9];
        int[][] b = new int[9][9];
        copy_arr(template, a);
        addval(a, no);
        
        isValid_sud isValid = new isValid_sud();
        
        while (true) {
            if (isValid.valid_board(a)) {
                break;
            }else{
                copy_arr(template, a);
                addval(a, no);
            }
        }
        
        return a;
    }
    public static void addval(int[][] a, int no) {
        Random rand = new Random();
        Boolean apply = false;
        int delay = 0;
        int uses = no;
        while (uses>0) {
            delay = rand.nextInt(6) + 3;
            apply = false;
            
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[1].length; j++) {
                    if (delay != 0) {
                        delay -= 1;
                    }else{
                        if (a[i][j] == 0) {
                            apply = rand.nextBoolean();
                            if (apply && uses>0) {
                                a[i][j] = rand.nextInt(9) + 1;
                                delay = rand.nextInt(6) + 2;
                                uses -= 1;
                            }
                        }
                    }
                }
            }
        }
    }
    public static void copy_arr(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[1].length; j++) {
                b[i][j] = a[i][j];
            }
        }
    }
}