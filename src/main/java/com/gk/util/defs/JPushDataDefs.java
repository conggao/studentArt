package com.gk.util.defs;


public class JPushDataDefs {

	public static final int        JPUSHDATA_TYPE_NONE                           = 0x0000;
	
    // 新作业通知
	//   消息详细信息detailInfo可转换为相应作业ID
	public static final int        JPUSHDATA_TYPE_NEW_HOMEWORK                   = 0x0001;

	public static final int        JPUSHDATA_TYPE_NEW_CLASSNOTES                 = 0x0002;

    // 新发现通知
	//   消息详细信息detailInfo可转换为相应发现ID
	public static final int        JPUSHDATA_TYPE_NEW_ANNOUNCEMENT               = 0x0011;
	public static final int        JPUSHDATA_TYPE_NEW_PRESENCE                   = 0x0012;
	public static final int        JPUSHDATA_TYPE_NEW_GARDEN                     = 0x0013;

	
    // 用户在其它地方登陆的提醒推送通知
	//   消息详细信息detailInfo为NULL
	public static final int        JPUSHDATA_TYPE_OTHER_PLACES_LOGIN           = 0x0100;
	
}
