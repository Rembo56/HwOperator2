public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int clientOs = 0;

        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        int clientOs2 = 1;
        int clientDeviceYear = 2000;

        if (clientOs2 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs2 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs2 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        int year = 2020;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println( + year + " год является високосным ");
        } else {
            System.out.println( + year + " год не является високосным ");
        }


        int monthNumber = 0;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }


        int deliveryDistance = 204;
        int oneDayDelivery = 20;
        int incDayDelivery = 40;
        int day = 1;

        if (deliveryDistance <= oneDayDelivery) {
            System.out.println("Потребуется " + day + " дней");
        } else {
            day = ((deliveryDistance - oneDayDelivery) / incDayDelivery)+ 2;
            System.out.println("Потребуется " + day + " дней");
            
        }
    }
}