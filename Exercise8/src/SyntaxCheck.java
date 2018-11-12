/**
 * Exercise 8.11 67
 */
public class SyntaxCheck {

    private String[] html;

    public SyntaxCheck( String[] htmlWords ){
        html = htmlWords;
    }

    public String [] getArray(){
        return html;
    }

    public boolean isHTML(){

        return html[0] == "<HTML>" && html[ html.length - 1 ] == "</HTML>";

    }

    public int countChar( String word, char character ){
        int count = 0;
        for( int i = 0; i< word.length() ; i++ ){
            if( word.charAt(i) == character)
                count++;
        }
        return count;
    }

    public int countImg(){
        int count = 0;
        for( int i = 0; i < html.length; i++ ){
            if( html[i].contains("img"))
                count++;
        }
        return count;
    }

    public boolean bracketsMatch(){

        int count1 = 0;
        int count2 = 0;

       for ( int i = 0; i < html.length; i++ ){
           count1 += countChar( html[i], '<' );
           count2 += countChar( html[i], '>');
       }

       return count1 == count2;

    }

    public int size(){
        int count = 0;
        for( int i = 0; i < html.length; i++ )
            count ++;
        return count;
    }

    public String toString(){
        String str = "";
        for( int i = 0; i < html.length; i++ ){
            str += html[i] + "    ";
        }

        return str + html[0] + ", " + html[html.length-1];
    }
}
