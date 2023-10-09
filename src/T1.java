public class T1 extends Thread {
    private final int[][] MA = new int[Data.N][Data.N];
    private final int[][] ME = new int[Data.N][Data.N];
    private final int[] A = new int[Data.N];
    private final int[] B = new int[Data.N];
    @Override
    public void run() {
        System.out.println("T1 started working");
        System.out.println("T1: data entry");
        Data.fillMatrix(MA);
        Data.fillMatrix(ME);
        Data.fillVector(A);
        Data.fillVector(B);
// Друк вхідних даних
        System.out.println("MA:");
        Data.printMatrix(MA);
        System.out.println("ME:");
        Data.printMatrix(ME);
        System.out.println("A:");
        Data.printVector(A);
        System.out.println("B:");
        Data.printVector(B);
// Обчислення F1
        int[] e = Data.multiplyVectorAndVector(
                Data.multiplyMatrixAndVector(
                        Data.multiplyMatrix(MA, ME),
                        A),
                Data.sortMatrix(B)
        );

        System.out.println("F1 result:");
        Data.printVector(e);
    }
}