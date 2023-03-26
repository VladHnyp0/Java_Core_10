package ua.lviv.lgs;

public class CheckPalindrome{

    public void check(StringBuffer sb) throws Exception {
        if (5 != sb.length()) {
            throw new Exception("Слово повинно містити 5 букв");
        }
        else {
            StringBuffer reversed = new StringBuffer(sb).reverse();
            if (sb.toString().equals(reversed.toString())) {
                System.out.println("Слово є паліндромом");
            } else {
                System.out.println("Слово не є паліндромом");
            }
        }
    }{

    }

}
