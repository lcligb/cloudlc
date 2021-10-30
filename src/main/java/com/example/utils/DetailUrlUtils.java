package com.example.utils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import static com.example.constant.EventConstants.*;
@Component
public class DetailUrlUtils {

    @Value("${environment}")
    private String environment;

    public String appendUrl(String path,String detailId){
        StringBuilder url = new StringBuilder(environment.equals(DAILY) ? URI_DAILY :
                environment.equalsIgnoreCase(ENVIRONMENT_PRE) ? URI_PRE : URI_PRO);
        if (StringUtils.isBlank(detailId)) {
            return url.append(path).toString();
        }
        return url.append(path).append(detailId).toString();
    }
}
