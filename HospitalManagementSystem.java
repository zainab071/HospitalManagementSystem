package JavaProject;
import java.util.Scanner;
public class HospitalManagementSystem {
     static  Scanner sc = new Scanner (System.in);
     static int []patientId=new int[50];
     static String[]patientName=new String[50];
     static int [] patientAge=new int[50];
     static String[]patientSymptoms=new String[50];
     static int patientCount=0;

     static int[]doctorId=new int[50];
     static String[]doctorName=new String[50];
    static String []doctorSpecialization =new String[50];
    static int doctorCount=0;

    static int[]AppointmentPatientId=new int[50];
    static int []AppointmentDoctorId=new int[50];
    static String [] AppointmentDate =new String[50];
    static int AppointmentCount=0;



    public static void main(String [] args){
        System.out.println("----------------------Welcome to Hospital Management System----------------------");
      while(true){
          try{
              System.out.println("-----Main Menu----");
              System.out.println("1.Patient Management Menu.");
              System.out.println("2.Doctor Management Menu.");
              System.out.println("3.Booking Management Menu.");
              System.out.println("4.Exit.");
              System.out.println("Enter choice.");
              int choice = sc.nextInt();
              sc.nextLine();

              switch (choice) {
                  case 1:
                      PatientMenu();
                      break;
                  case 2:
                      DoctorMenu();
                      break;
                  case 3:
                      BookingMenu();
                      break;
                  case 4:
                      System.out.println("Exiting---------------Go to Main Menu.");
                      return;
                  default:
                      System.out.println("Invalid choice!.Try Again.");
              }
          }catch(Exception e){
              System.out.println("Invalid input!Enter Valid Input.");
              sc.nextLine();
          }

      }


    }

