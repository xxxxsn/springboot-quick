package com.xiesn.springboot.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (Child)表实体类
 *
 * @author makejava
 * @since 2021-04-19 15:54:02
 */
@Data
public class Child extends Model<Child> {

    private Integer chilId;

    private String chilCode;

    private String chilCardno;

    private Date chilCarddate;

    private String chilName;

    private String chilSex;

    private String chilNo;

    private String chilBirthno;

    private Date chilBirthday;

    private String chilBirthweight;

    private String chilFetus;

    private Integer chilNatiId;

    private String chilMother;

    private String chilMothercorp;

    private String chilMothertel;

    private String chilMothermobile;

    private String chilFather;

    private String chilFathercorp;

    private String chilFathertel;

    private String chilFathermobile;

    private String chilBirthhospital;

    private String chilZoneId;

    private Integer chilResidence;

    private String chilAddress;

    private Integer chilHabiId;

    private String chilHabiaddress;

    private String chilTel;

    private String chilMobile;

    private String chilEmail;

    private String chilInfection;

    private String chilSensitivity;

    private String chilAefi;

    private String chilMotherhb;

    private String chilIstabu;

    private String chilTabu;

    private Date chilKinddate;

    private Integer chilKindId;

    private String chilHere;

    private String chilAccount;

    private Date chilLeavedate;

    private String chilLeave;

    private String chilCurdepartment;

    private String chilPredepartment;

    private String chilEditstate;

    private Date chilChangedate;

    private Date chilUploaddate;

    private String chilInoculatestate;

    private Integer chilCreatecounty;

    private String chilCreatesite;

    private Date chilCreatedate;

    private String chilCreateman;

    private Date chilElementary;

    private Date chilJunior;

    private String chilRemark;

    private String chilCustomcode;

    private String chilNobacterin;

    private Integer chilInocno;

    private Date chilInocdate;

    private String chilInocstate;

    private String chilMotherhiv;

    private String chilChildhiv;

    private Date chilBookingprintdate;

    private String chilHospitallevel;

    private String chilServerliststate;

    private Date chilInocfeetime;

    private String chilReinforceyears;

    private Date chilArrivedate;

    private Date chilInocuploaddate;

    private String chilIsmessage;

    private String chilEditman;

    private String chilSelectbacterin;

    private String chilMessageapprize;

    private String chilRepeat;

    private Integer chilElementaryschool;

    private Integer chilJuniorhighschool;

    private Integer chilUniversity;

    private String chilSchoolclass;

    private Date chilUniversitydate;

    private Date chilMessagetime;

    private String chilOccup;

    private String chilUnitimmu;

    private String chilHealthno;

    private Date chilEditDate;

    private String chilCarddepaid;

    private String chilCityno;

    private String chilTicketdepaid;

    private String chilTicketno;

    private Date chilTicketdate;

    private String chilMotherno;

    private String chilFatherno;

    private String chilBcgScar;

    private String chilResidenceclient;

    private String chilAttributive;

    private String chilHepbintime;

    private String chilLeaveremark;

    private String chilTranscontrol;

    private String chilAddressdistrict;

    private String chilMothercode;

    private String chilFathercode;

    private String chilFlpeId;

    private String chilProvince;

    private String chilBirthhospitalname;

    private Integer chilFastref;

    private String chilIdxUplState;

    private String chilIdxUplErrDes;

    private String chilContactaddress;

    private String chilMotheraddress;

    private String chilFatheraddress;

    private String chilBinding;

    private String chilMessagetype;

    private String chilMessagefreeze;

    private String chilVideCode;

    private String chilGuardQq;

    private String chilNewbornMark2;

    private Date chilAttributiveeditdate;

    private String chilMovetype;

    private Date chilLastinocdate;

    private String chilInoctype;

    private String chilCreatetype;

    private String chilFamily;

    private String chilRelation;

    private String chilRelationId;

    private Date chilRelationdate;

    private String chilCaseUplState;

    private String chilCaseUplDesc;

    private Integer chilCreateType;

    private String chilNameInitial;

    private String chilAddressDepaCode;

    private String chilHeight;

    private String chilPartusType;

    private String chilKind;

    private String chilEditSite;

    private String chilEditSiteName;

    private String chilCardType;

    private String chilCard;

    private String chilFathercardType;

    private String chilMothercardType;

    private Integer chilVersion;
    //出生孕周
    private String chilOtherGuardiantel;
    //其他监护人与受种者关系
    private String chilOtherGuardianRelation;



    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.chilId;
    }
}
