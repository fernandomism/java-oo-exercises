
public class fraction {

	int num;
	int dom;
	
	public fraction(int num, int dom) {
		this.num = num;
		this.dom = dom;
	}
	
	
	public void addFract(fraction fTwo) {
		int addN = (this.num + fTwo.num);
		int addD = (this.dom + fTwo.dom);
		fraction nFrac = new fraction(addN,addD);
		System.out.println("The addition of the fractions : " + this.num + " / " + this.dom + " + " + fTwo.num + " / " + fTwo.dom + " is = " + nFrac.num + " / " + nFrac.dom);
	}
	
	public void multFract(fraction fTwo) {
		int addN = (this.num * fTwo.num);
		int addD = (this.dom * fTwo.dom);
		fraction nFrac = new fraction(addN,addD);
		System.out.println("The multiplication of the fractions : " + this.num + " / " + this.dom + " x " + fTwo.num + " / " + fTwo.dom + " is = " + nFrac.num + " / " + nFrac.dom);
	}
	
	public void recip() {
		fraction nFrac = new fraction(this.dom,this.num);
		System.out.println("The recipricol of " + this.num + " / " + this.dom + " is " + nFrac.num + " / " + nFrac.dom);
	}
	
	public void simpli() {
		int limit = 0;
		if(this.num > this.dom) {
			limit = this.num;
		} else {
			limit = this.dom;
		}
		
		for(int i = limit; i >= 0; i--) {
			if(this.num % i == 0 && this.dom%i == 0) {
				fraction nFrac = new fraction(this.num / i,this.dom /i );
				System.out.println(this.num + " / " + this.dom + " simplified is " + (nFrac.num) + " / " + (nFrac.dom) );
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		fraction testA = new fraction(16,8);
		fraction testB = new fraction(2,5);
		
		testB.recip();
		
		testA.simpli();
		
		testA.addFract(testB);
		testA.multFract(testB);

	}

}
