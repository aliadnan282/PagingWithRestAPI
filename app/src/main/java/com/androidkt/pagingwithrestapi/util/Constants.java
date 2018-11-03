package com.androidkt.pagingwithrestapi.util;

/**
 * Created by Dev on 3/14/2017.
 */
public class Constants {


    public static final String PS_ALERT_MESSAGE_HOUSE = "You received this alert because it is" +
            " sent near your residence.";
    public static final String PS_ALERT_MESSAGE_WITHOUT_HOUSE = "You received this alert " +
            "because you were nearby.";

    public static final String RECEIVING_ALERT_NEARBY = "You received this alert because " +
            "you are nearby.";
    public static final String RECEIVING_ALERT_HOUSE = "You received this alert because " +
            "it is sent near your residence.";


    public static final String NGROK_URL = "31617ab6.ngrok.io";

    public static final String PS_ALERT = "PS_alert";
    public static final String PS_ALERT_CHANNEL_NAME = "ps_new_alert";
    public static final String PS_EDIT_ALERT_CHANNEL_NAME = "ps_edit_alert";
    public static final String PS_UPDATE_ALERT_CHANNEL_NAME = "ps_alert_update";
    public static final String PS_ALERT_DEACTIVATION_CHANNEL_NAME = "ps_alert_deactivated";
    public static final String PS_ALERT_PEER_MESSAGE = "PS has sent a peer alert!";
    public static final String PS_ALERT_INFORMATIONAL_MESSAGE = "PS has sent an informational alert!";
    public static final String PS_ALERT_EMERGENCY_MESSAGE = "PS has sent an emergency alert!";
    public static final String PS_ALERT_PEER_MESSAGE_HOUSE = "PS has sent a peer alert in your house " +
            "area!";
    public static final String PS_ALERT_INFORMATIONAL_MESSAGE_HOUSE = "PS has sent an informational" +
            " alert in your house area!";


    public static final String PS_ALERT_EMERGENCY_MESSAGE_HOUSE = "PS has sent an emergency" +
            " alert in your house area!";


    //    public static final String PS_ALERT_MESSAGE_WITHOUT_HOUSE="PS has sent an alert because you are nearby!";
    public static final String MY_PRIVATE_CHANNEL = "user_channel";
    public static final String NEW_PUSHER_AUTH_URL = "http://" + Constants.NGROK_URL + "/emergencme/main/pusher_webhook";

