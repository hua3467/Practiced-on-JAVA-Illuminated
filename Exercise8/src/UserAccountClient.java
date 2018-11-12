public class UserAccountClient {
    public static void main( String [] args ){

        UserAccount dave = new UserAccount("001", "123j3", "123j3", "dave@gmail.com",
                "Dave Wang", "285 25th St. N", "Fargo", "ND", "58102", "7012497029");

        System.out.println(dave.toString());

    }
}
