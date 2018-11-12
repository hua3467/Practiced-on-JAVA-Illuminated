/**
 * Version 6
 * @author aaronyang
 */
import java.text.DecimalFormat;

public class Auto 
{
    // instance variables
    private String model;
    private int milesDriven;
    private double gallonsOfGas;
    
    public static int countAutos = 0;
    
    public Auto()
    {
        model = "nuknow";
        countAutos++;
    }
    
    public Auto( String startModel, int startMilesDriven, double startGallonsOfGas )
    {
        model = startModel;
        milesDriven = startMilesDriven;
        gallonsOfGas = startGallonsOfGas;
        countAutos++;
    }
    
    public String getModel()
    {
        return model;
    }
    
    public int getMilesDriven()
    {
        return milesDriven;
    }
    
    public double getGallonsOfGas()
    {
        return gallonsOfGas;
    }
    
    public static int getCountAutos()
    {
        return countAutos;
    }
    
    // Mutator methods
    public void setModel( String newModel )
    {
        model = newModel;
    }
    
    public void setMilesDriven( int newMilesDriven )
    {
        if( newMilesDriven >= 0 )
           milesDriven = newMilesDriven;
        else
            System.err.println("Miles driven cannot be negative. \nValue not changed.");
    }
    
    public void setGallonsOfGas( double newGallonsOfGas )
    {
        if( newGallonsOfGas >= 0.0 )
            gallonsOfGas = newGallonsOfGas;
        else
            System.err.println( "Gallons of gas cannot be negative. \nValue not changed." );
    }
    
    @Override
    public String toString()
    {
        DecimalFormat gallonsFormat = new DecimalFormat( "#0.0");
        return "Model: " + model
                + "; miles driven: " + milesDriven
                + "; gallons of gas: " + gallonsFormat.format (gallonsOfGas);
    }
    
    @Override
    public boolean equals( Object o )
    {
        if( !( o instanceof Auto))
            return false;
        else
        { 
            Auto objAuto = ( Auto ) o;
            return model.equals( objAuto.model )
                    && milesDriven == objAuto.milesDriven
                    && Math.abs( gallonsOfGas - objAuto.gallonsOfGas ) < 0.0001;
        }
    }
    
}
