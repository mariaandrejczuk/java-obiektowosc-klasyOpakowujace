
public class KlasyOpakowujace {
    public static void main(String[] args) {

        int i = 10;
        Integer integer = Integer.valueOf(i);  //obiekt Integer z wartością 10
        System.out.println("int i: " + i);
        System.out.println("integer: " + integer);

        int j = integer.intValue();  //typ prosty j z wartością 10
        System.out.println("int j: " + j);
        System.out.println("integer: " + integer);

        Integer number = Integer.valueOf("22"); //tekst na Integer
        int k = Integer.parseInt("44");  // tekst na int
        System.out.println("Number: " + number);
        System.out.println("int k: " + k);
        System.out.println();

        System.out.println("------------- Character.toLowerCase -------------");
        System.out.println();

        char a = 'A';
        Character character = Character.toLowerCase(a);  //duża litera na małą literę
        System.out.println(character);

        System.out.println("------------- Character.isSpaceChar -------------");
        System.out.println();
        char c1 = ' ';
        char c2 = '2';
        boolean b1;
        boolean b2;

        b1 = Character.isSpaceChar(c1);
        b2 = Character.isSpaceChar(c2);

        String str1 = "is c1 a space character?: " + b1;
        String str2 = "is c2 a space character?: " + b2;

        System.out.println(str1);
        System.out.println(str2);

        System.out.println();
        System.out.println("------------- Integer.sum -------------");
        System.out.println();

        int d = 100;
        int e = 181;
        int f = Integer.sum(d, e);
        System.out.println("Sum of d and e: "+f);
        //System.out.println("Sum of d and e: " + Integer.sum(d, e));
    }
}
