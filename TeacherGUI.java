import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class TeacherGUI{
    //declaring variables
    private JFrame frame,frame2;
    
    private JPanel panel,panel2;
    
    private JLabel backLabel, teacherIdLabel, teacherNameLabel, addressLabel, workingTypeLabel, employmentStatusLabel, 
    workingHoursLabel, departmentLabel, yearsOfExperienceLabel, gradedScoreLabel, 
    salaryLabel, specializationLabel, academicQualificationsLabel, performanceIndexLabel;

    //for Lecture section
    private JTextField backTxt,teacherIdTxt, teacherNameTxt, addressTxt, workingTypeTxt, employmentStatusTxt, 
    workingHoursTxt, departmentTxt, yearsOfExperienceTxt, gradedScoreTxt, 
    salaryTxt, specializationTxt, academicQualificationsTxt, performanceIndexTxt;
     
    //for all buttons
    private JButton backButton, tutorButton, addTutorButton, removeTutorButton, setSalaryButton, lecturerButton,
    gradeAssignmentButton, displayButton, clearButton, tutorDisplayButton, tutorClearButton;

    //for Tutor section
    private JTextField tutorIdTxt, tutorNameTxt, tutorAddressTxt, tutorWorkingTypeTxt, tutorEmploymentStatusTxt,
    tutorWorkingHoursTxt, tutorSalaryTxt, tutorSpecializationTxt, tutorAcademicQualificationsTxt,
    tutorPerformanceIndexTxt;

    private JLabel tutorIdLabel, tutorNameLabel, tutorAddressLabel, tutorWorkingTypeLabel,
    tutorWorkingHoursLabel, tutorEmploymentStatusLabel, tutorSalaryLabel, tutorSpecializationLabel,
    tutorAcademicQualificationsLabel, tutorPerformanceIndexLabel;

    private ArrayList<Teacher> teachers;
    public TeacherGUI(){
        teachers = new ArrayList<>();
        
        frame = new JFrame("TeacherGUI");
        //frame.setSize(800,800);
        frame.setTitle("Teacher Management");
        frame.setBounds(320,80,800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        //creating panel with GridBagLayout
        panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(13, 13, 13, 13);//add space or padding
                                                        //around the components
        //Initializing JLabel and TextField for input
        JLabel label = new JLabel("LECTURER");
        label.setBounds(320,30,200,30);
        Font font = new Font("Arial",Font.BOLD,30);
        label.setFont(font);
        frame.add(label);

        teacherIdLabel = new JLabel("Teacher Id");
        teacherIdLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(teacherIdLabel, constraints);

        teacherIdTxt = new JTextField(15);
        teacherIdTxt.setPreferredSize(new Dimension(15,25));
        teacherIdTxt.setFont(new Font("Arial", Font.PLAIN, 16));
        constraints.gridx = 1;
        panel.add(teacherIdTxt, constraints);

        teacherNameLabel = new JLabel("Teacher Name");
        teacherNameLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(teacherNameLabel, constraints);

        teacherNameTxt = new JTextField(15);
        teacherNameTxt.setPreferredSize(new Dimension(15,25));
        teacherNameTxt.setFont(new Font("Arial", Font.PLAIN, 16));
        constraints.gridx = 1;
        panel.add(teacherNameTxt, constraints);

        addressLabel = new JLabel("Address");
        addressLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(addressLabel, constraints);

        addressTxt = new JTextField(15);
        addressTxt.setPreferredSize(new Dimension(15,25));
        addressTxt.setFont(new Font("Arial", Font.PLAIN, 16));
        constraints.gridx = 1;
        panel.add(addressTxt, constraints);

        workingTypeLabel = new JLabel("Working Type");
        workingTypeLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(workingTypeLabel, constraints);

        workingTypeTxt = new JTextField(15);
        workingTypeTxt.setPreferredSize(new Dimension(15,25));
        workingTypeTxt.setFont(new Font("Arial", Font.PLAIN, 16));
        constraints.gridx = 1;
        panel.add(workingTypeTxt, constraints);

        employmentStatusLabel = new JLabel("Employment Status");
        employmentStatusLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        constraints.gridx = 0;
        constraints.gridy = 4;
        panel.add(employmentStatusLabel, constraints);

        employmentStatusTxt = new JTextField(15);
        employmentStatusTxt.setPreferredSize(new Dimension(15,25));
        employmentStatusTxt.setFont(new Font("Arial", Font.PLAIN, 16));
        constraints.gridx = 1;
        panel.add(employmentStatusTxt, constraints);

        workingHoursLabel = new JLabel("Working Hours");
        workingHoursLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        constraints.gridx = 0;
        constraints.gridy = 5;
        panel.add(workingHoursLabel, constraints);

        workingHoursTxt = new JTextField(15);
        workingHoursTxt.setPreferredSize(new Dimension(15,25));
        workingHoursTxt.setFont(new Font("Arial", Font.PLAIN, 16));
        constraints.gridx = 1;
        panel.add(workingHoursTxt, constraints);

        departmentLabel = new JLabel("Department");
        departmentLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        constraints.gridx = 0;
        constraints.gridy = 6;
        panel.add(departmentLabel, constraints);

        departmentTxt = new JTextField(15);
        departmentTxt.setPreferredSize(new Dimension(15,25));
        departmentTxt.setFont(new Font("Arial", Font.PLAIN, 16));
        constraints.gridx = 1;
        panel.add(departmentTxt, constraints);

        yearsOfExperienceLabel = new JLabel("Years Of Experience");
        yearsOfExperienceLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        constraints.gridx = 0;
        constraints.gridy = 7;
        panel.add(yearsOfExperienceLabel, constraints);

        yearsOfExperienceTxt = new JTextField(15);
        yearsOfExperienceTxt.setPreferredSize(new Dimension(15,25));
        yearsOfExperienceTxt.setFont(new Font("Arial", Font.PLAIN, 16));
        constraints.gridx = 1;
        panel.add(yearsOfExperienceTxt, constraints);

        gradedScoreLabel = new JLabel("Grade Score");
        gradedScoreLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        constraints.gridx = 0;
        constraints.gridy = 8;
        panel.add(gradedScoreLabel, constraints);

        gradedScoreTxt = new JTextField(15);
        gradedScoreTxt.setPreferredSize(new Dimension(15,25));
        gradedScoreTxt.setFont(new Font("Arial", Font.PLAIN, 16));
        constraints.gridx = 1;
        panel.add(gradedScoreTxt, constraints);

        //Buttons and their listeners for the action
        tutorButton = new JButton("Tutor");
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.NORTH;
        panel.add(tutorButton, constraints);
        tutorButton.setBackground(new Color(0,0,0));
        tutorButton.setForeground(Color.WHITE);
        tutorButton.setFont(new Font("Roboto" , Font.BOLD , 16));
        tutorButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    frame2 = new JFrame("Teacher Management");
                    frame2.setBounds(320,80,800,800);

                    frame2.setVisible(true);//show the current frame
                    frame.setVisible(false);//hide the previous frame
                    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setResizable(false);

                    //creating panel with GridBagLayout
                    panel2 = new JPanel(new GridBagLayout());
                    GridBagConstraints constraints = new GridBagConstraints();
                    constraints.fill = GridBagConstraints.HORIZONTAL;
                    constraints.insets = new Insets(11, 11, 11, 11);

                    //Initializing JLabel and TextField for input 
                    JLabel label2 = new JLabel("TUTOR");
                    label2.setBounds(340,30,200,30);
                    Font font = new Font("Arial",Font.BOLD,30);
                    label2.setFont(font);

                    frame2.add(label2);

                    tutorIdLabel = new JLabel("Teacher Id");
                    tutorIdLabel.setFont(new Font("Arial", Font.PLAIN, 16));
                    constraints.gridx = 0;
                    constraints.gridy = 0;
                    panel2.add(tutorIdLabel, constraints);

                    tutorIdTxt = new JTextField(15);
                    tutorIdTxt.setPreferredSize(new Dimension(15,25));
                    tutorIdTxt.setFont(new Font("Arial", Font.PLAIN, 16));
                    constraints.gridx = 1;
                    panel2.add(tutorIdTxt, constraints);

                    tutorNameLabel = new JLabel("Teacher Name");
                    tutorNameLabel.setFont(new Font("Arial", Font.PLAIN, 16));
                    constraints.gridx = 0;
                    constraints.gridy = 1;
                    panel2.add(tutorNameLabel, constraints);

                    tutorNameTxt = new JTextField(15);
                    tutorNameTxt.setPreferredSize(new Dimension(15,25));
                    tutorNameTxt.setFont(new Font("Arial", Font.PLAIN, 16));
                    constraints.gridx = 1;
                    panel2.add(tutorNameTxt, constraints);

                    tutorAddressLabel = new JLabel("Address");
                    tutorAddressLabel.setFont(new Font("Arial", Font.PLAIN, 16));
                    constraints.gridx = 0;
                    constraints.gridy = 2;
                    panel2.add(tutorAddressLabel, constraints);

                    tutorAddressTxt = new JTextField(15);
                    tutorAddressTxt.setPreferredSize(new Dimension(15,25));
                    tutorAddressTxt.setFont(new Font("Arial", Font.PLAIN, 16));
                    constraints.gridx = 1;
                    panel2.add(tutorAddressTxt, constraints);

                    tutorWorkingTypeLabel = new JLabel("Working Type");
                    tutorWorkingTypeLabel.setFont(new Font("Arial", Font.PLAIN, 16));
                    constraints.gridx = 0;
                    constraints.gridy = 3;
                    panel2.add(tutorWorkingTypeLabel, constraints);

                    tutorWorkingTypeTxt = new JTextField(15);
                    tutorWorkingTypeTxt.setPreferredSize(new Dimension(15,25));
                    tutorWorkingTypeTxt.setFont(new Font("Arial", Font.PLAIN, 16));
                    constraints.gridx = 1;
                    panel2.add(tutorWorkingTypeTxt, constraints);

                    tutorEmploymentStatusLabel = new JLabel("Employment Status");
                    tutorEmploymentStatusLabel.setFont(new Font("Arial", Font.PLAIN, 16));
                    constraints.gridx = 0;
                    constraints.gridy = 4;
                    panel2.add( tutorEmploymentStatusLabel, constraints);

                    tutorEmploymentStatusTxt = new JTextField(15);
                    tutorEmploymentStatusTxt.setPreferredSize(new Dimension(15,25));
                    tutorEmploymentStatusTxt.setFont(new Font("Arial", Font.PLAIN, 16));
                    constraints.gridx = 1;
                    panel2.add(tutorEmploymentStatusTxt, constraints);

                    tutorWorkingHoursLabel = new JLabel("Working Hours");
                    tutorWorkingHoursLabel.setFont(new Font("Arial", Font.PLAIN, 16));
                    constraints.gridx = 0;
                    constraints.gridy = 5;
                    panel2.add(tutorWorkingHoursLabel, constraints);

                    tutorWorkingHoursTxt = new JTextField(15);
                    tutorWorkingHoursTxt.setPreferredSize(new Dimension(15,25));
                    tutorWorkingHoursTxt.setFont(new Font("Arial", Font.PLAIN, 16));
                    constraints.gridx = 1;
                    panel2.add(tutorWorkingHoursTxt, constraints);

                    tutorSalaryLabel = new JLabel("Salary");
                    tutorSalaryLabel.setFont(new Font("Arial", Font.PLAIN, 16));
                    constraints.gridx = 0;
                    constraints.gridy = 6;
                    panel2.add(tutorSalaryLabel, constraints);

                    tutorSalaryTxt = new JTextField(15);
                    tutorSalaryTxt.setPreferredSize(new Dimension(15,25));
                    tutorSalaryTxt.setFont(new Font("Arial", Font.PLAIN, 16));
                    constraints.gridx = 1;
                    panel2.add(tutorSalaryTxt, constraints);

                    tutorSpecializationLabel = new JLabel("Specialization");
                    tutorSpecializationLabel.setFont(new Font("Arial", Font.PLAIN, 16));
                    constraints.gridx = 0;
                    constraints.gridy = 7;
                    panel2.add(tutorSpecializationLabel, constraints);

                    tutorSpecializationTxt = new JTextField(15);
                    tutorSpecializationTxt.setPreferredSize(new Dimension(15,25));
                    tutorSpecializationTxt.setFont(new Font("Arial", Font.PLAIN, 16));
                    constraints.gridx = 1;
                    panel2.add(tutorSpecializationTxt, constraints);

                    tutorAcademicQualificationsLabel = new JLabel("Academic Qualification");
                    tutorAcademicQualificationsLabel.setFont(new Font("Arial", Font.PLAIN, 16));
                    constraints.gridx = 0;
                    constraints.gridy = 8;
                    panel2.add(tutorAcademicQualificationsLabel, constraints);

                    tutorAcademicQualificationsTxt = new JTextField(15);
                    tutorAcademicQualificationsTxt.setPreferredSize(new Dimension(15,25));
                    tutorAcademicQualificationsTxt.setFont(new Font("Arial", Font.PLAIN, 16));
                    constraints.gridx = 1;
                    panel2.add(tutorAcademicQualificationsTxt, constraints);

                    tutorPerformanceIndexLabel = new JLabel("Performance Index");
                    tutorPerformanceIndexLabel.setFont(new Font("Arial", Font.PLAIN, 16));
                    constraints.gridx = 0;
                    constraints.gridy = 9;
                    panel2.add(tutorPerformanceIndexLabel, constraints);

                    tutorPerformanceIndexTxt = new JTextField(15);
                    tutorPerformanceIndexTxt.setPreferredSize(new Dimension(15,25));
                    tutorPerformanceIndexTxt.setFont(new Font("Arial", Font.PLAIN, 16));
                    constraints.gridx = 1;
                    panel2.add(tutorPerformanceIndexTxt, constraints);

                    addTutorButton = new JButton("Add Tutor");
                    constraints.gridx = 2;
                    constraints.gridy = 4;
                    constraints.anchor = GridBagConstraints.NORTH;
                    panel2.add(addTutorButton, constraints);
                    addTutorButton.setBackground(new Color(0,0,0));
                    addTutorButton.setForeground(Color.WHITE);
                    addTutorButton.setFont(new Font("Roboto" , Font.BOLD , 16));
                    addTutorButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    if(tutorIdTxt.getText().isEmpty() || tutorNameTxt.getText().isEmpty() || 
                                    tutorAddressTxt.getText().isEmpty() || tutorWorkingTypeTxt.getText().isEmpty() ||
                                    tutorEmploymentStatusTxt.getText().isEmpty() || tutorWorkingHoursTxt.getText().isEmpty()
                                    || tutorSalaryTxt.getText().isEmpty() || tutorSpecializationTxt.getText().isEmpty() ||
                                    tutorAcademicQualificationsTxt.getText().isEmpty() || tutorPerformanceIndexTxt.getText().isEmpty()) {
                                        JOptionPane.showMessageDialog(frame, "Please fill the empty field!!", "Empty Field", JOptionPane.ERROR_MESSAGE);
                                    } else {
                                        int teacherId = Integer.parseInt(tutorIdTxt.getText());
                                        String teacherName = tutorNameTxt.getText();
                                        String address = tutorAddressTxt.getText();
                                        String workingType = tutorWorkingTypeTxt.getText();
                                        String employmentStatus = tutorEmploymentStatusTxt.getText();
                                        int workingHours = Integer.parseInt(tutorWorkingHoursTxt.getText());
                                        double salary = Double.parseDouble(tutorSalaryTxt.getText());
                                        String specialization = tutorSpecializationTxt.getText();
                                        String academicQualifications = tutorAcademicQualificationsTxt.getText();
                                        int performanceIndex = Integer.parseInt(tutorPerformanceIndexTxt.getText());

                                        Tutor tutor = new Tutor(teacherId, teacherName, address, workingType, employmentStatus, workingHours, salary, specialization, academicQualifications, performanceIndex);
                                        teachers.add(tutor);
                                        JOptionPane.showMessageDialog(frame2, "Tutor added successfully!");
                                    }
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(frame2, "Invalid input. Please check your entries.");
                                }
                            }

                        }); 

                    removeTutorButton = new JButton("Remove Tutor");
                    constraints.gridx = 2;
                    constraints.gridy = 5;
                    constraints.anchor = GridBagConstraints.NORTH;
                    panel2.add(removeTutorButton, constraints);
                    removeTutorButton.setBackground(new Color(0,0,0));
                    removeTutorButton.setForeground(Color.WHITE);
                    removeTutorButton.setFont(new Font("Roboto" , Font.BOLD , 16));

                    removeTutorButton.addActionListener(new ActionListener() {

                            public void actionPerformed(ActionEvent e) {
                                try {
                                    int teacherId = Integer.parseInt(tutorIdTxt.getText());

                                    boolean found = false;
                                    for (Teacher teacher : teachers) {  //checks the teacher elements
                                        if (teacher instanceof Tutor && teacher.getteacherId() == teacherId) {
                                            Tutor tutor = (Tutor) teacher; //down casting
                                            String message1 = tutor.removeTutor();
                                            JOptionPane.showMessageDialog(frame2, message1);
                                            found = true;
                                            break;
                                        }
                                    }

                                    if (!found) {
                                        JOptionPane.showMessageDialog(frame2, "Tutor with the specified ID not found.");
                                    }
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(frame2, "Invalid input. Please check your entries.");
                                }
                            }
                        });

                    setSalaryButton = new JButton("Set Salary");
                    constraints.gridx = 2;
                    constraints.gridy = 6;
                    constraints.anchor = GridBagConstraints.NORTH;  
                    panel2.add(setSalaryButton, constraints);
                    setSalaryButton.setBackground(new Color(0,0,0));
                    setSalaryButton.setForeground(Color.WHITE);
                    setSalaryButton.setFont(new Font("Roboto" , Font.BOLD , 16));
                    setSalaryButton.addActionListener(new ActionListener() {

                            public void actionPerformed(ActionEvent e) {
                                try {
                                    int teacherId = Integer.parseInt(tutorIdTxt.getText());
                                    double newSalary = Double.parseDouble(tutorSalaryTxt.getText());
                                    int newPerformanceIndex = Integer.parseInt(tutorPerformanceIndexTxt.getText());

                                    boolean found = false;
                                    for (Teacher teacher : teachers) { 
                                        if (teacher instanceof Tutor && teacher.getteacherId() == teacherId) {
                                            Tutor tutor = (Tutor) teacher;
                                            String message = tutor.setSalary(newSalary, newPerformanceIndex);//Declaring a variable message1 to display message
                                            JOptionPane.showMessageDialog(frame2, message);
                                            found = true;
                                            break;
                                        }
                                    }

                                    if (!found) {
                                        JOptionPane.showMessageDialog(frame2, "Tutor with the specified ID not found.");
                                    }
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(frame2, "Invalid input. Please check your entries.");
                                }
                            }
                        });

                    tutorDisplayButton = new JButton("Display");
                    constraints.gridx = 2;
                    constraints.gridy = 7;
                    constraints.gridwidth = 1;
                    constraints.anchor = GridBagConstraints.NORTH;
                    panel2.add(tutorDisplayButton, constraints);
                    tutorDisplayButton.setBackground(new Color(0,0,0));
                    tutorDisplayButton.setForeground(Color.WHITE);
                    tutorDisplayButton.setFont(new Font("Roboto" , Font.BOLD , 16));
                    tutorDisplayButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                StringBuilder details = new StringBuilder("Teachers Details:\n");
                                for (Teacher teacher : teachers) {
                                    details.append("Teacher ID: ").append(teacher.getteacherId()).append("\n")
                                    .append("Teacher Name: ").append(teacher.getteacherName()).append("\n")
                                    .append("Address: ").append(teacher.getaddress()).append("\n")
                                    .append("Working Type: ").append(teacher.getworkingType()).append("\n")
                                    .append("Employment Status: ").append(teacher.getemploymentStatus()).append("\n");

                                    if (teacher instanceof Tutor) {
                                        Tutor tutor = (Tutor) teacher;
                                        details.append("Working Hours: ").append(tutor.getworkingHours()).append("\n")
                                        .append("Salary: ").append(tutor.getsalary()).append("\n")
                                        .append("Specialization: ").append(tutor.getspecialization()).append("\n")
                                        .append("Academic Qualifications: ").append(tutor.getacademicQualifications()).append("\n")
                                        .append("Performance Index: ").append(tutor.getperformanceIndex()).append("\n");
                                    }
                                    details.append("----------------------\n");
                                }

                                JOptionPane.showMessageDialog(frame2, details.toString());
                            }
                        });

                    tutorClearButton = new JButton("Clear");
                    constraints.gridx = 2;
                    constraints.gridy = 8;
                    constraints.gridwidth = 1;
                    constraints.anchor = GridBagConstraints.NORTH;
                    panel2.add(tutorClearButton, constraints);
                    tutorClearButton.setBackground(new Color(0,0,0));
                    tutorClearButton.setForeground(Color.WHITE);
                    tutorClearButton.setFont(new Font("Roboto" , Font.BOLD , 16));
                    tutorClearButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                JOptionPane.showMessageDialog(frame, "Do you want to clear all fields?","Clear",JOptionPane.WARNING_MESSAGE);

                                tutorIdTxt.setText("");
                                tutorNameTxt.setText("");
                                tutorAddressTxt.setText("");
                                tutorWorkingTypeTxt.setText("");
                                tutorEmploymentStatusTxt.setText("");
                                tutorWorkingHoursTxt.setText("");
                                tutorSalaryTxt.setText("");
                                tutorSpecializationTxt.setText("");
                                tutorAcademicQualificationsTxt.setText("");
                                tutorPerformanceIndexTxt.setText("");
                            }
                        });

                    backButton = new JButton("<--Back");
                    constraints.gridx = 0;
                    constraints.gridy = 13;
                    constraints.gridwidth = 1;
                    constraints.anchor = GridBagConstraints.NORTHWEST;
                    panel2.add(backButton, constraints);
                    backButton.setBackground(new Color(0,0,0));
                    backButton.setForeground(Color.WHITE);
                    backButton.setFont(new Font("Roboto" , Font.BOLD , 16));

                    backButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame2.setVisible(false); // Hide the current frame
                                frame.setVisible(true);    // Show the previous frame
                            }
                        });

                    frame2.getContentPane().add(panel2, BorderLayout.CENTER);
                    frame2.setVisible(true);

                }
            });

        lecturerButton = new JButton("Add Lecturer");
        constraints.gridx = 2;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.NORTH;
        panel.add(lecturerButton, constraints);
        lecturerButton.setBackground(new Color(0,0,0));
        lecturerButton.setForeground(Color.WHITE);
        lecturerButton.setFont(new Font("Roboto" , Font.BOLD , 16));
        lecturerButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    try{
                        if(teacherIdTxt.getText().isEmpty()||teacherNameTxt.getText().isEmpty()||addressTxt.getText().isEmpty()||workingTypeTxt.getText().isEmpty()||employmentStatusTxt.getText().isEmpty()||workingHoursTxt.getText().isEmpty()||departmentTxt.getText().isEmpty()||yearsOfExperienceTxt.getText().isEmpty()||gradedScoreTxt.getText().isEmpty()){
                            JOptionPane.showMessageDialog(frame,"Please fill the empty fields!!","Empty Field Found",JOptionPane.ERROR_MESSAGE);

                        }
                        else{
                            int teacherId = Integer.parseInt(teacherIdTxt.getText());
                            String teacherName = teacherNameTxt.getText();
                            String address = addressTxt.getText();
                            String workingType = workingTypeTxt.getText();
                            String employmentStatus = employmentStatusTxt.getText();
                            int workingHours = Integer.parseInt(workingHoursTxt.getText());
                            String department = departmentTxt.getText();
                            int yearsOfExperience = Integer.parseInt(yearsOfExperienceTxt.getText());
                            int gradedScore = Integer.parseInt(gradedScoreTxt.getText());

                            Lecturer lecturer = new Lecturer(teacherId, teacherName, address, workingType, workingHours, employmentStatus, department, yearsOfExperience);
                            teachers.add(lecturer);
                            JOptionPane.showMessageDialog(frame, "Lecturer added successfully!");
                        }
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(frame, "Invalid input. Please check your entries");
                    }
                }
            });

        gradeAssignmentButton = new JButton("Grade Assignment");
        constraints.gridx = 2;
        constraints.gridy = 5;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.NORTH;
        panel.add(gradeAssignmentButton, constraints);
        gradeAssignmentButton.setBackground(new Color(0,0,0));
        gradeAssignmentButton.setForeground(Color.WHITE);
        gradeAssignmentButton.setFont(new Font("Roboto" , Font.BOLD , 16));
        gradeAssignmentButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    try{
                        int teacherId = Integer.parseInt(teacherIdTxt.getText());
                        int gradedScore = Integer.parseInt(gradedScoreTxt.getText());
                        String department = departmentTxt.getText();
                        int yearsOfExperience = Integer.parseInt(yearsOfExperienceTxt.getText());

                        boolean found = false;
                        for (Teacher teacher : teachers) {
                            if(teacher instanceof Lecturer && teacher.getteacherId() == teacherId){
                                Lecturer lecturer = (Lecturer) teacher;
                                String grade = lecturer.gradeAssignment(gradedScore, department, yearsOfExperience);
                                JOptionPane.showMessageDialog(frame, "Assigned successfully: " + grade);
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            JOptionPane.showMessageDialog(frame, "Lecturer with the specified ID not found.");
                        }
                    }catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Invalid input. Please check your entries");

                    }
                }
            });

        displayButton = new JButton("Display");
        constraints.gridx = 2;
        constraints.gridy = 6;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.NORTH;
        panel.add(displayButton, constraints);
        displayButton.setBackground(new Color(0,0,0));
        displayButton.setForeground(Color.WHITE);
        displayButton.setFont(new Font("Roboto" , Font.BOLD , 16));
        displayButton.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    StringBuilder details = new StringBuilder("Teachers Details:\n");

                    for (Teacher teacher : teachers) {
                        details.append("Teacher ID: ").append(teacher.getteacherId()).append("\n")
                        .append("Teacher Name: ").append(teacher.getteacherName()).append("\n")
                        .append("Address: ").append(teacher.getaddress()).append("\n")
                        .append("Working Type: ").append(teacher.getworkingType()).append("\n")
                        .append("Employment Status: ").append(teacher.getemploymentStatus()).append("\n");

                        if (teacher instanceof Lecturer) {
                            Lecturer lecturer = (Lecturer) teacher;
                            details.append("Department: ").append(lecturer.getdepartment()).append("\n")
                            .append("Years of Experience: ").append(lecturer.getyearsOfExperience()).append("\n")
                            .append("Graded Score: ").append(lecturer.getgradedScore()).append("\n");
                        }                     details.append("---------------------------\n");
                    }

                    JOptionPane.showMessageDialog(frame, details.toString());
                }
            });

        clearButton = new JButton("Clear");
        constraints.gridx = 2;
        constraints.gridy = 7;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.NORTH;
        panel.add(clearButton, constraints);
        clearButton.setBackground(new Color(0,0,0));
        clearButton.setForeground(Color.WHITE);
        clearButton.setFont(new Font("Roboto" , Font.BOLD , 16));
        clearButton.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(frame, "Do you want to clear all fields?","Clear",JOptionPane.WARNING_MESSAGE);

                    teacherIdTxt.setText("");
                    teacherNameTxt.setText("");
                    addressTxt.setText("    ");
                    workingTypeTxt.setText("");
                    employmentStatusTxt.setText("");

                    workingHoursTxt.setText("");
                    departmentTxt.setText("");
                    yearsOfExperienceTxt.setText("");
                    gradedScoreTxt.setText("");

                }
            });

        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true); 
    }

    public static void main(String[] args){
        new TeacherGUI();
    }

}

