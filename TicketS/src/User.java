public class User extends Member {

    public User(String firstname, String lastname,String password, String email) {
        super(firstname, lastname, password, email);
    }
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }
@Override
    public void displayInfo() {
        System.out.println("User: " + firstname + " "+ lastname );
    }
}
