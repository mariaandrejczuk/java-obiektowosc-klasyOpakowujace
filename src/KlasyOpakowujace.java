public class KlasyOpakowujace {
    public static void main(String[] args) {

        int i = 10;
        Integer integer = Integer.valueOf(i);  //obiekt Integer z wartością 10
        System.out.println("int i: "+i);
        System.out.println("integer: "+integer);

        int j = integer.intValue();  //typ prosty j z wartością 10
        System.out.println("int j: "+j);
        System.out.println("integer: "+integer);


        Integer number = Integer.valueOf("22"); //tekst na Integer
        int k = Integer.parseInt("44");  // tekst na int
        System.out.println("Number: "+number);
        System.out.println("int k: "+k);
    }
}
