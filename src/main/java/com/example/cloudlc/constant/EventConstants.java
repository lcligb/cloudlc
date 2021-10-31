package com.example.cloudlc.constant;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.regex.Pattern;

/**
 * @author: ZhengWei
 * @create: 2019-05-09 16:22
 **/
public class EventConstants {
    /**
     * 方舟日常 预发 以及 线上 URL
     */
    public static final String URI_DAILY = "https://dc-x.alibaba.net";
    public static final String URI_PRE = "https://aliark-pre.alibaba-inc.com";
    public static final String URI_PRO = "https://aliark.alibaba-inc.com";
    /**
     * ali_change url
     */
    public static final String CHANGE_URI_DAILY = "http://alichange-core.taobao.net";
    public static final String CHANGE_URI_PRE = "http://pre-alichange-core.alibaba-inc.com";
    public static final String CHANGE_URI_PRO = "http://alichange-core.alibaba-inc.com";
    public static final String CHANGE_URI_PATH= "/innerApi/v1/calendar/getActionList?keyWord=&type=0&";
    /**
     * 获取天气 url
     */
    public static final String WEATHER_URI= "https://api.seniverse.com/v3/weather/daily.json?key=lkwfeakfkqikzs4y&location=";
    public static final String WEATHER_PATH_LAST="&language=zh-Hans&unit=c&start=0&days=3";
    /**
     * 关联告警ID 跳转
     */
    public static final String REPTOR_ALARM_URL = "http://raptor-pro.alibaba-inc.com/pose/alarm/tree/detail?id=#{id}&aggregatedAlarmId=#{aggregatedAlarmId}";
    public static final String REPTOR_ALARM_URL_PRE = "http://raptor-pro-pre.alibaba-inc.com/pose/alarm/tree/detail?id=#{id}&aggregatedAlarmId=#{aggregatedAlarmId}";

    /**
     * 事件详情
     */
    public static final String EVENT_DETAIL = "/ark/eventDetail?eventOrderUuid=";
    /**
     * 事件等级I4
     */
    public static final String EVENT_LEVEL_LOG = "LOG";
    public static final String EVENT_LEVEL_I5 = "I5";
    public static final String EVENT_LEVEL_I4 = "I4";
    public static final String EVENT_LEVEL_I3 = "I3";
    public static final String EVENT_LEVEL_I2 = "I2";
    public static final String EVENT_LEVEL_I1 = "I1";
    public static final String EVENT_LEVEL_I0 = "I0";
    public static final String EVENT_LEVEL_P = "P";



    public static final String EVENT_RECOVERY_REASON = "事件恢复原因";
    public static final String EVENT_RECOVERY_REASON_REMARK = "事件恢复原因备注";
    public static final String POSE_API = "pose-api";
    public static final String POWER = "power";

    public static final String IDC = "idc";
    public static final String NULL = "null";
    public static final String SLA = "sla";
    public static final String SLA_SEND_MESSAGE = "sla send remind message";
    public static final String ENVIRONMENT_TEST = "test";
    public static final String ENVIRONMENT_PRE = "prehost";
    public static final String ENVIRONMENT_PRO = "online";
    public static final String DAILY = "daily";

    public static final String OK = "ok";
    public static final String RISK_SUBJECT = "风险库消息通知";
    public static final String PER_TEST = "【测试环境】";
    public static final String DATA_INTERRUPTION = "EMS数据中断";
    public static final String GOC_AUTU_SEND = "GOC推送";
    public static final String CONFIRM_GOC_SEND = " 确认GOC推送";
    public static final String REFRESH_GOC_SEND = " 更新GOC推送";
    public static final String MATCH_CHINESE = "[\u4e00-\u9fa5]";

    public static final long SIX_DAY = 1000L * 60 * 60 * 24 * 6;
    public static final long EIGHT_DAY = 1000L * 60 * 60 * 24 * 8;
    public static final long THIRTY_DAY = 1000L * 60 * 60 * 24 * 30;
    public static final long ONE_DAY = 1000L * 24 * 60 * 60;
    public static final long ONE_MIN = 1000L * 60 ;
    public static final long THREE_SECONDS = 1000L * 3;


    public static final String EOP = "eop";
    public static final String RECOVERY = "recovery";
    public static final String MANAGER = "manager";
    public static final String BINGO = "bingo";

    public static final String LOCAL = "local";
    public static final String ONLINE = "online";


