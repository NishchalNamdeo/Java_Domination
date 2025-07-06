package Stringbuilder;

//matrix / 2D Array

//Ques 1. -> Transpose Matrix
//public class level1 {
//    public int[][] transpose(int[][] matrix){
//        int m = matrix.length;
//        int n = matrix[0].length;
//
//        int ans[][] = new int [n][m];
//        for (int i = 0; i <n ; i++) {
//            for (int j = 0; j <m ; j++) {
//                ans[i][j] = matrix[j][i];
//            }
//        }
//        return ans;
//    }
//}


import java.util.HashSet;
import java.util.Set;

//Ques 2. -> Valid Sudoku
//public class level1{
//        public boolean rowCheck(char[] row){
//            Set<Character> set = new HashSet<>();
//            for (int i = 0; i < row.length; i++) {
//                if(row[i] != '.'){
//                    if(set.contains(row[i]))
//                        return false;
//                    set.add(row[i]);
//                }
//            }
//            return true;
//        }
//        public boolean columnCheck(char[][] board, int j){
//            Set<Character> set = new HashSet<>();
//            for (int i = 0; i < board.length; i++) {
//                if(board[i][j] != '.'){
//                    if(set.contains(board[i][j]))
//                        return false;
//                    else
//                        set.add(board[i][j]);
//                }
//            }
//            return true;
//        }
//        public boolean subSudukoCheck(char[][] board, int i, int j){
//            Set<Character> set = new HashSet<>();
//            for (int k = i; k < i+3; k++) {
//                for (int l = j; l < j + 3 ; l++) {
//                  if(board[k][l] != '.'){
//                      if(set.contains(board[k][l]))
//                          return false;
//                      else
//                          set.add(board[k][l]);
//                  }
//                }
//            }
//            return true;
//        }
//        public boolean isValidSudoku(char[][] board){
//            for (int i = 0; i <board.length; i++) {
//                if(!rowCheck(board[i]))
//                    return false;
//                if(!columnCheck(board, i))
//                    return false;
//            }
//            for (int i = 0; i <board.length ; i += 3) {
//                for (int j = 0; j <board[i].length ; j +=3) {
//                    if(!subSudukoCheck(board, i, j))
//                        return false;
//                }
//            }
//            return  true;
//        }
//}


//Ques 3. ->Rotate Image
//public class level1{
//    public void rotate(int[][] matrix){
//        int m = matrix.length;
//        int n = matrix[0].length;
//        int ans[][] = new int [n][m];
//        for (int i = 0; i <m ; i++) {
//            for (int j = 0; j < n; j++) {
//                ans[j][m-1-i] = matrix[j][i];
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            matrix[i] = ans[i];
//        }
//    }
//}


//ques 4. -> Search a 2D Matrix
//public class level1{
//    public int probableRow(int[][] matrix, int target){
//        int start = 0, end = matrix.length -1;
//        while (start <= end){
//            int mid = (start+end)/2;
//            if(target >= matrix[mid][0] && target <= matrix[mid][matrix[0].length-1])
//                return mid;
//            else if(target > matrix[mid][0])
//                start = mid +1;
//            else
//                end = mid -1;
//        }
//        return -1;
//    }
//    public boolean bs(int arr[], int target){
//        int start = 0, end = arr.length-1;
//        while (start<= end){
//            int mid = (start+end)/2;
//            if(target == arr[mid])
//                return true;
//            else if(target>arr[mid])
//                start = mid + 1;
//            else
//                end = mid -1;
//        }
//        return false;
//    }
//    public boolean searchMatrix(int[][] matrix, int target){
//        int row = probableRow(matrix, target);
//            if(row == -1) return false;
//            return bs(matrix[row],target);
//    }
//}


