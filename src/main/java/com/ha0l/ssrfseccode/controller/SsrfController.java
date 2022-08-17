package com.ha0l.ssrfseccode.controller;

import com.ha0l.ssrfseccode.utils.HttpUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ha0
 * @date 2022-0817
 */
@Component
@RestController
@RequestMapping("/ssrf")
public class SsrfController {

    /**
     * @vulnPath：
     * 1）<a href="http://localhost:8788/ssrf/urlConnectionVuln?url=file:///etc/passwd">...</a>
     * 2）<a href="http://localhost:8788/ssrf/urlConnectionVuln?url=http://baidu.com">...</a>
     */
    @GetMapping("/urlConnectionVuln")
    public String urlConnectionVuln(@RequestParam String url) {
        return HttpUtils.URLConnection(url);
    }

    /**
     * @vulnPath：
     * 1）<a href="http://localhost:8788/ssrf/httpClientVuln?url=file:///etc/passwd">...</a>
     * 2）<a href="http://localhost:8788/ssrf/httpClientVuln?url=http://baidu.com">...</a>
     */
    @GetMapping("/httpClientVuln")
    public String httpClientVuln(String url) {
        return HttpUtils.HttpClient(url);
    }



}
