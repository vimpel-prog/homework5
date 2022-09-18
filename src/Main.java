public class Main {
    public static void main(String[] args) {
//        Task 1
        int clientOS = 1;
        if(clientOS==0) System.out.println("Установите версию приложения для iOS по ссылке");
        else System.out.println("Установите версию приложения для Android по ссылкеv");

//        Task 2
        int clientDeviceYear = 2015;
        if(clientOS==0) {
            if(clientDeviceYear>=2015) System.out.println("Установите версию приложения для iOS по ссылке");
            else System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else
            if(clientDeviceYear>=2015) System.out.println("Установите версию приложения для Android по ссылкеv");
            else System.out.println("Установите облегченную версию приложения для Android по ссылке");

//        Task 3
        int year = 2021;
        if(year%4==0&&year%100!=0||year%400==0) System.out.println(year+" Годя является високосным");
        else System.out.println(year+" Год не является високосным");

//        Task 4
        int deliveryDistance = 95;
        int daysDelivery;
        if(deliveryDistance<20) daysDelivery=1;
        else {
            deliveryDistance=deliveryDistance-20;
            daysDelivery=deliveryDistance/40+2;
        }
        System.out.println("Потребуется дней: " + daysDelivery);

//        Task 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Этот месяц принадлежит к сезону Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц принадлежит к сезону Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц принадлежит к сезону Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц принадлежит к сезону Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}