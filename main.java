import java.util.Scanner;

public class marioSavesPrincess
{
    /*
     * Pre:
     *     int n: an integer that stores the length of the maze, a square grid
     *     String[] maze: an array of Strings, which represent the rows of the maze.
     *                    "-" represents a step Mario can take, "m" is Mario, "p" is
     *                     Princess Peach.
     * Post:
     *     String[] instructions: an array of instructions for Mario, so here can find
     *                            Princess Peach.
     */
    public static String[] savePrincess(int n, String[] maze)
    {
        String[] instructions = new String[n];
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
