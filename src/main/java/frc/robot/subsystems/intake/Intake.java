package frc.robot.subsystems.intake;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Ports;

public class Intake extends SubsystemBase {
    private static WPI_TalonFX motor = new WPI_TalonFX(Ports.MOTOR);
    private static Solenoid piston = new Solenoid(PneumaticsModuleType.CTREPCM, Ports.PISTON);
    private static Intake INSTANCE = null;

    private Intake() {
        motor.enableVoltageCompensation(Constants.ENABLE_VOLTAGE);
        motor.setInverted(Ports.INVERTED);
        motor.configVoltageCompSaturation(Constants.COMP_VOLTAGE);
    }

    public static double getPower() {
        return motor.get();
    }

    public static void setPower(double power) {
        motor.set(power);
    }

    public static Intake INSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new Intake();
        }
        return INSTANCE;
    }

    public static void toggle() {
        piston.toggle();
    }

    public static void openPiston() {
        piston.set(true);
    }

    public static void closePiston() {
        piston.set(false);
    }

    public static void stopMotor() {
        motor.set(0);
    }
}
