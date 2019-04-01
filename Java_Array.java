import java.util.Arrays;
//Week 9 assignment
//Created by Zach Wozich 3-31-2018
  class Main {

    public static void main (String args[]){
    try {
       int numbers[]= {1,5,-9,12,-3,89, 18,23,4,-6};

	// Find minimum (lowest) value in array using loop
		int minValue = numbers[0];
		for(int i=1;i < numbers.length;i++){
		if(numbers[i] < minValue){
		minValue = numbers[i];
		}
	}
	
           System.out.println("Minimum Value = " + minValue);
            //calculate min value
            
       
	 // Find maximum (largest) value in array using loop
		int maxValue = numbers[0];
		for(int i=1;i < numbers.length;i++){
		if(numbers[i] > maxValue){
		maxValue = numbers[i];
		}
	}

	System.out.println("Maximum Value = " + maxValue);

       

	// Determine the average of all element values in array using loop
		int sum = 0;
            	for(int i=0; i < numbers.length ; i++)
            	sum = sum + numbers[i];
            //calculate average value
            	double average = sum / numbers.length;
            System.out.println("Average value of the array elements is : " + average);
            
	 // ADD CODE TO Get Median AND PRINT THE Median\
	 
		Arrays.sort(numbers);
		int array_length=numbers.length;
		int median = 0;
		median = (numbers[array_length/2] + numbers[(array_length-1)/2]) / 2;
		
	 
	System.out.println("Median value of the array elements is : " + median);
	
	//Test Catch
	int Array_Index = numbers.length;
	System.out.println("Array_Index = " + Array_Index);
	int b = 11 / Array_Index;
	int c[] = { 1 };
	c[11] = 99;
	} catch (ArithmeticException x) {
             System.out.println("Divide by 0: " + x);

	} catch (ArrayIndexOutOfBoundsException x) {
              System.out.println("Array index Out of Bounds: " + x);
         }
    }
}  // Main
