public class Purchase extends Stock{
    int pqty; //purchase quantity
    int prate; //purchase rate

    Purchase (String a, int b, int c, int pq, int pr) {
        super(a,b,c);
        pqty = pq;
        prate = pr;
    }

    void update () {
        qty += pqty;
        if (prate != rate)
            rate = prate;
        amt = qty * rate;
    }

    void display () {
        System.out.println("\nItems in Stock before purchase:- ");
        super.display();
        update();
        System.out.println("\nItems in Stock after purchase:- ");
        super.display();
    }
}
