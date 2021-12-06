public class SubrectangleQueries {
    public SubrectangleQueries(int[][] rectangle) {

    }
    public static void main(String[] args) {

        System.out.println(getValue(1,1));
        System.out.println();
        updateSubrectangle(1,1,2,2,25);
    }
    public static void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        int[][] subrectangleQueries = {{1,2,5},{5,5,6},{5,8,9}};
        for (int i = row1; i <= row2 ; i++) {
            for (int j = col1; j <= col2 ; j++) {
                subrectangleQueries[i][j] = newValue;
            }
        }
        printArr(subrectangleQueries);
    }

    public static int getValue(int row, int col) {
        int[][] subrectangleQueries = {{1,2,5},{5,5,6},{5,8,9}};
        int value = subrectangleQueries [row][col];
        return value;
    }
    public static void printArr(int[][] arr) {//Метод для удобочитаемого вида вывода двумерного массива
        for (int[] ints : arr) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + "  ");
            }
            System.out.println();
        }
    }
}

