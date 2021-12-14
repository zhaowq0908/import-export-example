package com.wz.it.service;

import javax.servlet.http.HttpServletRequest;

/**
 * 导入服务
 *
 * @author zhaowangquan
 * @since 2021/12/14 5:20 下午
 */
public interface ImportService {
    /**
     * 异步导入
     * @param request
     * @return 返回唯一标识
     */
    String asyncImport(HttpServletRequest request);
}
