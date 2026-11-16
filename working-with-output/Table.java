public class Table {
    
    public static void main(String[] args) {
        int[][] table = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9} };

         

        for (int i = 0; i < table.length; i++) {
            int sum = 0;   
            for (int j = 0; j < table[i].length; j++) {
                sum += table[i][j];
            }

            System.out.println("Sum of row " + i + ": " + sum);
        }
    }
}