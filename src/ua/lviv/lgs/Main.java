package ua.lviv.lgs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        info();
        Scanner choice = new Scanner(System.in);
        int num = choice.nextInt();

        if (num == 1) {
            System.out.print("Введи слово з 5 букв ");
            Scanner scanner = new Scanner(System.in);
            StringBuffer sb = new StringBuffer(scanner.nextLine().toLowerCase());

            CheckPalindrome checkPalindrome = new CheckPalindrome();
            checkPalindrome.check(sb);
        } else if (num == 2) {
            System.out.print("Введи будь який текст ");
            Scanner scanner = new Scanner(System.in);
            StringBuffer sb = new StringBuffer(scanner.nextLine());

            ReplaceVowels replaceVowels = new ReplaceVowels();
            replaceVowels.replace(sb);
        } else if (num == 3) {
            System.out.print("Введи будь який текст ");
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();

            CountWords countWords = new CountWords();
            countWords.count(text);
        }
    }

    static void info() {
        System.out.println("Напиши 1, щоб перевіряти, чи є слово з п'яти букв паліндромом");
        System.out.println("Напиши 2, щоб змінити всі голосні букви в строці на тире");
        System.out.println("Напиши 3, щоб порахувати кількість слів у реченні");
    }
}
