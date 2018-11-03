package com.androidkt.pagingwithrestapi.vo;

import com.androidkt.pagingwithrestapi.util.Constants;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Hamid-Dev on 1/18/2018.
 */

public class AlertsFeedData {


    @SerializedName(Constants.WEB_CALL_KEY_COUNT)
    String count;

    @SerializedName(Constants.WEB_CALL_KEY_RESULT)
    ArrayList<AlertsFeedDetailModel> safetyFeedList;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public ArrayList<AlertsFeedDetailModel> getSafetyFeedList() {
        return safetyFeedList;
    }

    public void setSafetyFeedList(ArrayList<AlertsFeedDetailModel> safetyFeedList) {
        this.safetyFeedList = safetyFeedList;
    }
}
