package com.campusdual.classroom;

public class FuelTank {

  public int actualFuel = 10;

  public void setActualFuel(int fuel) {
    if (fuel < 0) {
      System.out.println("No se puede establecer una cantidad de combustible negativa.");

    } else {
      this.actualFuel = fuel;
    }
  }

  public void showDetails() {
    System.out.println("La capacidad actual es de " + this.actualFuel + " litros.");

  }

  public int getActualFuel() {
    return this.actualFuel;

  }
}
