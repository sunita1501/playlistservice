package com.playlist;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.*;

@Service
public class PlayListService {

    //String play1;
    //List<PlayListDTO> play1 = new ArrayList<>();

    @Autowired
    PlayListRepository playListRepository;

    public PlayListService(PlayListRepository playListRepository) {
    }

    /*public Object getPlayList() {

        return null;

    }*/

    public List<PlayListDTO> getPlayList1() {

        List<PlayListEntity> EntityList = playListRepository.findAll();

        List<PlayListDTO> playListDTOList = EntityList.stream().map(visitorEntity -> {
            PlayListDTO playListDTO = new PlayListDTO(visitorEntity.name, visitorEntity.songs);
            return playListDTO;
        }).collect(Collectors.toList());

        return playListDTOList;



    }
    public void savePlayListDetails(PlayListDTO playListDTO) {
        //play1.add(playListDTO.name);
        //play1.add(playListDTO.songs);
        //System.out.println(play1[0].name);
        playListRepository.save(new PlayListEntity(playListDTO.name, playListDTO.songs));



    }

    /*public void addSongs(PlayListDTO playListDTO) {
        play1.add(playListDTO.songs);

    }*/




}
