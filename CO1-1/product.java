class Product {
    int pcode;
    String pname;
    double price;

    Product(int c, String n, double p) {
        pcode = c;
        pname = n;
        price = p;
    }

    void display() {
        System.out.println(pcode + "\t" + pname + "\t" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects
        Product p1 = new Product(101, "Laptop", 40000);
        Product p2 = new Product(102, "Mobile Phone", 25000);
        Product p3 = new Product(103, "Smart Watch", 30000);

        // User-defined array of Product objects
        Product[] products = {p1, p2, p3};

        // Loop through array
        for (Product p : products) {
            p.display();
        }
    }
}

