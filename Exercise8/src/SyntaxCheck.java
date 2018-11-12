public class SyntaxCheck {

    private String[] html;

    public SyntaxCheck( String[] htmlWords ){
        html = htmlWords;
    }

    public boolean isHTML(){
        if( html[0] == "<HTML>" && html[ html.length - 1 ] == "</HTML>" )
            return true;
        else
            return false;
    }

    public int countChar( String sentence, char character ){
        int count = 0;
        for( int i = 0; i < sentence.length(); i++ ){
            if( sentence.charAt(i) == character)
                count++;
        }
        return count;
    }

    public boolean bracketsMatch(){
       
    }
}
