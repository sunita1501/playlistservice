package com.playlist;

import java.util.ArrayList;
import java.util.List;

public class PlayListService {

    //String play1;
    List<String> play1 = new ArrayList<>();

    /*public Object getPlayList() {

        return null;

    }*/

    public List<String> getPlayList1() {


        return play1;
    }


    public void addSongs(PlayListDTO playListDTO) {
        play1.add(playListDTO.songs);

    }
}
