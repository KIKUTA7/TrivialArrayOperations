This assignment is meant to realize several simple functions on array. Please do not use any function from the Java API. For output, please use the method writeConsole(). Please do not print any newlines.

 Print 3 of 3 tests passing
public static void print(int[] arr) - outputs the array onto the console. The array is meant to start with an opening curly bracket and ends with a closing curly bracket; the indvidual elemets of the array are separated by a comma and a blank. Example: print(new int[] {1, 2, 3, 4, 5}) prints to the console the output {1, 2, 3, 4, 5}.
 Minimum und Maximum 3 of 3 tests passing
public static void minUndMax(int[] arr) - prints minimum and maximum of the array arr to the console. The input array is meant to be traversed at most once during execution of the method. Example: minUndMax(new int[] {1, 10, 25, -13, 1000}) prints onto the console the output Minimum = -13, Maximum = 1000.
 Inversion 3 of 3 tests passing
public static int[] invert(int[] arr) - returns a fresh array that contains the elements of the array arr in reverse order. Example: invert(new int[] {0, 1, 2, 3}) returns the array {3, 2, 1, 0}.
 Cut 6 of 6 tests passing
public static int[] cut(int[] arr, int len) - returns a fresh array which provides space for exactly len elements and contains the elements of arr in the same order adn as many as possible. If the returned array is larger as the argument array, then the extra positions should receive the value 0. Example: cut(new int[] {1, 2, 3}, 2) returns an array {1, 2} and cut(new int[] {1, 2, 3}, 5) returns an array {1, 2, 3, 0, 0}.
 Linearization 4 of 4 tests passing
public static int[] linearize(int[][] arr) - retruns a fresh one-dimentionsal array that contains the elements of the 2-dimensional argument array arr. The rows of the array arr are meant to be concatenated successively according to their indices. Take into account that rows need not be of equal length. Example: linearize(new int[][] {{1, 3}, {25}, {7, 4, 6, 9}}) returns an array {1, 3, 25, 7, 4, 6, 9}.
