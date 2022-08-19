package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class Pickup extends CommandBase {
    private Intake intake;
    private double power;

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
        intake.setPower(0);
    }
    
}