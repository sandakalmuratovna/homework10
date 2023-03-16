import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // task1
        System.out.println("ФИО сотрудника - " + task1());

        // task2
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + task2());

        // task3
        System.out.println("Данные ФИО сотрудника - " + task3());

    }

    public static String task1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter your middle name: ");
        String middleName = scanner.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();
        String fullName = lastName + " " + firstName + " " + middleName;
        return fullName;
    }

    public static String task2(){
        String fullName = task1();
        fullName = fullName.toUpperCase();
        return  fullName;
    }

    public static String task3() {
        String fullName = task1();
        fullName = fullName.replace("ё", "е");
        return fullName;
    }
}