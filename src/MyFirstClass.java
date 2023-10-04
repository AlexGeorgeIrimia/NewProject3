public class MyFirstClass {
    public static void main(String[] args) {
        System.out.println("Hello World");
        // Ex1
        int x;
        int y;
        x=29;
        y=6;
        System.out.println("Ziua nasterii="+x);
        System.out.println("Data nasterii="+y);
        System.out.println("Suma="+(x+y));
        //Ex 2
        String nume="Alex";
        System.out.println(nume +" learns Java");
        //Ex optionale
        String limbaj="Java";
        String text1="este usor sa inveti ";
        System.out.println(text1+limbaj);
        limbaj="Python";
        System.out.println(text1+limbaj);
        limbaj="Orice limbaj de programare";
        System.out.println(text1+limbaj);
        String text2=" atata timp cat iti dai silinta";
        System.out.println(text1+limbaj+text2);
        System.out.println(text2+limbaj+text1);
    }
}
