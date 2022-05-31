package Exercise1;

public class person {
	private String name;
	private Float age;
	
	public person ()
	{
		
	}
       public person (String name , Float age)
       {
    	   super();
    	   this.name = name ;
    	   this.age = age;
       }
       public String getName()
       {
		return name;
    	   
       }
       public void setName(String name) {
    	   this.name = name;
       }
       public Float getAge() {
		return age;
    	   
       }
       public void setAge(Float Age) {
    	   this.age = age;
       }
       public String toString() {
		return "person [name" + name+ ",age="+age +"]";
    	   
       }
}
