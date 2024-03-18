public class Main {
    public static void main(String[] args) {
        char clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }


        int clientDeviceYear = 2017;
        int clientOs = 0;
        if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установить обычную версию приложения для Android по ссылке");
        } else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }


        int year = 1948;
        if (year % 4 == 0) {
            System.out.println(+year + " год является високосным");
        } else if (year % 4 != 0) {
            System.out.println(+year + " год не является високосным");
        }


        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребются сутки, чтобы проехать " + deliveryDistance + " км");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется двое суток, чтобы проехать " + deliveryDistance + " км");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется еще трое суток, чтобы проехать " + deliveryDistance + " км");
        } else {
            System.out.println("Доставки нет");
        }


        int monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зимнее время");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весеннее время");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летнее время");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осеннее время");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }




    }
}

