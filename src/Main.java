import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.trimToSize();
        //1,2,4,6,8,9,10
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Введите строку в формате 'text~num' или 'print~num' (для выхода введите 'exit'):");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }

            String[] parts = input.split("~");

            if (parts.length != 2) {
                System.out.println("Неверный формат ввода!");
                continue;
            }

            String command = parts[0];
            int num = Integer.parseInt(parts[1]);

            if (command.equals("text")) {
                // Добавляем текст в связный список на позицию num
                if (num >= 0 && num <= linkedList.size()) {
                    linkedList.add(num, parts[0]);
                    System.out.println("Строка успешно добавлена в позицию " + num);
                } else {
                    System.out.println("Недопустимая позиция!");
                }
            } else if (command.equals("print")) {
                // Выводим строку из позиции num и удаляем её из списка
                if (num >= 0 && num < linkedList.size()) {
                    String removedString = linkedList.remove(num);
                    System.out.println("Строка из позиции " + num + ": " + removedString);
                } else {
                    System.out.println("Недопустимая позиция!");
                }
            } else {
                System.out.println("Неверная команда!");
            }
        }

        scanner.close();
    }
}
