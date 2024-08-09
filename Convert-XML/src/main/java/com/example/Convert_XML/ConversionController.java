package com.example.Convert_XML;


import com.example.Convert_XML.Entities.RespenceStaticInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.validation.Valid;
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
    public HttpEntity<ByteArrayResource> convertXlsxToXml(@RequestParam("file") MultipartFile file,@RequestPart("item") @Valid String itemJson) throws JsonProcessingException {

            // Convertir le JSON reçu en un objet RespenceStaticInfo
            ObjectMapper objectMapper = new ObjectMapper();
            RespenceStaticInfo item = objectMapper.readValue(itemJson, RespenceStaticInfo.class);

            // Traitez le fichier et l'objet RespenceStaticInfo ici

            System.out.println("Conversion réussie");
            byte[] xmlData = conversionService.convertXlsxToXml(file,item);


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
