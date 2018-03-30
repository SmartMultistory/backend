package net.model;
import javax.persistence.*;

@Entity
@Table(name = "USER")
public class User {

    @Id
    @Column(name ="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name ="FIRST_NAME")
    private int first_name;

    @Column(name ="MIDDLE_NAME")
    private int middle_name;


    @Column(name ="LAST_NAME")
    private int last_name;


    @Column(name ="NUMBER")
    private int  number;

    @Column(name ="FLAT_ID")
    private int flat_id;


    @Column(name ="ROLE_ID")
    private int role_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFirst_name() {
        return first_name;
    }

    public void setFirst_name(int first_name) {
        this.first_name = first_name;
    }

    public int getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(int middle_name) {
        this.middle_name = middle_name;
    }

    public int getLast_name() {
        return last_name;
    }

    public void setLast_name(int last_name) {
        this.last_name = last_name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getFlat_id() {
        return flat_id;
    }

    public void setFlat_id(int flat_id) {
        this.flat_id = flat_id;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", first_name=" + first_name +
                ", middle_name=" + middle_name +
                ", last_name=" + last_name +
                ", number=" + number +
                ", flat_id=" + flat_id +
                ", role_id=" + role_id +
                '}';
    }
}
/*
    @Column(name ="EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "NICK_NAME")
    private String nickname;

    @Column(name = "USER_ID")
    private int user_id;

    public int getId() {
        return id;
    }

    public String getF() {
        return ;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getUser_id() {

        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getPassword() {
        return password;

    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", user_id=" + user_id +
                '}';
    }
*/
