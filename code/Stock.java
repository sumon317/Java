public class Stock {
    String item;
    int qty;
    int rate;
    int amt;

    Stock (String i, int q, int r) {
        item = i;
        qty = q;
        rate = r;
        amt = qty * rate;
    }

    void display () {
        System.out.println("Name of the item: " + item);
        System.out.println("Quantity: " + qty);
        System.out.println("Rate per unit: " + rate);
        System.out.println("Net value: " + amt);
    }
}
