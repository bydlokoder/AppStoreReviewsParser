package com.company;

import java.util.Date;

public class Review implements Comparable<Review> {
    private long appId;
    private double rate;
    private String title;
    private String body;
    private Date date;
    private String version;

    public Review(long appId, double rate, String title, String body, Date date, String version) {
        this.appId = appId;
        this.rate = rate;
        this.title = title;
        this.body = body;
        this.date = date;
        this.version = version;
    }

    public double getRate() {
        return rate;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public Date getDate() {
        return date;
    }


    public String getVersion() {
        return version;
    }

    public long getAppId() {
        return appId;
    }

    public int compareTo(Review review) {
        if (review.date == null) {
            return -1;
        } else {
            return review.date.compareTo(date);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Review review = (Review) o;

        if (appId != review.appId) return false;
        if (Double.compare(review.rate, rate) != 0) return false;
        if (title != null ? !title.equals(review.title) : review.title != null) return false;
        if (body != null ? !body.equals(review.body) : review.body != null) return false;
        if (date != null ? !date.equals(review.date) : review.date != null) return false;
        return !(version != null ? !version.equals(review.version) : review.version != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (appId ^ (appId >>> 32));
        temp = Double.doubleToLongBits(rate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (body != null ? body.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        return result;
    }
}
