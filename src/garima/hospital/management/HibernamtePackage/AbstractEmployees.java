package garima.hospital.management.HibernamtePackage;

import java.util.HashSet;
import java.util.Set;


/**
 * AbstractEmployees generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractEmployees  implements java.io.Serializable {


    // Fields    

     private String username;
     private String password;
     private String firstname;
     private String lastname;
     private String address;
     private String phone;
     private Integer sex;
     private String nationality;
     private String verificationcode;
     private Integer type;
     private String consultinghours;
     private String qualification;
     private String specialist;
     private Set otherfeeses = new HashSet(0);
     private Set appointmentsesForEmployeeuserid = new HashSet(0);
     private Set healths = new HashSet(0);
     private Set roomses = new HashSet(0);
     private Set patientsForEmployeeuserid = new HashSet(0);
     private Set doctorfeeses = new HashSet(0);
     private Set patientsForDoctorconsultedid = new HashSet(0);
     private Set appointmentsesForDoctoruserid = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractEmployees() {
    }

	/** minimal constructor */
    public AbstractEmployees(String username) {
        this.username = username;
    }
    
    /** full constructor */
    public AbstractEmployees(String username, String password, String firstname, String lastname, String address, String phone, Integer sex, String nationality, String verificationcode, Integer type, String consultinghours, String qualification, String specialist, Set otherfeeses, Set appointmentsesForEmployeeuserid, Set healths, Set roomses, Set patientsForEmployeeuserid, Set doctorfeeses, Set patientsForDoctorconsultedid, Set appointmentsesForDoctoruserid) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.phone = phone;
        this.sex = sex;
        this.nationality = nationality;
        this.verificationcode = verificationcode;
        this.type = type;
        this.consultinghours = consultinghours;
        this.qualification = qualification;
        this.specialist = specialist;
        this.otherfeeses = otherfeeses;
        this.appointmentsesForEmployeeuserid = appointmentsesForEmployeeuserid;
        this.healths = healths;
        this.roomses = roomses;
        this.patientsForEmployeeuserid = patientsForEmployeeuserid;
        this.doctorfeeses = doctorfeeses;
        this.patientsForDoctorconsultedid = patientsForDoctorconsultedid;
        this.appointmentsesForDoctoruserid = appointmentsesForDoctoruserid;
    }

   
    // Property accessors

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getSex() {
        return this.sex;
    }
    
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getNationality() {
        return this.nationality;
    }
    
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getVerificationcode() {
        return this.verificationcode;
    }
    
    public void setVerificationcode(String verificationcode) {
        this.verificationcode = verificationcode;
    }

    public Integer getType() {
        return this.type;
    }
    
    public void setType(Integer type) {
        this.type = type;
    }

    public String getConsultinghours() {
        return this.consultinghours;
    }
    
    public void setConsultinghours(String consultinghours) {
        this.consultinghours = consultinghours;
    }

    public String getQualification() {
        return this.qualification;
    }
    
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSpecialist() {
        return this.specialist;
    }
    
    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public Set getOtherfeeses() {
        return this.otherfeeses;
    }
    
    public void setOtherfeeses(Set otherfeeses) {
        this.otherfeeses = otherfeeses;
    }

    public Set getAppointmentsesForEmployeeuserid() {
        return this.appointmentsesForEmployeeuserid;
    }
    
    public void setAppointmentsesForEmployeeuserid(Set appointmentsesForEmployeeuserid) {
        this.appointmentsesForEmployeeuserid = appointmentsesForEmployeeuserid;
    }

    public Set getHealths() {
        return this.healths;
    }
    
    public void setHealths(Set healths) {
        this.healths = healths;
    }

    public Set getRoomses() {
        return this.roomses;
    }
    
    public void setRoomses(Set roomses) {
        this.roomses = roomses;
    }

    public Set getPatientsForEmployeeuserid() {
        return this.patientsForEmployeeuserid;
    }
    
    public void setPatientsForEmployeeuserid(Set patientsForEmployeeuserid) {
        this.patientsForEmployeeuserid = patientsForEmployeeuserid;
    }

    public Set getDoctorfeeses() {
        return this.doctorfeeses;
    }
    
    public void setDoctorfeeses(Set doctorfeeses) {
        this.doctorfeeses = doctorfeeses;
    }

    public Set getPatientsForDoctorconsultedid() {
        return this.patientsForDoctorconsultedid;
    }
    
    public void setPatientsForDoctorconsultedid(Set patientsForDoctorconsultedid) {
        this.patientsForDoctorconsultedid = patientsForDoctorconsultedid;
    }

    public Set getAppointmentsesForDoctoruserid() {
        return this.appointmentsesForDoctoruserid;
    }
    
    public void setAppointmentsesForDoctoruserid(Set appointmentsesForDoctoruserid) {
        this.appointmentsesForDoctoruserid = appointmentsesForDoctoruserid;
    }
   








}