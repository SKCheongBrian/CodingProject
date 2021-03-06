//hi jia yi
public class Sudoku
{
    public static boolean usedInRow(int[][] grid, int row, int num)
    {
        for (int col = 0; col < 9; col++)
        {
            if (grid[row][col] == num)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean usedInCol(int[][] grid, int col, int num)
    {
        for (int row = 0; row < 9; row++)
        {
            if (grid[row][col] == num)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean usedInBox(int[][] grid, int row, int col, int num)
    {
        int boxRow = row - (row % 3);
        int boxCol = col - (col % 3);
        for (int r = boxRow; r < boxRow + 3; r++)
        {
            for (int c = boxCol; c < boxCol + 3; c++)
            {
                if (grid[r][c] == num)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isSafe(int[][] grid, int row, int col, int num)
    {
        if (!usedInRow(grid, row, num) && !usedInCol(grid, col, num) &&
        !usedInBox(grid, row, col, num))
        {
            return true;
        }
        return false;
    }

    public static boolean solve(int[][] grid)
    {
        int row = -1;
        int col = -1;
        boolean done = true;
        for (int r = 0; r < 9; r++)
        {
            for (int c = 0; c < 9; c++)
            {
                if (grid[r][c] == 0)
                {
                    row = r;
                    col = c;
                    done = false;
                    break;
                }
            }
        }

        if (done)
        {
            return true;
        }
        for (int num = 1; num <= 9; num++)
        {
            if (isSafe(grid, row, col, num))
            {
                grid[row][col] = num;
                if (solve(grid))
                {
                    return true;
                }
                else
                {
                    grid[row][col] = 0;
                }
            }
        }
        return false;
    }

    public static void printGrid(int[][] grid) 
    {
        for (int row = 0; row < 9; row++)
        {
            for (int col = 0; col < 9; col++)
            {
                System.out.print(grid[row][col]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args)
    {
        int[][] grid = new int[][]
        {
            {9, 0, 0, 0, 0, 0, 0, 6, 0}, 
            {0, 0, 0, 0, 8, 0, 1, 9, 0}, 
            {0, 0, 7, 0, 1, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 6, 0, 7, 3}, 
            {0, 0, 0, 3, 0, 9, 0, 0, 0}, 
            {3, 4, 5, 0, 0, 0, 0, 0, 0}, 
            {4, 0, 0, 0, 0, 2, 6, 8, 0}, 
            {0, 0, 2, 5, 0, 0, 0, 0, 0}, 
            {0, 3, 0, 7, 0, 0, 0, 0, 0}, 
        };
        if (solve(grid))
        {
            printGrid(grid);
        }
        else
        {
            System.out.println("There is no solution!");
        }
    }
}
