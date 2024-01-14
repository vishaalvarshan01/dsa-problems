package Basics;

import java.util.ArrayList;
import java.util.Arrays;

public class MazeProblem {

    public static int countTheNumberOfWays(int x, int y) {
        if (x == 1 || y == 1) {
            return 1;
        }
        int count = 0;

        count = countTheNumberOfWays(x - 1, y) + countTheNumberOfWays(x, y - 1);

        return count;
    }

    public static void printThePath(String p, int x, int y) {
        if (x == 1 && y == 1) {
            System.out.println(p);
            return;
        }
        if (x > 1)
            printThePath(p + "D", x - 1, y);
        if (y > 1)
            printThePath(p + "R", x, y - 1);
    }

    public static ArrayList<String> listOfPaths(String p, int x, int y) {
        if (x == 1 && y == 1) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        ArrayList<String> list = new ArrayList<>();

        if (x > 1)
            list.addAll(listOfPaths(p + "D", x - 1, y));
        if (y > 1)
            list.addAll(listOfPaths(p + "R", x, y - 1));

        return list;
    }

    public static ArrayList<String> diagonalIncluded(String p, int x, int y) {
        if (x == 1 && y == 1) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        ArrayList<String> list = new ArrayList<>();

        if (x > 1 && y > 1)
            list.addAll(diagonalIncluded(p + "D", x - 1, y - 1));
        if (x > 1)
            list.addAll(diagonalIncluded(p + "V", x - 1, y));
        if (y > 1)
            list.addAll(diagonalIncluded(p + "H", x, y - 1));

        return list;
    }

    public static void pathRestrictions(String p, boolean[][] maze, int x, int y) {
        if (x == maze.length - 1 && y == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[x][y])
            return;

        if (x < maze.length - 1)
            pathRestrictions(p + "D", maze, x + 1, y);
        if (y < maze[0].length - 1)
            pathRestrictions(p + "R", maze, x, y + 1);
    }

    public static void allPath(String p, boolean[][] maze, int x, int y) {
        if (x == maze.length - 1 && y == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[x][y])
            return;

        maze[x][y] = false;

        if (x < maze.length - 1) {
            allPath(p + "D", maze, x + 1, y);
        }

        if (y < maze[0].length - 1) {
            allPath(p + "R", maze, x, y + 1);
        }

        if (x > 0) {
            allPath(p + "U", maze, x - 1, y);
        }
        if (y > 0) {
            allPath(p + "L", maze, x, y - 1);
        }

        // this line is where the function is over , so
        // before it gets out of call stack undo the changes made
        maze[x][y] = true;
    }

    public static void allPathPrint(String p, boolean[][] maze, int x, int y, int[][] path, int step) {
        if (x == maze.length - 1 && y == maze[0].length - 1) {
            // System.out.println(p);
            path[x][y] = step;
            for (int i[] : path) {
                System.out.println(Arrays.toString(i));
            }
            System.out.println();
            return;
        }

        // restricted block , cannot be accesseds
        if (!maze[x][y])
            return;

        // once the element has been travelled, set it to false
        maze[x][y] = false;
        
        path[x][y] = step;

        if (x < maze.length - 1) {
            allPathPrint(p + "D", maze, x + 1, y, path, step + 1);
        }

        if (y < maze[0].length - 1) {
            allPathPrint(p + "R", maze, x, y + 1, path, step + 1);
        }

        if (x > 0) {
            allPathPrint(p + "U", maze, x - 1, y, path, step + 1);
        }
        if (y > 0) {
            allPathPrint(p + "L", maze, x, y - 1, path, step + 1);
        }

        // this line is where the function is over , so
        // before it gets out of call stack undo the changes made
        maze[x][y] = true;
        path[x][y] = 0;
    }

    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        // int ans = countTheNumberOfWays(x, y);
        // System.out.println(ans);

        // printThePath("", x, y);

        // ArrayList<String> ans = listOfPaths("", x, y);
        // System.out.println(ans);

        // ArrayList<String> ans = diagonalIncluded("", 3, 3);
        // System.out.println(ans);
        boolean[][] maze = {{ true, true, true },
                            { true, true, true },
                            { true, true, true }};

        int[][] mat = new int[maze.length][maze[0].length];

        // allPath("", maze, 0, 0);
        allPathPrint("", maze, x, y, mat, 1);
    }
}
