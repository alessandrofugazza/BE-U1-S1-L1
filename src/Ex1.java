// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Ex1 {
    public static void main(String[] args) {
        System.out.println(multiply(3, 5));
        System.out.println(concat("YO", 5));
        String[] strArr = {"ciao", "a", "tutti", "ehhh", "ah"};
        String[] strArrWithInsertedString = insertInArray(strArr, "kk");
        for (int i = 0; i < strArrWithInsertedString.length; i++) {
            System.out.println(strArrWithInsertedString[i]);
        }
    }

    public static int multiply(int n1, int n2) {
        return n1 * n2;
    }

    public static String concat(String str, int times) {
        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < times; i++) {
            finalString.append(str);
        }
        return finalString.toString();
    }

    public static String[] insertInArray(String[] strArray, String strToInsert){
        int insertPlace = 3;
        String[] finalStringArray = new String[6];
        for (int i = 0; i < insertPlace-1; i++) {
            finalStringArray[i] = strArray[i];
        }
        finalStringArray[insertPlace-1] = strToInsert;
        for (int i = insertPlace-1; i < 5; i++) {
            finalStringArray[i+1] = strArray[i];
        }
        return finalStringArray;
    }
}