package com.playlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayListController {

    @Autowired
    public PlayListService playlistService;

    @GetMapping("playlist")
    public List<PlayListDTO> fetchList(){
        return playlistService.getPlayList1();

    }

    @PostMapping("playlist")
    @ResponseStatus(HttpStatus.CREATED)
    public void createPlayList(@RequestBody PlayListDTO playListDTO){
        playlistService.savePlayListDetails(playListDTO);
    }
}
