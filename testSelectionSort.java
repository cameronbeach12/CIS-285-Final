import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testSelectionSort {
	private SelectionSort temp1;
	
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixes();
	}
	
	public void testPositive(){
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;
		SelectionSort temp1 = new SelectionSort();
		temp1.selectionSort(arr);
		
		assertNotNull(temp1);
	    assertSame(2, arr[0]);
	    assertSame(7, arr[1]);
	    assertSame(8, arr[2]);
	    assertSame(9, arr[3]);
	    assertSame(10, arr[4]);
	}
	
	public void testNegative(){
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = -9;
		arr[2] = -7;
		arr[3] = -10;
		arr[4] = -2;
		SelectionSort temp1 = new SelectionSort();
		temp1.selectionSort(arr);
		
		assertNotNull(temp1);
	    assertSame(-10, arr[0]);
	    assertSame(-9, arr[1]);
	    assertSame(-8, arr[2]);
	    assertSame(-7, arr[3]);
	    assertSame(-2, arr[4]);
	}
	
	public void testMixes(){
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = -9;
		arr[2] = 0;
		arr[3] = -10;
		arr[4] = 2;
		SelectionSort temp1 = new SelectionSort();
		temp1.selectionSort(arr);
		
		assertNotNull(temp1);
	    assertSame(-10, arr[0]);
	    assertSame(-9, arr[1]);
	    assertSame(0, arr[2]);
	    assertSame(2, arr[3]);
	    assertSame(8, arr[4]);
	}
}
