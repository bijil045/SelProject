package bsp;

public class Encap2 {
public static void main(String[] args) {
	Encap e= new Encap(0);
	e.setValue(10);
	int j= e.getValue();
	System.out.println(j);
	//e.i=10;error
	//int j= e.i;error
}
}
