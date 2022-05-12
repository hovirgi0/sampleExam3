public class Matrix {

    //private static int[][] matrix;

    public static void main(String[] args) {

        //indexesOfNullColumns(matrix);
       // indexesOfNullColumns();
        indexesOfNullColumns2();
        indexOfMaximum();
        //indexOfMaximum2();
    }
    /*public static void indexesOfNullColumns() {
       int array[][] = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int nullindex = 0;

        for (int row = 0; row < array.length; row++) {
                //System.out.print("Row " + row + ": ");
            if (array[row] == null) {
                nullindex = row;
                for (int col = 0; col < array[row].length; col++)
                    System.out.print("empty" + nullindex);
            }
            else {
                //  System.out.print(array[row][col] + " ");
                System.out.print(" ");
            }
            }
        System.out.println(nullindex);
        }*/

    //EZ JÓ!!
    public static void indexesOfNullColumns2() {
        int array[][] = {
                {0, 0, 3},
                {4, 5, 6}
        };
        int nulls = 0;
        int nullindex = array[0][0];

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++)
                if (array[row][col] == 0) {
                    nulls++;
                    if(nulls == array.length){
                        nullindex = col;
                    }
                        System.out.println("A null oszlopainak sorszámai: " + nullindex);
                    }
                }
        }

    //SOROK KIÍRÁSA
       /* for ( int row=0; row < array.length; row++ )
        {
            System.out.print("Row " + row + ": ");
            if ( array[row] == null )
                System.out.print( "empty" );
            else
            {
                for ( int col=0; col < array[row].length; col++ )
                    System.out.print( array[row][col] + " ");
            }

            System.out.println();
        }*/

    public static void indexOfMaximum() {
        int array[][] = {
                {1, 2, 3},
                {4, 5, 6}
        };

        //max érték kiír
        /*
        int maxindex = array[0][0];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++)
            if (maxindex < array[row][col]) {
                maxindex = array[row][col];
            }
        }
        System.out.println(maxindex);
    }
    */

    //max érték indexe kiír //EZ JÓ!!!!
    int max = array[0][0];
    int maxrow = 0; //maximum érték melyik sorban lesz
    int maxcolumn = 0; //maximum érték melyik oszlopbanban lesz
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++)
                if (array[row][col] > max) {
                    max = array[row][col];
                    maxrow = row;
                    maxcolumn = col;
            }
    }
        System.out.println("The max is: "+max+" at index ["+maxrow+"]["+maxcolumn+"]");
}

    /*public static void indexOfMaximum2() {
        int[][] arr = {{4, 44, 5, 7, 63, 1}, {7, 88, 31, 95, 9, 6}, {88, 99, 6, 5, 77, 4}};

        int max = arr[0][0]; //dunno why you made it double when you're dealing with integers
        int max_row = 0;
        int max_column = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    max_row = i;
                    max_column = j;

                }
            }
            System.out.println("The max is: " + max + " at index [" + max_row + "][" + max_column + "]");
        }
    }*/
}
