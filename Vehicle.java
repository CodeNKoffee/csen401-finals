public abstract class Vehicle {
  public Manufacturer MAKE;
  private boolean isRunning;

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
