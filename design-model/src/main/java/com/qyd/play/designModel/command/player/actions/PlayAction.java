package com.qyd.play.designModel.command.player.actions;

import com.qyd.play.designModel.command.player.GPlayer;
import com.qyd.play.designModel.command.player.IAction;

/**
 * Created by Tom.
 */
public class PlayAction implements IAction {
    private GPlayer gplayer;

    public PlayAction(GPlayer gplayer) {
        this.gplayer = gplayer;
    }

    public void execute() {
        gplayer.play();
    }
}
