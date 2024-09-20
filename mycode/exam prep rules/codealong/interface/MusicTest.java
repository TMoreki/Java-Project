 interface Musician{
	private String getName();
	private String getSong();
}

class Pac implements Musician{
	public String getName(){
		return "2Pac";
	}
	public String getSong(){
		return "Dear Mama";
	}
}

class BIG implements Musician{
	public String getName(){
		return "BIGGY";
	}
	public String getSong(){
		return "Sky is the limit";
	}
}

public class MusicTest{
	public static void main(String[] args){
		Musician [] musician = new Musician[]{new Pac(),new BIG()};

		for(int i = 0; i < musician.length;i++){
			System.out.println("Name:"+ musician[i].getName());
			System.out.println("Song:"+ musician[i].getSong());
		}
	}
}