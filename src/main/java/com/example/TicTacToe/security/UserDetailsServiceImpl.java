package com.example.TicTacToe.security;

import com.example.TicTacToe.model.Player;
import com.example.TicTacToe.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import static com.google.common.base.Preconditions.checkNotNull;
import static org.springframework.util.StringUtils.isEmpty;


/**
 * Created by User on 11/29/2017.
 */
//Customize security settings
public class UserDetailsServiceImpl implements UserDetailsService {

    private PlayerRepository playerRepository;

    @Autowired
    public UserDetailsServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        checkNotNull(userName);

        if (isEmpty(userName)) {
            throw new UsernameNotFoundException("Username cannot be empty");
        }

        Player player = playerRepository.findOneByUserName(userName);
        if (player == null) {
            throw new UsernameNotFoundException("Player " + userName + " not found or not exist");
        }
        return new ContextUser(player);
    }
}
