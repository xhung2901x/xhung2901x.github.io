package Lab6;

public class PartTimeEmployee extends Employee implements IEmployee{
    
    public int workingHours;

    public PartTimeEmployee() {
        
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        super.setName(name);
    }

    @Override
    public int calculatorSalary() {
        // TODO Auto-generated method stub
        return 0;
    }

    
}
