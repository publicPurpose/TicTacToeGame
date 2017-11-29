package com.example.TicTacToe.security;

import com.example.TicTacToe.model.Player;
import com.google.common.collect.ImmutableSet;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

/**
 * Created by User on 11/29/2017.
 */

//We construct the user object of our application
public class ContextUser extends User {

    //TODO make it final player field
    private Player player;
    // our user in application is our player = > we user fields out from this class


    //create constructor matching super
    public ContextUser(Player player) {
        //receive the userName and password
        super(player.getUserName(),
                player.getPassword(),
                // do not check if account if expired or else
                //TODO test in the future
                true,
                true,
                true,
                true,
                ImmutableSet.of(new SimpleGrantedAuthority("create")));

        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }
}
