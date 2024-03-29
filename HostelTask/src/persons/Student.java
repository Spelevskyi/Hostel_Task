package persons;

import utils.Random;

public class Student {
    private int courseNumber;
    
    public Student() {
        super();
    }
    
    public Student(int courseNumber) {
        this.courseNumber = courseNumber;
    }
    
    public int getCourseNumber() {
        return courseNumber;
    }
    
    public void newCourse() {
        courseNumber++;
    }
    
    public boolean universityExpulsion() {
        return Random.generateQualitieValue() == 1;
    }
}
