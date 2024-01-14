package Basics;

public class WordSearch {

    public static boolean solution(String p, boolean[][] maze, char[][] board, int x, int y, String word) {
        if (p.equals(word))
            return true;

        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || maze[x][y]
                || board[x][y] != word.charAt(p.length()))
            return false;

        maze[x][y] = true;

        boolean found = solution(p + board[x][y], maze, board, x + 1, y, word) ||
                solution(p + board[x][y], maze, board, x - 1, y, word) ||
                solution(p + board[x][y], maze, board, x, y + 1, word) ||
                solution(p + board[x][y], maze, board, x, y - 1, word);

        maze[x][y] = false;

        return found;
    }

    public static boolean exist(char[][] board, String word) {
        boolean ans = false;

        boolean[][] maze = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (solution("", maze, board, i, j, word)) {
                    ans = true;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
        String target = "ABCCED";

        boolean ans = exist(board, target);
        System.out.println("ans : " + ans);
    }
}
