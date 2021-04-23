package com.xiesn.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author xiesn
 * @since 2021-04-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ADULT")
public class Adult extends Model<Adult> {

    private static final long serialVersionUID = 1L;

    @TableField("CHIL_ID")
    private String chilId;

    @TableField("CHIL_CODE")
    private String chilCode;

    @TableField("CHIL_CARDNO")
    private String chilCardno;

    @TableField("CHIL_CARDDATE")
    private Date chilCarddate;

    @TableField("CHIL_NAME")
    private String chilName;

    @TableField("CHIL_SEX")
    private String chilSex;

    @TableField("CHIL_NO")
    private String chilNo;

    @TableField("CHIL_BIRTHNO")
    private String chilBirthno;

    @TableField("CHIL_BIRTHDAY")
    private Date chilBirthday;

    @TableField("CHIL_BIRTHWEIGHT")
    private String chilBirthweight;

    @TableField("CHIL_FETUS")
    private String chilFetus;

    @TableField("CHIL_NATI_ID")
    private BigDecimal chilNatiId;

    @TableField("CHIL_MOTHER")
    private String chilMother;

    @TableField("CHIL_MOTHERCORP")
    private String chilMothercorp;

    @TableField("CHIL_MOTHERTEL")
    private String chilMothertel;

    @TableField("CHIL_MOTHERMOBILE")
    private String chilMothermobile;

    @TableField("CHIL_FATHER")
    private String chilFather;

    @TableField("CHIL_FATHERCORP")
    private String chilFathercorp;

    @TableField("CHIL_FATHERTEL")
    private String chilFathertel;

    @TableField("CHIL_FATHERMOBILE")
    private String chilFathermobile;

    @TableField("CHIL_BIRTHHOSPITAL")
    private String chilBirthhospital;

    @TableField("CHIL_ZONE_ID")
    private String chilZoneId;

    @TableField("CHIL_RESIDENCE")
    private BigDecimal chilResidence;

    @TableField("CHIL_ADDRESS")
    private String chilAddress;

    @TableField("CHIL_HABI_ID")
    private BigDecimal chilHabiId;

    @TableField("CHIL_HABIADDRESS")
    private String chilHabiaddress;

    @TableField("CHIL_TEL")
    private String chilTel;

    @TableField("CHIL_MOBILE")
    private String chilMobile;

    @TableField("CHIL_EMAIL")
    private String chilEmail;

    @TableField("CHIL_INFECTION")
    private String chilInfection;

    @TableField("CHIL_SENSITIVITY")
    private String chilSensitivity;

    @TableField("CHIL_AEFI")
    private String chilAefi;

    @TableField("CHIL_MOTHERHB")
    private String chilMotherhb;

    @TableField("CHIL_ISTABU")
    private String chilIstabu;

    @TableField("CHIL_TABU")
    private String chilTabu;

    @TableField("CHIL_KINDDATE")
    private Date chilKinddate;

    @TableField("CHIL_KIND_ID")
    private BigDecimal chilKindId;

    @TableField("CHIL_HERE")
    private String chilHere;

    @TableField("CHIL_LEAVEDATE")
    private Date chilLeavedate;

    @TableField("CHIL_LEAVE")
    private String chilLeave;

    @TableField("CHIL_CURDEPARTMENT")
    private String chilCurdepartment;

    @TableField("CHIL_PREDEPARTMENT")
    private String chilPredepartment;

    @TableField("CHIL_EDITSTATE")
    private String chilEditstate;

    @TableField("CHIL_CHANGEDATE")
    private Date chilChangedate;

    @TableField("CHIL_UPLOADDATE")
    private Date chilUploaddate;

    @TableField("CHIL_INOCULATESTATE")
    private String chilInoculatestate;

    @TableField("CHIL_CREATECOUNTY")
    private BigDecimal chilCreatecounty;

    @TableField("CHIL_CREATESITE")
    private String chilCreatesite;

    @TableField("CHIL_CREATEDATE")
    private Date chilCreatedate;

    @TableField("CHIL_CREATEMAN")
    private String chilCreateman;

    @TableField("CHIL_ELEMENTARY")
    private Date chilElementary;

    @TableField("CHIL_JUNIOR")
    private Date chilJunior;

    @TableField("CHIL_REMARK")
    private String chilRemark;

    @TableField("CHIL_CUSTOMCODE")
    private String chilCustomcode;

    @TableField("CHIL_NOBACTERIN")
    private String chilNobacterin;

