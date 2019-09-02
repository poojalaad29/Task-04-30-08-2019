
public class Project {
	int id,Duration;String Title,Client;

     static Project p1=new Project(101,4,"Security app","IBM");
     static Project p2=new Project(102,4,"Ecommerce","TCS");
     static Project p3=new Project(103,5,"Website","Scott");
     static Project p4=new Project(104,6,"Desktop Application","IBM");
     
	public Project(int id, int duration, String title, String client) {
		super();
		this.id = id;
		Duration = duration;
		Title = title;
		Client = client;
	}

	public Project() {
		super();
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", Duration=" + Duration + ", Title=" + Title + ", Client=" + Client + "]";
	}
	

}
