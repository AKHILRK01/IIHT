package Animal;

public class Animal {
	public static final int length = 0;
	private String name;
	private String breed;
	private int age;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public Animal(){
		
	}

	void getAnimalLifestyle()
	{

		System.out.println("name=" + this.name + "breed="+ this.breed + "age="+this.age);
	}

	public static Object getcount() {
		// TODO Auto-generated method stub
		return null;
	}
	}


