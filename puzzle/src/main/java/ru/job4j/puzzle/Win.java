package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int index = 0; index < board.length; index++) {
            if (whenVerticalWin(board,index) || whenHorizontalWin(board,index)) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static boolean whenVerticalWin(int[][] arr,int res) {
        boolean result = true;
        for (int i = 0; i < arr.length; i++) {
                if (arr[res][i]!= 1){
                    result = false;
                    break;
                }

        }
        return  result;
    }
    public static boolean whenHorizontalWin(int[][] arr,int res) {
        boolean result = true;
        for (int i = 0; i < arr.length; i++) {
                if (arr[i][res]!= 1){
                    result = false;
                    break;
                }

        }
        return  result;
    }
}
