public class T2 extends Thread {
    private final int[][] MG = new int[Data.N][Data.N];
    private final int[][] ML = new int[Data.N][Data.N];
    @Override
    public void run() {
        System.out.println("T2 started working");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("T2: data entry");
        Data.fillMatrix(MG);
        Data.fillMatrix(ML);
// Друк вхідних даних
        System.out.println("MG:");
        Data.printMatrix(MG);
        System.out.println("ML:");
        Data.printMatrix(ML);
// Обчислення F2
        int h = Data.getMinMatrix(Data.multiplyMatrix(MG, ML));

        System.out.print("F2 result:");
        System.out.println(h);
    }
}