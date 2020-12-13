package Avikal.JavaMasterClass;

public class Movie {
	
	public String getName() {
		return name;
	}

	private String name;

	public Movie(String name) {
		this.name = name;
	}
	
	public String plot() {
		return "No Plot here";
	}
	
}

class JL50 extends Movie {
	public JL50() {
		super("JL50");
	}
	
	public String plot() {
		return "Time Travell";
	}
}

class Interstellar extends Movie {
	@Override
	public String plot() {
		// TODO Auto-generated method stub
		return "black Hole/Time Travell";
	}

	public Interstellar() {
		super("Interstellar");
	}
	
}

class HostalDayz extends Movie {

	@Override
	public String plot() {
		// TODO Auto-generated method stub
		return "Engineering Students Life";
	}

	public HostalDayz() {
		super("Hostel Dayz");
		// TODO Auto-generated constructor stub
	}
	
}

class Mirzapur extends Movie {

	@Override
	public String plot() {
		// TODO Auto-generated method stub
		return "The Killer Story of Mirzapur Dist (UP 63)";
	}

	public Mirzapur() {
		super("Mirzapur");
		// TODO Auto-generated constructor stub
	}
	
}

class Panchayat extends Movie {

	public Panchayat() {
		super("Panchayat");
		// TODO Auto-generated constructor stub
	}
	
//	PLOT ISNT AVALABLE IN THIS CLASS
	
}















