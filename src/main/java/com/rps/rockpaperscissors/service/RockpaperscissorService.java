package com.rps.rockpaperscissors.service;

import com.rps.rockpaperscissors.model.PlayerDetails;
import com.rps.rockpaperscissors.utils.MoveType;
import com.rps.rockpaperscissors.utils.PlayerType;

/***
 **@Author:Nagaraju Ukkalam
 @Version:1.0
 @Date:08-08-2019 23:03
 **/

public interface RockpaperscissorService {
    public PlayerDetails getRockpaperscissorGameResult(MoveType moveType, PlayerType playWith);
}
