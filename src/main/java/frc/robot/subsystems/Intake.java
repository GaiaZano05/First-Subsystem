package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.Subsystem;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Ports;

import java.security.spec.RSAOtherPrimeInfo;

public class Intake extends SubsystemBase {
    private final WPI_TalonFX motor = new WPI_TalonFX(Ports.MOTOR);
    private final Solenoid piston = new Solenoid(PneumaticsModuleType.CTREPCM, Ports.PISTON);
    private final Intake INSTANCE = null;

    private Intake(){
        motor.setInverted(Ports.INV);
    }
}
