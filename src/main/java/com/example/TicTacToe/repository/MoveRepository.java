package com.example.TicTacToe.repository;

import com.example.TicTacToe.model.Move;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by User on 11/29/2017.
 */
@Repository
public interface MoveRepository extends CrudRepository<Move, Long> {
    //TODO get findByMethods
}
