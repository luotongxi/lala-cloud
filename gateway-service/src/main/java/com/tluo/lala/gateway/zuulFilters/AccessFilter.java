package com.tluo.lala.gateway.zuulFilters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by edz on 2017/8/12.
 */
public class AccessFilter extends ZuulFilter {
    private static final Logger logger = LoggerFactory.getLogger(AccessFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        logger.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
        String token = request.getParameter("accessToken");
        if (StringUtils.isEmpty(token)) {
            logger.warn("accessToken is empty");
            ctx.setSendZuulResponse(false); // 不予路由
            ctx.setResponseStatusCode(401);
            ctx.setResponseBody("亲，您没有权限访问哦！");
            return null;
        }
        logger.info("accessToken is ok");
        return null;
    }
}
