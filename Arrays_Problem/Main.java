public class Main {
    public static void main(String[] args) {
        // Creating object, inspite of no-use
        BesTimeToBuySellStock obj = new BesTimeToBuySellStock();
        // Invoking method using class name, since method is declared as STATIC (static members depend upon the class rather than the object)
        System.out.println(BesTimeToBuySellStock.findMaximumProfit(new int[]{10,4,6,8,1}));
    }
}