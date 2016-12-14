package com.example.android.listofitems;

/**
 *
 * {@link ListMember} represents...
 */

class ListMember {

    /**
     *
     */
    private int mImageResourceId;

    /**
     *
     */
    private String mTitle;

    /**
     *
     */
    private String mDescription;

    /**
     *
     */
    private boolean mHasImage;

    /**
     *
     */
    private boolean mHasDescription;

    /**
     *
     * @param pImageResourceId - location of the image in the card
     * @param pTitle - title of the card
     * @param pDescription - description of the card
     */
    ListMember(int pImageResourceId, String pTitle, String pDescription) {
        this(pImageResourceId, pTitle);
        mHasDescription = true;
        mDescription = pDescription;
    }

    /**
     *
     * @param pTitle - title of the card
     * @param pDescription - description of the card
     */
    ListMember(String pTitle, String pDescription) {
        this(pTitle);
        mDescription = pDescription;
        mHasDescription = true;
    }

    /**
     *
     * @param pTitle - title of the card
     */
    ListMember(String pTitle) {
        mTitle = pTitle;
        mHasDescription = false;
        mHasImage = false;
    }

    /**
     *
     * @param pImageResourceId - location of the image in the card
     * @param pTitle - title of the card
     */
    ListMember(int pImageResourceId, String pTitle) {
        this(pTitle);
        mImageResourceId = pImageResourceId;
        mHasImage = true;
    }

    /**
     *
     * @return - the location of the image to be placed in the card
     */
    int getImageResourceId() { return mImageResourceId; }

    /**
     *
     * @return - the title of the card
     */
    String getTitle() { return mTitle; }

    /**
     *
     * @return - the description of the card
     */
    String getDescription() { return mDescription; }

    /**
     *
     * @return - check whether the card has an image
     */
    boolean hasImage() { return mHasImage; }

    /**
     *
     * @return - check whether the card has a description
     */
    boolean hasDescription() { return mHasDescription; }
}
