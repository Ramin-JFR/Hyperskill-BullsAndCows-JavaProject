import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();


        double area = (a+ b+ c)/2.0d;
        System.out.println(Math.sqrt(area* (area - a) * (area - b) * (area - c)));

    }
}