    //-----------------------------Patient Menu--------------------------------
    public static void PatientMenu(){
        while(true){
            try{
                System.out.println("------- Patient Management Menu---------");
                System.out.println("1.Add Patient.");
                System.out.println("2.View Patient List.");
                System.out.println("3.Search Patient by ID.");
                System.out.println("4.Exit");
                System.out.println("Enter a choice");
                int choice=sc.nextInt();
                sc.nextLine();

                switch(choice){
                    case 1:
                        AddPatient();
                        break;
                    case 2:
                        ViewPatient();
                        break;
                    case 3:
                       SearchPatient();
                        break;
                    case 4:
                        System.out.println("Exit...........Go to Main Menu.");
                        return;
                    default:
                        System.out.println("Invalid choice! Try Again.");
                }
            }catch(Exception e){
                System.out.println("Invalid Input!Enter Valid Input.");
            }
        }

    }
    //----------------------------Add Patient-----------------------
    public static void AddPatient(){
        try{
            if(patientCount>=patientId.length){
                System.out.println("You cannot add more!");
                return;
            }
            System.out.println("---------Add Patient----------- ");
            System.out.println("Enter patient Id.");
            patientId[patientCount]=sc.nextInt();
            sc.nextLine();

            System.out.println("Enter patient Name.");
            patientName[patientCount]=sc.nextLine();

            System.out.println("Enter patient Age.");
            patientAge[patientCount]=sc.nextInt();
            sc.nextLine();


            System.out.println("Enter patient Symptoms.");
            patientSymptoms[patientCount]=sc.nextLine();

            patientCount++;

            System.out.println("Patient Added Successfully!");


        }catch(Exception e){
            System.out.println("Invalid Input!Enter valid input.");
            sc.nextLine();
        }

    }
    //----------------View Patient-------------------
    public static void ViewPatient(){
        try{
            if(patientCount==0){
                System.out.println("No patients added yet!");
                return;
            }
            System.out.println("------------View Patient List-----------");
            for(int i=0; i<patientCount;i++){
                System.out.println("Patient Id :"+patientId[i]);
                System.out.println("Patient Name :"+patientName[i]);
                System.out.println("Patient Age:"+patientAge[i]);
                System.out.println("Patient Symptoms:"+patientSymptoms[i]);
                sc.nextLine();
            }
        }catch(Exception e){
            System.out.println("Invalid Input!Enter valid input");
        }
    }
    //-------------Search Patient-------------------------
    public static void SearchPatient(){
        try{
            if(patientCount==0){
                System.out.println("No patients added yet!");
                return;
            }
            System.out.println("------Search Patient By ID--------");

            System.out.println("Enter Patient ID.");
            int id = sc.nextInt();
            sc.nextLine();

            boolean Exist=false;

            for(int i=0; i<patientCount;i++){
                if(patientId[i]==id){
                    System.out.println("------- Patient Found -------");
                    System.out.println("Patient ID: " + patientId[i]);
                    System.out.println("Patient Name: " + patientName[i]);
                    System.out.println("Patient Age: " + patientAge[i]);
                    System.out.println("Patient Symptoms: " + patientSymptoms[i]);
                    sc.nextLine();
                    Exist= true;
                    break;
                }

            }
        }catch(Exception e){
            System.out.println("Invalid Input!Enter valid input.");
        }

    }
    //------------------------------------Doctor Management Menu------------------------------
    public static void DoctorMenu(){
        while(true) {
            try {
                System.out.println("------- Doctor Management Menu---------");
                System.out.println("1.Add Doctor.");
                System.out.println("2.View Doctor List.");
                System.out.println("3.Search Doctor by ID.");
                System.out.println("4.Exit");
                System.out.println("Enter a choice");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        AddDoctor();
                        break;
                    case 2:
                        ViewDoctor();
                        break;
                    case 3:
                        SearchDoctor();
                    case 4:
                        System.out.println("Exit...........Go to Main Menu.");
                        return;
                    default:
                        System.out.println("Invalid choice! Try Again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid Input!Enter valid Input.");
            }



        }

    }
    //----------------Add Doctor--------------------
    public static void AddDoctor() {
        try {
            if (doctorCount >= doctorId.length) {
                System.out.println("You cannot add more!");
                return;
            }
            System.out.println("-------Add Doctor----------");

            System.out.println("Enter doctor Id.");
            doctorId[doctorCount] = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter doctor name.");
            doctorName[doctorCount] = sc.nextLine();

            System.out.println("Enter doctor Specialization.");
            doctorSpecialization[doctorCount] = sc.nextLine();

            doctorCount++;

            System.out.println("Doctor added successfully!");


        } catch (Exception e) {
            System.out.println("Invalid Input!Enter valid input.");
            sc.nextLine();
        }


    }
    //-----------------View Doctor--------------
    public static void ViewDoctor(){
        try{
            if(doctorCount==0){
                System.out.println("No doctors added yet!");
                return;
            }
            System.out.println("------------View Doctor List-----------");
            for(int i=0; i<doctorCount;i++){
                System.out.println("Doctor Id :"+doctorId[i]);
                System.out.println("Doctor Name :"+doctorName[i]);
                System.out.println("Doctor Specialization:"+doctorSpecialization[i]);
                sc.nextLine();
            }
        }catch(Exception e){
            System.out.println("Invalid Input!Enter valid input");
        }

    }
    //----------Search Doctor------------------------
    public static void SearchDoctor(){
        try{
            if(doctorCount==0){
                System.out.println("No doctor added yet!");
                return;
            }
            System.out.println("------Search Doctor By ID--------");

            System.out.println("Enter Doctor ID.");
            int id = sc.nextInt();
            sc.nextLine();

            boolean Exist=false;

            for(int i=0; i<doctorCount;i++){
                if(doctorId[i]==id){
                    System.out.println("------- Doctor Found -------");
                    System.out.println("Doctor ID: " + doctorId[i]);
                    System.out.println("Doctor Name: " + doctorName[i]);
                    System.out.println("Doctor Specialization: " +doctorSpecialization[i]);
                    sc.nextLine();
                    Exist= true;
                    break;
                }

            }
        }catch(Exception e){
            System.out.println("Invalid Input!Enter valid input.");
        }
    }
    //-------------------Booking Management Menu--------------------
    public static void BookingMenu(){
        while(true){
            try{
                System.out.println("------ Booking Menu-----");
                System.out.println("1.Book Appointment");
                System.out.println("2.View Appointment");
                System.out.println("3.Cancel Appointment");
                System.out.println("4.Update  Appointment date");
                System.out.println("5.Exit");
                System.out.println("Enter a choice.");
                int choice = sc.nextInt();
                sc.nextLine();

                switch(choice){
                    case 1:
                        BookAppointment();
                        break;
                    case 2:
                        ViewAppointment();
                        break;
                    case 3:
                        CancelAppointment();
                        break;
                    case 4:
                        UpdateAppointmentDate();
                        break;
                    case 5:
                        System.out.println("Exiting.........Thank you.Stay Healthy!");
                        return;
                    default:
                        System.out.println("Invalid choice! Try again.");
                }

            }catch(Exception e){
                System.out.println("Invalid Input!Enter valid input");
            }
        }
    }
    public static void BookAppointment(){
        try{
            if(AppointmentCount>=AppointmentPatientId.length){
                System.out.println("You cannot Book more Appointments yet!");
                return;
            }
            System.out.println("---------Book Appointment-----------");
            System.out.println("Enter patient Id.");
            int patId=sc.nextInt();
            sc.nextLine();

            boolean PatientFound=false;
            for(int i=0; i<patientCount;i++){
                if(patientId[i]==patId){
                    PatientFound=true;
                    break;
                }

            }
            if(!PatientFound){
                System.out.println("No patient found!");
                return;
            }

            System.out.println("Enter doctor Id.");
            int docId= sc.nextInt();
            sc.nextLine();

            boolean DoctorFound = false;
            for(int i=0; i<doctorCount;i++){
                if(doctorId[i]==docId){
                    DoctorFound = true;
                    break;
                }
            }
            if(!DoctorFound){
                System.out.println("No doctor found yet!");
                return;
            }
            System.out.println("Enter Appointment Date (DD/MM/YYYY):");
            String date = sc.nextLine();

            AppointmentPatientId[AppointmentCount]=patId;
            AppointmentDoctorId[AppointmentCount]=docId;
            AppointmentDate[AppointmentCount]=date;

            AppointmentCount++;

            System.out.println("Appointment booked successfully!");


        }catch(Exception e){
            System.out.println("Invalid Input!Enter valid input.");
            sc.nextLine();
        }
    }
    public static void ViewAppointment(){
        try{
            if(AppointmentCount==0){
                System.out.println("No Appointment book yet!");
                return;
            }
            System.out.println("---------View Appointment details----------");
            for (int i = 0; i < AppointmentCount; i++) {
                System.out.println("Appointment " + (i + 1));
                System.out.println("Patient ID: " + AppointmentPatientId[i]);
                System.out.println("Doctor ID: " + AppointmentDoctorId[i]);
                System.out.println("Date: " + AppointmentDate[i]);
                sc.nextLine();
            }

        }catch(Exception e){
            System.out.println("Invalid Input!Enter valid Input");
            sc.nextLine();
        }
    }
    public static void CancelAppointment(){
        try{

                if (AppointmentCount == 0) {
                    System.out.println("No appointments to cancel!");
                    return;
                }

                System.out.println("Enter Appointment Number to Cancel:");
                int num = sc.nextInt();
                sc.nextLine();

                if (num < 1 || num > AppointmentCount) {
                    System.out.println("Invalid Appointment Number!");
                    return;
                }

                int index = num - 1;
                for (int i = index; i < AppointmentCount - 1; i++) {
                    AppointmentPatientId[i] = AppointmentPatientId[i + 1];
                    AppointmentDoctorId[i] = AppointmentDoctorId[i + 1];
                    AppointmentDate[i] = AppointmentDate[i + 1];
                }

                AppointmentCount--;
                System.out.println("Appointment canceled successfully!");


        }catch(Exception e){
            System.out.println("Invalid Input!Enter valid Input");
            sc.nextLine();
        }
    }
    public static void UpdateAppointmentDate(){
        try{
            if(AppointmentCount==0){
                System.out.println("No Appointment Updated yet!");
                return;
            }
            System.out.println("--------Update Appointment date--------");
            System.out.println("Enter Appointment number");
            int num  =sc.nextInt();
            sc.nextLine();

            if(num<1||num>AppointmentCount){
                System.out.println("Invalid Appointment Number!");
                return;
            }

            int index  =num-1;
            System.out.println("Enter New Appointment Date (DD/MM/YYYY):");
            String newDate = sc.nextLine();

            AppointmentDate[index]=newDate;
            System.out.println("Appointment updated successfully!");


        }catch(Exception e){
            System.out.println("Invalid Input!Enter valid Input");
            sc.nextLine();
        }
    }

}
