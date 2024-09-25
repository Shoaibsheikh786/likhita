package abstractions;
/*
 * void credit();
 * void debit();
 * void netbanking();
 * */


//interface , abstract class

interface RBI {
	
//	int a=14;  //100%
  	void credit(); // no body //no logic //default abstract, public 

public	abstract void debit(); // no body

public	abstract void netbanking();





}
class pnb implements RBI

{

	@Override
	public void credit() {
		
		System.out.println("Credit logic for pnb");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void netbanking() {
		// TODO Auto-generated method stub
		
	}
	
	public void atm()
	{
		
	}
	
}
public class Icici implements RBI {
	
	public void credit(){
		System.out.println("Credit logic for icici");
	}
	
	//register its bank with RBI


	@Override
	public void debit() {
		System.out.println("Debit Logic for icici");
	}

	@Override
	public void netbanking() {
		
		System.out.println("net BAnking for icic");
		
	}
	
	public void upi()
	{
		System.out.println("upi");
	}
	
	
	

	public static void main(String[] args) {
		// interface
	}

}
