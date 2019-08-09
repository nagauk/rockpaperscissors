package com.rps.rockpaperscissors.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum MoveType {

    ROCK,PAPER,SCISSOR;

    private static final List<MoveType> VALUES = Collections.unmodifiableList(Arrays.asList(values()));

    private static final int SIZE = VALUES.size();

    private static final Random RANDOM = new Random();

    public static MoveType randomMoveType()  {

        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
