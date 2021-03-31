
public class Drawing {

	String petName;
	int age;
	double weight;
	boolean isCat;
	
	Drawing(String petName, int age, double weight, boolean isCat){
		this.petName = petName;
		this.age = age;
		this.weight = weight;
		this.isCat = isCat;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Drawing drawingOfTosha = new Drawing("Tosha", 6 , 8.6, true);
		
		System.out.println(String.format("Name: %1$s, \nAge: %1$d \nWeight: %1$.2f \nIt is %1$b \n that %1$s \n is a cat!", drawingOfTosha));

	}

}
