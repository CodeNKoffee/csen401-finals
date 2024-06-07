public abstract class Vehicle {
  public final Manufacturer MAKE;
  private boolean isRunning;

  public Vehicle() {
    MAKE = new Manufacturer("Generic");
    isRunning = false;
  }

  public void start() {
    if (!this.isRunning)
      this.isRunning = true;
      
    System.out.println("Vehicle Started");
  }

  public void stop() {
    if (this.isRunning)
      this.isRunning = false;
      
    System.out.println("Vehicle Stopped");
  }

  public abstract void honk();
}
