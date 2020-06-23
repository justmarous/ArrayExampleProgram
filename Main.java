import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        int[] myVariable;
//        int[] myIntArray = new int[10];
//        myIntArray[5] = 50;
//        double[] myDoubleArray = new double[2];
//        array(myIntArray);


//        int[] myIntegers = getIntegers(5);
//        for(int i=0;i<myIntegers.length;i++)
//        {
//            System.out.println("["+i+"] -> "+myIntegers[i]);
//        }
//        System.out.println(getAverage(myIntegers));



//        int[] array = new int [10];
//        System.out.println("Put numbers in the array:\r");
//        for (int i=0;i<array.length;i++)
//        {
//            array[i]=scanner.nextInt();
//        }
//
//        for (int value : array) {
//            System.out.println(value);
//        }
//
//        Challange.sortIntegers(array);
//
//        for (int value : array) {
//            System.out.println(value);
//        }



        int[] arrayB = {5,4,3,3,1};

        for (int i = 0;i<arrayB.length-1;i++)
        {
            Challange.sortArrayB(arrayB);
        }
        for (int value : arrayB) {
            System.out.println(value);
        }
    }

    private static void array() {
    }

    public static void array(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.println("element "+array[i]);
        }
    }

    public static int[] getIntegers (int number)
    {
        System.out.println("Array initiallized; enter "+ number + " variables\r");
        int[] array = new int[number];
        for(int i=0;i<array.length;i++)
        {
            array[i]= scanner.nextInt();
        }

        return array;

    }

    public static double getAverage (int[] array)
    {
        int sum=0;
        for (int i = 0;i<array.length;i++)
        {
            sum+=array[i];
        }
        return (double) sum/ (double)array.length;
    }


}
