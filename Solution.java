import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        int[][] matrix = {
    {  1,  2,  3,  4 },
    {  5,  6,  7,  8 },
    {  9, 10, 11, 12 },
    { 13, 14, 15, 16 },
    { 17, 18, 19, 20 },
    { 21, 22, 23, 24 }
};

        ArrayList<Integer> list = new ArrayList<>();
        int rowStart = 0, rowEnd = matrix.length;
        int colStart = 0, colEnd = matrix[0].length;

        while (rowStart < rowEnd && colStart < colEnd) {
            for (int i = colStart; i < colEnd; i++) {
                list.add(matrix[rowStart][i]);
            }
            rowStart++;

            for (int i = rowStart; i < rowEnd; i++) {
                list.add(matrix[i][colEnd - 1]);
            }
            colEnd--;
            if (rowStart < rowEnd) {
                for (int i = colEnd - 1; i >= colStart; i--) {
                    list.add(matrix[rowEnd - 1][i]);
                }
                rowEnd--;
            }
            if (colStart > colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    list.add(matrix[i][colStart]);
                }
                colStart++;
            }

        }
        System.out.println(list);
        // return list;
    }
}