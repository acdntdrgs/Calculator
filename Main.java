import java.util.Scanner;
// Данный калькулятор написан самостоятельнос с помощью остаточных знаний.
public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Первое число: ");
            int num1 = scan.nextInt();

            System.out.print("Второе число: ");
            double num2 = scan.nextInt();
            double res = 0;

            System.out.println("Действие: ");
            String deistvie = scan.nextLine();
            deistvie = scan.nextLine();
            switch (deistvie) {
                case "+" -> {
                    res = num1 + num2;
                    System.out.println("Результат: " + res);
                }
                case "-" -> {
                    res = num1 - num2;
                    System.out.println("Результат: " + res);
                }
                case "*" -> {
                    res = num1 * num2;
                    System.out.println("Результат: " + res);
                }
                case "/" -> {
                    if (num2 == 0)
                        System.out.println(" Error" +
                                "На ноль делить нельзя");
                    else
                        res = num1 / num2;
                    System.out.println("Результат: " + res);
                }
                default -> System.out.println("Вы ввели неверные данные");
            }

        }
    }

