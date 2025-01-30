package demo1;

public class DemoTest3 {
	
	public static void main(String[] args) {
		
		System.out.println("Java");
		
		char group = 'D';
		String team1 = "";
		String team2 = "";
		String team3 = "";
		String team4 = "";
		boolean isGroupExist = true;
		String message = "";
		
		switch(group) {
		
		case 'A':
			team1= "Netherlands";
			team2= "Senegal";
			team3= "Ecuador";
			team4= "Qatar";
			break;
		case 'B':
			team1= "England";
			team2= "United States";
			team3= "Iran";
			team4= "Wales";
			break;

		default:
			message = "WRONG GROUP";
			isGroupExist = false;
		}
		
		if(isGroupExist == true) {
			System.out.println("****************** GROUP " + group + " ******************");
			System.out.println(team1);
			System.out.println(team2);
			System.out.println(team3);
			System.out.println(team4);
		}else {
			System.out.println("GROUP " + group + " is not part of World Cup Table");
			System.out.println("Is Group " + group + " Exist: " + isGroupExist);
		
	}

}
}
