public class Main {
    public static void main(String[] args) {
        System.out.println("Уважаемый пассажир!");

        int ticket_price = 13676; // стоимость билета
        int one_mile = 20; // стоимость одной мили
        int miles = ticket_price / one_mile; // расчет количества милей

        System.out.println("За билет стоимостью " + ticket_price + " рублей Вам начислено " + miles + " миль.");

    }
}