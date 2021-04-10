package com.playlist;

import org.junit.jupiter.api.Test;

public class PlayListIT {

    @Test
    public void gPlayListDBIsEmptyTest() {
        PlayListDB playlist = new PlayListDB();

        assertNull(playlist.getplayList());
    }

}
