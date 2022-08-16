package frc.robot.subsystems.conveyor;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Ports;


public class Conveyor extends SubsystemBase {
    private static WPI_TalonFX motor=new WPI_TalonFX(Ports.CONVEYOR);
    private static Conveyor INSTANCE=null;

    private Conveyor(){
        motor.setInverted(Ports.INVERTED);
        motor.enableVoltageCompensation(Constants.ENABLE_VOLTAGE);
        motor.configVoltageCompSaturation(Constants.COMP_VOLTAGE);
    }

    public static double getPower(){
        return motor.get();
    }
    public static void setPower(double Power){
        motor.set(Power);
    }

    public static Conveyor INSTANCE(){
        if (INSTANCE==null){
            INSTANCE=new Conveyor();
        }
        return INSTANCE;
    }



}
