public class Challange {

    public static int[] sortIntegers(int[] array)
    {
        int[] darray = new int [array.length+1]; //+1 ponieważ potrzebujemy dodatkowo darray[0] mającego najniższa wartość, potem nowy array
                                                // będzie zawierał elementy darray bez [0]

        darray[0]= Integer.MIN_VALUE; //darray 0 ma minimalną wartość, żeby tablica znaków była rosnąca

        int n; // n ma maksymalna wartosc aby moc przyjmowac najmniejsze wartosci

        for(int j=1;j<darray.length;j++)
        {
            n=Integer.MAX_VALUE;
            System.out.println();

            int count;
            for (int i=0;i<array.length; i++)
            {

                if (n > array[i] && array[i] > darray[j - 1])
                {
                    n = array[i];
                        darray[j] = array[i];
                        System.out.println(j + ". position of sorted array = " + darray[j]+"\n");
                }
            }
            if(checkCount(array,n)>1)
            {
                count=checkCount(array,n);
                System.out.println("--- "+n+ " appears "+count+" times ---\n");

                for (int k=0;k<count-1;k++)
                {
                    j++;
                    darray[j] = n;
                    System.out.println(j + ". position of sorted array = "+ darray[j]);
                }
            }
        }

        System.arraycopy(darray, 1, array, 0, array.length);

        return array;
    }

    public static int[] sortArrayB(int[] array)
    {
        int[] arrayB = new int[array.length];
        boolean flag = true;
        int temp;
        while(flag)
        {
            flag = false;
            for (int i=0;i<array.length-1;i++)
            {
                if(array[i]>array[i+1])
                {
                    temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                    flag=true;
                }
            }
        }


        return arrayB;
    }

    public static int checkCount(int[]array,int number)
    {
        //zwraca  liczbę wystąpień danej liczby

        int count=0;

        for(int i=0;i<array.length;i++)
        {
            if(array[i]==number)
            {
                count++;
            }
        }
        return count;
    }

}
