package Avikal.JavaMasterClass;

public class Bedroom {

	private RoomWall wall1;
	private RoomWall wall2;
	private RoomWall wall3;
	private RoomWall wall4;
	
	private Ceiling ceiling;
	
	private Lamp lamp;
	
	private Bed bed;

	public Bedroom(RoomWall wall1, RoomWall wall2, RoomWall wall3, RoomWall wall4, Ceiling ceiling, Lamp lamp, Bed bed) {
		this.wall1 = wall1;
		this.wall2 = wall2;
		this.wall3 = wall3;
		this.wall4 = wall4;
		this.ceiling = ceiling;
		this.lamp = lamp;
		this.bed = bed;
	}
	
	public Lamp getLamp() {
		return this.lamp;
	}
	
	public void makeBed() {
		System.out.println("Bedroom -> Making Bedroom");
		bed.make();
	}
	
	
}



//		public static void main(String[] args) {
//			
//			RoomWall wall1 = new RoomWall("East");
//			RoomWall wall2 = new RoomWall("North");
//			RoomWall wall3 = new RoomWall("West");
//			RoomWall wall4 = new RoomWall("South");
//			
//			Ceiling ceiling =  new Ceiling(8, 55);
//			
//			Lamp lamp = new Lamp("Modern", true, 95);
//			
//			Bed bed = new Bed("Comfortable", 6, 2, 2);
//			
//			Bedroom bedroom = new Bedroom(wall1, wall2, wall3, wall4, ceiling, lamp, bed);
//			
//			bedroom.makeBed();
//			bedroom.getLamp().turnOn();
//		}
