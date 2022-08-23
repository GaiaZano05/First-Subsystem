// Copyright (c) FIRST and other WPILib contributors.

// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.commands.MoveIntake;
import frc.robot.subsystems.commands.PowerWheels;
import frc.robot.subsystems.commands.TakeBall;


/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer
{
    // The robot's subsystems and commands are defined here...
    private XboxController xbox = new XboxController(0);
    private JoystickButton a = new JoystickButton(xbox, XboxController.Button.kA.value);
    private JoystickButton x = new JoystickButton(xbox, XboxController.Button.kX.value);
    private JoystickButton b = new JoystickButton(xbox, XboxController.Button.kB.value);
    private JoystickButton y = new JoystickButton(xbox, XboxController.Button.kY.value);
    private Intake intake = new Intake();

    
    /** The container for the robot. Contains subsystems, OI devices, and commands. */
    public RobotContainer()
    {
        // Configure the button bindings
        configureButtonBindings();
    }
    
    
    /**
     * Use this method to define your button->command mappings. Buttons can be created by
     * instantiating a {@link GenericHID} or one of its subclasses ({@link
     * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
     * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
     */
    private void configureButtonBindings()
    {
        // Add button to command mappings here.
        // See https://docs.wpilib.org/en/stable/docs/software/commandbased/binding-commands-to-triggers.html
        a.whenPressed(new MoveIntake(intake, false));//up
        x.whenPressed(new MoveIntake(intake, true));//down
        b.whileHeld(new PowerWheels(intake));
        y.whileHeld(new TakeBall(intake));
    }
    
    
    /**
     * Use this to pass the autonomous command to the main {@link Robot} class.
     *
     * @return the command to run in autonomous
     */
    public Command getAutonomousCommand(){return getAutonomousCommand();}

        // An ExampleCommand will run in autonomous

}
