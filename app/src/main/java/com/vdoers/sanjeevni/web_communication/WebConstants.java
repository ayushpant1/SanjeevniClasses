package com.vdoers.sanjeevni.web_communication;

public class WebConstants {


    /* To try the app with Enablex hosted service you need to set the kTry = true */
    public static final boolean kTry = true;

    /*Your webservice host URL, Keet the defined host when kTry = true */

    public static final String kBaseURL = "https://test.newspaperadsbooking.online/api/";

    /*The following information required, Only when kTry = true, When you hosted your own webservice remove these fileds*/

    /*Use enablec portal to create your app and get these following credentials*/
    public static final String kAppId = "5f491e5290ef801825159ad2";
    public static final String kAppkey = "yYubahupuVanu4e2eqyTyjeUuVuPaYe5u3y6";


    public static final String getRoomId = "create_room/";
    public static final int getRoomIdCode = 1;
    // public static final String validateRoomId = "get_room/index.php?roomId=";
    public static final String validateRoomId = "get_room/room.php?roomId=";
    public static final int validateRoomIdCode = 2;
    public static final String getTokenURL = "create_token/";
    public static final int getTokenURLCode = 3;
}
