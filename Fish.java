public class Fish extends Animals implements Pet{
	
	private String name;
	
	protected Fish(int legs) {
		super(legs);
	}
	
	public Fish() {
		super(0);
		name = "Piscene";
	}
	
	public String walk() {
		return "Are you an imbecile. It does not have legs. It swims and flips around bumping into glass. ";
	}
	
	public String getName() {
		return name;
	}
	public String eat() {
		return "Fish likes to eat worms ";
	}
	public void setName(String name) {
		this.name = name;
		
	}

	public void play() {
System.out.println("Fish swim around. ");
		
	}
	


}