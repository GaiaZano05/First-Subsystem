package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandBase;

/**
 * opens piston, set power to power%, close piston, set power 0%.
 */

public class Pickup extends CommandBase {
    private final Intake intake;
    private final double power;

    public Pickup(Intake intake, double power) {
        this.intake = intake;
        this.power = power;
        addRequirements(intake);
    }

    @Override
    public void initialize() {
        intake.openPiston();
    }

    @Override
    public void execute() {
        intake.setPower(power);
    }

    @Override
    public void end(boolean interrupted) {
        intake.closePiston();
        intake.setPower(0);

    }

}
