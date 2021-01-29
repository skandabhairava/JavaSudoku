import java.util.Scanner;

public class front
{
    static Scanner sc = new Scanner(System.in);
    public static void main() {
        int c = Integer.parseInt("00");
        System.out.println(c);
    }
    public static void printboard(int[][] a, int sizee)
    {
        String num = "";
        for(int i=0;i<sizee;i++)
        {
            for(int j=0;j<sizee;j++)
            {
                if (a[i][j] == 0){
                    num = "•";
                }else{
                    num = a[i][j] + "";
                }
                System.out.print(((j==2 || j == 5)?(num+" | "):(num+" ")));
            }
            System.out.println((i==2 || i == 5)?("\n---------------------"):(""));
        }
    }
    public static void print(String s){
        System.out.println(s);
    }
    public static int choice(String prompt) {
        System.out.println(prompt);
        int ch = sc.nextInt();
        return ch;
    }
    public static String choicestr(String prompt) {
        System.out.println(prompt);
        String ch = sc.next();
        return ch;
    }
    public static void printboard(String[][] a, int sizee)
    {
        for(int i=0;i<sizee;i++)
        {
            for(int j=0;j<sizee;j++)
            {
                System.out.print(((j==2 || j == 5)?(a[i][j]+" | "):(a[i][j]+" ")));
            }
            System.out.println((i==2 || i == 5)?("\n------------------------------"):(""));
        }
    }
}
