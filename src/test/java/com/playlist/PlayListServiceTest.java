package com.playlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.AssertTrue.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
public class PlayListServiceTest {

    PlayListService service;

    @BeforeEach
    public void setup() {
        service = new PlayListService();
    }


    @Test
    public void gPlayListDBIsEmptyTest() {

        //assertNull(service.getPlayList1());
        assertTrue(service.getPlayList1().isEmpty());
    }


    @Test
    public void gPlayListDBReturnsPlayListTest() {

        //service.play1 = "Playlist1";
        service.play1.add("Playlist1");

        assertEquals(service.getPlayList1().get(0), "Playlist1");
    }

    @Test
    public void getMultiplePlayListNames() {

        //service.play1 = "Playlist1";
        service.play1.add("Playlist1");
        service.play1.add("Playlist2");

        assertEquals("Playlist1",service.getPlayList1().get(0));
        assertEquals("Playlist2", service.getPlayList1().get(1));
    }

    @Test
    public void addSongsToPlayList(){
        PlayListDTO playListDTO = new PlayListDTO();
        playListDTO.songs = "song1";
        service.addSongs(playListDTO);

        assertEquals("song1", service.addSongs().get(0));
    }
}
