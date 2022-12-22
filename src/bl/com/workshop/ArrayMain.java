package bl.com.workshop;

/**
 * 
 * @author Raja
 *
 */
public class ArrayMain {

	public static void main(String[] args) {
		int array[] = { 12, 13, 5, 6, 7 };
		int length = array.length;
		ArrayHandling array1 = new ArrayHandling();
		array1.PrintArray(array);
		array1.PrintSecoundElement(array);
		array1.largestElement(array, length);
		array1.PrintArray(array);

	}
}
