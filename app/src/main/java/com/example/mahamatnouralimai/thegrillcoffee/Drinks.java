package com.example.mahamatnouralimai.thegrillcoffee;

/**
 * Created by mahamatnouralimai on 03/07/2017.
 */

public class Drinks {

    private String name ;
    private String descs;
    private int imageID;

    public static final Drinks[] drinks = {

            new Drinks("coffee", "this a description for the grill coffee", R.drawable.grillcoffeesubusa),
            new Drinks("black", "this a description for the grill black coffee", R.drawable.coffe2),
            new Drinks("grill coffe", "this a description for the grill coffee", R.drawable.grillcoffee),
    };

    private Drinks(String name, String descs, int imageID){

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

