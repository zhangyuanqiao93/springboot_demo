package com.tk.spring_boot_mail.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create By Bridge On 2017/9/6
 * Function:
 * Description:
 */

@RestController
public class MailController {

    @GetMapping(value = "/mail")
    public String getMailAddress(){
        return "spring_boot_mail address";
    }
}
