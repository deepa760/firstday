package org.example;
public class basicexample
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Car saab = new Car();
        saab.brand = "SAAB";
        saab.modelName = "900 Turbo";
        saab.topSpeed = 245;
        Car volvo = new Car();
        volvo.brand = "Volvo";
        volvo.modelName = "S60 T5";
        volvo.topSpeed = 220;
        System.out.println(volvo.getInfo());
        System.out.println(saab.getInfo());

    }

}



class Car {

    String modelName;   //class field

    String brand;       //class field

    int topSpeed;       //class field



    public String getInfo() {

        return "Car: " + brand + " | " + modelName + " | " + topSpeed;

    }

}







