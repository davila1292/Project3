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
		case 'C':
			team1= "Argentina";
			team2= "Poland";
			team3= "Mexico";
			team4= "Saudi Arabia";
			break;
		case 'D':
			team1= "France";
			team2= "Australia";
			team3= "Tunisia";
			team4= "Denmark";
			break;
		case 'E':
			team1= "Japan";
			team2= "Spain";
			team3= "Germany";
			team4= "Costa Rica";
			break;
		case 'F':
			team1= "Morocco";
			team2= "Croatia";
			team3= "Belgium";
			team4= "Canada";
			break;
		case 'G':
			team1= "Brazil";
			team2= "Switzerland";
			team3= "Cameroon";
			team4= "Serbia";
			break;
		case 'H':
			team1= "Portugal";
			team2= "South Korea";
			team3= "Uruguay";
			team4= "Ghana";
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
