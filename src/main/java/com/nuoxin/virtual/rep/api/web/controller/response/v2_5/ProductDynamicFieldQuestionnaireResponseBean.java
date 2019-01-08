package com.nuoxin.virtual.rep.api.web.controller.response.v2_5;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.security.access.method.P;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 产品动态字段包含问卷调查的信息
 * @author tiancun
 * @date 2018-09-18
 */
@ApiModel(value = "产品动态字段包含问卷调查的信息")
@Data
public class ProductDynamicFieldQuestionnaireResponseBean implements Serializable {
    private static final long serialVersionUID = -650497624101900561L;

    @ApiModelProperty(value = "产品")
    private ProductLineResponseBean productLineResponseBean;

    @ApiModelProperty(value = "产品动态字段")
    private List<DoctorProductDynamicFieldValueResponseBean> productDynamicFieldList = new ArrayList<>();

    @ApiModelProperty(value = "处方信息")
    private PrescriptionResponseBean prescription = new PrescriptionResponseBean();

    @ApiModelProperty(value = "拜访记录")
    private VisitResponseBean visit = new VisitResponseBean();

    @ApiModelProperty(value = "医生选中的分型ID")
    private List<Long> classificationIdList = new ArrayList<>();


//    @ApiModelProperty(value = "产品问卷调查")
//    private List<ProductQuestionnaireResponseBean> productQuestionnaireList = new ArrayList<>();
}
