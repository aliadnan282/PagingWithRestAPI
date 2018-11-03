package com.androidkt.pagingwithrestapi.vo;

import android.graphics.Bitmap;

import com.androidkt.pagingwithrestapi.util.Constants;
import com.google.gson.annotations.SerializedName;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Created by Mohtashim-Dev on 10/12/2017.
 */

@Entity(tableName = "alerts_feed")
public class AlertsFeedDetailModel {

    public static final DiffUtil.ItemCallback<AlertsFeedDetailModel> DIFF_CALLBACK = new DiffUtil.ItemCallback<AlertsFeedDetailModel>() {
        @Override
        public boolean areItemsTheSame(@NonNull AlertsFeedDetailModel oldItem, @NonNull AlertsFeedDetailModel newItem) {
            return oldItem.feedIdentifier.equals(newItem.feedIdentifier);
        }

        @Override
        public boolean areContentsTheSame(@NonNull AlertsFeedDetailModel oldItem, @NonNull AlertsFeedDetailModel newItem) {
            return oldItem.equals(newItem);
        }
    };
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "local_primar_key")
    long localPrimarKey;
    @SerializedName(Constants.WEB_CALL_KEY_IS_CHECK)
    String isChecked;
    @SerializedName(Constants.WEB_CALL_KEY_SOURCE_TYPE_ID)
    String sourceTypeId;
    @SerializedName(Constants.WEB_CALL_KEY_CREATED)
    String created;
    @SerializedName(Constants.WEB_CALL_KEY_ID)
    String id;
    @SerializedName(Constants.WEB_CALL_KEY_TRACKING)
    String tracking;
    @SerializedName(Constants.WEB_CALL_KEY_RECIEVER_ID)
    String recieverID;
    @SerializedName(Constants.WEB_CALL_KEY_STATUS)
    String status;
    @SerializedName(Constants.WEB_CALL_KEY_USERNAME)
    String username;
    @SerializedName(Constants.WEB_CALL_KEY_NAME)
    String name;
    @SerializedName(Constants.WEB_CALL_KEY_EMAIL)
    String email;
    @SerializedName(Constants.WEB_CALL_KEY_CELL_PHONE)
    String cellPhone;
    @SerializedName(Constants.WEB_CALL_KEY_FID)
    String fid;
    @SerializedName(Constants.WEB_CALL_KEY_PID)
    String pid;
    @SerializedName(Constants.WEB_CALL_KEY_I_REMOVED)
    String iRemoved;
    @SerializedName(Constants.WEB_CALL_KEY_THEY_REMOVED)
    String theyRemoved;
    @SerializedName(Constants.WEB_CALL_KEY_LAST_CHECK_IN)
    String lastCheckIn;
    @SerializedName(Constants.WEB_CALL_KEY_PROFILE_IMG)
    String profileImage;
    @SerializedName(Constants.WEB_CALL_KEY_FEED_IDENTIFIER)
    String feedIdentifier;
    @SerializedName(Constants.WEB_CALL_KEY_REASON_ID)
    String reasonId;
    @SerializedName(Constants.WEB_CALL_KEY_REASON_DESCRIPTION)
    String reasonDesc;
    @SerializedName(Constants.WEB_CALL_KEY_FAMILY_ID)
    String familyId;
    @SerializedName(Constants.WEB_CALL_KEY_ALERT_RADIUS)
    String alertRadius;
    @SerializedName(Constants.WEB_CALL_KEY_ALERT_DESCRIPTION)
    String alertDescription;
    @SerializedName(Constants.WEB_CALL_KEY_ALERT_ID)
    String alertId;
    @SerializedName(Constants.WEB_CALL_KEY_ALERT_TYPE)
    String alertType;
    @SerializedName(Constants.WEB_CALL_KEY_ALERT_SUB_TYPE)
    String alertSubType;
    @SerializedName(Constants.WEB_CALL_KEY_ACTIVE)
    String active;
    @SerializedName(Constants.WEB_CALL_KEY_LATITUDE)
    String latitude;
    @SerializedName(Constants.WEB_CALL_KEY_LONGITUDE)
    String longitude;
    @SerializedName(Constants.WEB_CALL_KEY_ZIP)
    String zip;
    @SerializedName(Constants.WEB_CALL_KEY_STATE_CODE)
    String stateCode;
    @SerializedName(Constants.WEB_CALL_KEY_TIME_ACTIVATION)
    String timeActivation;
    @SerializedName(Constants.WEB_CALL_KEY_TIME_DEACTIVATION)
    String timeDeActivation;
    @SerializedName(Constants.WEB_CALL_KEY_HOUSE_ID)
    String houseIds;
    @SerializedName(Constants.WEB_CALL_KEY_DETAILS_URL)
    String detailsUrl;
    @SerializedName(Constants.WEB_CALL_KEY_SYSTEM_NAME)
    String systemName;
    @SerializedName(Constants.WEB_CALL_KEY_COUNTY)
    String countyName;
    @SerializedName(Constants.WEB_CALL_KEY_ATTACHMENTS)
    String attachment;
    @SerializedName(Constants.WEB_CALL_KEY_IS_UPDATE)
    String isUpdate;
    Bitmap snippetImage;

    public long getLocalPrimarKey() {
        return localPrimarKey;
    }

    public String getAlertDescription() {
        return alertDescription;
    }

    public void setAlertDescription(String alertDescription) {
        this.alertDescription = alertDescription;
    }

    public String getHouseIds() {
        return houseIds;
    }

    public void setHouseIds(String houseIds) {
        this.houseIds = houseIds;
    }

    public String getDetailsUrl() {
        return detailsUrl;
    }

    public void setDetailsUrl(String detailsUrl) {
        this.detailsUrl = detailsUrl;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getAlertSubType() {
        return alertSubType;
    }

    public void setAlertSubType(String alertSubType) {
        this.alertSubType = alertSubType;
    }

    public String getAlertId() {
        return alertId;
    }

    public void setAlertId(String alertId) {
        this.alertId = alertId;
    }

    public Bitmap getSnippetImage() {
        return snippetImage;
    }

    public void setSnippetImage(Bitmap snippetImage) {
        this.snippetImage = snippetImage;
    }

    public String getReasonId() {
        return reasonId;
    }

    public void setReasonId(String reasonId) {
        this.reasonId = reasonId;
    }

    public String getReasonDesc() {
        return reasonDesc;
    }

    public void setReasonDesc(String reasonDesc) {
        this.reasonDesc = reasonDesc;
    }

    public String getFamilyId() {
        return familyId;
    }

    public void setFamilyId(String familyId) {
        this.familyId = familyId;
    }

    public String getAlertRadius() {
        return alertRadius;
    }

    public void setAlertRadius(String alertRadius) {
        this.alertRadius = alertRadius;
    }

    public String getAlertType() {
        return alertType;
    }

    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getTimeActivation() {
        return timeActivation;
    }

    public void setTimeActivation(String timeActivation) {
        this.timeActivation = timeActivation;
    }

    public String getTimeDeActivation() {
        return timeDeActivation;
    }

    public void setTimeDeActivation(String timeDeActivation) {
        this.timeDeActivation = timeDeActivation;
    }

    public String getFeedIdentifier() {
        return feedIdentifier;
    }

    public void setFeedIdentifier(String feedIdentifier) {
        this.feedIdentifier = feedIdentifier;
    }

    public String getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(String isChecked) {
        this.isChecked = isChecked;
    }

    public String getSourceTypeId() {
        return sourceTypeId;
    }

    public void setSourceTypeId(String sourceTypeId) {
        this.sourceTypeId = sourceTypeId;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTracking() {
        return tracking;
    }

    public void setTracking(String tracking) {
        this.tracking = tracking;
    }

    public String getRecieverID() {
        return recieverID;
    }

    public void setRecieverID(String recieverID) {
        this.recieverID = recieverID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getIRemoved() {
        return iRemoved;
    }

    public void setIRemoved(String iRemoved) {
        this.iRemoved = iRemoved;
    }

    public String getTheyRemoved() {
        return theyRemoved;
    }

    public void setTheyRemoved(String theyRemoved) {
        this.theyRemoved = theyRemoved;
    }

    public String getLastCheckIn() {
        return lastCheckIn;
    }

    public void setLastCheckIn(String lastCheckIn) {
        this.lastCheckIn = lastCheckIn;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public String getIsUpdate() {
        return isUpdate;
    }

    public void setIsUpdate(String isUpdate) {
        this.isUpdate = isUpdate;
    }
}
