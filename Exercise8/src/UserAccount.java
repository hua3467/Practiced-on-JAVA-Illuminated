
public class UserAccount {

    private String[] account;

    public UserAccount( String userID, String password, String passwordAgain, String email, String name,
                        String street, String city, String state, String zip, String phoneNumber ){

            account = new String[]{userID, password, passwordAgain, email, name, street, city, state, zip, phoneNumber};
    }

    public String getID(){
        return account[0];
    }
    public String getPassword(){
        return account[1];
    }
    public String getEmail(){
        return account[3];
    }
    public String getName(){
        return account[4];
    }
    public String getStreet(){
        return account[5];
    }
    public String getCity(){
        return account[6];
    }
    public String getState(){
        return account[7];
    }
    public String getZip(){
        return account[8];
    }
    public String getPhoneNumber(){
        return account[9];
    }


    public void setPassword( String newPassword, String newPasswordAgain ) throws Exception {
        if( ! passwordMatch() )
            throw new Exception("Password does not match. ");
        else {
            account[1] = newPassword;
            account[2] = newPasswordAgain;
        }
    }
    public void setEmail( String newEmail ){
            account[3] = newEmail;
    }
    public void setName( String newName ){
        account[4] = newName;
    }
    public void setStreet( String newStreet ){
        account[5] = newStreet;
    }
    public void setCity( String newCity ){
        account[6] = newCity;
    }
    public void setState( String newState ) throws Exception {
        if( ! isState() )
            throw new Exception("Please enter two characters to represent a state.");
        else
            account[7] = newState;
    }
    public void setZip( String newZip ){
        account[8] = newZip;
    }
    public void setPhoneNumber( String newPhoneNumber ){
        account[9] = newPhoneNumber;
    }


    public boolean isEmpty(){
        for( int i = 0; i < account.length; i++ ){
            if (account[i] == null)
                return true;
        }
        return false;
    }

    public int countIdChar(){
        return account[0].length();
    }

    public boolean passwordMatch(){
        return account[1].equals(account[2]);
    }

    public boolean isEmail(){
        int count = 0;
        for( int i = 0; i < account[3].length(); i++ ){
            if( account[3].charAt(i) == '@')
                count++;
        }
        if( count == 1 )
            return true;
        else
            return false;

    }
    public boolean isState(){
        if( account[7].length() == 2 )
            return true;
        else
            return false;
    }

    public String toString(){
        return "\nUser ID: " + account[0]
                + "\nEmail: " + account[3]
                + "\nName: " + account[4]
                + "\nStreet: " + account[5]
                + "\nCity: " + account[6]
                + "\nState: " + account[7]
                + "\nZip: " + account[8]
                + "\nPhone: " + account[9];
    }

}
