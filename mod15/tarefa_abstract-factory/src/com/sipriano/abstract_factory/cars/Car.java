package com.sipriano.abstract_factory.cars;

public class Car {

    private String brand;
    private String year;
    private String classCar;

    public Car() {

    }

    public Car(String brand, String year, String classCar) {
        this.brand = brand;
        this.year = year;
        this.classCar = classCar;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getClassCar() {
        return classCar;
    }

    public void setClassCar(String classCar) {
        this.classCar = classCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year='" + year + '\'' +
                ", classCar='" + classCar + '\'' +
                '}';
    }
}
