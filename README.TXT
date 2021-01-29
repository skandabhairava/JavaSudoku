INTRODUCTION


With our open sourced project we have decided to make a code for a sudoku game. We use multiple classes to create a program which generates a sudoku and gives the digits based on the difficulty you chose. It gives you 10 digits for easy difficulty , 6 for medium difficulty and 5 for hard difficulty. And gives you a certain number of tries based on the difficulty , these tries show when you get a digit wrong and doesn’t change it if so. In easy mode u get unlimited tries, in medium you get 5 and on hard mode you get none. Once you solve the sudoku it checks your solution and tells you that you have solved it. You can also easily modify the default values using a separate modification file(.datapack/datapack.txt). It also provides 4 Public APIs for other developers to use features from our program(for example make their own GUI, or another type of puzzle using our default generators). 


APIs

Class : isValid_sud() -> to check the validity of any sudoku board
public static Boolean valid_board(int [][] grid)

Class : Suduko() -> to solve a sudoku board
public static boolean solveSuduko(int grid[][], int row, int col) {call by ref}

Class : Generator() -> to generate a sudoku board
public static int[][] generate(int no_of_digits)

Class : datapack_loader() -> to read data from a data pack file
public static int val(int ch) {
        switch (ch) {
            case 0:
                return No_of_digits_Easy;
            case 1:
                return No_of_digits_Medium;
            case 2:
                return No_of_digits_Hard;
            case 3:
                return No_of_tries_in_Medium;
            default:
                return 0;
        }
    }
 
PROBLEM STATEMENT

We made a sudoku code to provide entertainment for people and give a unique and simple app for sudoku.



CODE
DOWNLOAD LINK



IDEAS FOR EXTENSION

Provide a better user interface for the sudoku code
More user friendly way to input numbers into the sudoku
More types of sudoku



REFERENCES


https://www.geeksforgeeks.org/sudoku-backtracking-7/

