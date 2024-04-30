/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym;

/**
 *
 * @author Team NYAM
 */


import javax.swing.JOptionPane;



public class gymmodel {

    private int id;
    private String name;
    private String gender;
    private String age;
    private String phone;
    private String email;

    public gymmodel(int id, String name, String gender, String phone, String age, String email) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void insertMember() {
        try {
            java.sql.Statement statement = connection.JDBCconnection.Connect().createStatement();

            statement.executeUpdate("INSERT INTO universitysystem.gym (ID, NAME, GENDER, AGE, PHONE, EMAIL_ID)" +
                    " VALUES ('" + this.getId() + "','" + this.getName() + "','" + this.getGender() + "'," +
                    "'" + this.getAge() + "','" + this.getPhone() + "','" + this.getEmail() + "')");

            JOptionPane.showMessageDialog(null, "Member successfully added!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
    }

    public void updateMember() {
        try {
            java.sql.Statement statement = connection.JDBCconnection.Connect().createStatement();
            String sql = "UPDATE universitysystem.gym SET name = '" + this.getName() + "', gender = '" + this.getGender() +
                    "', age = '" + this.getAge() + "', phone = '" + this.getPhone() + "', email_id = '" + this.getEmail() +
                    "' WHERE id = '" + this.getId() + "'";
            statement.executeUpdate(sql);

        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
    }

    public void deleteMember() {
        try {
            java.sql.Statement statement = connection.JDBCconnection.Connect().createStatement();
            String sql = "DELETE FROM universitysystem.gym WHERE id = '" + this.getId() + "'";
            statement.executeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
    }
}
