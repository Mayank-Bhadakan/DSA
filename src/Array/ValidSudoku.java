package Array;

import java.util.HashSet;
import java.util.Scanner;

public class ValidSudoku {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        boolean valid = true;

        // check this input sodoku is valid or not;
        // check every row, column and box 3x3 if any number repetition then return false otherwise true
        // create set database then initialize set data
        // check every row, column and box
        // add value in that row column and box
        // find box index use this formula = (i/3) * 3 + (j/3)

        // set database here normal create set whoes length is 9
        HashSet<Character>[] row = new HashSet[9];
        HashSet<Character>[] col = new HashSet[9];
        HashSet<Character>[] box = new HashSet[9];

        //initialize data that means initialize every has own empty value in set
        for (int i=0; i<9; i++){
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        // check if the number it repetition or not if yes then false otherwise add the number and in last return true
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){

                char num = board[i][j];
                if(num == '.') continue;

                int boxIndex = (i/3)*3 + (j/3);

                if(row[i].contains(num) || col[j].contains(num) || box[boxIndex].contains(num)){
                    valid = false;
                    break;
                }

                row[i].add(num);
                col[j].add(num);
                box[boxIndex].add(num);
            }
        }

        System.out.println("This sudoku validition is " + valid);

    }
}