    public static final String SPAMMING_TIME = "spamming_time";
    public static final String SHARED_SMART_ICE = "smart_ice";
    public static final String EMPTY = "";
    public static final String DIALOG_MESSSAGE = "Note: Your smart I.C.E is currently disabled. " +
            "addRequest atleast one residence to enable so that public safety officials can view your information in case of an emergency.";
    public static final String EMAIL = "email";
    public static final String PUSHER_PRESENCE_URL_LOCAL = "http://" + Constants.NGROK_URL +
            "/emergencme/Main/authenticate_presence/";
    public static final String PUSHER_PRESENCE_URL_LIVE = "https://www.emergenc.me/Main/authenticate_presence/";
    public static final String PUSHER_PRESENCE_URL_STAGGING = "http://eme-staging.us-west-2.elasticbeanstalk.com/Main/authenticate_presence/";
    public static final String FID = "new_fid";
    public static final String ACCOUNT_TYPE = "account_type";
    public static final String PID = "new_pid";
    public static final String FAMILY_ID = "new_family_id";
    public static final String FAMILY_D = "family_id";
    public static final String NEARBY = "Nearby User";
    public static final String CELL_PHONE = "cell_phone";
    public static final String NAME = "share_name";
    public static final String LOADING = "Loading...";
    public static final String CONNECTING_TO_SERVER = "Connecting To Server";
    public static final String PLEASE_WAIT = "Please Wait";
    public static final String VALIDATING_INFO = "Validating Information";
    public static final String UPLOADING_PICTURE = "Uploading Picture";
    public static final String IS_SUBSCRIBED = "area_subscribed";
    public static final String PS_ALERT_KEY = "2";
    public static final String CONSUMER_ALERT_KEY = "1";
    public static final String CURRENT_LONGITUDE = "current_longitude";
    public static final String CURRENT_LATITUDE = "current_latitude";
    public static final String DOMAIN_CHANNELS = "domainCounties";
    public static final String YESTERDAY = "yesterday";
    public static final String TODAY = "today";
    public static final String YELLOW_ALERTS_COUNT = "yellow_alerts_count";
    public static final String RED_ALERTS_COUNT = "red_alerts_count";
    public static final String NINE_ALERTS_COUNT = "911_alerts_count";
    public static final String NOTIFICATION_CLICKED = "click_notification";
    public static final String NOTIFICATION_MISSED_ALERTS = "missed_alerts_notification";
    public static final String WEB_CALL_KEY_PROFILE_IMG = "profile_img";
    public static final String WEB_CALL_KEY_PROFILE_IMAGE = "profile_image";
    public static final String WEB_CALL_KEY_PROFILE_IMAGE_URL = "profile_image_url";
    public static final String WEB_CALL_KEY_LAST_CHECK_IN = "last_check_in";
    public static final String WEB_CALL_KEY_IS_ACTIVE = "is_last_active";
    public static final String WEB_CALL_KEY_IS_FAVOURITE = "favourite";
    public static final String WEB_CALL_KEY_CREATED = "created";
    public static final String WEB_CALL_KEY_TITLE = "title";
    public static final String WEB_CALL_KEY_FEED_IDENTIFIER = "feed_identifier";
    public static final String WEB_CALL_KEY_REASON_ID = "reason_id";
    public static final String WEB_CALL_KEY_REASON_DESCRIPTION = "reason_desc";
    public static final String WEB_CALL_KEY_ALERT_RADIUS = "alert_radius";
    public static final String WEB_CALL_KEY_ALERT_TYPE = "alert_type";
    public static final String WEB_CALL_KEY_ACTIVE = "active";
    public static final String WEB_CALL_KEY_LATITUDE = "latitude";
    public static final String WEB_CALL_KEY_LONGITUDE = "longitude";
    public static final String WEB_CALL_KEY_OFFSET = "offset";
    public static final String WEB_CALL_KEY_LIMIT = "limit";
    public static final String WEB_CALL_KEY_TIME_ACTIVATION = "time_activation";
    public static final String WEB_CALL_KEY_TIME_DEACTIVATION = "time_deactivation";
    public static final String WEB_CALL_KEY_FAVOURITES = "favourites";
    public static final String WEB_CALL_KEY_LOCAION_INFO = "location_info";
    public static final String WEB_CALL_KEY_COUNTY_ID = "county_id";
    public static final String WEB_CALL_KEY_COUNTY = "county";
    public static final String WEB_CALL_KEY_ATTACHMENTS = "attachments";
    public static final String WEB_CALL_KEY_IS_UPDATE = "is_update";
    public static final String WEB_CALL_KEY_DISTANCE = "distance";
    public static final String WEB_CALL_KEY_ACTION = "action";
    public static final String WEB_CALL_KEY_ALERT_ID = "alert_id";
    public static final String WEB_CALL_KEY_HOUSE_ID = "house_ids";
    public static final String WEB_CALL_KEY_DETAILS_URL = "details_url";
    public static final String WEB_CALL_KEY_SYSTEM_NAME = "system_name";
    public static final String WEB_CALL_KEY_ALERT_DESCRIPTION = "alert_desc";
    public static final String TIME_ZERO = "0000-00-00 00:00:00";
    public static final String NO_DATA_FOUND = "No data found";
    public static final String WEB_CALL_KEY_SETTINGS_0 = "settings[0]";
    public static final String WEB_CALL_KEY_SETTINGS_1 = "settings[1]";
    public static final String WEB_CALL_KEY_SETTINGS_2 = "settings[2]";
    public static final String IS_SEEN_ALERT_NOTIFICATION_SETTINGS_DIALOG = "share_alert_notificaiton_dialog";
    public static final String CELL_VERIFIED = "cell_verified";
    public static final String IS_USER_EMAIL_VERIFIED = "is_user_email_verified";
    public static final String CELL_NUMBER = "cell_number";
    public static final String CODE = "code";
    public static final String IS_NUMBER_VERIFIED = "is_num_verified";
    public static final String VERIFICATION_CODE = "verification_code";
    public static final String IS_VERIFIED = "is_verified";
    public static final String MESSAGE = "message";
    public static final String USERFILE = "userfile";
    public static final String IMAGE_DATA = "image_data";
    public static final String PROFILE_IMAGE_URL = "profile_image_url";
    public static final String CAMERA = "camera";
    public static final String GALLERY = "gallery";
    public static final String API_KEY = "api_key";
    public static final String CUSTOMER_THRESHOLD = "customer_alert_threshold";
    public static final String PS_THRESHOLD = "ps_alert_threshold";
    public static final String USER_NAME = "user_name";
    public static final String SAFETY_NETWORK_MODEL_ARG_KEY ="safety_network_model_arg_key";


