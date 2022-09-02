
public class Hero {
	//Field
	private String name;
	private int bloodVolume;
	private int armor;
	private double moveSpeed;
	private int killed;


	public String getName(){
		return this.name;
	}
	public void setName(String newName){
		this.name = newName;
	}

	 public void keng(){
		System.out.println("坑队友");
	
	}
	public int getKilled(){
		return this.killed;
	}
	public void setKilled(int kill){
		this.killed = kill;
		
	}
//Constructor
	public Hero() {}
	public Hero(String name,int bloodVolume,int armor,double moveSpeed) {
		this.name = name;
		this.bloodVolume = bloodVolume;
		this.armor = armor;
		this.moveSpeed = moveSpeed;
	}

}

class MyTest {
	public static void main(String args[]) {
		Hero garen = new Hero("garen",616,27,350);
		Hero teemo = new Hero("teemo",383,14,330);
		System.out.println(garen.getName());
		System.out.println(garen.getKilled()); //0
		garen.setKilled(9);
		System.out.println(garen.getKilled());
		//System.out.println(teemo.name);
	}
}