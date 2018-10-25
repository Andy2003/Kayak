/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.andy2003.ui.time;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;

@ActionID(category = "Time",
id = "StopAction")
@ActionRegistration(iconBase = "org/tango-project/tango-icon-theme/16x16/actions/media-playback-stop.png",
displayName = "com.github.andy2003.ui.time.Bundle#CTL_StopAction")
@ActionReferences({
    @ActionReference(path = "Toolbars/Time", position = 300),
    @ActionReference(path = "Menu/Time", position = 300)
})
public final class StopAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        TimeSourceManager.getGlobalTimeSource().stop();
    }
}
