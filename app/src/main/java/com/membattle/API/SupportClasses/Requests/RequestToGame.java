package com.membattle.API.SupportClasses.Requests;

/**
 * Created by Севастьян on 22.11.2017.
 */
public class RequestToGame {
    public int user_id, game_id;
    int right;
    String type;
    public RequestToGame(int user_id, int right, int game_id, String type) {
        this.user_id = user_id;
        this.game_id = game_id;
        this.right = right;
        this.type = type;
    }
}