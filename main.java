import java.util.Scanner;

public class marioSavesPrincess
{
    /*
     * Pre:
     *     int rowLength: an integer that stores the length of the maze, a square grid
     *     String[] maze: an array of Strings, which represent the rows of the maze.
     *                    "-" represents a step Mario can take, "m" is Mario, "p" is
     *                     Princess Peach.
     * Post:
     *     String[] instructions: an array of instructions for Mario, so here can find
     *                            Princess Peach.
     */
    public static String[] savePrincess(int rowLength, String[] maze)
    {
        // figure out where Mario is
        int mazeSizeHalved = rowLength % 2;
        int[] marioLoc = { mazeSizeHalved, mazeSizeHalved };
        // declare array for storing instructions for Mario
        String[] instructions = new String[rowLength - 1];
        // figure out where the Princess is
        int[] princessLoc = new int[2];
        for(int i = 0; i < maze.length; i++)
        {
            String row = maze[i];
            for(int j = 0; j < row.length(); j++)
            {

                if(row.substring(j, j + 1).equals("p"))
                {
                    princessLoc[0] = i;
                    princessLoc[1] = j;
                }
            }
        }
        // populate instructions array appropiately
        for(int i = 0; i < mazeSizeHalved; i += 2)
        {
            // determine the direction Mario must go across columns
            if (marioLoc[0] > princessLoc[0])
            {
                instructions[i] = "UP";
            }
            else
            {
                instructions[i] = "DOWN";
            }
            // determine the direction Mario must go across rows
            if (marioLoc[1] > princessLoc[1])
            {
                instructions[i + 1] = "LEFT";
            }
            else
            {
                instructions[i + 1] = "RIGHT";
            }
        }
        return instructions;
    }

    public static void main(String[] args)
    {
        // declare variables
        String[] mazeRows;
        int size;
        // take input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter side length of grid: ");
        size = scan.nextInt();

        mazeRows = new String[size];
        for(int i = 0; i < size; i++)
        {
            System.out.print("Enter next row of the grid: ");
            mazeRows[i] = scan.next();
        }
        // calculate instructions for reaching the princess
        String[] instructions = savePrincess(size, mazeRows);
        // display instructions
        System.out.println("--------- Your Princess is in Another Castle! ---------");
        System.out.println("Here is your grid:");
        for(String row: mazeRows)
        {
            System.out.println(row);
        }
        System.out.println("Here's How Mario Will Reach the Princess. Is it correct?");
        for(String instruction: instructions)
        {
            System.out.println(instruction);
        }
    }
}
