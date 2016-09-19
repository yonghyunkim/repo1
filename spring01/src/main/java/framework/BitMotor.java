package framework;

public class BitMotor implements Motor {
  int charge = 100;
  
  @Override
  public int chargeState() {
    // TODO Auto-generated method stub
    return charge;
  }

  @Override
  public void execute() {
    // TODO Auto-generated method stub
    System.out.println("스르르륵....간다...");
  }

}
