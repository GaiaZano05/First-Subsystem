package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Ports;


public class Intake extends SubsystemBase {
    WPI_TalonFX motor;
    Solenoid piston;

    public Intake(){
        motor = new WPI_TalonFX(Ports.Intake.MOTOR);
        motor.setInverted(Ports.Intake.IS_INVERTED);
        piston = new Solenoid(PneumaticsModuleType.CTREPCM, Ports.Intake.SELENOID);
    }


    public void setPower(double power) {
        motor.set(power);
    }

    public void setPiston(boolean pistonMode) {
        piston.set(pistonMode);
    }
}
