package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        sortCharacter();
        busRent();

    }

    public static void sortCharacter(){
        System.out.println("------------- SORT CHARACTER -------------");
        System.out.println();
        System.out.println("Input your word(s):");
        Scanner scanner = new Scanner(System.in); // scanner kata
        String kata = scanner.nextLine();
        List<String> hasilSorting = SortCharacter.sortCharacter(kata);
        System.out.println("HASIL");
        System.out.println("Vowel character(s): " + hasilSorting.toArray()[0]);
        System.out.println("Consonant character(s): " +hasilSorting.toArray()[1]);
        System.out.println();
    }

    public static void busRent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------- BUS RENT -------------");
        System.out.println();
        System.out.println("Input your total family numbers:");
        int jumlahKeluarga = scanner.nextInt();
        System.out.println();
        System.out.println("Input your number for each every member:");
        scanner.nextLine();
        String[] strNums = scanner.nextLine().split(" ");

        List<Integer> parsedValue = new ArrayList<>();

        if (strNums.length != jumlahKeluarga) {
            System.out.println("Input must be equal with count of family");
            System.exit(1);
        }

        for (String strNum : strNums) {
            Integer intNum = Integer.parseInt(strNum);
            parsedValue.add(intNum);
        }

        int busCount = BusRent.busRent(parsedValue);
        System.out.println("Minimum bus required is: " + busCount);
    }
}