public class Square implements Shape  {


    double length;
    double height;

Square(double length, double height){

    this.length = length;
    this.height = height;

}

public double calculateArea(){

    return height*length;

}



}
