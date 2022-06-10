package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import frc.robot.Constants;
import frc.robot.Ports;


public class Intake {
    private static Intake INSTANCE;
    private final WPI_TalonFX motor = new WPI_TalonFX(Ports.Intake.MOTOR);
    private final Solenoid piston = new Solenoid(PneumaticsModuleType.CTREPCM, Ports.Intake.SELENOID);


    public Intake() {
        motor.getSelectedSensorPosition();
        motor.enableVoltageCompensation(true);
        motor.configVoltageCompSaturation(Constants.NOMINAL_VOLTAGE, Constants.TALON_TIMEOUT);
        motor.configClosedloopRamp(0);
        motor.configOpenloopRamp(0);

    }

    public static Intake getINSTANCE(){
        if (INSTANCE == null){
            INSTANCE = new Intake();
        }
        return INSTANCE;
    }

    public double getPower() {
        return motor.get();
    }

    public void setPower(double power){
        motor.set(power);
    }

    public void openPiston(){
        piston.set(pistonState.OPEN.value);
    }
    public void closePiston(){
        piston.set(pistonState.CLOSED.value);
    }

    public void togglePiston(){
        piston.toggle();
    }

    public boolean getPistonState() {
        return piston.get();
    }


    public enum pistonState{
        OPEN(true),
        CLOSED(false);

        public final boolean value;

        pistonState(boolean value) {
            this.value = value;
        }
    }
}
