
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class RigoTechnology implements ActionListener{ 
    JTextField platform1_Text, workingHour1_text ,salary_Text ,interviewer1_Text ,appointed_Bytext , terminationDate_text ,platform2_Text, workingHour2_text, salary2_Text,
    interviewer2_Text, contractPeriod_text, name1_Text, specialization_Text, developerNotext_1, appointDate_text, termiDate_text, name2_Text,  joiningDate_text, developerNotext_2,
    roomNo_text, advanceSlry_text;
    
    JButton junior_Btn, senior_Btn, appoint_Btn, termi_Btn, appointJr_btn, display_Btn, clear_Btn;
    
     JLabel labelJAdd,platform_1,working_Hour1 ,Salary ,Interviewer1 ,appointed_By ,termination_Date,labelSAdd ,Platform2 ,workingHour_2 , Salary2 ,
     Interviewer2,contract_Period,label_Junior ,Name1 ,Specialization ,developerNo_1 ,appoint_Date ,Termi_Date ,labelSenior ,Name2 ,joining_Date ,developerNo_2 ,room_No
     ,advance_Slry ;
    
    ArrayList<Developer> developerList = new ArrayList<>();
        
    // instance variables - replace the example below with your own
    public static void main(String arg[])
    {
        RigoTechnology obj= new RigoTechnology();
        obj.GUI();
    }
        
    public void GUI()
    {
        JFrame jFrame = new JFrame("Rigo Technology");
        jFrame.setSize(670,675);
        jFrame.setLayout(null);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container container = jFrame.getContentPane();
        
        //Label along with textfield starts from here:
        JLabel labelJAdd = new JLabel("Add platform for Junior Developer", JLabel.CENTER);
        labelJAdd.setBounds(-100, 10, 450, 70);
        
        JLabel platform_1 = new JLabel("Platform:");
        platform_1.setBounds(30, 60, 120, 30);
        
        platform1_Text = new JTextField();
        platform1_Text.setBounds(100, 60 , 125, 30);
        
        JLabel working_Hour1 = new JLabel("Working Hour:");
        working_Hour1.setBounds(270, 60, 120, 30);
        
        workingHour1_text = new JTextField();
        workingHour1_text.setBounds(360, 60 , 95, 30);
                       
        JLabel Salary = new JLabel("Salary:");
        Salary.setBounds(470, 60 , 120, 30);
        
        salary_Text = new JTextField();
        salary_Text.setBounds(520, 60, 110, 30);
                
        JLabel Interviewer1 = new JLabel("Interviewer:");
        Interviewer1.setBounds(30, 95, 120, 30);
        
        interviewer1_Text = new JTextField();
        interviewer1_Text.setBounds(100, 95 , 150, 30);
        
        JLabel appointed_By = new JLabel("Appointed By:");
        appointed_By.setBounds(270, 95 , 110, 30);
        
        appointed_Bytext = new JTextField();
        appointed_Bytext.setBounds(360, 95, 95, 30);
        
        JLabel termination_Date = new JLabel("Termi. Date:");
        termination_Date.setBounds(470, 95, 100, 30);
        
        terminationDate_text = new JTextField();
        terminationDate_text.setBounds(545, 95, 85 ,30);
        
        
        JLabel labelSAdd = new JLabel("Add platform for Senior Developer", JLabel.CENTER);
        labelSAdd.setBounds(-100, 150, 450, 70);
        
        JLabel Platform2 = new JLabel("Platform:");
        Platform2.setBounds(30, 200, 120, 30);
        
        platform2_Text = new JTextField();
        platform2_Text.setBounds(100, 200 , 125, 30);
        
        JLabel workingHour_2 = new JLabel("Working Hour:");
        workingHour_2.setBounds(270, 200, 120, 30);
        
        workingHour2_text = new JTextField();
        workingHour2_text.setBounds(360, 200 , 95, 30);
                       
        JLabel Salary2 = new JLabel("Salary:");
        Salary2.setBounds(470, 200 , 120, 30);
        
        salary2_Text = new JTextField();
        salary2_Text.setBounds(520, 200, 110, 30);
                
        JLabel Interviewer2 = new JLabel("Interviewer:");
        Interviewer2.setBounds(30, 235, 120, 30);
        
        interviewer2_Text = new JTextField();
        interviewer2_Text.setBounds(100, 235 , 150, 30);
        
        JLabel contract_Period = new JLabel("Contract Period:");
        contract_Period.setBounds(445, 235, 100, 30);
        
        contractPeriod_text = new JTextField();
        contractPeriod_text.setBounds(545, 235, 85 ,30);
        
        
        JLabel label_Junior = new JLabel("Appoint Junior Developer", JLabel.CENTER);
        label_Junior.setBounds(-125, 300, 450, 50);
        
        JLabel Name1 = new JLabel("Name:");
        Name1.setBounds(30, 340, 120, 30);
        
        name1_Text = new JTextField();
        name1_Text.setBounds(100, 340 , 330, 30);
        
        JLabel Specialization = new JLabel("Specialization:");
        Specialization.setBounds(450, 340, 120, 30);
        
        specialization_Text = new JTextField();
        specialization_Text.setBounds(535, 340, 95, 30);
        
        JLabel developerNo_1 = new JLabel("Dev No:");
        developerNo_1.setBounds(30, 375, 120, 30);
        
        developerNotext_1 = new JTextField();
        developerNotext_1.setBounds(100, 375 , 90, 30);
        
        JLabel appoint_Date = new JLabel("Appoint Date:");
        appoint_Date.setBounds(240, 375, 120, 30);
        
        appointDate_text = new JTextField();
        appointDate_text.setBounds(320, 375, 110, 30);
                
        JLabel Termi_Date = new JLabel("Termi Date:");
        Termi_Date.setBounds(450, 375, 130, 30);
        
        termiDate_text = new JTextField();
        termiDate_text.setBounds(535, 375, 95, 30);
        
        
        JLabel labelSenior = new JLabel("Appoint/Terminate Senior Developer", JLabel.CENTER);
        labelSenior.setBounds(-95, 450, 450, 50);
        
        JLabel Name2 = new JLabel("Name:");
        Name2.setBounds(30, 490, 120, 30);
        
        name2_Text = new JTextField();
        name2_Text.setBounds(100, 490 , 330, 30);
        
        JLabel joining_Date = new JLabel("Joining date:");
        joining_Date.setBounds(450, 490, 120, 30);
        
        joiningDate_text = new JTextField();
        joiningDate_text.setBounds(530, 490, 100, 30);
        
        JLabel developerNo_2 = new JLabel("Dev No:");
        developerNo_2.setBounds(30, 525, 120, 30);
        
        developerNotext_2 = new JTextField();
        developerNotext_2.setBounds(100, 525 , 90, 30);
       
        JLabel room_No = new JLabel("Room No:");
        room_No.setBounds(260, 525, 120, 30);
        
        roomNo_text = new JTextField();
        roomNo_text.setBounds(320, 525, 110, 30);
        
        JLabel advance_Slry = new JLabel("Adv Salary:");
        advance_Slry.setBounds(450, 525, 90, 30);
        
         advanceSlry_text = new JTextField();
        advanceSlry_text.setBounds(530, 525, 100, 30);
        
        //--Label ends here---
        //---field ends here---
        
        //button starts here:
        junior_Btn = new JButton("Add for Junior");
        junior_Btn.setBounds(510, 130, 120, 30);
        jFrame.add(junior_Btn);
        
        senior_Btn = new JButton("Add for Senior");
        senior_Btn.setBounds(510, 270, 120, 30);
        jFrame.add(senior_Btn);
        
        appoint_Btn = new JButton("Appoint");
        appoint_Btn.setBounds(370, 570, 120, 30);
        jFrame.add(appoint_Btn);
        
        termi_Btn = new JButton("Terminate");
        termi_Btn.setBounds(510, 570, 120, 30);
        jFrame.add(termi_Btn);
        
        appointJr_btn = new JButton("Appoint Junior Dev");
        appointJr_btn.setBounds(430, 415, 200, 30);
        jFrame.add(appointJr_btn);
        
        display_Btn = new JButton("Display All");
        display_Btn.setBounds(230, 570, 120, 30);
        jFrame.add(display_Btn);
        
        clear_Btn = new JButton("Clear");
        clear_Btn.setBounds(90, 570, 120, 30);
        jFrame.add(clear_Btn);
        //--button ends here--
        
        //container starts here:
        container.setLayout(null);
        container.add(labelJAdd);
        container.setLayout(null);
        container.add(labelSAdd);
        container.setLayout(null);
        container.add(labelSenior);
        container.setLayout(null);
        container.add(label_Junior);
        container.add(platform1_Text);
        container.add(workingHour1_text);
        container.add(Interviewer1);
        container.add(interviewer1_Text);
        container.add(Salary);
        container.add(salary_Text);
        container.add(appointed_By);
        container.add(appointed_Bytext);
        container.add(termination_Date);
        container.add(terminationDate_text);
        container.add(Platform2);
        container.add(platform2_Text);
        container.add(workingHour_2);
        container.add(workingHour2_text);
        container.add(Salary2);
        container.add(salary2_Text);
        container.add(Interviewer2);
        container.add(interviewer2_Text);
        container.add(contract_Period);
        container.add(contractPeriod_text);
        container.add(name1_Text);        
        container.add(joiningDate_text);
        container.add(developerNotext_1);
        container.add(roomNo_text);
        container.add(advanceSlry_text);
        container.add(name2_Text);
        container.add(specialization_Text);
        container.add(developerNotext_2);
        container.add(appointDate_text);
        container.add(termiDate_text);
        container.add(platform_1);
        container.add(working_Hour1);
        container.add(Name1);
        container.add(developerNo_1);
        container.add(joining_Date);
        container.add(room_No);
        container.add(advance_Slry);
        container.add(Name2);
        container.add(Specialization);
        container.add(developerNo_2);
        container.add(appoint_Date);
        container.add(Termi_Date);
        //--container ends here--
        
        junior_Btn.addActionListener(this);
        senior_Btn.addActionListener(this);
        appoint_Btn.addActionListener(this);
        termi_Btn.addActionListener(this);
        appointJr_btn.addActionListener(this);
        display_Btn.addActionListener(this);
        clear_Btn.addActionListener(this);
        
        jFrame.setVisible(true);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {   if (e.getSource()==junior_Btn)
        {
            try
            { System.out.println("I am PLATFORM button for JUNIOR");
              String platform = platform1_Text.getText();
              String interviewer = interviewer1_Text.getText();
              int workinghour = Integer.parseInt(workingHour1_text.getText());
              String appointedby = appointed_Bytext.getText();
              double salaryjunior= Double.parseDouble(salary_Text.getText()); 
              String terminationdate = terminationDate_text.getText();
              
              
                   
              
              if(salaryjunior < 11000 || salaryjunior > 5000000)
              {
                  System.out.println("Salary range of Develpors is 11000 to 5000000. Please insert a Valid Data");
              }
              else if (interviewer.isEmpty())
              {
                  System.out.println("Do not leave textFields empty");
                }
              else if (workinghour < 8 || workinghour >16 )
              {
                 System.out.println("The range of working hour Develpors is 8 to 16. Please insert a Valid Data");
                  
              }
              else
              {
                  JuniorDeveloper dev_Junior = new JuniorDeveloper(platform ,interviewer ,workinghour ,salaryjunior ,appointedby ,terminationdate) ;
                  developerList.add(dev_Junior);
                  
                  System.out.println("Process Success" + "\n" + platform + "\n" + "Interviewer :" + interviewer + "\n" + "Wokring Hour : " + workinghour + 
                  "\n" + "Salary : " + salaryjunior + "\n" + "Appointed By :" + appointedby + "\n" + "Termination Date :" + terminationdate);
            }
            }
            
            catch(Exception a)
            {
                System.out.println("Enter valid data");
            }
        }
        
        else if(e.getSource()==senior_Btn)
        {
            try
            {
                System.out.println("I am button PLATFORM for SENIOR");
                String platform_senior=platform2_Text.getText();
                int workinghour_senior=Integer.parseInt(workingHour2_text.getText());
                double salary_senior=Double.parseDouble(salary2_Text.getText());
                String interviewer_senior = interviewer2_Text.getText();
                int contract_Senior=Integer.parseInt(contractPeriod_text.getText());
                
               if (platform_senior.matches(".*\\d.*") || interviewer_senior.matches(".*\\d.*"))
              {
                  System.out.println("Please Enter Valid Data" );
               }
               else if(salary_senior < 11000 || salary_senior > 5000000)
              {
                  System.out.println("Salary range of Develpors is 11000 to 5000000. Please insert a Valid Data");
              }
              else if (workinghour_senior < 8 || workinghour_senior >16 )
              {
                 System.out.println("The range of working hour Develpors is 8 to 16. Please insert a Valid Data");
                  
              }
              else
              {
                SeniorDeveloper dev_Senior = new SeniorDeveloper(platform_senior ,interviewer_senior,workinghour_senior,salary_senior ,contract_Senior);
                developerList.add(dev_Senior);
                System.out.println( "Process Success" + "\n"+ "Platform : "+ platform_senior + "\n" + "Interviewer : " +
                interviewer_senior +"\n" + "Working Hour :" + workinghour_senior + "\n" + "Salary : " + salary_senior + "\n" + 
                "Contract Period : " +contract_Senior);
               }
            }
            catch(Exception a)
            {
                System.out.println("Enter valid data");
            }
            
        }    
    
        else if (e.getSource()==appointJr_btn)
        {   
            try
            { 
                System.out.println("I am Appoint Button for JUNIOR DEVELOPER");
                String name_Appointjunior=name1_Text.getText();
                String spec_Appointjunior=specialization_Text.getText();
                int devno_Appointjunior=Integer.parseInt(developerNotext_1.getText());
                String appointDate_appointJunior=appointDate_text.getText();
                String termiDate_appointJunior=termiDate_text.getText();
                
                
               
               
               if(devno_Appointjunior < developerList.size())
               {
                   
                   if(developerList.get(devno_Appointjunior) instanceof JuniorDeveloper)
                   {
                       JuniorDeveloper dev_J = (JuniorDeveloper) developerList.get(devno_Appointjunior);
                       dev_J.Devloperappoint(name_Appointjunior, appointDate_appointJunior, termiDate_appointJunior, spec_Appointjunior);
                       
                       System.out.println("Junior Developer is appointed");
                   }
                   else
                   {
                       System.out.println("Please entvalid data");
                    }
                }
                else
                {
                    System.out.println("Please enter  valid data");
                }
            }
            catch(Exception a)
            {
                System.out.println("Enter valid data");
            }
        }
    
        else if (e.getSource()==termi_Btn)
        { 
            try
            {
                System.out.println("I am Terminate Button for SENIOR DEVELOPER");
                int devNo_senDevter = Integer.parseInt(developerNotext_2.getText());
                if(devNo_senDevter < developerList.size())
                {
                    
                    if(developerList.get(devNo_senDevter) instanceof SeniorDeveloper)
                    {
                        SeniorDeveloper dev1 = (SeniorDeveloper) developerList.get(devNo_senDevter);
                        dev1.terminate();
                        
                        System.out.println("Senior Developer is Termiated");
                    }
                    else
                    {
                        System.out.println("Senior Developer is not terminated");
                    }
                }
                
            }
            catch(Exception a)
            {
                System.out.println("Enter valid data");
            }
        }
        
        else if (e.getSource()==appoint_Btn)
        {
            try
            {
                System.out.println("I am Appoint Button for SENIOR DEVELOPER");
                
                String name_AppointsenDev=name2_Text.getText();
                String joinDate_senDev=joiningDate_text.getText(); 
                int devNo_senDev = Integer.parseInt(developerNotext_2.getText());
                String roomNo_senDev = roomNo_text.getText();
                double advanceSalry_senDev= Double.parseDouble(advanceSlry_text.getText());
                
                
                if(devNo_senDev < developerList.size())
                {
                    
                    if(developerList.get(devNo_senDev) instanceof SeniorDeveloper)
                    {
                        SeniorDeveloper dev1 = (SeniorDeveloper) developerList.get(devNo_senDev);
                        dev1.developerappoint(name_AppointsenDev,joinDate_senDev, advanceSalry_senDev, roomNo_senDev);
                        
                        System.out.println("Senior Developer is appointed" + "\n" + "Name : " + name_AppointsenDev + "\n" + 
                        "Joining Date : " + joinDate_senDev + "\n" + "Advance Salary" + advanceSalry_senDev + "\n" + "Room Number :" + roomNo_senDev);
                    }
                    else
                    {
                        System.out.println("Senior Developer is not appointed yet !");
                    }
                }
                else
                {
                    System.out.println("Please enter a valid data");
                }
            }
            
            catch(Exception a)
            {
                System.out.println("Enter valid data");
            }
        }
        else if (e.getSource()==display_Btn)
        {
            try
            {
                
                int b = developerList.size();
               
                for(int i=0; i<b;i++) {
                 Developer display_Btn= developerList.get(i);
                
                    if (display_Btn instanceof SeniorDeveloper)
                    {
                        SeniorDeveloper dev1 = (SeniorDeveloper) developerList.get(i);
                        dev1.showfinal();
                    }
                    else if (display_Btn instanceof JuniorDeveloper)
                    {
                       JuniorDeveloper dev_J = (JuniorDeveloper) developerList.get(i);
                       dev_J.display();
                    }
                
                }
            }
            catch(Exception a)
            {
                System.out.println("Enter valid data");
            }
        }
        else if(e.getSource()==clear_Btn)
        {
            try
            {
              platform1_Text.setText("");
              interviewer1_Text.setText("");
              workingHour1_text.setText("");
              appointed_Bytext.setText("");
              salary_Text.setText("");
              terminationDate_text.setText("");
              platform2_Text.setText("");
              workingHour2_text.setText("");
              salary2_Text.setText("");
              interviewer2_Text.setText("");
              contractPeriod_text.setText("");
              name1_Text.setText("");
              specialization_Text.setText("");
              developerNotext_1.setText("");
              appointDate_text.setText("");
              termiDate_text.setText("");
              name2_Text.setText("");
              joiningDate_text.setText(""); 
              developerNotext_2.setText("");
              roomNo_text.setText("");
              advanceSlry_text.setText("");
                
            }
            catch(Exception a)
            {
                System.out.println("Enter valid data");
            }
        }
    }
    
   
            
       
    
}