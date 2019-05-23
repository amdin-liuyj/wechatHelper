package com.nuoxin.virtual.rep.api.entity.v2_5;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class VirtualDoctorCallInfoParams{


	private Long id;
	private Long callId;
	private String sinToken;
	private Long virtualDrugUserId;
	private Long virtualDoctorId;
	private Integer doctorQuestionnaireId;
	private Integer productId;
	private String mobile;
	private Integer type;
	private String visitResult="";
	private Integer attitude;
	private String visitTime;
	private String nextVisitTime;
	private String remark;
	private int status;
	private String statusName;
	private Long callTime;
	private String callUrl;

	private String unpressedCallUrl;

	private String unpressedCallUrlIn;

	private String unpressedCallUrlOut;

	@ApiModelProperty(value = "医生潜力 3高,2中,1低,-1未知")
	private Integer hcpPotential;
	@ApiModelProperty(value = "是否有药 1.有,0.无,-1未知")
	private Integer isHasDrug;
	@ApiModelProperty(value = "是否是目标客户 1.是,0.非,-1未知")
	private Integer isTarget;
	@ApiModelProperty(value = "是否有 AE 1.是,0.非,-1未知")
	private Integer isHasAe;
	@ApiModelProperty(value = "是否有 招募 1.是,0.非,-1未知")
	private Integer isRecruit;

	@ApiModelProperty(value = "是否覆盖，0是未开始，1是覆盖中，2是退出项目")
	private Integer isCover;
	@ApiModelProperty(value = "是否脱落1.是,0.非,-1未知")
	private Integer isBreakOff;

	@ApiModelProperty(value = "成功招募时间")
	private Date recruitTime;

	@ApiModelProperty(value = "退出项目时间")
	private Date dropOutTime;

}
