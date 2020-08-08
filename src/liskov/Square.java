
package liskov;

/**
 *
 * @author Jimmy Kessie 
 */

public class Square extends Rectangle
{
   
    public void setLength(int length){
        this.length=length;
        this.width=length;
    }
    public void setWidth(){
        this.length=width;
        this.width=width;
    }
}
