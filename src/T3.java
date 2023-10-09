public class T3 extends Thread {
    private final int[][] MR = new int[Data.N][Data.N];
    private final int[][] MS = new int[Data.N][Data.N];
    private final int[] P = new int[Data.N];
    @Override
    public void run() {
        System.out.println("T3 started working");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("T3: data entry");
        Data.fillMatrix(MR);
        Data.fillMatrix(MS);
        Data.fillVector(P);
// Друк вхідних даних
        System.out.println("MR:");
        Data.printMatrix(MR);
        System.out.println("MS:");
        Data.printMatrix(MS);
        System.out.println("P:");
        Data.printVector(P);
// Обчислення F3
        int[] O = Data.multiplyMatrixAndVector(
                Data.multiplyMatrix(MR, MS), P
        );

        System.out.println("F3 result:");
        Data.printVector(O);
    }
}