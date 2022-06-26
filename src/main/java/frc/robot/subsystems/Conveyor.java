package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Ports;

public class Conveyor extends SubsystemBase {
    private static Conveyor INSTANCE;
    private final WPI_TalonFX motor = new WPI_TalonFX(Ports.Conveyor.MOTOR);

    private Conveyor() {
        motor.enableVoltageCompensation(true);
        motor.configVoltageCompSaturation(Constants.NOMINAL_VOLTAGE, Constants.TALON_TIMEOUT);
        motor.setInverted(Ports.Conveyor.IS_INVERTED);
    }

    public static Conveyor getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Conveyor();
        }
        return INSTANCE;
    }

    public double getPower(){
        return motor.get();
    }

    public void setPower(double power){
        motor.set(power);
    }
}
