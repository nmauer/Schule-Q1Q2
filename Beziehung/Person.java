package Beziehung;

public abstract class Person {
	private String name;
	private int alter;
	
	public Person(String pName, int pAlter) {
		name = pName;
		alter = pAlter;
	}
	
	public abstract void reden();  //          
	
	public void schreien() {                  //polymorph
		System.out.println("Kek");
	}
	

}
