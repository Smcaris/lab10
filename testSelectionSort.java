import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
@Test
public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
    public testSelectionSort() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        SelectionSort temp1 = new SelectionSort();
        int [] testArr = temp1.basicSelectionSort(arr);
        assertEquals(Sortedarr[0],testArr[0]);
        assertEquals(Sortedarr[1],testArr[1]);
        assertEquals(Sortedarr[2],testArr[2]);
        assertEquals(Sortedarr[3],testArr[3]);
        assertEquals(Sortedarr[4],testArr[4]);

    }

    public void testNegative(){

    	 int[] arr = new int[5];
         arr[0] = -3;
         arr[1] = -7;
         arr[2] = -1;
         arr[3] = -6;
         arr[4] = -4;

         int[] Sortedarr = new int[5];
         Sortedarr[0] = -7;
         Sortedarr[1] = -6;
         Sortedarr[2] = -4;
         Sortedarr[3] = -3;
         Sortedarr[4] = -1;

         SelectionSort temp1 = new SelectionSort();
         int [] testArr = temp1.basicSelectionSort(arr);
         assertEquals(Sortedarr[0],testArr[0]);
         assertEquals(Sortedarr[1],testArr[1]);
         assertEquals(Sortedarr[2],testArr[2]);
         assertEquals(Sortedarr[3],testArr[3]);
         assertEquals(Sortedarr[4],testArr[4]);

    }


    public void testMixed(){

     	 int[] arr = new int[5];
          arr[0] = 8;
          arr[1] = 9;
          arr[2] = -7;
          arr[3] = -10;
          arr[4] = 2;

          int[] Sortedarr = new int[5];
          Sortedarr[0] = -10;
          Sortedarr[1] = -7;
          Sortedarr[2] = 2;
          Sortedarr[3] = 8;
          Sortedarr[4] = 9;

          SelectionSort temp1 = new SelectionSort();
          int [] testArr = temp1.basicSelectionSort(arr);
          assertEquals(Sortedarr[0],testArr[0]);
          assertEquals(Sortedarr[1],testArr[1]);
          assertEquals(Sortedarr[2],testArr[2]);
          assertEquals(Sortedarr[3],testArr[3]);
          assertEquals(Sortedarr[4],testArr[4]);

     }

     public void testDuplicates(){

     	 int[] arr = new int[5];
          arr[0] = 8;
          arr[1] = 9;
          arr[2] = 8;
          arr[3] = 10;
          arr[4] = 2;

          int[] Sortedarr = new int[5];
          Sortedarr[0] = 2;
          Sortedarr[1] = 8;
          Sortedarr[2] = 8;
          Sortedarr[3] = 9;
          Sortedarr[4] = 10;

          SelectionSort temp1 = new SelectionSort();
          int [] testArr = temp1.basicSelectionSort(arr);
          assertEquals(Sortedarr[0],testArr[0]);
          assertEquals(Sortedarr[1],testArr[1]);
          assertEquals(Sortedarr[2],testArr[2]);
          assertEquals(Sortedarr[3],testArr[3]);
          assertEquals(Sortedarr[4],testArr[4]);

     }
 }
