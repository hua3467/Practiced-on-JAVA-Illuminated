/** Team Class with Javadoc comments
 *  Excercise 7.18.55
 *  @author Zhenhua Yang
 */

public class Team
{
    private String name;

    /**
     * Overloaded constructor: <BR>
     *      Allows client to set beginning value for name.<BR>
     * @param n the initial name of the team
     */
    public Team( String n ){
        name = n;
    }

    /**
     * Accessor method: <BR>
     *     Allow client to access the name of Team.
     * @return the name of the team.
     */
    public String getName(){
        return name;
    }

    /**
     * Mutator method: <BR>
     *     Allows client to set value of name.
     * @param n the new name of the Team
     */
    public void setName( String n ){
        name = n;
    }

    /**
     * toString method: <BR>
     *     This object (which is already a string!) is itself returned.
     * @return the string itself.
     */
    public String toString (){
        return "Team name: " + name;
    }

    /**
     * equals method: <BR>
     *     Compare two Team objects for the same field values
     * @param o another object
     * @return a boolean, true if o is a Team object and this object has the same field values as the parameter o.
     */
    @Override
    public boolean equals(Object o) {

        if ( ! ( o instanceof Team))
            return false;
        else
        {
            Team objTeam = ( Team ) o;
            return ( name.equals( objTeam.name) );
        }
    }
}
