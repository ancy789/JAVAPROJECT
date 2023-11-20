package practical1;


interface ResumeDetails
{
	public void personelDetails();
	public void educationDetails();
	public void skills();
	public void exp();
}
class Resume implements ResumeDetails
{
	static String name="Ancy K J";
	static long  ph=9876545677l;
	static String emailId="ancyjose@gmail.com";
	
	@Override
	public void personelDetails() {
		
		System.out.println("------Personnel Details ");
		System.out.println("Name="+name);
		System.out.println("Phone No="+ph);
		System.out.println("Email id="+emailId);
		
		
	}
	@Override
	public void educationDetails() {
		System.out.println();
		System.out.println("------Education Details------");
		System.out.println("PG = MCA");
		System.out.println("UG = BCA");
		System.out.println("Plus Two");
		System.out.println("SSLC");
		
	}
	@Override
	public void skills() {
		System.out.println();
		System.out.println("------Skills------");
		System.out.println("Focused");
		System.out.println("Hard Working");
		System.out.println("Adaptability");
		
	}
	@Override
	public void exp() {
		System.out.println();
		System.out.println("------Experience------");
		System.out.println("Software developer- 10 months");
		
	}
	
}

public class ResumePrep {

	public static void main(String[] args) {
		Resume ob=new Resume();
		ob.personelDetails();
		ob.educationDetails();
		ob.skills();
		ob.exp();
		

	}

}
