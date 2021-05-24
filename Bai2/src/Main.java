import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        list.add(string.charAt(0));
        for (int j = 1; j < string.length(); j++) {
            if (string.charAt(j) > list.getLast()) {
                list.add(string.charAt(j));
            } else {
                if (list.size() > max.size()) {
                    max.clear();
                    max.addAll(list);
                }
                list.clear();
                list.add(string.charAt(j));
            }
        }
        if (list.size() > max.size()) {
            max.clear();
            max.addAll(list);
        }
        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
