public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum(Integer.toBinaryString(5), Integer.toBinaryString(12)));
        System.out.println(bins.mult(Integer.toBinaryString(5), Integer.toBinaryString(12)));
    }
}