/* Airport class
   Anderson, Franceschi
*/

public class Airport
{
  // 1. ***** Define the instance variables  *****
  //  airportCode is a String
  //  gates is an integer
  private String airportCode;
  private int gates;


  // 2. ***** Write this method *****
  // Default constructor:
  // method name: Airport
  // return value:  none
  // parameters: none
  // function: sets the airportCode to an empty String
    public Airport()
          {
              airportCode = "";
          }



  // 3. ***** Write this method *****
  // Overloaded constructor:
  // method name: Airport
  // return value: none
  // parameters:  a String startAirportCode and an int startGates
  // function:
  //      calls the the setAirportCode method,
  //      passing startAirportCode parameter;
  //      calls the setGates method, passing startGates parameter
    public Airport( String startAirportCode, int StartGates)
    {
        setAirportCode( startAirportCode );

    }




  // 4. ***** Write this method *****
  // Accessor method for the airportCode instance variable
  // method name: getAirportCode
  // return value: String
  // parameters: none
  // function: returns airportCode



  // 5. ***** Write this method *****
  // Accessor method for the gates instance variable
  // method name: getGates
  // return value: int
  // parameters: none
  // function: returns gates



  // 6. ***** Write this method *****
  // Mutator method for the airportCode instance variable
  // method name: setAirportCode
  // return value: void
  // parameters: String newAirportCode
  // function: assigns airportCode the value of the
  //       newAirportCode parameter



  // 7. ***** Write this method *****
  // Mutator method for the gates instance variable
  // method name: setGates
  // return value:  void
  // parameters: int newGates
  // function: validates the newGates parameter.
  //   if newGates is greater than or equal to 0,
  //       sets gates to newGates;
  //       otherwise, prints an error message to System.err
  //       and does not change value of gates




 }
