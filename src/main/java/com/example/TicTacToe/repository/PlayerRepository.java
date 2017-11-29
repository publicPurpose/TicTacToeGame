package com.example.TicTacToe.repository;

import com.example.TicTacToe.model.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by User on 11/29/2017.
 */
@Repository
public interface PlayerRepository extends CrudRepository<Player, Long>{

    Player findOneByUserName(String userName);
}
