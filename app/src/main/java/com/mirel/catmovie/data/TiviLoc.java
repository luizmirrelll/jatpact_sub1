package com.mirel.catmovie.data;
///////////////////////////
public class TiviLoc {
    private String tivi_Id;
    private int gambar;
    private String deskripsi;
    private String judul;

//////////////////////////////
    public TiviLoc(
            String tivi_Id,
            String judul,
            String deskripsi,
            int gambar) {
        this.tivi_Id = tivi_Id;
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
    }
/////////////////////////////////
    public String getDek() {

        return deskripsi;
    }

    public int getgmbar() {

        return gambar;
    }
    public String getidtivi() {

        return tivi_Id;
    }

    public String getjudul() {

        return judul;
    }



}
