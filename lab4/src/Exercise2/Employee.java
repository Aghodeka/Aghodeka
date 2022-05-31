package Exercise2;

public class Employee {
	private int id;
	private String name;
	private Double salary;
	private String designation;
	private String insuranceScheme;
	
	public Employee() {
	
	}
	
	public Employee(Integer id, String name, Double salary, String designation, String insuranceScheme)
	{
		super();
		this.id = id ;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
	}
	public int getId() {
		return id;
		
	}
    public void setId(int id)
    {
    	this.id = id;
    }
    
    public String getName()
    {
		return name;
    	
    }
    
    public void setName(String name)
    {
    	this.name = name;
    }
    
    public Double getsalary()
    {
		return salary;
    	
    }
	public void setSalary(Double Salary)
	{
		this.salary = salary;
	}
    
    public String getDesignation()
    {
		return designation;
    	
    }
    public void setDisgnation(String Designation)
    {
    	this.designation = Designation;
    			
    }
    
    public String getinsuranceScheme()
    {
		return insuranceScheme   ;
    	
    }
    
    public void setinsuranceScheme(String insuranceScheme)
    {
    	this.insuranceScheme = insuranceScheme;
    }
    
    
    public String toString() {
		return "Employee [id =" + id + ", name=" +name +",salary=" + salary+ ", designation =" + designation +",insurancecheme=" + insuranceScheme+"}";
    	
    }
    
 
    
    
   

	}


