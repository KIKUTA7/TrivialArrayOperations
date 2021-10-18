package fop.w3simple;

public class Arrays extends MiniJava {
    public static void main (String [] args)
    {
        print (new int [] {1,2,3});
    }
    public static void print(int[] arr) {
        int i=0;
        writeConsole ("{");
        while (i < arr.length -1)
        {
            writeConsole(arr[i]);
            writeConsole(",");

i++;

        }
        writeConsole(arr[arr.length-1]);
        write("}");
    }

    public static void minAndMax(int[] arr) {

    }

    public static int[] invert(int[] arr) {
	return new int [] {1,2,3};
    }

    public static int[] cut(int[] arr, int len) {
        return new int [] {1,2,3};
    }

    public static int[] linearize(int[][] arr) {
        return new int [] {1,2,3};
    }
}
