package com.playlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PlayListIT {

    @Test
    public void gPlayListDBIsEmptyTest() {
        PlayListDB playlist = new PlayListDB();

        assertNull(playlist.getPlayList());
    }

    @Test
    public void gPlayListDBReturnsPlayListTest() {
        PlayListDB playlist = new PlayListDB();
        playlist.play1 = "Playlist1";

        assertEquals(playlist.getPlayList(), "Playlist1");
    }

}
