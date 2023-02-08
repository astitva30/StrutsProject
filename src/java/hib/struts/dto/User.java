package hib.struts.dto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.File;
/**
 *
 * @author deshp
 */
public class User {

    private int serialNo;
    private String userID;
    private String pass;
    private String fNm;
    private String mail;
    private String contact;
    private String address;
    private String city;
    private String dOB;
    private String time;
    private String gender;
    private String hobbies;
    private File photo;

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    
    
    public User(){}
    public User(String userID, String pass, String fNm, String mail, String contact, String address, String city, String dOB, String time, String gender, String hobbies, File photo) {
        this.userID = userID;
        this.pass = pass;
        this.fNm = fNm;
        this.mail = mail;
        this.contact = contact;
        this.address = address;
        this.city = city;
        this.dOB = dOB;
        this.time = time;
        this.gender = gender;
        this.hobbies = hobbies;
        this.photo = photo;
    }
    /**
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return the fNm
     */
    public String getfNm() {
        return fNm;
    }

    /**
     * @param fNm the fNm to set
     */
    public void setfNm(String fNm) {
        this.fNm = fNm;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the dOB
     */
    public String getdOB() {
        return dOB;
    }

    /**
     * @param dOB the dOB to set
     */
    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the hobbies
     */
    public String getHobbies() {
        return hobbies;
    }

    /**
     * @param hobbies the hobbies to set
     */
    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    /**
     * @return the photo
     */
    public File getPhoto() {
        return photo;
    }

    /**
     * @param photo the photo to set
     */
    public void setPhoto(File photo) {
        this.photo = photo;
    }
}
