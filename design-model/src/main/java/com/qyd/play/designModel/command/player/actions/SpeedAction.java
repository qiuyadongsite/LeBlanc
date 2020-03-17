package com.qyd.play.designModel.command.player.actions;

import com.qyd.play.designModel.command.player.GPlayer;
import com.qyd.play.designModel.command.player.IAction;

/**
 * Created by Tom.
 */
public class SpeedAction implements IAction {
    private GPlayer gplayer;

    public SpeedAction(GPlayer gplayer) {
        this.gplayer = gplayer;
    }

    public void execute() {
        gplayer.speed();
    }
}
