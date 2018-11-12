public class SyntaxCheckClient {
    public static void main( String[] args ){

        String htmlSentence = "<HTML> <h1> Title of HTML </h1> <img src=\"image.jpg\"/> <img src=\"image.jpg\"/> <p> This is a paragraph. </p> </HTML>";

        String[] strWords= htmlSentence.split(" ");

        SyntaxCheck check = new SyntaxCheck( strWords );

        System.out.println( check.toString() );

        System.out.println( check.isHTML());
        System.out.println( check.bracketsMatch());
        System.out.println( check.countImg());

        System.out.println( check.getArray()[0]);
        System.out.println( check.getArray()[check.size()-1]);
    }
}
