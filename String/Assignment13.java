// Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged. 
// If the input is "xHix", then output is "Hi".
// If the input is "America", then the output is "America".

public class Assignment13 {
    public static void main(String[] args) {
        String str = "xdishux";
        if (str.startsWith("x"))
            str = str.substring(1, str.length());
        if (str.endsWith("x"))
            str = str.substring(0, str.length() - 1);
        System.out.println(str);
    }
}
