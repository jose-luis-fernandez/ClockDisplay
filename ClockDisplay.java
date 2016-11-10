
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private NumberDisplay hora;
    private NumberDisplay minuto;

    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
        // initialise instance variables
        hora = new NumberDisplay(24);
        minuto = new NumberDisplay(60);
    }

    
    public void fijarHora(int nuevaHora, int nuevoMinuto)
    {
        hora.setValue(nuevaHora);
        minuto.setValue(nuevoMinuto);
    }
    
    public void avanzarMinuto()
    {
        minuto.increment();
        if (minuto.getValue() == 0){
            hora.increment();
        }
    }
    
    public String mostrarHora()
    {
        return hora.getDisplayValue() + ":" + minuto.getDisplayValue();
    }
}
