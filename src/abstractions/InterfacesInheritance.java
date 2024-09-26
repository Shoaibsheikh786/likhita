package abstractions;

interface i1
{
	//public abstract methods 
	//variable --> final 
	
	public void add();
	public void sub();
	
}

interface i2 extends i1    //implemtns --> provide 
{
	public void div();
	public void mul();
	
	
}

//:--> interface <--- class      :implements 
//:--> interface <---- interface : extends 
//Multiple inheritance 
class MultipleInhertiance implements i1,i2
{

	@Override
	public void div() {
		// TODO Auto-generated method stub
		
		i2 obj;
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}
	
}


public class InterfacesInheritance implements i2 {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		
	}



}
