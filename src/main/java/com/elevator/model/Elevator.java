package com.elevator.model;

public interface Elevator {
    void gotoFloor(int floor);
    Dimension getDimension();
    ElevatorState getState();
    int getCurrentFloor();

}
