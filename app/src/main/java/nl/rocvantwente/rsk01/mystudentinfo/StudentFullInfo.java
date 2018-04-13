package nl.rocvantwente.rsk01.mystudentinfo;

import java.util.Date;

/**
 * Created by Marcel Roesink on 12-4-2018.
 */

public class StudentFullInfo {

    private String studentNr;
    private String firstName;
    private String middleName;
    private String lastName;
    private String residence;
    private String gender;
    private String education;
    private String studentClass;
    private String postalCode;
    private Date birthDate;
    private String birthPlace;
    private String address;
    private String code;
    private String animal;
    private String crebo;

    public StudentFullInfo() {
    }

    /**
     * @return
     */
    public String getStudentNr() {
        return studentNr;
    }

    /**
     * @param studentNr
     */
    public void setStudentNr(String studentNr) {
        this.studentNr = studentNr;
    }

    /**
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * @param middleName
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return
     */
    public String getResidence() {
        return residence;
    }

    /**
     * @param residence
     */
    public void setResidence(String residence) {
        this.residence = residence;
    }

    /**
     * @return
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return
     */
    public String getEducation() {
        return education;
    }

    /**
     * @param education
     */
    public void setEducation(String education) {
        this.education = education;
    }

    /**
     * @param studentNr
     * @param firstName
     * @param middleName
     * @param lastName
     * @param residence
     * @param gender
     * @param education
     */
    public StudentFullInfo(String studentNr, String firstName,
                           String middleName, String lastName,
                           String residence, String gender,
                           String education) {
        this.studentNr = studentNr;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.residence = residence;
        this.gender = gender;
        this.education = education;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getCrebo() {
        return crebo;
    }

    public void setCrebo(String crebo) {
        this.crebo = crebo;
    }


}
