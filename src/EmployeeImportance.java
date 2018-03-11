import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeImportance {
    public int getImportance(List<Employee> employees, int id) {
        int empImportance = 0;
        List<Integer> subordinates = null;
        Map<Integer,Integer> employeeImportance = new HashMap<>();
        for(Employee emp:employees){
            if(emp.id == id){
                subordinates = emp.subordinates;
            }
            employeeImportance.put(emp.id,emp.importance);
        }
        if(subordinates == null)return employeeImportance.get(id);
        empImportance = employeeImportance.get(id);
        for(int k=0 ;k<subordinates.size();++k){
            empImportance += employeeImportance.get(subordinates.get(k));
        }
        return empImportance;
    }
}
