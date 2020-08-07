
package liskov;

/**
 *
 * @author Jimmy Kessie 
 */

public class Square extends Rectangle
{
   
    public void setLength(int length){
        this.length=length;
        this.breadth=length;
    }
    public void setWidth(){
        this.length=breadth;
        this.breadth=breadth;
    }
}
