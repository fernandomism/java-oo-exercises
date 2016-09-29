
public class rectangle {

	//fields
	
	int length;
	int width;
	
	//methods
	public rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public void areaCheck() {
		System.out.println("The area is : " + (this.length * this.width));
	}
	
	public void periCheck() {
		System.out.println("The perimeter is : " + ((this.length*2) + (this.width*2)) );
	}
	
	public static void main(String[] args) {
		rectangle rectOne = new rectangle(5, 5);
		rectOne.areaCheck();
		rectOne.periCheck();
	}

}
