
public class main
{
    static front f = new front();
    static solver_view sol = new solver_view();
    static question_view que = new question_view();
    static Generator gen = new Generator();
    
    public static void main() {
        System.out.print('\u000C');
        main_screen();
    }
    public static void main_screen(){
            int board[][] = gen.generate(10);
            String display = "";
            int ch = 0;
            int c = 0;
            int row = 0;
            int col = 0;
            int size = board.length;
            f.print("            SUDOKU BOARD\n____________________________________");
            f.print("");
            f.print("");
            f.printboard(board, size);
            f.print("");
            f.print("");
            while (true) {
                ch = f.choice("Welcome to Sudoku Puzzler\n1.Solve Sudokus\n2.Ask Answers for a Sudoku\n3.Terminate program");
                if (ch == 1) {
                    que.main();
                }else if (ch == 2) {
                    sol.main();
                }else if (ch == 3) {
                    System.exit(1);
                }else{
                    f.print("");
                    f.print("Invalid input, retry");
                    f.print("");
                }
            }
            
            
    }
}
