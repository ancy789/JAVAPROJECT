package constructor;


class Students1
{
	String stname;
	int stno;
	
	public String getStname() 
	{
		return stname;
	}
	public void setStname(String stname)
	{
		this.stname = stname;
	}
	public int getStno() {
		return stno;
	}
	public void setStno(int stno)
	{
		this.stno = stno;
	}
	
}

public class EncapsulationEx {

	public static void main(String[] args) 
	{
		Students1 ob=new Students1();
		ob.setStname("Anu");
		ob.setStno(100);
		System.out.println("Name="+ob.getStname());
		System.out.println("No="+ob.getStno());	
	}

}
