package com.playlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PlayListServiceTest {

    PlayListService service;

    @BeforeEach
    public void setup() {
        service = new PlayListService();
    }


    @Test
    public void gPlayListDBIsEmptyTest() {

        assertNull(service.getPlayList());
    }


    @Test
    public void gPlayListDBReturnsPlayListTest() {

        service.play1 = "Playlist1";

        assertEquals(service.getPlayList1(), "Playlist1");
    }

}
