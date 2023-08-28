public class SecondTask {
    public static void main(String[] args) {
        try {
            int[] intArray = new int[8];
            int d = 0;
            double catchedRes1 = (double) intArray[7] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Словил ArithmeticException: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Словил ArrayIndexOutOfBoundsException: " + e);
        } catch (Exception e) {
            System.out.println("Остальное: " + e);
        } finally {
            System.out.println("Блок выполнился.");

        }
    }
}
