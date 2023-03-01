import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[][] arr = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    continue;
                } else if (arr[i][j] != arr[j][i]) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");
    }
}

// Symmetric matrix
// Given the number n, not exceeding 10, and a matrix of size n × n.

// Check whether this matrix is symmetric in relation to the main diagonal. Output the word “YES”, if it is symmetric and the word “NO” otherwise.

// Keep in mind that the main diagonal runs from the top left corner to the bottom right corner.


// Sample Input:
// 3
// 0 1 2
// 1 2 3
// 2 3 4

// Sample Output:
// YES
