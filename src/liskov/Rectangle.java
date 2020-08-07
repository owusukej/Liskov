
package liskov;

/**
 *
 * @author Jimmy Kessie
 */

public class Rectangle
{
    int length;
    int breadth;
    
    Rectangle (){
    
    }
    
    Rectangle(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    
    int getArea()
    {
        return length * breadth;
    }

    int getPerimeter()
    {
        return 2 * (length + breadth);
    }
}
