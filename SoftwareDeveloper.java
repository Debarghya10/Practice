public class SoftwareDeveloper extends Employee {

    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    SoftwareDeveloper( int employeeCode , String name , String programmingLanguage){
        super(employeeCode, name);
        this.programmingLanguage= programmingLanguage;
    }
// 		<name> (<employeeCode>), Software Developer with Programming Language: <programmingLanguage>//
     public String getDetails() {
        return super.getName()+ " ("+ super.getEmployeeCode()+"), Software Developer with Programming Language: "+ this.programmingLanguage;
    }
}



/*
 * TODO 1: Provide SoftwareDeveloper class which extends Employee class.
 *
 * TODO 2: Provide following attributes in the class.
 * 		- programmingLanguage: String
 * 		Also provide getters and setters for this attribute.
 *
 * TODO 3: Provide following constructor in the class.
 * 		SoftwareDeveloper(employeeCode: int, name: String, programmingLanguage: String)
 * 		this constructor need to call superclass constructor using super(). Also pass
 * 		employeeCode and name to the super class constructor.
 *
 * 		Also initialize programmingLanguage attribute using the constructor argument.
 *
 * TODO 4: Provide following method in the class.
 * 		getDetails(): String
 * 		This method should return the following output.
 * 		<name> (<employeeCode>), Software Developer with Programming Language: <programmingLanguage>
 * 		For example:
 * 		Ishwar (1001), Software Developer with Programming Language: Java
 *
 */