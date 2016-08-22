package com.example.android.visitA2;

/**
 * Class that contains information about one sight in the city
 */
public class Sight {

    // The name of the sight
    private String mName;
    // A description for the sight
    private String mDescription;
    // The id for the drawable that corresponds to the sight
    private int mImgResId;
    // The website with information of the sight
    private String mWebsite;
    // The website to the Google Maps location of the sight
    private String mMapWebsite;

    /**
     * Public constructor for the class
     *
     * @param name        The name of the sight
     * @param description The description of the new sight
     * @param imgResId    The resource id for the drawable of the new sight
     * @param website     The website of the new sight
     * @param mapWebsite  The map website for the new sight
     */
    public Sight(String name, String description, int imgResId, String website, String mapWebsite) {
        this.mName = name;
        this.mDescription = description;
        this.mImgResId = imgResId;
        this.mWebsite = website;
        this.mMapWebsite = mapWebsite;
    }

    /**
     * Getter function for the name of the sight
     *
     * @return The name of the sight
     */
    public String getName() {
        return mName;
    }

    /**
     * Getter function for the description of the sight
     *
     * @return The description of the sight
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * Getter function for the drawable resource id of the sight
     *
     * @return The drawable resource id
     */
    public int getImgResId() {
        return mImgResId;
    }

    /**
     * Getter function for the website of the sight
     *
     * @return The website of the sight
     */
    public String getWebsite() {
        return mWebsite;
    }

    /**
     * Getter function for the map website og the sight
     *
     * @return The map website for the sight
     */
    public String getMapWebsite() {
        return mMapWebsite;
    }

    /**
     * Returns a string with all the information associated with the sight in human-readable
     * language
     *
     * @return A string with all the information for a sight
     */
    @Override
    public String toString() {
        String str = "Name: " + this.getName() + "\n";
        str += "Description: " + this.getDescription() + "\n";
        str += "Image Id: " + this.getImgResId();
        str += "Website: " + this.getWebsite() + "\n";
        str += "Map Website: " + this.getMapWebsite() + "\n";
        return str;
    }
}
