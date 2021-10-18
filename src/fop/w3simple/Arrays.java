package fop.w3simple;

public class Arrays extends MiniJava {


    public static void print(int[] arr) {
        int i = 0;
        writeConsole("{");
        while (i < arr.length - 1) {
            writeConsole(arr[i]);
            writeConsole(",");


            i++;

        }
        writeConsole(arr[arr.length - 1]);
        writeConsole("}");
    }

    public static void minAndMax(int[] arr) {
        int Min = arr[0], Max = arr[0];
        int i = 1;
        while (i < arr.length) {
            if (Min > arr[i]) Min = arr[i];
            if (Max < arr[i]) Max = arr[i];
            i++;
        }
        writeConsole("Minimum = " + Min + ", Maximum = " + Max);
    }

    public static int[] invert(int[] arr) {
        int i = arr.length - 1;
        int[] b = arr.clone();
        while (i > -1) {
            b[i] = arr[arr.length - i - 1];


            i--;

        }
        return b;

    }


    public static int[] cut(int[] arr, int len) {
        int [] c = arr.clone();
        if(len> arr.length)
        {
            int [] b = new int [len];

            int i=0;
            while (i<arr.length)
            {
                b[i] = c[i];
i++;
            }
            return b;
        }
        else {
            int [] b = new int [arr.length - len+1] ;
            int i=0;
            while (i<b.length)
            {
                b[i]=arr[i];
                i++;
            }
            return b;
        }
    }


    public static int[] linearize(int[][] arr) {
        int i=0;
        int sum = 0;
        while (i<arr.length) {
            sum+=arr[i].length;
            i++;
        }
        int [] arr1 = new int [sum];
        i=0;
        int index = 0;
        while (i < arr.length)
        {
            int k=0;
            while (k<arr[i].length)
            {
                arr1[index] = arr[i][k];
                index++;
                k++;
            }
            i++;
        }
return arr1;
    }
}

