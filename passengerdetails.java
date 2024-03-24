package ticketbooking;

public class passenger {
	  String passengername;
     static int id=1;
	 String gender;
	int age;
    int passengerId;
	int number;
	String alloted;
	String berthpref;
	passenger(String name,int age,String gender,String bp){
		this.passengername=name;
		this.gender=gender;
		this.age=age;
		this.berthpref=bp;
		passengerId=id++;
		alloted="";
		number++;
	}

}
