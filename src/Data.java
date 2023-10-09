import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class Data {
    public static int N = 8;
    public static int MIN = 1;
    public static int MAX = 10;

    public static int getRandomNumber(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }
    public static void fillVector(int[] A) {
        Arrays.fill(A, getRandomNumber(MIN, MAX));
    }
    public static void fillMatrix(int[][] MA) {
        for (int[] ints : MA) {
            Arrays.fill(ints, getRandomNumber(MIN, MAX));
        }
    }
    public static int getMinMatrix(int[][]matrix){
        int min = matrix[0][0];
        for (int[]row:matrix){
            for (int digit:row){
                if (digit < min){
                    min = digit;
                }
            }
        }
        return min;
    }
    public static int[][] multiplyMatrix(int[][] MA, int[][] MB) {
        int[][] MX = new int[N][N];
        for (int i = 0; i < N; i++) {
            int x = 0;
            for (int j = 0; j < N; j++) {
                MX[i][x] = 0;
                for (int k = 0; k < N; k++) {
                    MX[i][x] += MA[i][k] * MB[k][j];
                }
                x++;
            }
        }
        return MX;
    }
    public static int[] multiplyMatrixAndVector(int[][] MA, int[] A) {
        int[] B = new int[N];
        int index = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                B[index++] += MA[i][j] * A[i];
            }
            index = 0;
        }
        return B;
    }
    public static int[] multiplyVectorAndVector(int[] v1, int[] v2){
        int[] result = new int[v1.length];
        for (int i = 0; i < v1.length; i++ ){
            result[i] = v1[i]*v2[i];
        }
        return result;
    }
    public static int[] sortMatrix(int[] m) {
        Arrays.sort(m);
        return m;
    }
    public static void printVector(int[] A) {
        String result = Arrays.stream(A).mapToObj(String::valueOf).collect(Collectors.joining(" "));
        System.out.println(result);
    }
    public static void printMatrix(int[][] A) {
        for (int i = 0; i < N; i++) {
            String result = Arrays.stream(A[i]).mapToObj(String::valueOf).collect(Collectors.joining(" "));
            System.out.println(result);
        }
    }
}
