package com.elevator.model;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SimpleElevator implements Elevator {
    @Override
    public void gotoFloor(int floor) {
        
    }

    @Override
    public Dimension getDimension() {
        return null;
    }

    @Override
    public ElevatorState getState() {
        return null;
    }

    @Override
    public int getCurrentFloor() {
        return 0;
    }
}
