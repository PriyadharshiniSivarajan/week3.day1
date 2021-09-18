package week3.day1;

public class AxisBank extends BankInfo {
	public float deposit(float f)
	{
		System.out.println("Axis bank deposit" +f);
		return f;
	}
	public static void main(String[] args) {
		AxisBank obj =new AxisBank();
		obj.fixed(15000.98f);
		obj.deposit(16000.56f);
		obj.savings(30000.568f);

	}

}
