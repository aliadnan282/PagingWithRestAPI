package com.androidkt.pagingwithrestapi.vo;

import androidx.recyclerview.widget.DiffUtil;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

@Entity
public class User {
    public static DiffUtil.ItemCallback<AlertsFeedDetailModel> DIFF_CALLBACK = new DiffUtil.ItemCallback<AlertsFeedDetailModel>() {
        @Override
        public boolean areItemsTheSame(@NonNull AlertsFeedDetailModel oldItem, @NonNull AlertsFeedDetailModel newItem) {
            return oldItem.feedIdentifier .equals(newItem.feedIdentifier);
        }

        @Override
        public boolean areContentsTheSame(@NonNull AlertsFeedDetailModel oldItem, @NonNull AlertsFeedDetailModel newItem) {
            return oldItem.equals(newItem);
        }
    };

    @SerializedName("id")
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "user_id")
    public long userId;

    @SerializedName("login")
    @ColumnInfo(name = "first_name")
    public String firstName;
    public String address;

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;

        User user = (User) obj;

        return user.userId == this.userId && user.firstName == this.firstName;
    }
}
