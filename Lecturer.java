public class Lecturer extends Teacher
    {
    //additional attributes for subclass lecturer
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    
    //constructors//
      public Lecturer(int teacherId, String teacherName, String address, String workingType, int workingHours, String employmentStatus, String department, int yearsOfExperience)
    {
        //super class constructors
        super(teacherId, teacherName, address, workingType, employmentStatus);
        //call for WorkingHours
        super.setworkingHours(workingHours); 
        
        
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.gradedScore = 0;
        this.hasGraded = false;
    }
    //  getter method(accessor) //
    public String getdepartment()
    {
        return department;
    }
    public int getyearsOfExperience()
    {
        return yearsOfExperience;
    }
    public int getgradedScore()
    {
        return gradedScore;
    }
    public void setgradedScore(int gradedScore)//setter method for gradedScore 
    {
        this.gradedScore = gradedScore;
    }
    public boolean gethasGraded()
    {
        return hasGraded;
    }
    //Method for grade assignments of students//
    public String gradeAssignment(int score, String department, int yearsOfExperience)
    {
        if(( yearsOfExperience >=5) && (getdepartment().equals(department)))
        {
            hasGraded = true;
            this.gradedScore=score;
            if (score >= 70 && score <=100)//taking 'A' as full score 
            {
                return "Grade: A";
            }
            else if (score >= 60)
            {
                return "Grade: B";
            }
            else if (score >= 50)
            {
                return "Grade: C";
            }
            else if (score >= 40)
            {
                return "Grade: D";
            }
            else
            {
                return "Grade: E";
            }
        }
        else
        {
           return("Assignment hasn't been graded yet ");
        }
    }
      
     public void display()
     {
        super.display();//call the displayTeacherDetails
        System.out.println("Department: "+getdepartment());
        System.out.println("Years Of Experience:" +getyearsOfExperience());
        if(hasGraded)
        {
            System.out.println("Graded Score: "+getgradedScore());    
        }
        else
        {
            System.out.println("Score has not been graded yet");
        }
     }
    
    }
    
    
    