    @TableField("CHIL_INOCNO")
    private BigDecimal chilInocno;

    @TableField("CHIL_INOCDATE")
    private Date chilInocdate;

    @TableField("CHIL_INOCSTATE")
    private String chilInocstate;

    @TableField("CHIL_MOTHERHIV")
    private String chilMotherhiv;

    @TableField("CHIL_CHILDHIV")
    private String chilChildhiv;

    @TableField("CHIL_BOOKINGPRINTDATE")
    private Date chilBookingprintdate;

    @TableField("CHIL_HOSPITALLEVEL")
    private String chilHospitallevel;

    @TableField("CHIL_SERVERLISTSTATE")
    private String chilServerliststate;

    @TableField("CHIL_INOCFEETIME")
    private Date chilInocfeetime;

    @TableField("CHIL_REINFORCEYEARS")
    private String chilReinforceyears;

    @TableField("CHIL_ARRIVEDATE")
    private Date chilArrivedate;

    @TableField("CHIL_INOCUPLOADDATE")
    private Date chilInocuploaddate;

    @TableField("CHIL_ISMESSAGE")
    private String chilIsmessage;

    @TableField("CHIL_EDITMAN")
    private String chilEditman;

    @TableField("CHIL_SELECTBACTERIN")
    private String chilSelectbacterin;

    @TableField("CHIL_MESSAGEAPPRIZE")
    private String chilMessageapprize;

    @TableField("CHIL_REPEAT")
    private String chilRepeat;

    @TableField("CHIL_ELEMENTARYSCHOOL")
    private BigDecimal chilElementaryschool;

    @TableField("CHIL_JUNIORHIGHSCHOOL")
    private BigDecimal chilJuniorhighschool;

    @TableField("CHIL_UNIVERSITY")
    private BigDecimal chilUniversity;

    @TableField("CHIL_SCHOOLCLASS")
    private String chilSchoolclass;

    @TableField("CHIL_UNIVERSITYDATE")
    private Date chilUniversitydate;

    @TableField("CHIL_MESSAGETIME")
    private Date chilMessagetime;

    @TableField("CHIL_OCCUP")
    private String chilOccup;

    @TableField("CHIL_UNITIMMU")
    private String chilUnitimmu;


    public static final String CHIL_ID = "CHIL_ID";

    public static final String CHIL_CODE = "CHIL_CODE";

    public static final String CHIL_CARDNO = "CHIL_CARDNO";

    public static final String CHIL_CARDDATE = "CHIL_CARDDATE";

    public static final String CHIL_NAME = "CHIL_NAME";

    public static final String CHIL_SEX = "CHIL_SEX";

    public static final String CHIL_NO = "CHIL_NO";

    public static final String CHIL_BIRTHNO = "CHIL_BIRTHNO";

    public static final String CHIL_BIRTHDAY = "CHIL_BIRTHDAY";

    public static final String CHIL_BIRTHWEIGHT = "CHIL_BIRTHWEIGHT";

    public static final String CHIL_FETUS = "CHIL_FETUS";

    public static final String CHIL_NATI_ID = "CHIL_NATI_ID";

    public static final String CHIL_MOTHER = "CHIL_MOTHER";

    public static final String CHIL_MOTHERCORP = "CHIL_MOTHERCORP";

    public static final String CHIL_MOTHERTEL = "CHIL_MOTHERTEL";

    public static final String CHIL_MOTHERMOBILE = "CHIL_MOTHERMOBILE";

    public static final String CHIL_FATHER = "CHIL_FATHER";

    public static final String CHIL_FATHERCORP = "CHIL_FATHERCORP";

    public static final String CHIL_FATHERTEL = "CHIL_FATHERTEL";

    public static final String CHIL_FATHERMOBILE = "CHIL_FATHERMOBILE";

    public static final String CHIL_BIRTHHOSPITAL = "CHIL_BIRTHHOSPITAL";

    public static final String CHIL_ZONE_ID = "CHIL_ZONE_ID";

    public static final String CHIL_RESIDENCE = "CHIL_RESIDENCE";

    public static final String CHIL_ADDRESS = "CHIL_ADDRESS";

    public static final String CHIL_HABI_ID = "CHIL_HABI_ID";

    public static final String CHIL_HABIADDRESS = "CHIL_HABIADDRESS";

    public static final String CHIL_TEL = "CHIL_TEL";

    public static final String CHIL_MOBILE = "CHIL_MOBILE";

    public static final String CHIL_EMAIL = "CHIL_EMAIL";

