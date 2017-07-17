package com.example.mahamatnouralimai.thegrillcoffee;

/**
 * Created by mahamatnouralimai on 04/07/2017.
 */

public class Foods {
    private String name ;
    private String descs;
    private int imageID;

    public static final Foods[] foods = {

            new Foods("coffee", "this a description for the grill coffee", R.drawable.grillcoffeesubusa),
            new Foods("black", "this a description for the grill black coffee", R.drawable.coffe2),
            new Foods("grill coffe", "this a description for the grill coffee", R.drawable.grillcoffee),
    };

    private Foods(String name, String descs, int imageID){

        this.name=name;
        this.descs= descs;
        this.imageID=imageID;
    }

    public String getDescs(){
        return descs;
    }
    public String getName(){
        return name;
    }
    public int getImageID(){
        return imageID;
    }

    public String toString(){

        return this.name;
    }

}
