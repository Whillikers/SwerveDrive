/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardware;

import edu.wpi.first.wpilibj.PIDSource;

/**
 *
 * @author Aidan
 */
public interface AngularSensor extends PIDSource {
    public double getDegrees();
}