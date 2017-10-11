
public class Cat extends Animals implements Pet{
private String Name;

	public Cat ( ) {
		super(4);
		Name = "Felix";
	}
		public Cat(String Name) {
			super(4);
			this.Name = Name;
			legs = 4;
		}

	public String getName () {
		return Name;
	}
		public void setName(String name) {
			this.Name = Name;
			
			
		}
		public String eat () {
			return "Cat is eating";
			}
		public void play() {
			System.out.print("Cat scratches you ");
			
		}
		
	
}
