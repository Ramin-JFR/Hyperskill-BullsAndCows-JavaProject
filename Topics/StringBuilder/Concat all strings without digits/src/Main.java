import java.util.Scanner;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {
        StringBuilder sb = new StringBuilder();

        String concatenatedString = String.join("", strings);
        char[] input = concatenatedString.toCharArray();
        for (int i = 0; i < input.length; i++) {
            if (Character.isLetter(input[i])) {
                sb.append(input[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}