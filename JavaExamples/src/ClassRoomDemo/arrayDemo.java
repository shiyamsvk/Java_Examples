package ClassRoomDemo;

public class arrayDemo {
	private int[] nums= {1,2,3,4,5};
	private int sum=0;

	public int[] getNums()
	{
		int[] copy=nums.clone();
		return copy;
		
	}
	
	public void setNum(int index, int value) {
		nums[index] = value;
	}

	public int sum() {
		for (int x : nums)
			sum += x;
		return sum;
	}	
	
	public void printSummary() {
		System.out.println("Array Values");
		for(int i:nums) 
			System.out.println(i);
		System.out.println("Array Added Values is: "+sum);
		//System.out.println("Array Added Values is: "+sum());
	}
}
