public class Series extends Number{
    int sum;

    Series (int nn) {
        super(nn);
        sum = 0;
    }

    void calsum () {
        for (int i = 1; i <= n; i++) {
            sum = sum + factorial(i);
        }
    }

    void display () {
        super.display();
        System.out.println("Sum of the series " + sum);
    }
}
