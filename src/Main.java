public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
    }

    private static void task1() {
        String firstName = " Ivan ";
        String middleName = " Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — "+fullName);
    }

    private static void task2() {
        String firstName = " Ivan ";
        String middleName = " Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullName.toUpperCase());
    }

    private static void task3() {
        String firstName = " Семён ";
        String middleName = " Семёнович";
        String lastName = "Иванов ";
        String fullName = lastName + firstName + middleName;
        String fullNameTrue = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника —  "+fullNameTrue);
    }
}