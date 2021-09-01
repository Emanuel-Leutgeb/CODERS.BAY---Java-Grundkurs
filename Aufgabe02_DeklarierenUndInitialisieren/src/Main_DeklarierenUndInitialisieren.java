
public class Main_DeklarierenUndInitialisieren {

	public static void main(String[] args) {
		
		String firstname;
		String lastname;
		char sex;
		int age;
		String birthplace;
		boolean married;
		double salary;
		
		firstname = "Emanuel";
		lastname = "Leutgeb";
		sex = 'm';
		age = 24;
		birthplace = "Linz";
		married = false;
		salary = 15.51;
		
		System.out.println("Hello my name is " + firstname + " " + lastname + ".");
		System.out.println("My Sex is '" + sex + "' and i`m " + age + " years old.");
		System.out.println("I was born in " + birthplace + ".");
		System.out.println("Relationship status (J/N): " + married);
		System.out.println("My current salary is " + salary + " Euro.");

	}

}
