package frc.robot;

import com.ctre.phoenix.motorcontrol.TalonFXInvertType;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import edu.wpi.first.wpilibj.motorcontrol.Talon;

public class Ports {
    public static class Intake {
        public static int MOTOR = 0;
        public static int PISTON = 0;
        public static TalonFXInvertType INV = TalonFXInvertType.Clockwise;
    }
    public static class Conveyor {
        public static int MOTOR = 0;
    }

}
