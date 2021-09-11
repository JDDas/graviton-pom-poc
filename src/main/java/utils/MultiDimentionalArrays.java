package utils;

public class MultiDimentionalArrays {
    public static void main(String[] args) {

        //A multidimensional array is an array of arrays. Each element of a multidimensional array is an array itself. For example,
        //
        //int[][] a = new int[3][4];
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
        System.out.println(x);


        int[][] arr = new int[10][20];
        arr[0][0] = 1;

        System.out.println("arr[0][0] = " + arr[0][0]);

        // create a 2d array
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7},
        };

        // calculate the length of each row
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);
    }
    }

