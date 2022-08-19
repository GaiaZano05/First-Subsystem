package frc.robot.subsystems.conveyor;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Ports;

public class Conveyor extends SubsystemBase {
    private WPI_TalonFX motor = new WPI_TalonFX(Ports.Conveyor.MOTOR);
    private Conveyor INSTANCE = null;

    private Conveyor(){

    }
}
