package tr.org.linux.kamp.ex;

public class CollegeTest {
	public static void main(String[] args) {
		
		Students std1 = new Students("Eray",1);
		Students std2 = new Students("Seden",2);
		Students std3 = new Students("Oğuz",3);
		Students std4= new Students("Kaan",4);
		Students std5 = new Students("Özge",5);
		
		
		
		Department dpt = new Department("Bilgisayar","Mühendislik");
		dpt.addStudent(std1);
		dpt.addStudent(std2);
		dpt.addStudent(std3);
		dpt.addStudent(std4);
		dpt.addStudent(std5);
	
		Course crs1 = new Course("Algorithm",dpt,"Hakan Kutucu");
		Course crs2 = new Course("Java",dpt,"Adilcan Eren");
		Course crs3 = new Course("Java-",dpt,"Büşra Uman");
		
		crs1.registerToCourse(std1);
		crs1.registerToCourse(std2);
		crs2.registerToCourse(std3);
		crs3.registerToCourse(std4);
		crs3.registerToCourse(std5);
		
		System.out.println(dpt.toString());
		System.out.println(crs1.toString());
		System.out.println(crs2.toString());
		System.out.println(crs3.toString());
		
		
		
	}

}
