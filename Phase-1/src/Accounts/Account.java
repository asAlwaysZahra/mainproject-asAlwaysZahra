package Accounts;

<<<<<<< HEAD
public abstract class Account {
=======
import java.util.ArrayList;

public abstract class Account {
    public static ArrayList<Account> allAccounts = new ArrayList<>();
>>>>>>> 4ca75fff15a03808040f7f0e4912f53be1fb340a

    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;
<<<<<<< HEAD
    private String accountType; // set in child classes

    public Account(String username, String firstName, String lastName,
                   String email, String phoneNumber, String password)
=======
    private String role;

    Account(String username,
            String firstName,
            String lastName,
            String email,
            String phoneNumber,
            String password)
>>>>>>> 4ca75fff15a03808040f7f0e4912f53be1fb340a
    {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
<<<<<<< HEAD
    }

    @Override
    public abstract String toString();

    // Getters and Setters ================================================
=======

        allAccounts.add(this);
    }

    public abstract void showInfo();
    public abstract void menu();

    // Setters and Getters
>>>>>>> 4ca75fff15a03808040f7f0e4912f53be1fb340a

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

<<<<<<< HEAD
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
=======
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
>>>>>>> 4ca75fff15a03808040f7f0e4912f53be1fb340a
