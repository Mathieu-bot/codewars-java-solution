import java.util.Arrays;
​
public class Solution {
​
    public static int isSolved(int[][] board) {
        for (int[] row : board) {
            if (row[0] != 0 && Arrays.stream(row).distinct().count() == 1)
                return row[0];
        }
​
        for (int i = 0; i < 3; i++) {
            int a = board[0][i], b = board[1][i], c = board[2][i];
            if (a != 0 && a == b && b == c)
                return a;
        }
​
        if (board[0][0] != 0 && board[0][0] == board[1][1] && board[1][1] == board[2][2])
            return board[0][0];
        if (board[0][2] != 0 && board[0][2] == board[1][1] && board[1][1] == board[2][0])
            return board[0][2];
​
        boolean hasEmpty = Arrays.stream(board)
                                 .flatMapToInt(Arrays::stream)
                                 .anyMatch(cell -> cell == 0);
​
        return hasEmpty ? -1 : 0;
    }
}
​