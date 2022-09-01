import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2021;
        checkTheLeapYear(year);

        int clientOS = 0;
        int currentYear = LocalDate.now().getYear();
        checkPhonesOS(clientOS, currentYear);

        int deliveryDistance = 99;
        System.out.println("Потребуется дней: " + countDeliveryDays(deliveryDistance));


    }

    //task 1
    private static void  checkTheLeapYear(int year) {
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            System.out.println(year + " - не високосный год");
        } else {
            System.out.println(year + " - високосный год");
        }
    }

    //task 2
    private static void checkPhonesOS(int clientOS, int currentYear) {
        int iOs = 0;
        int android = 1;
        int minSupported = 2015;
        int nextYear = 2023;

        if (clientOS == iOs && currentYear >= minSupported && currentYear < nextYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == android && currentYear >= minSupported && currentYear < nextYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == iOs && currentYear < minSupported) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == android && currentYear < minSupported) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else throw new
                RuntimeException("Введены недопустимые параметры ОС или год выпуска");

    }

    //task 3
    private static Integer countDeliveryDays(int deliveryDistance) {
        int daysRequired = 1;
        int firstBorder = 20;
        int secondBorder = 60;
        int lastBorder = 100;

        if (deliveryDistance <= firstBorder) {
            return  daysRequired;
        } else if (deliveryDistance <= secondBorder) {
            return  ++daysRequired;
        } else if (deliveryDistance <= lastBorder) {
            return daysRequired + 2;
        } else {
            throw new RuntimeException("Вне зоны доставки");
        }
    }
}