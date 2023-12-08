import java.util.ArrayList;

public class Shapes {

    public ArrayList<Shape> objekter = new ArrayList<>();

    public void addShape(Shape s) {

        objekter.add(s);
    }

    public double totalArea() {

        double SumOfArea = 0;
        for (Shape s : objekter) {
            SumOfArea += s.calculateArea();
        }
        return SumOfArea;
    }


}



