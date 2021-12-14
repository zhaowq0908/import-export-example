package com.wz.it.service.impl;

import com.wz.it.service.ImportService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * 导入服务
 *
 * @author zhaowangquan
 * @since 2021/12/14 5:20 下午
 */
@Service
public class ImportServiceImpl implements ImportService {
    @Override
    public String asyncImport(HttpServletRequest request) {
        return null;
    }
}
