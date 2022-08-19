package frc.robot.subsystems.conveyor;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Ports;

public class Conveyor extends SubsystemBase {
    private WPI_TalonFX motor = new WPI_TalonFX(Ports.Conveyor.MOTOR);
    private Conveyor INSTANCE = null;

    private Conveyor(){
        motor.setInverted(Ports.Conveyor.INV);
        motor.enableVoltageCompensation(Constants.Conveyor.VOLT_ENABLE);
        motor.configVoltageCompSaturation(Constants.Conveyor.SAT);
    }
    
    public void setPower(double power){
        motor.set(power);
    }
    public double getPower(){
        return motor.get();
    }
    public Conveyor INSTACE(){
        if (INSTANCE == null){
            INSTANCE = new Conveyor();
        }
        return INSTANCE;
    }
}
