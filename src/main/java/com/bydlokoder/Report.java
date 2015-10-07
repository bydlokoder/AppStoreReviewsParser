package com.bydlokoder;

import java.util.Collection;

public class Report {
    private long appId;
    private Collection<Review> reviews;

    public Report(long appId, Collection<Review> reviews) {
        this.appId = appId;
        this.reviews = reviews;
    }

    public long getAppId() {
        return appId;
    }

    public Collection<Review> getReviews() {
        return reviews;
    }
}
