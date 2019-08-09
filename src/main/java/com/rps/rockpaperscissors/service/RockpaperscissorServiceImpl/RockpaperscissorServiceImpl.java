package com.rps.rockpaperscissors.service.RockpaperscissorServiceImpl;

import com.rps.rockpaperscissors.model.PlayerDetails;
import com.rps.rockpaperscissors.service.RockpaperscissorService;
import com.rps.rockpaperscissors.utils.MoveType;
import com.rps.rockpaperscissors.utils.PlayerType;
import com.rps.rockpaperscissors.utils.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/***
 **@Author:Nagaraju Ukkalam
 @Version:1.0
 @Date:08-08-2019 23:10
 **/
@Service
public class RockpaperscissorServiceImpl implements RockpaperscissorService {

    private Logger logger = LoggerFactory.getLogger(RockpaperscissorServiceImpl.class);

    @Override
    public PlayerDetails getRockpaperscissorGameResult(MoveType moveType, PlayerType playerType) {
        logger.info("Start getRockpaperscissorGameResult request details[moveType:{},playerType:{}]",moveType,playerType);
        PlayerDetails playerDetails = new PlayerDetails();

        MoveType player1MoveType = MoveType.randomMoveType();

        MoveType player2MoveType = moveType;
        playerDetails.setPlayerType(playerType);
        playerDetails.setMoveType(moveType);
        if(player1MoveType.equals(player2MoveType)){
            playerDetails.setStatus(Status.TIE);
        } else if((player1MoveType.equals(MoveType.SCISSOR) && player2MoveType.equals(MoveType.PAPER)) ||
                (player1MoveType.equals(MoveType.PAPER) && player2MoveType.equals(MoveType.ROCK)) ||
                (player1MoveType.equals(MoveType.ROCK) && player2MoveType.equals(MoveType.SCISSOR))){
            playerDetails.setStatus(Status.LOSS);
        }else if((player2MoveType.equals(MoveType.SCISSOR) && player1MoveType.equals(MoveType.PAPER)) ||
                (player2MoveType.equals(MoveType.PAPER) && player1MoveType.equals(MoveType.ROCK)) ||
                (player2MoveType.equals(MoveType.ROCK) && player1MoveType.equals(MoveType.SCISSOR))){
            playerDetails.setStatus(Status.WIN);
        }else{
            playerDetails.setStatus(Status.NO_RESULT);
        }
        logger.info("End getRockpaperscissorGameResult moves[player1MoveType:{},player2MoveType:{},status:{}]",player1MoveType,player2MoveType,playerDetails.getStatus().name());
        return playerDetails;
    }
}
