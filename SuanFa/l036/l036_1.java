package SuanFa.l036;

import java.util.HashSet;

public class l036_1 {

    // 遍历三遍
    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0;i < 9;i++) {
            HashSet<Character> s = new HashSet<Character>();
            for (int j = 0;j < 9;j++) {
                if (board[i][j] != '.') {
                    if (s.contains(board[i][j])) {
                        return false;
                    }
                    else {
                        s.add(board[i][j]);
                    }
                }
            }
        }
        for (int j = 0;j < 9;j++) {
            HashSet<Character> s = new HashSet<Character>();
            for (int i = 0;i < 9;i++) {
                if (board[i][j] != '.') {
                    if (s.contains(board[i][j])) {
                        return false;
                    }
                    else {
                        s.add(board[i][j]);
                    }
                }
            }
        }
        for (int row = 0;row < 3;row++) {
            for (int col = 0;col < 3;col++) {
                HashSet<Character> s = new HashSet<Character>();
                for (int i = 3*row;i <= 3*row+2;i++) {
                    for (int j = 3*col;j <= 3*col+2;j++) {
                        if (board[i][j] != '.') {
                            if (s.contains(board[i][j])) {
                                return false;
                            }
                            else {
                                s.add(board[i][j]);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
    }
}
