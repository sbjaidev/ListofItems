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
     * @param pImageResourceId
     * @param pTitle
     * @param pDescription
     */
    ListMember(int pImageResourceId, String pTitle, String pDescription) {
        this(pImageResourceId, pTitle);
        mHasDescription = true;
        mDescription = pDescription;
    }

    /**
     *
     * @param pTitle
     * @param pDescription
     */
    ListMember(String pTitle, String pDescription) {
        this(pTitle);
        mDescription = pDescription;
        mHasDescription = true;
    }

    /**
     *
     * @param pTitle
     */
    ListMember(String pTitle) {
        mTitle = pTitle;
        mHasDescription = false;
        mHasImage = false;
    }

    /**
     *
     * @param pImageResourceId
     * @param pTitle
     */
    ListMember(int pImageResourceId, String pTitle) {
        this(pTitle);
        mImageResourceId = pImageResourceId;
        mHasImage = true;
    }

    /**
     *
     * @return
     */
    int getImageResourceId() { return mImageResourceId; }

    /**
     *
     * @return
     */
    public String getTitle() { return mTitle; }

    /**
     *
     * @return
     */
    String getDescription() { return mDescription; }

    /**
     *
     * @return
     */
    boolean hasImage() { return mHasImage; }

    /**
     *
     * @return
     */
    boolean hasDescription() { return mHasDescription; }
}
