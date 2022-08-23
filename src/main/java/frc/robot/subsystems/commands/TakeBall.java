package frc.robot.subsystems.commands;


import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.Intake;

public class TakeBall extends CommandBase {


    Intake intake;

    public TakeBall(Intake intake){
        this.intake = intake;
        addRequirements(intake);
    }
    @Override
    public void initialize() {
        intake.setPower(Constants.Intake.POWER);
        intake.setPiston(true);
    }

    @Override
    public void end(boolean interrupted) {
        intake.setPower(0);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
