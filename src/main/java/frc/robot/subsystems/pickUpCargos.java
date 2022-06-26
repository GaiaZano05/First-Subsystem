package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandBase;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;

public class pickUpCargos extends CommandBase {
    private final Intake intake;
    private final Conveyor conveyor;
    private final BooleanSupplier condition;
    private final DoubleSupplier powerIntake;
    private final DoubleSupplier powerConveyor;

    public pickUpCargos(Intake intake, Conveyor conveyor, BooleanSupplier condition, DoubleSupplier powerIntake, DoubleSupplier powerConveyor) {
        this.intake = intake;
        this.conveyor = conveyor;
        this.condition = condition;
        this.powerIntake = powerIntake;
        this.powerConveyor = powerConveyor;

        addRequirements(intake, conveyor);
    }

    @Override
    public void initialize() {
        intake.openPiston();
    }

    @Override
    public void execute() {
        if (condition.getAsBoolean()) {
            intake.setPower(powerIntake.getAsDouble());
        } else intake.setPower(0);
    }

    @Override
    public boolean isFinished() {
        if (!condition.getAsBoolean()) {
            return false;
        }
        return true;
    }

    @Override
    public void end(boolean interrupted) {
        intake.setPower(0);
        intake.closePiston();
    }
}
