import java.util.Scanner;

public class CoffeeMachine {

    final static Scanner scanner = new Scanner(System.in);
    // coffee machine’s initial state
    static int water = 400;
    static int milk = 540;
    static int coffee = 120;
    static int disposableCups = 9;
    static int money = 550;

    enum Cup {
        ESPRESSO(250,0,16,4),
        LATTE(350,75,20,7),
        CAPPUCCINO(200,100,12,6);

        int water;
        int milk;
        int coffee;
        int cost;

        Cup(int water, int milk, int coffee, int cost) {
            this.water = water;
            this.milk = milk;
            this.coffee = coffee;
            this.cost = cost;
        }
    }

    public static void start() {
        boolean exit = false;
        while (!exit) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            switch (scanner.next()) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    remaining();
                    break;
                case "exit":
                    exit = true;
                    break;
                default:
            }
        }
    }

    public static void main(String[] args) {

        start();
    }

    static void remaining() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffee + " of coffee beans");
        System.out.println(disposableCups + " of disposable cups");
        System.out.println(money + " of money");
        System.out.println();
    }

    static void buy() {

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        String selectCoffee = scanner.next();
        switch (selectCoffee) {
            case "1":
                if (water < Cup.ESPRESSO.water) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (coffee < Cup.ESPRESSO.coffee) {
                    System.out.println("Sorry, not enough coffee!");
                    break;
                } else if (disposableCups == 0) {
                    System.out.println("Sorry, not enough disposable cups");
                    break;
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= Cup.ESPRESSO.water;
                    coffee -= Cup.ESPRESSO.coffee;
                    money += Cup.ESPRESSO.cost;
                    disposableCups -= 1;
                    break;
                }
            case "2":
                if (water < Cup.LATTE.water) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (coffee < Cup.LATTE.coffee) {
                    System.out.println("Sorry, not enough coffee!");
                    break;
                } else if (milk < Cup.LATTE.milk) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                } else if (disposableCups == 0) {
                    System.out.println("Sorry, not enough disposable cups");
                    break;
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= Cup.LATTE.water;
                    milk -= Cup.LATTE.milk;
                    coffee -= Cup.LATTE.coffee;
                    money += Cup.LATTE.cost;
                    disposableCups -= 1;
                    break;
                }
            case "3":
                if (water < Cup.CAPPUCCINO.water) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (coffee < Cup.CAPPUCCINO.coffee) {
                    System.out.println("Sorry, not enough coffee!");
                    break;
                } else if (milk < Cup.CAPPUCCINO.milk) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                } else if (disposableCups == 0) {
                    System.out.println("Sorry, not enough disposable cups");
                    break;
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= Cup.CAPPUCCINO.water;
                    milk -= Cup.CAPPUCCINO.milk;
                    coffee -= Cup.CAPPUCCINO.coffee;
                    money += Cup.CAPPUCCINO.cost;
                    disposableCups -= 1;
                    break;
                }
            default:
        }
        System.out.println();
    }

    static void fill() {
        System.out.println("Write how many ml of water do you want to add:");
        int addWater = scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        int addMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int addCoffee = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int addDisposableCups = scanner.nextInt();
        water += addWater;
        milk += addMilk;
        coffee += addCoffee;
        disposableCups += addDisposableCups;
        System.out.println();
    }

    static void take() {
        System.out.println("I gave you $" + money);
        money -= money;
        System.out.println();
    }
}
