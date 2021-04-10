package com.playlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayListController {

    @Autowired
    public PlayListService playlistService;

    @GetMapping("playlist")
    public List<String> fetchList(){
        return playlistService.getPlayList1();


    }
}
