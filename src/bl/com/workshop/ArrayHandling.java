//Need to take an array and print the second and second largest element in the array

package bl.com.workshop;

/**
 * 
 * @author Raja baitha
 *
 */

public class ArrayHandling {
	public void PrintSecoundElement(int array[])
	{
		System.out.println("Secount elemet of the array " +array[1]);
		System.out.println();
	}
	
	public void largestElement(int array[], int total) {
		/*
		 * Method to check for the condition 
		 * array----->Element in Array total----->Size
		 * of the array temp------>To swap the element
		 */

		int temp;

		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		System.out.println("Secound largest element of the array" +array[total - 2]);
	}
	/**
	 * Method to print Array
	 */
	public void PrintArray(int array[])
	{
		for (int i=0; i<array.length; i++)
		{
			System.out.print(array[i] + ", ");
		}
		System.out.println();
	}
	
}

