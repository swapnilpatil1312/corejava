package com.app.fruits;

import java.util.Scanner;

public class fruitbasket {

    // Helper Methods (Moved inside the class)
    public static  void displayFruitNames  (Fruit[] basket) {
        for (Fruit f : basket) {
            if (f != null) System.out.println(f.getName());
        }
    }

    public static void displayFreshFruitDetails(Fruit[] basket) {
        for (Fruit f : basket) {
            if (f != null && f.isFresh()) {
                System.out.println(f.toString() + " Taste: " + f.taste());
            }
        }
    }

    public static void displayStaleFruitTastes(Fruit[] basket) {
        for (Fruit f : basket) {
            if (f != null && !f.isFresh()) {
                System.out.println("Stale :" + f.getName() + " Taste: :" + f.taste());
            }
        }
    }

    public static void markSourFruitsStale(Fruit[] basket) {
        for (Fruit f : basket) {
            if (f != null && f.taste().equalsIgnoreCase("sour")) {
                f.setFresh(false);
            }
        }
    }

    public static int menuList(Scanner sc) {
        System.out.println("\n0. Exit | 1. Mango | 2. Orange | 3. Apple");
        System.out.println("4. Names | 5. Fresh Details | 6. Stale Tastes | 7. Mark Stale | 8. Mark Sour Stale");
        System.out.print("Choice: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basket Size: ");
        Fruit[] basket = new Fruit[sc.nextInt()];
        int counter = 0;
        int choice;

        while ((choice = menuList(sc)) != 0) {
            switch (choice) {
                case 1: // Add Mango
                    if (counter < basket.length) {
                        System.out.print("Enter color and weight: ");
                        basket[counter++] = new mango( sc.next(), sc.nextDouble(),"mango");
                    } else System.out.println("Basket is full!");
                    break;

                case 2: // Add Orange
                    if (counter < basket.length) {
                        System.out.print("Enter weight and color: ");
                        basket[counter++] = new orange ("Orange", sc.nextDouble(), sc.next());
                    } else System.out.println("Basket is full!");
                    break;

                case 3: // Add Apple
                    if (counter < basket.length) {
                        System.out.print("Enter  weight and color: ");
                        basket[counter++] = new apple("Apple", sc.nextDouble(), sc.next());
                    } else System.out.println("Basket is full!");
                    break;
                    

                case 4:
                    displayFruitNames(basket);
                    break;

                case 5:
                    displayFreshFruitDetails(basket);
                    break;

                case 6:
                    displayStaleFruitTastes(basket);
                    break;

                case 7:
                    System.out.print("Enter index to mark stale: ");
                    int idx = sc.nextInt();
                    if (idx >= 0 && idx < counter) {
                        basket[idx].setFresh(false);
                        System.out.println(basket[idx].getName() + " is now stale.");
                    } else System.out.println("Invalid index!");
                    break;

                case 8:
                    markSourFruitsStale(basket);
                    System.out.println("All sour fruits marked stale.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}
