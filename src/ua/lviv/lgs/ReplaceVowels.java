package ua.lviv.lgs;

public class ReplaceVowels {

    public void replace(StringBuffer sb) {
        String regex = "[aeiouAEIOU]";
        sb = new StringBuffer(sb.toString().replaceAll(regex, "-"));
        System.out.println(sb);
    }
}
