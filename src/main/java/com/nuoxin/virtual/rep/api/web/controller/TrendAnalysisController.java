package com.nuoxin.virtual.rep.api.web.controller;

import com.nuoxin.virtual.rep.api.common.bean.DefaultResponseBean;
import com.nuoxin.virtual.rep.api.common.controller.BaseController;
import com.nuoxin.virtual.rep.api.web.controller.request.TargetAnalysisRequestBean;
import com.nuoxin.virtual.rep.api.web.controller.request.TrendAnalysisRequestBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by fenggang on 10/11/17.
 */
@Api(value = "", description = "趋势分析接口")
@RestController
@RequestMapping(value = "/trend/analysis")
public class TrendAnalysisController extends BaseController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @ApiOperation(value = "汇总统计接口", notes = "汇总统计接口")
    @PostMapping("/summation")
    public DefaultResponseBean<Boolean> summation(@RequestBody TrendAnalysisRequestBean bean,
                                                  HttpServletRequest request, HttpServletResponse response) {
        DefaultResponseBean<Boolean> responseBean = new DefaultResponseBean();

        return responseBean;
    }

    @ApiOperation(value = "呼出统计接口", notes = "呼出统计接口")
    @PostMapping("/callout")
    public DefaultResponseBean<Boolean> callOut(@RequestBody TrendAnalysisRequestBean bean,
                                                HttpServletRequest request, HttpServletResponse response) {
        DefaultResponseBean<Boolean> responseBean = new DefaultResponseBean();

        return responseBean;
    }

    @ApiOperation(value = "会话统计接口", notes = "会话统计接口")
    @PostMapping("/session")
    public DefaultResponseBean<Boolean> session(@RequestBody TrendAnalysisRequestBean bean,
                                                HttpServletRequest request, HttpServletResponse response) {
        DefaultResponseBean<Boolean> responseBean = new DefaultResponseBean();

        return responseBean;
    }

}
