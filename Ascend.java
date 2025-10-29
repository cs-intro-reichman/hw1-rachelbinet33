// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		if(lim>0){	
			int a = (int)(Math.random()*lim);
			 int b = (int)(Math.random()*lim);
			 int c = (int)(Math.random()*lim);
			 System.out.println(  a +" " + b + " " +c);
			 int pair1 = Math.min(a, b);
			 int pair2 = Math.min(a, c);
			 int pair3 = Math.min(b, c);
			 int smallest = Math.min(Math.min(a,b),c);
			 int largest = Math.max(Math.max(a,b),c);
			 int middle = Math.max(Math.max(pair1,pair2),pair3);
			 System.out.println(smallest + " " + middle + " " + largest);
			}
		}
		
	}
