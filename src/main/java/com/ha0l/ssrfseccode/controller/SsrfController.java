package com.ha0l.ssrfseccode.controller;

import com.ha0l.ssrfseccode.controller.form.SQLForm;
import com.ha0l.ssrfseccode.utils.HttpUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;

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
     * 1）<a href="http://localhost:8788/ssrf/httpClientVuln?url=http://baidu.com">...</a>
     */
    @GetMapping("/httpClientVuln")
    public String httpClientVuln(@RequestParam String url) {
        return HttpUtils.HttpClient(url);
    }

    /**
     * @vulnPath：
     * 1）<a href="http://localhost:8788/ssrf/httpUrlConnectionVuln?url=http://baidu.com">...</a>
     */
    @GetMapping("/httpUrlConnectionVuln")
    public String httpUrlConnectionVuln(@RequestParam String url) {
        return HttpUtils.HttpURLConnection(url);
    }

    /**
     * @vulnPath：
     * 1）<a href="http://localhost:8788/ssrf/okHttpVuln?url=http://baidu.com">...</a>
     */
    @GetMapping("/okHttpVuln")
    public String okHttpVuln(@RequestParam String url) throws IOException {
        return HttpUtils.okhttp(url);
    }

    @GetMapping("/ImageIOVuln")
    public String ImageIO(@RequestParam String url) {
        HttpUtils.imageIO(url);
        return "ImageIO ssrf test";
    }

    @GetMapping("/requestVuln")
    public String requestVuln(@RequestParam String url) {
        return HttpUtils.request(url);
    }

    @GetMapping("/sqlSsrf")
    public String sqlSsrfVuln(@RequestParam String username,
                               @RequestParam String url,
                               @RequestParam String passwd) throws ClassNotFoundException {
        return HttpUtils.connection(url, username, passwd);
    }

}
