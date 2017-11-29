package com.example.TicTacToe.model;

/**
 * Created by User on 11/28/2017.
 */
public class Position {

    private int boardRow;
    private int boardColumn;

    public Position() {
    }

    public int getBoardRow() {
        return boardRow;
    }

    public void setBoardRow(int boardRow) {
        this.boardRow = boardRow;
    }

    public int getBoardColumn() {
        return boardColumn;
    }

    public void setBoardColumn(int boardColumn) {
        this.boardColumn = boardColumn;
    }
}
