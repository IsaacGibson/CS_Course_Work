
public class Hospital {
	public void service(){
		System.out.print("I love work");
	}
	protected void message(){
		System.out.print("I work at the hospital");
	}
	
}

class Doctor extends Hospital{
	@Override
	public void service(){
		System.out.println("I'm the Doctor");
	}
	@Override
	public void message(){
		System.out.println("I love my job");
	}
	
}
class Nurse extends Hospital{
	@Override
	public void service(){
		System.out.println("I'm a Nurse");
	}
}
class Administrator extends Hospital{
	@Override
	public void service(){
		System.out.println("I'm the Administrator");
	}
	@Override
	public void message(){
		System.out.println("I do everyting");
	}
}
class Surgeon extends Hospital{
	@Override
	public void service(){
		System.out.println("I'm the Surgeon");
	}
}
class Receptionist extends Hospital{
	@Override
	public void service(){
		System.out.println("I'm the Receptionist");
	}
	@Override
	public void message(){
		System.out.println("I Tell people to come in and out");
	}
}
class Janitor extends Hospital{
	@Override
	public void service(){
		System.out.println("I'm the Janitor");
	}
	@Override
	public void message(){
		System.out.println("I hate life");
	}
}