/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.smg.gallery.model;

/**
 *
 * @author smgAF75
 */
public class Painting {
    private String authorName;
    private int year;
    private String icon;
    private String image;
    private int x;
    private int y;

    public Painting() {
    }

    public Painting(String authorName, int year, String icon, String image, int x, int y) {
        this.authorName = authorName;
        this.year = year;
        this.icon = icon;
        this.image = image;
        this.x = x;
        this.y = y;
    }



    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
 

    
    
    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }
   

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    
    
}
