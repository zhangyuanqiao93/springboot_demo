package spring_boot_file_upload.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create By Bridge On 2017/9/19
 * Function:
 * Description:
 */

@RestController
public class FileUploadController {

    @GetMapping(value = "/fileupload")
    public String uploadFiles(){
        return "file Upload";
    }

}
