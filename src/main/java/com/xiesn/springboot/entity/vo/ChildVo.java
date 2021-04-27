package com.xiesn.springboot.entity.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.*;
import lombok.Data;
import org.apache.poi.ss.usermodel.HorizontalAlignment;

import java.util.Date;


@Data
@ContentRowHeight(20)
@HeadRowHeight(20)
@ColumnWidth(20)
@HeadFontStyle
@HeadStyle()
@ContentStyle(horizontalAlignment= HorizontalAlignment.CENTER)
public class ChildVo {


    @ExcelProperty("ID")
    private Integer chilId;

    @ExcelProperty("儿童编码")
    private String chilCode;

    @ExcelProperty("免疫卡号")
    private String chilCardno;


    @ExcelProperty("日期")
    private Date chilCarddate;


    @ExcelProperty("姓名")
    private String chilName;

    @ExcelProperty("性别")
    private String chilSex;

    @ExcelProperty("身份证号")
    private String chilNo;

    @ExcelProperty("健康档案标识")
    private String chilBirthno;

    @ExcelProperty("出生证号")
    private Date chilBirthday;
    @ExcelProperty("日期")
    private String chilBirthweight;
    @ExcelProperty("日期")
    private String chilFetus;
    @ExcelProperty("日期")
    private Integer chilNatiId;
    @ExcelProperty("日期")
    private String chilMother;
    @ExcelProperty("日期")
    private String chilMothercorp;
    @ExcelProperty("日期")
    private String chilMothertel;
    @ExcelProperty("日期")
    private String chilMothermobile;
    @ExcelProperty("日期")
    private String chilFather;
    @ExcelProperty("日期")
    private String chilFathercorp;
    @ExcelProperty("日期")
    private String chilFathertel;
    @ExcelProperty("日期")
    private String chilFathermobile;
    @ExcelProperty("日期")
    private String chilBirthhospital;
    @ExcelProperty("日期")
    private String chilZoneId;
    @ExcelProperty("日期")
    private Integer chilResidence;
    @ExcelProperty("日期")
    private String chilAddress;
    @ExcelProperty("日期")
    private Integer chilHabiId;
    @ExcelProperty("日期")
    private String chilHabiaddress;
    @ExcelProperty("日期")
    private String chilTel;
    @ExcelProperty("日期")
    private String chilMobile;
    @ExcelProperty("日期")
    private String chilEmail;
    @ExcelProperty("日期")
    private String chilInfection;
    @ExcelProperty("日期")
    private String chilSensitivity;
    @ExcelProperty("日期")
    private String chilAefi;
    @ExcelProperty("日期")
    private String chilMotherhb;
    @ExcelProperty("日期")
    private String chilIstabu;
    @ExcelProperty("日期")
    private String chilTabu;
    @ExcelProperty("日期")
    private Date chilKinddate;
    @ExcelProperty("日期")
    private Integer chilKindId;
    @ExcelProperty("日期")
    private String chilHere;
    @ExcelProperty("日期")
    private String chilAccount;
    @ExcelProperty("日期")
    private Date chilLeavedate;
    @ExcelProperty("日期")
    private String chilLeave;
    @ExcelProperty("日期")
    private String chilCurdepartment;
    @ExcelProperty("日期")
    private String chilPredepartment;
    @ExcelProperty("日期")
    private String chilEditstate;
    @ExcelProperty("日期")
    private Date chilChangedate;
    @ExcelProperty("日期")
    private Date chilUploaddate;
    @ExcelProperty("日期")
    private String chilInoculatestate;
    @ExcelProperty("日期")
    private Integer chilCreatecounty;
    @ExcelProperty("日期")
    private String chilCreatesite;
    @ExcelProperty("日期")
    private Date chilCreatedate;
    @ExcelProperty("日期")
    private String chilCreateman;
    @ExcelProperty("日期")
    private Date chilElementary;
    @ExcelProperty("日期")
    private Date chilJunior;
    @ExcelProperty("日期")
    private String chilRemark;
    @ExcelProperty("日期")
    private String chilCustomcode;
    @ExcelProperty("日期")
    private String chilNobacterin;
    @ExcelProperty("日期")
    private Integer chilInocno;
    @ExcelProperty("日期")
    private Date chilInocdate;
    @ExcelProperty("日期")
    private String chilInocstate;
    @ExcelProperty("日期")
    private String chilMotherhiv;
    @ExcelProperty("日期")
    private String chilChildhiv;
    @ExcelProperty("日期")
    private Date chilBookingprintdate;
    @ExcelProperty("日期")
    private String chilHospitallevel;
    @ExcelProperty("日期")
    private String chilServerliststate;
    @ExcelProperty("日期")
    private Date chilInocfeetime;
    @ExcelProperty("日期")
    private String chilReinforceyears;
    @ExcelProperty("日期")
    private Date chilArrivedate;
    @ExcelProperty("日期")
    private Date chilInocuploaddate;
    @ExcelProperty("日期")
    private String chilIsmessage;
    @ExcelProperty("日期")
    private String chilEditman;
    @ExcelProperty("日期")
    private String chilSelectbacterin;
    @ExcelProperty("日期")
    private String chilMessageapprize;
    @ExcelProperty("日期")
    private String chilRepeat;
    @ExcelProperty("日期")
    private Integer chilElementaryschool;
    @ExcelProperty("日期")
    private Integer chilJuniorhighschool;
    @ExcelProperty("日期")
    private Integer chilUniversity;
    @ExcelProperty("日期")
    private String chilSchoolclass;
    @ExcelProperty("日期")
    private Date chilUniversitydate;
    @ExcelProperty("日期")
    private Date chilMessagetime;
    @ExcelProperty("日期")
    private String chilOccup;
    @ExcelProperty("日期")
    private String chilUnitimmu;
    @ExcelProperty("日期")
    private String chilHealthno;
    @ExcelProperty("日期")
    private Date chilEditDate;
    @ExcelProperty("日期")
    private String chilCarddepaid;
    @ExcelProperty("日期")
    private String chilCityno;
    @ExcelProperty("日期")
    private String chilTicketdepaid;
    @ExcelProperty("日期")
    private String chilTicketno;
    @ExcelProperty("日期")
    private Date chilTicketdate;
    @ExcelProperty("日期")
    private String chilMotherno;
    @ExcelProperty("日期")
    private String chilFatherno;
    @ExcelProperty("日期")
    private String chilBcgScar;
    @ExcelProperty("日期")
    private String chilResidenceclient;
    @ExcelProperty("日期")
    private String chilAttributive;
    @ExcelProperty("日期")
    private String chilHepbintime;
    @ExcelProperty("日期")
    private String chilLeaveremark;
    @ExcelProperty("日期")
    private String chilTranscontrol;
    @ExcelProperty("日期")
    private String chilAddressdistrict;
    @ExcelProperty("日期")
    private String chilMothercode;
    @ExcelProperty("日期")
    private String chilFathercode;
    @ExcelProperty("日期")
    private String chilFlpeId;
    @ExcelProperty("日期")
    private String chilProvince;
    @ExcelProperty("日期")
    private String chilBirthhospitalname;
    @ExcelProperty("日期")
    private Integer chilFastref;
    @ExcelProperty("日期")
    private String chilIdxUplState;
    @ExcelProperty("日期")
    private String chilIdxUplErrDes;
    @ExcelProperty("日期")
    private String chilContactaddress;
    @ExcelProperty("日期")
    private String chilMotheraddress;
    @ExcelProperty("日期")
    private String chilFatheraddress;
    @ExcelProperty("日期")
    private String chilBinding;
    @ExcelProperty("日期")
    private String chilMessagetype;
    @ExcelProperty("日期")
    private String chilMessagefreeze;
    @ExcelProperty("日期")
    private String chilVideCode;
    @ExcelProperty("日期")
    private String chilGuardQq;
    @ExcelProperty("日期")
    private String chilNewbornMark2;
    @ExcelProperty("日期")
    private Date chilAttributiveeditdate;
    @ExcelProperty("日期")
    private String chilMovetype;
    @ExcelProperty("日期")
    private Date chilLastinocdate;
    @ExcelProperty("日期")
    private String chilInoctype;
    @ExcelProperty("日期")
    private String chilCreatetype;
    @ExcelProperty("日期")
    private String chilFamily;
    @ExcelProperty("日期")
    private String chilRelation;
    @ExcelProperty("日期")
    private String chilRelationId;
    @ExcelProperty("日期")
    private Date chilRelationdate;
    @ExcelProperty("日期")
    private String chilCaseUplState;
    @ExcelProperty("日期")
    private String chilCaseUplDesc;
    @ExcelProperty("日期")
    private Integer chilCreateType;
    @ExcelProperty("日期")
    private String chilNameInitial;
    @ExcelProperty("日期")
    private String chilAddressDepaCode;
    @ExcelProperty("日期")
    private String chilHeight;
    @ExcelProperty("日期")
    private String chilPartusType;
    @ExcelProperty("日期")
    private String chilKind;
    @ExcelProperty("日期")
    private String chilEditSite;
    @ExcelProperty("日期")
    private String chilEditSiteName;
    @ExcelProperty("日期")
    private String chilCardType;
    @ExcelProperty("日期")
    private String chilCard;
    @ExcelProperty("日期")
    private String chilFathercardType;
    @ExcelProperty("日期")
    private String chilMothercardType;
    @ExcelProperty("日期")
    private Integer chilVersion;
    //出生孕周
    @ExcelProperty("日期")
    private String chilOtherGuardiantel;
    //其他监护人与受种者关系

    @ExcelProperty("日期")
    private String chilOtherGuardianRelation;


}
