package com.playlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class PlayListIT {

    @Test
    public void gPlayListDBIsEmptyTest() {
        PlayListDB playlist = new PlayListDB();

        assertNull(playlist.getPlayList());
    }

}