    public static String PRIMARY_SOURCE_TYPE = "1";
    public static String SECONDARY_SOURCE_TYPE = "2";


    public static String FEED_IDENTIFIER_PS_AREA_ALERT = "ps_area_alert";
    public static String FEED_IDENTIFIER_PS_RESIDENCE_ALERT = "ps_residence_alert";
    public static String FEED_IDENTIFIER_DOMAIN_ALERT = "ps_domain_alert";
    public static String FEED_IDENTIFIER_PEER_ALERT = "peer_alert";
    public static String FEED_IDENTIFIER_RESIDENCE_ALERT = "residence_alert";
    public static String FEED_IDENTIFIER_SAFETY_MEMBER_ALERT = "safety_member_alert";
    public static String FEED_IDENTIFIER_INVITE = "invite";


    public static int ADD_FAMILY_MEMBER = 3;
    public static final String SOURCE_TYPE = "source_type";
    public static final String PID_HASH = "pid_hash";
    public static int COUNT_VALUE = 0;
    public static String FEED_SENT_ALERT_PS = "sent_alert_ps";


    public static final String NETWORK_PRIMARY = "1";           // These users are capable of receiving   notifications of the people whom they have turn notifications on
    public static final String NETWORK_SECONDARY = "2";         // These users' updates show only in the safety feed
    public static final String NETWORK_ALL = "3";               // this will return all the safety network members
    public static final String NETWORK_BLOCKED = "4";           // this will return the list of people whom the user has blocked
    public static final String NETWORK_REVERSE = "5";           // this will return the people who have the user in their safety network - Kind of Reverse logic

    // index_put valid actions
    public static final String BLOCK_SIMPLE = "1";
    public static final String BLOCK_REMOVE = "2";
    public static final String UNBLOCK = "3";

    // index_delete valid actions
    public static final String REMOVE_SIMPLE = "1";
    public static final String REMOVE_REVERSE = "2";
    public static final String REMOVE_BOTH = "3";

    public static final String RECEIVED_INVITES = "1";
    public static final String SENT_INVITES = "2";
    public static final String TRACKING_INVITES = "3";
    public static final String ALL_INVITES = "4";
    // index_post valid actions
    public static final String SEND_INVITE = "1";
    public static final String RESEND_INVITE = "2";
    // index_put valid actions
    public static final String ACCEPT_INVITE = "1";
    public static final String CANCEL_INVITE = "2";

    public static final String ACTION_LOCATION_SHARING_INVITE = "5";
    public static final String ACTION_LOCATION_SHARING_CANCEL = "4";

    public static String CURRENT_TIME = "time";
    public static String APP_STATE = "app_state";

    //last tab location
    public static final String LAST_TAB_POSITION = "last_tab_location";


    /**
     * battery optimization screen keys
     */
    public static final String BATTERY_OPTIMIZATION = "battery_optimization_key";

    /**
     * alert settings key
     */
    public static final String AREA_ALERT_ACTIVATION = "area_alert_key";
    public static final String HOUSE_ALERT_ACTIVATION = "house_alert_key";
    public static final String PS_ALERT_ACTIVATION = "ps_alert_key";
    public static final String DOMAIN_ALERT_ACTIVATION = "domain_alert_key";
    // EME Account types


    public static final String ACCOUNT_PS = "RA";
    public static final String ACCOUNT_CONSUMER = "C";
    public static final String ACCOUNT_ADMIN = "LA";


    //WebCall keys .........

