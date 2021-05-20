package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 劳工信息主表
 * </p>
 *
 * @author liu.k
 * @since 2020-03-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
    @TableName(value = "ms_labor")
public class MsLabor {

    private static final long serialVersionUID = 1L;


    /**
     * 员工id
     */
    @Id
    @TableId(value = "id")
    private Long id;


    /**
     * ufaceid
     */
    private String ufaceId;

    /**
     * 工人姓名
     */
    private String name;

    /**
     * 员工性别 0.男 1.女 -1.未知
     */
    private Integer sex;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 身份证号
     */
    private String idCardNumber;

    /**
     * 银行卡号
     */
    private String bankNumber;

    /**
     * 所属班组编号
     */
    private Long teamId;

    /**
     * 所属班组
     */
    private String teamName;

    /**
     * 所属班组编码
     */
    private String teamCode;

    /**
     * 所属班组编码
     */
    @TableField(exist = false)
    private String oldTeamCode;


    /**
     * 所属工种
     */
    private Long jobTypeId;

    /**
     * 工作状态
     */
    private Integer workStatus;

    /**
     * 所属项目编号
     */
    private Long projectId;

    /**
     * 所属项目名称
     */
    private String projectName;

    /**
     * 所属项目编码
     */
    private String projectCode;


    /**
     * 年龄
     */
    private Integer age;

    /**
     * 企业编号
     */
    private Long companyId;

    /**
     * 企业名称
     */
    private String companyName;

    /**
     * 企业统一社会编码
     */
    private String companyCode;

    /**
     * 开工日期
     */
    private String workDate;

    /**
     * 简介
     */
    private String remark;

    /**
     * 所属岗位id
     */
    private Long postId;

    /**
     * 所属岗位编码
     */
    private String postCode;

    /**
     * 所属岗位
     */
    private String postName;

    /**
     * 离场时间
     */
    private String leaveDate;

    /**
     * 学历编号
     */
    private String degreeCode;

    /**
     * 学历编号
     */
    private Long degreeId;


    /**
     * 学历名称
     */
    private String degree;

    /**
     * 常住地址
     */
    private String address;

    /**
     * 是否班组长
     */
    private Boolean isTeamLeader;

    /**
     * 政治面貌编号
     */
    private Long politicsId;

    /**
     * 政治面貌
     */
    private String politicsCode;

    /**
     * 技能水平
     */
    private Long levelType;


    /**
     * 婚姻状况
     */
    private Integer maritalStatus;

    /**
     * 乐观锁
     */
    @Version
    private Integer version;

    /**
     * 是否删除
     */
    @TableLogic
    private Boolean isDeleted;

    /**
     * 租户id
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @JsonIgnore
    private transient Long tenantId;


    /**
     * 身份证地址
     */
    private String idCardAddress;

    /**
     * 身份证有效期-起始日期
     */
    private String idStartValid;

    /**
     * 身份证有效期-结束日期
     */
    private String idEndValid;

    /**
     * 签发机关
     */
    private String idAgency;

    /**
     * 民族
     */
    private String nation;

    /**
     * 生日
     */
    private String birthday;

    /**
     * 最后一次通过时间
     */
    private Date lastPassTime;

    /**
     * 最后一次是进或出
     */
    private Boolean isIn;

    /**
     * 是否参加过安全教育
     */
    private Boolean isSafeEdu;

    /**
     * 采集头像地址
     */
    @JsonIgnore
    private transient String issueCardpic;

    /**
     * 采集头像地址
     */
    @JsonIgnore
    private transient String issueCardpicUrl;

    /**
     * 采集头像地址
     */
    private String issueCardpicPath;

    /**
     * 身份证正面
     */
    @JsonIgnore
    private transient String positiveIdCardImage;

    /**
     * 身份证正面
     */
    @JsonIgnore
    private transient String positiveIdCardUrl;

    /**
     * 身份证正面地址
     */
    private String positiveIdCardImagePath;

    /**
     * 身份证反面地址
     */
    private String negativeIdCardImagePath;

    /**
     * 身份证反面
     */
    @JsonIgnore
    private transient String negativeIdCardImageUrl;

    /**
     * 身份证反面
     */
    @JsonIgnore
    private transient String negativeIdCardImage;

    /**
     * 头像地址
     */
    private String headImagePath;

    /**
     * 头像地址
     */
    @JsonIgnore
    private transient String headImageUrl;

    /**
     * 头像二进制
     */
    private String headImage;

    /**
     * 合同开始日期
     */
    private String contractStartDate;

    /**
     * 合同结束日期
     */
    private String contractEndDate;


    /**
     * 合同附件
     */
    private String contractImagePath;

    /**
     * 合同附件
     */
    private transient String contractImage;

    /**
     * 工人类型id
     */
    private Long personTypeId;

    /**
     * 工人类型
     */
    private String personTypeName;

    /**
     * 工人类型编码
     */
    private String personTypeCode;


    /**
     * 健康状态
     */
    private Long healthState;


    /**
     * 健康状态
     */
    private String healthStateName;


    /**
     * 卡号
     */
    private String cardNumber;


    /**
     * 政治面貌
     */
    private String politicsName;


    /**
     * 工种名称
     */
    private String jobTypeName;

    /**
     * 工种编码
     */
    private String jobTypeCode;


    /**
     * 同步状态
     */
    private Integer status;


    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人id
     */
    private Long createUserId;


    /**
     * 最后一次修改时间
     */
    private Date lastUpdateTime;

    /**
     * 最后一次修改人
     */
    private Long lastUpdateId;


    /**
     * 权限有效期-开始
     */
    private Date validateStart;

    /**
     * 权限有效期-结束
     */
    private Date validateEnd;

    /**
     * 是否黑名单，0：否，1：是；
     */
        private Boolean isBlack;

}
