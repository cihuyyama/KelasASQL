package com.example.kelasasql.database;

public class Teman {
    /*deklarasi varibel*/
    String id,nama,telpon;


    /*dikombinasikan dengan constructor get and set*/
    public Teman() {
    }

    /*function yang harus berisi parameter*/
    public Teman(String id, String nama, String telpon) {
        this.id = id;
        this.nama = nama;
        this.telpon = telpon;
    }

    /*constructor getter*/
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    /*constructor setter*/
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelpon() {
        return telpon;
    }

    public void setTelpon(String telpon) {
        this.telpon = telpon;
    }
}
