import java.util.Scanner;

public class ProductMan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Product " + (i + 1));
            System.out.print("Enter Product ID: ");
            int pid = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Product Name: ");
            String quantity = sc.nextLine();
            System.out.print("Enter Product Price: ");
            int price = sc.nextInt();
            products[i] = new Product(pid, price , quantity);
        }

        // b. Find Pid of the product with the highest price
        double maxPrice = products[0].price;
        int maxPid = products[0].pid;
        for (int i = 1; i < products.length; i++) {
            if (products[i].price > maxPrice) {
                maxPrice = products[i].price;
                maxPid = products[i].pid;
            }
        }
    }
}