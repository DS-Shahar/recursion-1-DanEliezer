
public class Main {
	public static void main(String []args) {
		int a = f(7);
		System.out.println("a= "+ a);
	}
	public static int f(int n) {
			if(n==0) {
				return 1;
			}
			return n * f(n-1);
		}
		
	}


