public class Operators {
    public static void main(String[] args) {
        int sum1=100+50;
        int sum2=sum1+50;
        int sum3=sum1+sum2;
        System.out.println("sum1="+sum1);
        System.out.println("sum2="+sum2);
        System.out.println("sum3="+sum3);

        int number1=100;
        int number2=50;

        System.out.println(number1+number2);
        System.out.println(number1-number2);
        System.out.println(number1/number2);
        System.out.println(number1*number2);
        System.out.println(number1%number2);
        System.out.println(++number1);
        System.out.println(--number2);

        int number3=number2;
        number3+=5;                           //Echivalent cu number2=number2+5;//
        System.out.println(number3);
        System.out.println(number1>number2);
        System.out.println(number1==number2);
        System.out.println('B'< 'a');

boolean condition=number1>number2 && number1>100;
    System.out.println(condition);

    //Exercitii

        //Ex1//
        System.out.println(10*6);
        //Ex2//
        System.out.println(10/2);
        //Ex3//
        int x=10;
        --x;
        System.out.println(x);

        //Ex4//
        int a=5;
        int b=8;
        int sum=a+b;

        if (sum>=10){
            System.out.println("Suma este mai mare decat 10");
        }
        else {
            System.out.println("Suma este mai mica decat 10");
        }
        if (sum%2==0){
            System.out.println("Suma este numar par");
        }
        else {
            System.out.println("");
        }
    }
}
