package framework;

public class Car {
  Sensor[] sensors;
  Motor motor;
  

  public void setSensors(Sensor[] sensors) {
    this.sensors = sensors;
  }

  public void setMotor(Motor motor) {
    this.motor = motor;
  }

  public void run() {
    excuteSensor();
    
    if(motor!=null && motor.chargeState() > 5){
      motor.execute();
    }else
    System.out.println("엔진가동~~");
  }

  private void excuteSensor() {
    if (sensors == null) 
      return;

      for (int i = 0; i < sensors.length; i++) {
        sensors[i].check();

      
    }
  }
}
