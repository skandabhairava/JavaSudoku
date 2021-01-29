
public class solver_view
{
    static Suduko s = new Suduko();
    static writerr write = new writerr();
    static isValid_sud isValid = new isValid_sud();
    static front f = new front();
    static main m = new main();
    static reader read = new reader();
    public static void main() {
        int[][] board = new int[9][9];
        int[][] board2 = new int[9][9];
        int[][] template = {{0, 0, 0, 0, 0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0, 0, 0, 0, 0}};
                           
        String[][] templatenos = {{"00", "01", "02", "03", "04", "05", "06", "07", "08"},
                            {"10", "11", "12", "13", "14", "15", "16", "17", "18"},
                            {"20", "21", "22", "23", "24", "25", "26", "27", "28"},
                            {"30", "31", "32", "33", "34", "35", "36", "37", "38"},
                            {"40", "41", "42", "43", "44", "45", "46", "47", "48"},
                            {"50", "51", "52", "53", "54", "55", "56", "57", "58"},
                            {"60", "61", "62", "63", "64", "65", "66", "67", "68"},
                            {"70", "71", "72", "73", "74", "75", "76", "77", "78"},
                            {"80", "81", "82", "83", "84", "85", "86", "87", "88"}};
        
        copy_arr(template, board);
        paint(board, board2, template, templatenos, "");

    }
    public static void copy_arr(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[1].length; j++) {
                b[i][j] = a[i][j];
            }
        }
    }
    public static void loadup(int[][] board) {
        try {
            read.main();
            board = read.sendboard();
            submit(board);
        }catch(Exception e){
            f.print("There is no sudoku.txt file in the directory");
        }
        
    }
        public static void paint(int[][] board, int[][] board2, int[][] og, String[][] template, String message) {
            System.out.print('\u000C');    
            String display = "";
            String ch = "";
            int c = 0;
            int row = 0;
            int col = 0;
            int size = board.length;
            f.print("            SUDOKU BOARD\n____________________________________");
            f.print("");
            f.print(message);
            f.print("");
            f.printboard(board, size);
            f.print("");
            f.print("");
            f.printboard(template, size);
            f.print("");
            f.print("");
            while(true) {
                ch = f.choicestr("Update Field ? \nType 111 for restart, 222 to go back to main screen, 333 to solve the saved sudoku, 444 to save the sudoku and 123 to finish the sudoku");
                if (ch.length() > 1) {
                    c = Integer.parseInt(ch);
                    if (c == 111) {
                        copy_arr(og, board);
                        paint(board, board2, og, template, "");
                    }else if (c == 123) {
                        submit(board);
                    }else if (c == 222) {
                        m.main();
                    }else if (c<=88 && c>=0) {
                        break;
                    }else if (c == 333) {
                        loadup(board);
                    }
                    else if (c == 444) {
                        write.ent_val(board);
                        write.write();
                        System.out.print('\u000C');
                        f.print("");
                        f.print("Board saved");
                        f.print("");
                        m.main_screen();
                    }
                }
                
            }
            row = (ch.charAt(0) -'0');
            col = (ch.charAt(1) -'0');
            while (true) {
                c = f.choice("New Value ?");
                if (c > 9 || c < 1) {
                    continue;
                }else{
                    copy_arr(board, board2); //backup on board2
                    board[row][col] = c;
                    if (isValid.valid_board(board)) {
                        paint(board, board2, og, template, "");
                    }else{
                        copy_arr(board2, board); //reverting back
                        paint(board, board2, og, template, "Invalid value or Wrong choice!!");
                    }
                    
                }
            }
            
            
        }
        public static void submit(int[][] board) {
            s.solveSuduko(board, 0, 0);
            System.out.print('\u000C');    
            int size = board.length;
            f.print("            SOLVED SUDOKU BOARD\n____________________________________");
            f.print("");
            f.print("");
            f.printboard(board, size);
            f.print("");
            f.print("");
            m.main_screen();
        }
}
