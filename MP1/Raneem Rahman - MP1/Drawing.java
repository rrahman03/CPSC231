public class Drawing {
    // creates the canvas with width and height
    // it returns a 2D char array
    public static char[][] createCanvas(int width, int height) {
        // 2D char array
        char [][] canvas = new char[height][width];

         
        // filling in the canvas 
        for (int row = 0; row < height; row ++){
            for (int col = 0; col < width; col++) {
                // checks for corners
                if ((row == 0 || row == height - 1) && (col == 0 || col == width - 1)) {
                    canvas[row][col] = '+';
                //checks for first  and last rows borders
                }else if (row == 0 || row == height-1){
                    canvas[row][col] = '=';
                    //checks for first and last columns
                } else if (col == 0 || col==width - 1){
                    canvas[row][col] = '|';
                }else {  // all other cells should contain ' ' space
                    canvas[row][col] = ' '; 
                }
            }
        }
        return canvas;

    }

    // adds a charachter to the canvas when specified

    public static void addCharacter(char[][] canvas, char emoji, int x, int y) {
        
        canvas[y][x] = emoji;
        
        // TODO: Implement this method according to the brief

    }

    /* 
        This method prints out your Canvas by iterating through
        each outer array as a single line, and each position in the outer array
        as a cell on that line.

        It also adds axis labels for you to the output, so you can verify
        that your characters are being added appropriately.

        DO NOT MODIFY THIS METHOD
    */
    public static void printCanvas(char[][] canvas) {
        System.out.println();
        System.out.println();
        for (int i = 0; i < canvas.length; ++i) {
            System.out.print((canvas.length - i - 1) + " ");
            
            for (int col = 0; col < canvas[i].length; ++ col) {
                System.out.print(canvas[i][col]);
                System.out.print(' ');
            }
            System.out.println();
        }
        System.out.print(" ");
        for (int i = 0; i < canvas[0].length; ++i) {
            System.out.print(" " + i);
        }
        System.out.println();
        System.out.println();
        System.out.println();

    }

    //program starts execution
    public static void main(String[] args) {

        
        char[][] canvas = (createCanvas(10,10));
        addCharacter(canvas, '*', 6,3);
        addCharacter(canvas, '*',6,5);
        addCharacter(canvas, '<',5,4);
        addCharacter(canvas, '3',6,4);
        printCanvas (canvas);
       
    }
}