    public static final String WEB_CALL_KEY_ERROR = "error";
    public static final String WEB_CALL_KEY_ALERT_SETTINGS = "alert_settings";
    public static final String WEB_CALL_KEY_CUSTOMER_ALERT_SETTINGS = "customer_alert_settings";
    public static final String WEB_CALL_KEY_CUSTOMER_PUBLIC_SAFETY = "public_safety";
    public static final String WEB_CALL_KEY_CUSTOMER_PEER = "peer";
    public static final String WEB_CALL_KEY_CUSTOMER_SAFETY_NETWORK = "safety_network";
    public static final String WEB_CALL_KEY_ERROR_MESSAGE = "error_message";
    public static final String WEB_CALL_KEY_ERROR_MSG = "error_msg";
    public static final String WEB_CALL_KEY_SUUCESS_MSG = "success_msg";
    public static final String WEB_CALL_KEY_FAMILY_DEAILS = "family_details";
    public static final String WEB_CALL_KEY_LISCENCE_DETAILS = "license_details";
    public static final String WEB_CALL_KEY_HOUSE_DETAILS = "house_details";
    public static final String WEB_CALL_KEY_STATES = "states";
    public static final String WEB_CALL_KEY_ALL_REASONS = "all_reasons";
    public static final String WEB_CALL_KEY_ID = "id";
    public static final String WEB_CALL_KEY_TRACKING = "tracking";
    public static final String WEB_CALL_KEY_PID = "pid";
    public static final String WEB_CALL_KEY_FID = "fid";
    public static final String WEB_CALL_KEY_FAMILY_ID = "family_id";
    public static final String WEB_CALL_KEY_SMART_ICE = "smart_ice";
    public static final String WEB_CALL_KEY_REGION_ID = "region_id";
    public static final String WEB_CALL_KEY_HID = "hid";
    public static final String WEB_CALL_KEY_CELL_PHONE = "cell_phone";
    public static final String WEB_CALL_KEY_TRACKING_USER_ID = "tracking_user_id";
    public static final String WEB_CALL_KEY_SESSION_ID = "session_id";
    public static final String WEB_CALL_KEY_CHANNEL_NAME= "channel_name";
    public static final String WEB_CALL_KEY_ZIP = "zip";
    public static final String WEB_CALL_KEY_CITY = "city";
    public static final String WEB_CALL_KEY_STATE = "state";
    public static final String WEB_CALL_KEY_STREET_ADDRESS = "street_address";
    public static final String WEB_CALL_KEY_HOME_PHONE = "home_phone";
    public static final String WEB_CALL_KEY_DATE_ENTERED = "date_entered";
    public static final String WEB_CALL_KEY_LAST_VERIFIED = "last_verified";
    public static final String WEB_CALL_KEY_VERIFICATION_SOURCE = "verification_source";
    public static final String WEB_CALL_KEY_PROPANE = "propane";
    public static final String WEB_CALL_KEY_BASEMENT = "basement";
    public static final String WEB_CALL_KEY_LEVELS = "levels";
    public static final String WEB_CALL_KEY_PETS = "pets";
    public static final String WEB_CALL_KEY_MISC = "misc";
    public static final String WEB_CALL_KEY_NAME = "name";
    public static final String WEB_CALL_KEY_EMAIL = "email";
    public static final String WEB_CALL_KEY_HOH = "HoH";
    public static final String WEB_CALL_KEY_SEX = "sex";
    public static final String WEB_CALL_KEY_BIRTHDATE = "birthdate";
    public static final String WEB_CALL_KEY_SMS_ALERTS = "sms_alerts";
    public static final String WEB_CALL_KEY_EMAILS_ALERTS = "email_alerts";
    public static final String WEB_CALL_KEY_NOTES = "notes";
    public static final String WEB_CALL_KEY_HEALTH_CARD = "health_card";
    public static final String WEB_CALL_KEY_ORGAN_DONOR = "organ_donor";
    public static final String WEB_CALL_KEY_LOCATION_VIEW = "location_view";
    public static final String WEB_CALL_KEY_STORM_SHELTER = "storm_shelter";
    public static final String WEB_CALL_KEY_STORM_SHELTER_LOCATION = "storm_shelter_location";
    public static final String WEB_CALL_KEY_XCORD = "x_cord";
    public static final String WEB_CALL_KEY_YCORD = "y_cord";
    public static final String WEB_CALL_KEY_IS_SECONDARY = "is_secondary";
    public static final String WEB_CALL_KEY_VISIT_FREQUENCY = "visit_frequency";
    public static final String WEB_CALL_KEY_IS_EXACT_ADDRESS = "is_exact_address";
    public static final String WEB_CALL_KEY_LICENSE_STATE = "license_state";
    public static final String WEB_CALL_KEY_PLATE_NUMBER = "plate_number";
    public static final String WEB_CALL_KEY_PLATE_EXPIRATION_DATE = "plate_expiration_date";
    public static final String WEB_CALL_KEY_VEHICLE_DESCRIPTION = "vehicle_description";
    public static final String WEB_CALL_KEY_COMPLETE_STATE = "complete_state";
    public static final String WEB_CALL_KEY_STATE_CODE = "state_code";
    public static final String WEB_CALL_KEY_REASONS = "reasons";
    public static final String WEB_CALL_KEY_REASON_TYPES = "reason_types";
    public static final String WEB_CALL_KEY_PHONE_NO = "phone_no";
    public static final String WEB_CALL_KEY_SOURCE_TYPE_ID = "sn_type_id";
    public static final String WEB_CALL_KEY_DATA = "data";
    public static final String WEB_CALL_KEY_RESULT = "result";
    public static final String WEB_CALL_KEY_COUNT = "count";
    public static final String WEB_CALL_KEY_PRIMARY = "primary";
    public static final String WEB_CALL_KEY_SECONDARY = "secondary";
    public static final String WEB_CALL_KEY_RECIEVER_ID = "receiver_id";
    public static final String WEB_CALL_KEY_STATUS = "status";
    public static final String WEB_CALL_KEY_USERNAME = "username";
    public static final String WEB_CALL_KEY_I_REMOVED = "i_removed";
    public static final String WEB_CALL_KEY_THEY_REMOVED = "they_removed";
    public static final String WEB_CALL_KEY_INVITATION_LIST = "invitation";
    public static final String WEB_CALL_KEY_PENDING_LIST = "pending";
    public static final String WEB_CALL_KEY_TRACKING_LIST = "tracking";
    public static final String WEB_CALL_KEY_IS_CHECK = "is_checked";
    public static final String WEB_CALL_KEY_DID = "did";
    public static final String WEB_CALL_KEY_SID = "sid";
    public static final String WEB_CALL_KEY_DOMAIN_NAME = "domain_name";
    public static final String WEB_CALL_KEY_ALERT_SUB_TYPE = "alert_sub_type";
    public static final String WEB_CALL_KEY_SENT_TRACKING_LIST = "tracking_sent";
    public static final String WEB_CALL_KEY_RECEIVED_TRACKING_LIST = "tracking_received";
    public static final String WEB_CALL_KEY_SENDER_FID = "sender_fid";
    public static final String WEB_CALL_KEY_RECEIVER_FID = "receiver_fid";
    public static final String WEB_CALL_KEY_ACTION_ID = "action_id";
    public static final String WEB_CALL_KEY_TRACKING_REQ_TIMEOUT = "tracking_request_timeout";
    public static final String WEB_CALL_KEY_TIME_TO_TRACK = "time_to_track";
    public static final String WEB_CALL_KEY_TRACKING_START_TIME = "tracking_time_start";
    public static final String WEB_CALL_KEY_TRACKING_END_TIME = "tracking_time_end";
    public static final String WEB_CALL_KEY_CREATED_AT = "created_at";
    public static final String WEB_CALL_KEY_SN_ID = "sn_id";
    public static final String WEB_CALL_KEY_LOCATIONS = "locations";


