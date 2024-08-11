package chapter12;

import java.util.HashMap;
import java.util.Map;  
  
public class TestResults {

    public static Map getOriginalGrades(){
        
        Map grades = new HashMap();
        grades.put("Lahiru", 24);
        grades.put("Isuru", 32);
        grades.put("Janidu", 80);
        grades.put("Aki", 50);
        grades.put("Laya", 79);
        grades.put("Bas", 40);
        grades.put("Carlos", 59);
        grades.put("Amber", 55);
        grades.put("Rex", 95);
        grades.put("Jason", 63);
        grades.put("Nikolay", 32);

        return grades;
    }


    public static Map getMakeUpGrades(){
        Map grades = new HashMap();
        grades.put("Lahiru", 97);
        grades.put("Isuru", 82);
        grades.put("Janidu", 76);
        grades.put("Aki", 89);
        grades.put("Laya", 79);
        grades.put("Bas", 98);
        grades.put("Carlos", 80);
        grades.put("Amber", 95);
        grades.put("Rex", 90);
        grades.put("Jason", 62);
        grades.put("Nikolay", 79);

        return grades;
    }
}
