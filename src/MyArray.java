public class MyArray {
    public static void main(String[] args) {
        int []myArray ={1,2,3,4};
        String []myStringArray = {"Unu","Doi","Trei"};
        System.out.println(myArray[2]);
        for (int i=0;i<myStringArray.length;i++)
        {
            System.out.println(myStringArray[i]);
        }
        for(String str:myStringArray) {
            System.out.println(str);
        }
        double []myDoubleArray={3.4, 4.5, 7.9, 9.0};
        System.out.println(myDoubleArray[1]);
        System.out.println(myDoubleArray[3]);

        for (int i=0;i<myDoubleArray.length;i++){
            System.out.println(myDoubleArray[i]);
        }


    }
}
