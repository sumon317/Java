import java.util.Scanner;

class Mixer {
    int arr[];
    int n;

    // Constructor to initialize the size of the array
    Mixer(int nn) {
        n = nn;
        arr = new int[n];
    }
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + n + " elements in ascending order without duplicates:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    Mixer mix(Mixer A) {
        int size = this.n + A.n;
        Mixer result = new Mixer(size);
        int i = 0, j = 0, k = 0;

        while (i < this.n && j < A.n) {
            if (this.arr[i] < A.arr[j]) {
                result.arr[k++] = this.arr[i++];
            } else if (this.arr[i] > A.arr[j]) {
                result.arr[k++] = A.arr[j++];
            } else {

                result.arr[k++] = this.arr[i++];
                j++;
            }
        }


        while (i < this.n) {
            result.arr[k++] = this.arr[i++];
        }
        while (j < A.n) {
            result.arr[k++] = A.arr[j++];
        }

        return result;
    }
    void display() {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the first array:");
        int size1 = sc.nextInt();
        Mixer obj1 = new Mixer(size1);
        obj1.accept();

        System.out.println("Enter the size of the second array:");
        int size2 = sc.nextInt();
        Mixer obj2 = new Mixer(size2);
        obj2.accept();

        Mixer merged = obj1.mix(obj2);
        System.out.println("Merged array:");
        merged.display();

        sc.close();
    }
}