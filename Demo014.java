class UnaryDemo {
	void UnaryOp() {
		int a = 10, b = 5;
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(b--);
		System.out.println(--b);
		
		a = 5; 
		b = 5;
		int c = a++ * --b * a;
		System.out.println(c);
	}

}
public class Demo014 {
    public static void main(String[] args) {
        UnaryDemo obj = new UnaryDemo();
        obj.UnaryOp();
	}
}
class SwapDemo {
	void swapnumbers() {
		int a = 100, b = 200;
		System.out.println("Before Swap a = "+a +" b = "+b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After Swap a = "+a +" b = "+b);		
	}
}

