package com.rps.rockpaperscissors.model;

import com.rps.rockpaperscissors.utils.MoveType;
import com.rps.rockpaperscissors.utils.PlayerType;
import com.rps.rockpaperscissors.utils.Status;

/***
 **@Author:Nagaraju Ukkalam
 @Version:1.0
 @Date:08-08-2019 23:03
 **/
public class PlayerDetails {
    private PlayerType playerType;
    private MoveType moveType;
    private Status status;

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public MoveType getMoveType() {
        return moveType;
    }

    public void setMoveType(MoveType moveType) {
        this.moveType = moveType;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