    public static final String WEB_CALL_KEY_NOTIFICATIONS_DATA = "data";
    public static final String WEB_CALL_KEY_NOTIFICATIONS_COUNT = "count";

    public static int DEACTIVATION_CHANGE = 0;
    public static final String SUBSCRIBED_PRESENCE_CHANNEL = "subscribed_presence_channel";
    public static final String INVITE = "invite";




    //Deep Link Constants
    public static final String ACTION_VERIFY_USER = "verify_user";
    public static final String ACTION_ACCEPT_INVITE = "accept_invite";
    public static final String SENDER_FID = "sender_fid";
    public static final String RECEIVER_FID = "reciever_fid";
    public static final String REQUEST_ID = "request_id";


    public static final String STATUS_TRACKING_IDLE = "0";
    public static final String STATUS_TRACKING_PENDING = "1";
    public static final String STATUS_TRACKING_ACCEPTED = "2";

    public static final String ACTION_ACCEPT_TRACKING_REQUEST = "1";
    public static final String ACTION_REJECT_TRACKING_REQUEST = "2";
    public static final String ACTION_COMPLETE_TRACKING_REQUEST = "3";

    public static final String WEB_CALL_KEY_TRACKING_STATUS = "tracking";

    public static final String RECEIVED_TRACKING_REQUEST_INTENT_FILTER = "receivedTrackingRequests";
    public static final String UPDATE_SEND_TRACKING_REQUEST_INTENT_FILTER = "updateSendTrackingRequests";
    public static final String UPDATE_TRACKING_UPON_SENDER_CANCEL = "updateTrackingUponSender";


    public static final String KEY_STATUS_LOCATION_TRACKING = "key_status";
    public static final String KEY_ACTION_ID_LOCATION_TRACKING = "key_action_id";
    public static final String KEY_RECEIVER_ID_LOCATION_TRACKING = "key_receiver_id";
    public static final String KEY_SENDER_ID_LOCATION_TRACKING = "key_sender_id";
    public static final String KEY_REQUEST_ID_LOCATION_TRACKING = "key_request_id";
    public static final String KEY_LOCATION_TRACKING_REQUEST = "key_location_tracking_request";

