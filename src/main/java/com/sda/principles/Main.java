package com.sda.principles;

import com.sda.principles.encapsulation.Person;
import com.sda.principles.inheritanceAndPolymorphism.Car;
import com.sda.principles.inheritanceAndPolymorphism.Vehicle;

public class Main {
    public static void main(String[] args) {
        Person person =new Person();
        person.setAge(18);
        System.out.println("Age: "+person.getAge());
        person.setAge(-18);
        System.out.println("Age: "+person.getAge());
        System.out.println("=========================");

        Vehicle vehicle=new Vehicle(220);
        vehicle.setManufacturer("Dacia");
        //vehicle.manufacturer="Dacia";  //eroare, deoarece proprietatea este protected -> nu am acces din alt pachet/clasa
                                         //care nu extinde parintele
        Car car=new Car(320,false);
        System.out.println(vehicle.toString());
        System.out.println(car.toString());

        Vehicle car2=new Car(180,true);
        Vehicle vehicle2 = new Vehicle(2000);

        System.out.println(car2.toString());
        System.out.println(vehicle2.toString());
        System.out.println("=========================");

        print(car2);
        print(vehicle2);
    }

    public static void print(Vehicle input){
//        if(input instanceof Car)
//            Car temp = (Car) input;

        System.out.println("Received vehicle with: " +
                "\nmaxSpeed: " + input.getMaxSpeed() +
                "\nmanufacturer: " + input.getManufacturer());

    }
}
