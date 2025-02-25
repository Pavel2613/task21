public class Main {
    public static void main(String[] args) {
        System.out.println("Уважаемый пассажир!");

        int ticketPrice = 13676; // стоимость билета
        int oneMile = 20; // стоимость одной мили
        int miles = ticketPrice / oneMile; // расчет количества милей

        System.out.println("За билет стоимостью " + ticketPrice + " рублей Вам начислено " + miles + " миль.");

    }
}