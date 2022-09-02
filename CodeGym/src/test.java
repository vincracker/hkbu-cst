public class test {
    public static void main(String[] args) {
        int[][][] cells = new int[9][3][3];

        cells[0] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; //some weird syntax that is not taught in this course.
        cells[4] = new int[][]{{1, 0, 3}, {4, 5, 6}, {0, 8, 9}};
        cells[8] = new int[][]{{4, 0, 3}, {1, 5, 6}, {0, 8, 2}};

        int[][] array_2d = arrayTo2D(cells);

    }

    public static int[][] arrayTo2D(int [][][] array) {
        //TODO
        int[][] array_2d = new int[9][9];

        for (int row = 0; row < 9; row+=3){
            for (int i = 0+row; i < 3+row;i++){
                for (int j = 0; j< 3;j++){
                    for (int  k = 0; k < 3;k++){
                        array_2d[i][k+3*j] = array[i][j][k];
                        System.out.println(i+" "+j+" "+ k);
                    }
                }
            }
        }
        return array_2d;
    }


}
