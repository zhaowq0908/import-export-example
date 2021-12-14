package com.wz.it.controller;

import com.wz.it.service.ImportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 导入控制器
 *
 * @author zhaowangquan
 * @since 2021/12/14 4:59 下午
 */
@RestController
@RequestMapping(value = "/import")
public class ImportController {

    private final ImportService importService;

    @Autowired
    public ImportController(ImportService importService) {
        this.importService = importService;
    }

    @RequestMapping(value = "/excel")
    public String asyncImport(HttpServletRequest request) {
        return importService.asyncImport(request);
    }
}
