package com.androidkt.pagingwithrestapi.vo;

import com.androidkt.pagingwithrestapi.util.Constants;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Mohtashim-Dev on 10/12/2017.
 */

public class AlertsFeedMain {

    @SerializedName(Constants.WEB_CALL_KEY_ERROR)
    boolean error;

    @SerializedName(Constants.WEB_CALL_KEY_ERROR_MESSAGE)
    String errorMessage;

    @SerializedName(Constants.WEB_CALL_KEY_DATA)
    AlertsFeedData safetyFeedData;

    @SerializedName(Constants.WEB_CALL_KEY_TITLE)
    String title;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public AlertsFeedData getSafetyFeedData() {
        return safetyFeedData;
    }

    public void setSafetyFeedData(AlertsFeedData safetyFeedData) {
        this.safetyFeedData = safetyFeedData;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