    public static final String KEY_LOCATION_TRACKING_BUNDLE_SENT = "key_location_tracking_sent_bundle";
    public static final String KEY_LOCATION_TRACKING_BUNDLE_TRACKING = "key_location_tracking_sent_tracking";
    public static final String KEY_UPDATE_TRACKING_REQUESTS_RECEIVER = "key_update_tracking_requests_receiver";

    //for walkthrough purpose checking
    public static final String WALK_THROUGH_DIALOG = "walk_through_dialog";
    public static final String WALK_THROUGH_SHOW = "walk_through_show";
    public static final String WALK_THROUGH_VIEWED_HOME_FRAGMENT = "walk_through_viewed_home_fragment";
    public static final String WALK_THROUGH_PROFILE_PIC_VIEWED = "walk_through_profile_pic_viewed";
    public static final String WALK_THROUGH_SAFETY_NETWORK_VIEWED = "walk_through_safety_network_viewed";
    public static final String WALK_THROUGH_SAFETY_NETWORK_RECYCLERVIEW_ITEM_VIEWED = "walk_through_safety_network_recyclerview_item_viewed";
    public static final String WALK_THROUGH_SMART_ICE_VIEWED = "walk_through_smart_ice_viewed";
    public static final String WALK_THROUGH_SMART_ICE_ENABLE_BUTTON_VIEWED = "walk_through_smart_ice_enable_button_viewed";
    public static final String WALK_THROUGH_SETTINGS_FRAGMENT = "walk_through_settings_fragment";
    public static final String WALK_THROUGH_REQUESTS_RECEIVED_FRAGMENT = "walk_through_requests_received_fragment";
    public static final String WALK_THROUGH_DUMMY_ALERT_SENT = "walk_through_dummy_alert_sent";
    public static final String WALK_THROUGH_MY_ALERTS_SCREEN = "walk_through_my_alerts_screen";
    public static final String WALK_THROUGH_SETTINGS_FRAGMENT_ADD_DOMAIN = "walk_through_settings_fragment_add_domain";
    public static final String WALK_THROUGH_DIALOG_SAFETY_NETWORK = "walk_through_dialog_safety_network";
    public static final String WALK_THROUGH_SHOW_SAFETY_NETWORK = "walk_through_show_safety_network";
    public static final String WALK_THROUGH_DIALOG_SMART_ICE = "walk_through_dialog_smart_ice";
    public static final String WALK_THROUGH_SHOW_SMART_ICE = "walk_through_show_smart_ice";
    public static final String WALK_THROUGH_DIALOG_SETTINGS_FRAGMENT = "walk_through_dialog_settings_fragment";
    public static final String WALK_THROUGH_DIALOG_REQUESTS_FRAGMENT = "walk_through_dialog_requests_fragment";
    public static final String WALK_THROUGH_SHOW_REQUESTS_FRAGMENT = "walk_through_show_requests_fragment";
    public static final String WALK_THROUGH_SHOW_SETTINGS_FRAGMENT = "walk_through_show_settings_fragment";
    public static final String WALK_THROUGH_DATA_PROTECTION_LAYER = "walk_through_data_protection_layer";
    public static final String WALK_THROUGH_TRACKING_REQUESTS_RECEIVED_FRAGMENT = "walk_through_tracking_requests_recieved_fragment";
    public static final String WALK_THROUGH_WATCH_LATER_BUTTON_PRESSED = "walk_through_watch_later_button_pressed";
    public static final String WALK_THROUGH_WATCH_LATER_BUTTON_PRESSED_SAFETY_NETWORK = "walk_through_watch_later_button_pressed_safety_network";
    public static final String WALK_THROUGH_WATCH_LATER_BUTTON_PRESSED_SMART_ICE = "walk_through_watch_later_button_pressed_smart_ice";
    public static final String WALK_THROUGH_WATCH_LATER_BUTTON_PRESSED_REQUEST = "walk_through_watch_later_button_pressed_request";

//     Created by Kamran MVP Message
//    TODO MVP REVAMPING PORTION MAY REMOVE THIS AFTER FINAL EVALUATION

    public static final String MVP_MESSAGE = "Field Called Through MVP=>";
    public static final String LOCATION_PERMISSION_ALERTDAILOGUE_SHOW = "location_permission_alertdialogue_show";

}
