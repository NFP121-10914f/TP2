package question2;
public class FahrenheitCelsius
{

    public static  float  fahrenheitEnCelsius ( int  f ) 
    {  
        float resulta = ((int)(5/9f*(f-32)*10)/10.0f);
        return resulta ;
    }
    
    public static void main(String[] args) {
        int y =0;
        float r ;
        int i ;
        try {
            while (args.length > y) {
                i = Integer.parseInt(args[y]);
                r = fahrenheitEnCelsius(i);
                System.out.println(i + "°F -> " + r + "°C");
                y++;
            }
        } catch (NumberFormatException e) {
            System.out.println("error : " +e.getMessage());
        }
        
    }

}
