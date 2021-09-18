 package org.system;

public class Desktop extends Computer {
	
public void desktopSize(double d) {
	
	System.out.println("Desktop SIze is "+d);
	

	}
public static void main(String[] args) {
	Desktop obj =new Desktop();
	obj.desktopSize(7.7);
	obj.computerModel("Dell");
	
}

}

