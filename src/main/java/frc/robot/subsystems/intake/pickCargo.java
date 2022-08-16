package frc.robot.subsystems.intake;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class pickCargo extends CommandBase {
    private final Intake intake;
    private final double power;

    public pickCargo(Intake intake, double power){
        this.intake=intake;
        this.power=power;
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
        intake.closePiston();
    }

    
}
