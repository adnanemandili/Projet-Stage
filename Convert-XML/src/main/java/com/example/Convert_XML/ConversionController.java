package com.example.Convert_XML;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/convert")
public class ConversionController {

    @Autowired
    private ConversionService conversionService;

    @PostMapping("/xlsx-to-xml")
    public HttpEntity<ByteArrayResource> convertXlsxToXml(@RequestParam("file") MultipartFile file) {
        byte[] xmlData = conversionService.convertXlsxToXml(file);
        if (xmlData == null) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

        ByteArrayResource resource = new ByteArrayResource(xmlData);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"output.xml\"")
                .contentType(MediaType.APPLICATION_XML)
                .contentLength(xmlData.length)
                .body(resource);
    }
}
