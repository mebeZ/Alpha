package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;

import org.opencv.core.Core;
import org.opencv.videoio.VideoCapture;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

import java.awt.image.BufferedImage;

public class FrameCaptureSubsystem
    {
    VideoCapture cap;
    
    public void subcam() {
        cap = new VideoCapture(0);
    }
 
    public void openCam() {
        cap.open(0);
    }
  
    public void isOpened() {
        if (cap.isOpened()) {
            System.out.println("cap is opened");
        }
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
      }
    }