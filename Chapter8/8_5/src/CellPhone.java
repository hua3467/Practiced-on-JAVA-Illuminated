
import java.text.DecimalFormat;

public class CellPhone
{
    public final int MONTHS = 6;
    private String phoneNumber;
    private double [] cellBills;

    // Default constructor creates cellBills with MONTHS elements;

    public CellPhone()
    {
        phoneNumber = "";
        cellBills = new double[ MONTHS ];
    }

    public CellPhone( String number, double [] bills )
    {
        phoneNumber = number;

        // instantiate array with same length as parameter
        cellBills = new double[ bills.length ];

        // copy parameter array to cellBills array
        for ( int i = 0; i < cellBills.length; i++ )
        {
            cellBills[i] = bills[i];
        }
    }

    // Return the phone number

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    // return an array of cell phone bills
    public double [] getCellBills()
    {
        double [] temp = new double [cellBills.length];
        for ( int i = 0; i < cellBills.length; i++)
        {
            temp[i] = cellBills[i];
        }

        return temp;
    }

    // Calculates total of all cell phone bills
    public double calcTotalBills()
    {
        double total = 0.0;

        for( int i = 0; i < cellBills.length; i++ )
        {
            total += cellBills[i];  // add current element to total
        }

        return total;
    }

    // Finds a maximum bill

    public double findMaximumBill()
    {
        double max = cellBills[0];
        for ( int i = 0; i < cellBills.length; i++ )
        {
            if( cellBills[i] > max )
                max = cellBills[i];
        }

        return max;
    }

    public String toString ()
    {
        String returnValue = phoneNumber + "\n";
        DecimalFormat money = new DecimalFormat( "$##0.00" );
        for ( int i = 0; i < cellBills.length; i++ )
        {
            returnValue += money.format( cellBills[i] ) + "\t";

        }

        returnValue += "\n";

        return returnValue;
    }

    public boolean qeuals( Object c )
    {
        if ( ! ( c instanceof CellPhone ) )
            return false;
        else
        {
            CellPhone objCP = ( CellPhone ) c;
            if ( cellBills.length != objCP.cellBills.length)
                return false;

            for ( int i = 0; i < cellBills.length; i++ )
            {
                if ( cellBills[i] != objCP.cellBills[i])
                    return false;
            }

            return true;
        }

    }

}
