package ua.lviv.lgs;

public class CountWords {
    public void count(String text) {
        String[] words = text.split("\\s+"); // розбиття речення на масив рядків
        int wordCount = words.length;
        System.out.println(wordCount);
    }
}
