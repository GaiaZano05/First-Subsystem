package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Ports;

public class Conveyor extends SubsystemBase {
    private final WPI_TalonFX motor = new WPI_TalonFX(Ports.Conveyor.MOTOR);

    private Conveyor(){
        motor.configVoltageCompSaturation(Constants.Conveyor.VOLTAGE_SATURATION);
        motor.enableVoltageCompensation();
    }
}
