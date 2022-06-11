package com.example.fxapplikasjon.model;

public class runde {
    private String player;
    private int antallForsok;

    private String ord;

    public runde(String ord, String player, int antallForsok) {
        this.ord = ord;
        this.player = player;
        this.antallForsok = antallForsok;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public int getAntallForsok() {
        return antallForsok;
    }

    public void setAntallForsok(int antallForsok) {
        this.antallForsok = antallForsok;
    }

    public String getOrd() {
        return ord;
    }

    public void setOrd(String ord) {
        this.ord = ord;
    }
}
