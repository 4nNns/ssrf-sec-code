package com.ha0l.ssrfseccode.controller;

import com.ha0l.ssrfseccode.utils.HttpUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ssrf")
public class SsrfController {

    @GetMapping("/urlConnectionVuln")
    public String urlConnectionVuln(String url) {
        return HttpUtils.URLConnection(url);
    }


}
