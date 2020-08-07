
package liskov;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Jimmy Kessie
 */


public class ShapesDemo {

    public static void calculateArea(Rectangle r){
        r.setBreadth(2);
        r.setLength(3);
        
        assertEquals("Area of calculation is incorrect", r.getArea(),6);
    }
   
   public static void main (String [] args){
       ShapesDemo.calculateArea(new Rectangle());
       
       ShapesDemo.calculateArea(new Square());
       }
}
