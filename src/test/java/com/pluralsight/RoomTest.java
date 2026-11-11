package com.pluralsight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_should_markRoomOccupiedAndDirty() {
        Room room = new Room(2, 77.00, false, false);
        room.checkIn();
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    public void checkOut_should_markRoomUnoccupiedAndDirty() {
        Room room = new Room(2, 77.00, true, true);
        room.checkOut();
        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());
        assertFalse(room.isAvailable());
    }

    @Test
    public void cleanRoom_should_markRoomAvailable() {
        Room room = new Room(2, 77.00, false, true);
        room.cleanRoom();
        assertFalse(room.isDirty());
        assertTrue(room.isAvailable());
    }

    @Test
    public void checkIn_should_doNothing_whenRoomIsDirty() {
        Room room = new Room(2, 77.00, false, true);
        room.checkIn();
        assertFalse(room.isOccupied());
    }

    @Test
    public void checkIn_should_doNothing_whenRoomIsOccupied() {
        Room room = new Room(2, 124.00, true, false);
        room.checkIn();
        assertTrue(room.isOccupied());
        assertFalse(room.isDirty());
    }

    @Test
    public void cleanRoomOccupiedRoomDoesNothing() {
        Room room = new Room(2, 77.00, true, true);
        room.cleanRoom();
        assertTrue(room.isDirty());
    }
}