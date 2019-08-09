package com.rps.rockpaperscissors.controller;

import com.rps.rockpaperscissors.exceptions.RockpaperscissorException;
import com.rps.rockpaperscissors.model.PlayerDetails;
import com.rps.rockpaperscissors.service.RockpaperscissorService;
import com.rps.rockpaperscissors.utils.MoveType;
import com.rps.rockpaperscissors.utils.PlayerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/***
 **@Author:Nagaraju Ukkalam
 @Version:1.0
 @Date:08-08-2019 22:53
 **/
@RestController
public class RockpaperscissorController {

    @Autowired
    private RockpaperscissorService rockpaperscissorService;

    @GetMapping(value = "/play", params = {"moveType","playerType"})
    public PlayerDetails getRockpaperscissorGameResult(@RequestParam("moveType") String moveType,
                                         @RequestParam("playerType") String playerType){
        PlayerDetails playerDetails = null;

        try {
            playerDetails = rockpaperscissorService.getRockpaperscissorGameResult(MoveType.valueOf(moveType),PlayerType.valueOf(playerType));
        } catch (Exception ex){
            throw new RockpaperscissorException("Invalid rockpaperscissor request details [moveType:"+moveType+" ,playerType:"+playerType+"]");
        }

        return playerDetails;
    }
}