    public static final String CHIL_INFECTION = "CHIL_INFECTION";

    public static final String CHIL_SENSITIVITY = "CHIL_SENSITIVITY";

    public static final String CHIL_AEFI = "CHIL_AEFI";

    public static final String CHIL_MOTHERHB = "CHIL_MOTHERHB";

    public static final String CHIL_ISTABU = "CHIL_ISTABU";

    public static final String CHIL_TABU = "CHIL_TABU";

    public static final String CHIL_KINDDATE = "CHIL_KINDDATE";

    public static final String CHIL_KIND_ID = "CHIL_KIND_ID";

    public static final String CHIL_HERE = "CHIL_HERE";

    public static final String CHIL_LEAVEDATE = "CHIL_LEAVEDATE";

    public static final String CHIL_LEAVE = "CHIL_LEAVE";

    public static final String CHIL_CURDEPARTMENT = "CHIL_CURDEPARTMENT";

    public static final String CHIL_PREDEPARTMENT = "CHIL_PREDEPARTMENT";

    public static final String CHIL_EDITSTATE = "CHIL_EDITSTATE";

    public static final String CHIL_CHANGEDATE = "CHIL_CHANGEDATE";

    public static final String CHIL_UPLOADDATE = "CHIL_UPLOADDATE";

    public static final String CHIL_INOCULATESTATE = "CHIL_INOCULATESTATE";

    public static final String CHIL_CREATECOUNTY = "CHIL_CREATECOUNTY";

    public static final String CHIL_CREATESITE = "CHIL_CREATESITE";

    public static final String CHIL_CREATEDATE = "CHIL_CREATEDATE";

    public static final String CHIL_CREATEMAN = "CHIL_CREATEMAN";

    public static final String CHIL_ELEMENTARY = "CHIL_ELEMENTARY";

    public static final String CHIL_JUNIOR = "CHIL_JUNIOR";

    public static final String CHIL_REMARK = "CHIL_REMARK";

    public static final String CHIL_CUSTOMCODE = "CHIL_CUSTOMCODE";

    public static final String CHIL_NOBACTERIN = "CHIL_NOBACTERIN";

    public static final String CHIL_INOCNO = "CHIL_INOCNO";

    public static final String CHIL_INOCDATE = "CHIL_INOCDATE";

    public static final String CHIL_INOCSTATE = "CHIL_INOCSTATE";

    public static final String CHIL_MOTHERHIV = "CHIL_MOTHERHIV";

    public static final String CHIL_CHILDHIV = "CHIL_CHILDHIV";

    public static final String CHIL_BOOKINGPRINTDATE = "CHIL_BOOKINGPRINTDATE";

    public static final String CHIL_HOSPITALLEVEL = "CHIL_HOSPITALLEVEL";

    public static final String CHIL_SERVERLISTSTATE = "CHIL_SERVERLISTSTATE";

    public static final String CHIL_INOCFEETIME = "CHIL_INOCFEETIME";

    public static final String CHIL_REINFORCEYEARS = "CHIL_REINFORCEYEARS";

    public static final String CHIL_ARRIVEDATE = "CHIL_ARRIVEDATE";

    public static final String CHIL_INOCUPLOADDATE = "CHIL_INOCUPLOADDATE";

    public static final String CHIL_ISMESSAGE = "CHIL_ISMESSAGE";

    public static final String CHIL_EDITMAN = "CHIL_EDITMAN";

    public static final String CHIL_SELECTBACTERIN = "CHIL_SELECTBACTERIN";

    public static final String CHIL_MESSAGEAPPRIZE = "CHIL_MESSAGEAPPRIZE";

    public static final String CHIL_REPEAT = "CHIL_REPEAT";

    public static final String CHIL_ELEMENTARYSCHOOL = "CHIL_ELEMENTARYSCHOOL";

    public static final String CHIL_JUNIORHIGHSCHOOL = "CHIL_JUNIORHIGHSCHOOL";

    public static final String CHIL_UNIVERSITY = "CHIL_UNIVERSITY";

    public static final String CHIL_SCHOOLCLASS = "CHIL_SCHOOLCLASS";

    public static final String CHIL_UNIVERSITYDATE = "CHIL_UNIVERSITYDATE";

    public static final String CHIL_MESSAGETIME = "CHIL_MESSAGETIME";

    public static final String CHIL_OCCUP = "CHIL_OCCUP";

    public static final String CHIL_UNITIMMU = "CHIL_UNITIMMU";

    @Override
    protected Serializable pkVal() {
        return null;
    }

}
