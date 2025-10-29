// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
        int currentValue = Integer.parseInt(args[0]);
        Double rate = Double.parseDouble(args[1])/100;
        int n = Integer.parseInt(args[2]);
        double futureValue = (currentValue * Math.pow(1+rate,n));
        System.out.println("After " + n + " years, " + "$"+currentValue+" saved at " + rate*100+ "% will yield $" + (int)futureValue);
	}
}
