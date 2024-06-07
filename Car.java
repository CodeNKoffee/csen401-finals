public class Car extends Vehicle {
  private static final Manufacturer DEFAULT = new Manufacturer("Fjord");
  protected String color = "red";
  protected int speed;

  public Car() {
    this(DEFAULT);
  }

  public Car(Manufacturer make) {
    this.MAKE = make;
  }

  public void paint(String color) {
    this.color = color;
  }

  public String lookAt() {
    return this.color;
  }

  public void accelerate() {
    speed++;
  }

  public void decelerate() {
    speed--;
  }

  public int readSpeedometer() {
    return this.speed;
  }

  public void honk() {
    System.out.println("Beep! Beep!");
  }
}
