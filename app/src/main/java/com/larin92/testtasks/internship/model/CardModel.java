package com.larin92.testtasks.internship.model;

import java.util.ArrayList;
import java.util.List;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class CardModel extends RealmObject {
    public static final String STATE = "mStatus";
    public static final String ID = "id";
    public static final String TITLE = "title";
    public static String sQueryInWork;
    public static String sQueryDone;
    public static String sQueryWaiting;
    public static List<Integer> sStateInWork = new ArrayList<>();
    public static List<Integer> sStateDone = new ArrayList<>();
    public static List<Integer> sStateWaiting = new ArrayList<>();

    @PrimaryKey
    private int id;
    private String mCategory;
    private String mDescription;
    private String mAddress;
    private String mDateCreated;
    private String mDateRegistered;
    private String mDateResolveTo;
    private String mDaysLeft;
    private int mLikes;
    private int mStatus;
    private String mStatusName;
    private String mTitle;
    private RealmList<ImageModel> mImages;
    private String mResponsible;

    public static void initQueries(List<Integer> inWork, List<Integer> done, List<Integer> waiting) {
        sStateInWork.addAll(inWork);
        sStateDone.addAll(done);
        sStateWaiting.addAll(waiting);
        sQueryInWork = arrayToString(inWork);
        sQueryDone = arrayToString(done);
        sQueryWaiting = arrayToString(waiting);
    }

    private static String arrayToString(List<Integer> list) {
        StringBuilder query = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            query.append(list.get(i));
            query.append(",");
        }
        query.append(list.get(size - 1));
        return query.toString();
    }


    public CardModel() {
    }

    public static Builder newBuilder() {
        return new CardModel().new Builder();
    }

    public class Builder {

        private Builder() {
        }

        public CardModel build() {
            return CardModel.this;
        }

        public Builder setID(int ID) {
            CardModel.this.id = ID;
            return this;
        }

        public Builder setCategory(String category) {
            CardModel.this.mCategory = category;
            return this;
        }

        public Builder setDescription(String description) {
            CardModel.this.mDescription = description;
            return this;
        }

        public Builder setAddress(String address) {
            CardModel.this.mAddress = address;
            return this;
        }

        public Builder setDateCreated(String dateCreated) {
            CardModel.this.mDateCreated = dateCreated;
            return this;
        }

        public Builder setDateRegistered(String dateRegistered) {
            CardModel.this.mDateRegistered = dateRegistered;
            return this;
        }

        public Builder setDateResolveTo(String dateResolveTo) {
            CardModel.this.mDateResolveTo = dateResolveTo;
            return this;
        }

        public Builder setDaysLeft(String daysLeft) {
            CardModel.this.mDaysLeft = daysLeft;
            return this;
        }

        public Builder setLikes(int likes) {
            CardModel.this.mLikes = likes;
            return this;
        }

        public Builder setStatus(int status) {
            CardModel.this.mStatus = status;
            return this;
        }

        public Builder setStatusName(String statusName) {
            CardModel.this.mStatusName = statusName;
            return this;
        }

        public Builder setImages(RealmList<ImageModel> images) {
            CardModel.this.mImages = images;
            return this;
        }

        public Builder setResponsible(String responsible) {
            CardModel.this.mResponsible = responsible;
            return this;
        }

        public Builder setTitle(String title) {
            CardModel.this.mTitle = title;
            return this;
        }
    }

    //  setters to use in future
    public int getID() {
        return id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getCategory() {
        return mCategory;
    }

    public void setCategory(String mCategory) {
        this.mCategory = mCategory;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public String getDateCreated() {
        return mDateCreated;
    }

    public void setDateCreated(String mDateCreated) {
        this.mDateCreated = mDateCreated;
    }

    public String getDateRegistered() {
        return mDateRegistered;
    }

    public void setDateRegistered(String mDateRegistered) {
        this.mDateRegistered = mDateRegistered;
    }

    public String getDateResolveTo() {
        return mDateResolveTo;
    }

    public void setDateResolveTo(String mDateResolveTo) {
        this.mDateResolveTo = mDateResolveTo;
    }

    public String getDaysLeft() {
        return mDaysLeft;
    }

    public void setDaysLeft(String mDaysLeft) {
        this.mDaysLeft = mDaysLeft;
    }

    public int getLikes() {
        return mLikes;
    }

    public void setLikes(int mLikes) {
        this.mLikes = mLikes;
    }

    public int getStatus() {
        return mStatus;
    }

    public void setStatus(int mStatus) {
        this.mStatus = mStatus;
    }

    public String getStatusName() {
        return mStatusName;
    }

    public void setStatusName(String mStatusName) {
        this.mStatusName = mStatusName;
    }

    public RealmList<ImageModel> getImages() {
        return mImages;
    }

    public void setImages(RealmList<ImageModel> mImages) {
        this.mImages = mImages;
    }

    public String getResponsible() {
        return mResponsible;
    }

    public void setResponsible(String mResponsible) {
        this.mResponsible = mResponsible;
    }
}