    /**
     * 测试数据
     */
    public static final String TEST_WORKER_ID = "WB404957";
    public static final String TEST_WORKER_NAME = "TEST";
    public static final String TEST_USER_JSON = "[{\"empId\":\"WB404957\",\"stageName\":\"郑伟\"}]";
    public static final String IDC_TBC = "tbc";
    public static final String WB_UPPER = "WB";
    public static final String WB_LOWER = "wb";
    public static final String RECEIVE = "receive";
    public static final String RECEIVER_USER = "receiverUser";
    public static final String PERMISSION_PERSON = "permissionPerson";
    public static final String EVENT_TYPE_META_ITEM_CLASS = "class";
    public static final String EVENT_TYPE_META_ITEM_SUBCLASS = "subclass";
    public static final String EVENT_TYPE_META_ITEM_LEAF = "leaf";
    public static final String RUNNING = "running";

    public static final String SKIP = "skip";
    public static final String AGREE = "agree";
    public static final String AGREE_ZH = "通过";
    public static final String DISAGREE_ZH = "否决";
    public static final String SYSTEM = "System";
    public static final String START_TIME = "startTime";
    public static final String END_TIME = "endTime";
    public static final String DATE_FUTURE = "1556639999999";

    public static final String DATE_ZERO = "0";
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int TEN = 10;
    public static final int FIFTY = 50;
    public static final String WORKER_NAME_UNKNOWN = "未知";

    public static final String CURRENT_BPMS_EVENT_AGREE_NODECODE = "sid-792229e5-146c-1708-bbbf-dda93848ef7c";
    public static final String CURRENT_BPMS_EVENT_DISAGREE_NODECODE = "sid-e45f7950-7778-bb95-c1dc-28c156ce308c";
    public static final String CURRENT_BPMS_EVENT_APPROVEL_NODECODE = "sid-16acd672-c62b-4717-a84c-556409e6e294";

    public static final String CHINESE_ALL = "全部";
    public static final int FLAG_ALL = 0;
    public static final String MAIN_PAGE_TEMPLATE = "方舟首页公告模板";
    public static final String GOC_DINGGROUP_TEMPLATE = "GOC钉群模版";
    public static final String CREATE_EVENT_TEMPLATE = "创建工单模板";
    public static final String CREATE_EVENT_TEMPLATE_V2 = "创建事件";

    public static final String EVENT_SOLUTION_APPROVEL = "事件解决方案审批";
    public static final String PUBLISH_ANNOUNCEMENT = "公告发布";
    public static final List<String> ALREADY_RECOVERED_EVENT_STATUS = Lists.newArrayList("确认恢复", "事件关闭", "现场确认正常");
    public static final List<String> CLOSE_EVENT = Lists.newArrayList("确认恢复", "事件关闭");
    public static final String CONFIRM_RECOVERY = "确认恢复";
    public static final String EVENT_CLOSE = "事件关闭";
    public static final String EVENT_CALLBACK = "事件退回";

    // button
    public static final String BUTTON_UPDATE_EVENT = "pc_button_step_update_event";
    public static final String BUTTON_UPDATE_PROGRESS = "pc_button_step_update_progress";
    public static final String BUTTON_UPDATE_EVENT_LEVEL = "pc_button_step_update_event_level";
    public static final String BUTTON_UPLOAD_REPORT = "pc_button_upload_report";
    public static final String BUTTON_ADD_PROGRESS = "pc_button_add_progress";
    public static final String BUTTON_UPDATE_CONFIRM_RECOVERY_REASON = "pc_button_update_confirm_recovery_reason";

    //确认接入
    public static final String BUTTON_STEP_CONFIRMACCESS = "pc_button_event_step_confirmAccess";
    //发布方案
    public static final String BUTTON_STEP_PUBLICPROJECT = "pc_button_event_step_publicProject";
    //方案审批
    public static final String BUTTON_STEP_APPROVEPROJECT = "pc_button_event_step_approveProject";
    //方案审批通过
    public static final String BUTTON_STEP_APPROVEPROJECT_AGREE = "pc_button_event_step_approveProject_agree";
    //方案审批不通过
    public static final String BUTTON_STEP_APPROVEPROJECT_DISAGREE = "pc_button_event_step_approveProject_disagree";
    //开始执行方案
    public static final String BUTTON_STEP_PERFORMPROJECT = "pc_button_event_step_performProject";
    //方案执行完成
    public static final String BUTTON_STEP_PROJECTFINISH = "pc_button_event_step_projectFinish";
    // 确认恢复
    public static final String BUTTON_STEP_CONFIRMRECOVERY_AGREE = "pc_button_event_step_confirmRecovery_agree";
    public static final String BUTTON_STEP_CONFIRMRECOVERY_DISAGREE = "pc_button_event_step_confirmRecovery_disagree";
    //事件关闭
    public static final String BUTTON_STEP_CLOSEEVENT = "pc_button_event_step_closeEvent";

