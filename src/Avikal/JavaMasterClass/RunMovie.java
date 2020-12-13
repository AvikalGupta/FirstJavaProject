package Avikal.JavaMasterClass;

public class RunMovie {
	
	public static void main() {
		for(int i = 1; i <= 20; i++) {
			Movie movie = randomMovie();
			System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
		}
		
		
	}
	
	public static Movie randomMovie() {
		int randomNumber = (int) (Math.random() * 5) + 1;
		System.out.println("Random Generated Nimbe was: " + randomNumber);
		switch(randomNumber) {
		
			case 1:
				return new JL50();
			case 2:
				return new Interstellar();
			case 3: 
				return new HostalDayz();
			case 4:
				return new Mirzapur();
			case 5: 
				return new Panchayat();
		}
		
		return null;
	}
	
}
	
	
