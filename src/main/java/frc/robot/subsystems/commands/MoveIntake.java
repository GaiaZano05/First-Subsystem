package frc.robot.subsystems.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.Constants;
import frc.robot.subsystems.Intake;

public class MoveIntake extends InstantCommand {
    Intake intake;
    private boolean mode;

    public MoveIntake(Intake intake, boolean mode){
        this.intake = intake;
        this.mode = mode;
        addRequirements(intake);
    }

    @Override
    public void initialize() {
        intake.setPiston(mode);
    }

}
