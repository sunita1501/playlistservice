package com.playlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

//import static org.junit.jupiter.api.AssertTrue.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
public class PlayListServiceTest {

    @InjectMocks
    PlayListService service;

    @Mock
    PlayListRepository playListRepository;

    PlayListDTO playListDTO;

    @BeforeEach
    public void setup() {
        //service = new PlayListService();
        service = new PlayListService(playListRepository);
        playListDTO = new PlayListDTO();
    }


   /* @Test
    public void gPlayListDBIsEmptyTest() throws Exception{

        //assertNull(service.getPlayList1());
        assertTrue(service.getPlayList1().isEmpty());
    }*/

    /*
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

        assertEquals("song1", service.getPlayList1().get(0));
    }*/
}
