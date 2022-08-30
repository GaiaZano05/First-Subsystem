package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Ports;

public class Conveyor extends SubsystemBase {
    private final WPI_TalonFX motor = new WPI_TalonFX(Ports.Conveyor.MOTOR);

    private Conveyor(){
        motor.configVoltageCompSaturation(Constants.Conveyor.VOLTAGE_SATURATION);
        motor.enableVoltageCompensation(Constants.Conveyor.VOLTAGE_COMPEMTION);
        motor.setInverted(Constants.Conveyor.VOLTAGE_COMPEMTION);
    }

    /**
     * set power to motor
     * @param power [-1 - 1]
     */
    public void setPower(double power){
        motor.set(power);
    }

    /**
     * get power of motor
     * @return power [-1 - 1]
     */
    public double getPower(){
        return motor.get();
    }
}

