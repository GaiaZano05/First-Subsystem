package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import java.time.Instant;

public class Intake {
    private static Intake INSTANCE;
  //  private final;
    private Solenoid pistonLeft;
    private Solenoid pistonRight;

    public Intake() {

    }

  //  public int getPower() {

    //}

//
   /// }

    public Solenoid getPistonLeft() {
        return pistonLeft;
    }

    public void setPistonLeft(Solenoid pistonLeft) {
        this.pistonLeft = pistonLeft;
    }

    public Solenoid getPistonRight() {
        return pistonRight;
    }

    public void setPistonRight(Solenoid pistonRight) {
        this.pistonRight = pistonRight;
    }
}
