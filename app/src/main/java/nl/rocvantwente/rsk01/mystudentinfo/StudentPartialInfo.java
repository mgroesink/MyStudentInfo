package nl.rocvantwente.rsk01.mystudentinfo;

/**
 * Created by Marcel Roesink on 12-4-2018.
 */

public class StudentPartialInfo {

    private String studentNr;
    private String firstName;
    private String middleName;
    private String lastName;
    private String residence;
    private String gender;
    private String education;

    /**
     *
     * @return
     */
    public String getStudentNr() {
        return studentNr;
    }

    /**
     *
     * @param studentNr
     */
    public void setStudentNr(String studentNr) {
        this.studentNr = studentNr;
    }

    /**
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     *
     * @param middleName
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName(){
        if(middleName.trim() != null && !middleName.trim().isEmpty()){
            return firstName + " " + middleName + " " +
                    lastName;
        } else {
            return firstName + " " +
                    lastName;
        }
    }

    /**
     *
     * @return
     */
    public String getResidence() {
        return residence;
    }

    /**
     *
     * @param residence
     */
    public void setResidence(String residence) {
        this.residence = residence;
    }

    /**
     *
     * @return
     */
    public String getGender() {
        return gender;
    }

    /**
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     *
     * @return
     */
    public String getEducation() {
        return education;
    }

    /**
     *
     * @param education
     */
    public void setEducation(String education) {
        this.education = education;
    }

    /**
     *
     * @param studentNr
     * @param firstName
     * @param middleName
     * @param lastName
     * @param residence
     * @param gender
     * @param education
     */
    public StudentPartialInfo(String studentNr, String firstName,
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

    public StudentPartialInfo() {
    }
}
