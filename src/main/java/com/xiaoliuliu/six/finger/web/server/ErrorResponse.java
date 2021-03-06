package com.xiaoliuliu.six.finger.web.server;

import com.xiaoliuliu.six.finger.web.common.util.DateUtil;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Des 失败的实体
 * @Author 小六六
 * @Date 2020/10/15 17:07
 * @Param
 * @Return
 */
@Getter
@ToString
@NoArgsConstructor
public class ErrorResponse {
    private String timestamp;
    private int status;
    private String error;
    private String message;
    private String path;

    public ErrorResponse(int status, String error, String message, String path) {
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
        this.timestamp = DateUtil.now();
    }
}