    //event_v2  button
    //接手
    public static final String BUTTON_STEP_SUBMITEVENT= "pc_button_event_step_submitEvent";
    //驻场处理中 - 升级FM
    public static final String BUTTON_STEP_RESIDENT_FMPROCESSING = "pc_button_event_step_resident_fmProcessing";
    //驻场处理中 - 已解决
    public static final String BUTTON_STEP_RESIDENT_RESOLVED = "pc_button_event_step_resident_resolved";
    // FM/设施专家处理中
    public static final String BUTTON_STEP_FMPROCESSING_RESOLVED = "pc_button_event_step_fmProcessing_resolved";
    //已解决
    public static final String BUTTON_STEP_RESOLVED_TRUE = "pc_button_event_step_resolved_true";
    //已解决  backToFM
    public static final String BUTTON_STEP_RESOLVED_BACKTOFM = "pc_button_event_step_resolved_backToFM";
    //已解决 backToResident
    public static final String BUTTON_STEP_RESOLVED_BACKTORESIDENT = "pc_button_event_step_resolved_backToResident";
    //事件关闭 closed
    public static final String BUTTON_STEP_CLOSED = "pc_button_event_step_closed";

    public static final String CONFIRMACCESS = "confirmAccess";
    public static final String SUBMITEVENTSOLUTION = "submitEventSolution";
    public static final String APPROVESOLUTION = "approveSolution";
    public static final String IMPLEMENTSOLUTION = "implementSolution";
    public static final String FINISHPROJECT = "finishProject";
    public static final String CONFIRMRECOVERY = "confirmRecovery";
    public static final String CLOSEEVENT = "closeEvent";
    public static final String END = "end";


    public static final String GMT_CREATE_DESC = "gmt_create DESC";
    public static final String GMT_CREATE = "gmt_create";
    public static final String ID_DESC = "id DESC";
    public static final String FIELD_LEVEL = " field(event_level,'P','I1','I2','I3','I4','I5','LOG') ";

    /**
     * poi
     */
    public static final String FONT_BLACK = "微软雅黑";
    public static final String EVENT_MESSAGE = "事件信息";
    public static final String FONT_YES = "是";
    public static final String FONT_NO = "否";
    public static final short HEIGHT_600 = 600;

    public static final String DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_PATTERN_DAY = "yyyy-MM-dd";
    public static final String DATE_PATTERN_MONTH = "yyyy-MM";
    public static final String DATE_PATTERN_HOURSE = "HH:mm:ss";
    public static final String UTC = "UTC";
    public static final String TRUE = "true";

    public static final String DISAGREE = "disagree";
    public static final String DISGREE = "disgree";
    public static final String WORKER_UNKNOWN = "未知";

    public static final String MANAGER_APPROVAL = "managerApproval";
    public static final String PERFORM_EOP = "按EOP实施";
    public static final String BACK_TO_RECOVERY = "跳转至恢复";
    public static final String PUBLISH_SOLUTION = "发布方案";
    /**
     * 分隔符
     */
    public static final String PATTERN_BLANK = "";
    public static final String PATTERN_DOUBLE_BLANK = " ";
    public static final String PATTERN_COMMA = ",";
    public static final String PATTERN_SEMICOLON = ";";
    public static final String PATTERN = "_";
    public static final String PATTERN_CENTER = "-";
    public static final String PATTERN_EQUAL = "=";
    public static final String PATTERN_AND = "&";
    public static final String PATTERN_COLON = ":";
    public static final String PATTERN_LEFT_BRACKKET = "[";
    public static final String PATTERN_RIGHT_BRACKKET = "]";
    public static final String PATTERN_SLANT = "/";
    public static final String PATTERN_CAESURA_SIGN = "、"; // 顿号


    public static final String PATTERN_BR = "<br/>";
    public static final String PATTERN_N = "  \n  ";

    public static final String APPENT_IDC = "&idc=";

    public static final String APPENT_UPLOAD_FLAG = "&uploadFile=true";


    public static Pattern chinesePattern = Pattern.compile("[\u4e00-\u9fa5]");

    public static Pattern numberPattern = Pattern.compile("[0-9]*");

    public static Pattern containNumberPattern = Pattern.compile(".*\\d+.*");

    public static Pattern HTML_PATTERN = Pattern.compile("\\$\\{(.*?)\\}", Pattern.CASE_INSENSITIVE);
    public static Pattern TEMPLATE_PATTERN = Pattern.compile("\\<(.*?)\\>", Pattern.CASE_INSENSITIVE);



