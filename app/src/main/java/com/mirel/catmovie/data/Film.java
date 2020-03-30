package com.mirel.catmovie.data;

public class Film {
    private String filmsId;
    private int gambar;
    private String judul;
    private String deskripsi;


//////////////////////////////
    public Film(String films_Id,
                String judul,
                String deskripsi,
                int gambar) {
        this.filmsId = films_Id;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
        this.judul = judul;

    }
/////////////////////////////////
    public String getDek() {

        return deskripsi;
    }

    public String getidfilm() {

        return filmsId;
    }

    public String getjudul() {

        return judul;
    }

    public int getgambar() {

        return gambar;
    }






}
