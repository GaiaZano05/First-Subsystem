package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.Subsystem;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Ports;

import java.security.spec.RSAOtherPrimeInfo;

public class Intake extends SubsystemBase {
    private final WPI_TalonFX motor = new WPI_TalonFX(Ports.MOTOR);
    private final Solenoid piston = new Solenoid(PneumaticsModuleType.CTREPCM, Ports.PISTON);
    private Intake INSTANCE = null;

    private Intake() {
        motor.setInverted(Ports.INV);
        motor.enableVoltageCompensation(Constants.VOLT_ENABLE);
        motor.configVoltageCompSaturation(Constants.SAT);
    }

    /**
     * set power
     * @param power power%
     */
    public void setPower(double power) {
        motor.set(power);
    }

    /**
     * get power
     * @return power%
     */
    public double getPower() {
        return motor.get();
    }

    /**
     * open piston
     */
    public void openPiston() {
        piston.set(true);
    }

    /**
     * close piston
     */
    public void closePiston() {
        piston.set(false);
    }

    /**
     * get piston
     * @return true/false
     */
    public boolean getPiston() {
        return piston.get();
    }

    /**
     * create intake
     * @return intake
     */
    public Intake INSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new Intake();
        }
        return INSTANCE;
    }
}