    /**
     * 文件下载路径
     */
    public static final String FILE_DOWN_PATH = "/file/download?fileName=";
    public static final String FILE_DOWN_OSSK = "&ossKey=";

    /**
     * 查询 ems pue 数据使用
     */
    public static final String POINT_PUE_PRE = "ems3_DPA_";
    public static final String POINT_10301_1009 = "10301_1009_sum";
    public static final String POINT_10901_1008 = "10901_1008_sum";
    public static final String POINT_10903_1003 = "10903_1003_sum";

    /**
     *  异常
     */

    public static final String EXCEPTION_PERMISSION = "have no permission";
    public static final String EXCEPTION_NO_ORDER = "have no this eventOrder";
    public static final String EXCEPTION_NO_DATA = "have no data";
    public static final String EXCEPTION_NO_ON_PUBLIC_PROJECT = "请刷新确认该节点是否已执行";
    public static final String EXCEPTION_NO_ID = "id can not be null";
    public static final String EXCEPTION_CONCLUDED = "已结单，无法更新";
    public static final String EXCEPTION_RECOVERY = "事件已恢复，无需发送GOC通知";
    public static final String EXCEPTION_REPEAT_SEND = "GOC通知已发送";
    public static final String EXCEPTION_NOT_NEED = "I4,I5和LOG等级事件不需要GOC通告";
    public static final String EXCEPTION_NOT_TEMPLATE = "通知模板不存在";
    public static final String EXCEPTION_DATE = "开始时间不能大于结束时间";
    public static final String EXCEPTION_NEED_FACILITYEXPERT_AND_RESIDENT = "仅有基础设施专家或基础设施驻场或者事件跟进人可操作";
    public static final String EXCEPTION_EVENT_TYPE_ERROR = "事件类型不匹配";
    public static final String EXCEPTION_NEED_FOC = "仅 idc-foc 角色可以退回事件";
    public static final String EXCEPTION_DUPLICATE_ENTRY = "请勿添加重复数据";
    public static final String EXCEPTION_LORD = "查询lord失败";
    // Duplicate entry
    public static final String DUPLICATE_ENTRY = "Duplicate entry";
    public static final String DATA_TOO_LONG = "Data too long";

    public static final String ASSOCIATED_ALARM = "关联raptor告警单";

    // 事件 rdb 统一前坠
    public static final String RDB_EVENT_KEY = "ark_dc_EventV2";
    public static final String RDB_EOP_KEY = "ark_dc_EopV2";

    // rdb 缓存 15 天
    public static final int FIFTEENDAY = 60 * 60 * 24 * 15;

    public static final int EVENT_TYPE_ID_TEMPERATURE_AND_HUMIDITY = 92;


    /**
     * key
     */
    public static final String GOC_SPACE = "GOCspace";
    public static final String IDC_NA61 = "NA61";
    public static final String BETWEEN_HOURSE = "between12hourse";
    public static final String ACTION_EVENT = "actionEvent";
    public static final String SERVER = "服务器";
    public static final String SUBCLASS_ID = "subclassId";
    public static final String CLASS_ID = "classId";
    public static final String NET = "网络";

    public static final String CM11 = "cm11";
    // serverSn添加条件
    public static final String EVENT_REASON_SERVER_SN = "PSU故障导致";
    /**
     * 来源raptor
     */
    public static final String SYSTEM_IDENTIFIER = "raptor_";
    /**
     * 自服务平台
     */
    public static final String PLATFORM_DIESEL = "Diesel";
    /**
     * 自维修平台
     */
    public static final String PLATFORM_SELFMAINTENANCE = "selfMaintenance";
    /**
     * 方舟平台
     */
    public static final String PLATFORM_ARK = "ark";
    /**
     * 消息通知方式
     */
    public static final String EMAIL = "email";
    public static final String VOICE = "voiceCall";
    public static final String SMS = "sms";
    public static final String DINGTALK = "dingTalk";
    public static final String MTO = "mto";
    public static final String IDC_DINGG_ROUP = "idcDingGroup";
    public static final String IDC_INFORMATIONG_ROUP = "idcInformationGroup";
    /**
     * 【IDC电力系统拓扑算法校验结果】<br/>
     */
    public static final String IDC_ALGORITHM_CHECK = "【IDC电力系统拓扑算法校验结果】";

    public static final String ID = "id";
    public static final String SERIAL_VERSION_UID = "serialVersionUID";

    public static final String IDC_EVENT_MANAGER_CELL_PHONE = "17306812419";

    public static final String ALL_IDC_PARENT_NAME = "IDC设施机房分类";
    public static final String GLOBAL_NAME = "全球";

}
