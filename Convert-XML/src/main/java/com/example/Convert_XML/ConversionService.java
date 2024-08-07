package com.example.Convert_XML;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;

@Service
public class ConversionService {

    public byte[] convertXlsxToXml(MultipartFile file) {
        try (InputStream is = file.getInputStream(); Workbook workbook = new XSSFWorkbook(is)) {
            Sheet sheet = workbook.getSheetAt(0);
            Persons persons = new Persons();

            for (Row row : sheet) {
                if (row.getRowNum() == 0) {
                    continue; // Skip header row
                }
                Person person = new Person();
                person.setName(row.getCell(0).getStringCellValue());
                person.setAge((int) row.getCell(1).getNumericCellValue());
                person.setCity(row.getCell(2).getStringCellValue());
                persons.getPersons().add(person);
            }

            JAXBContext jaxbContext = JAXBContext.newInstance(Persons.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            marshaller.marshal(persons, baos);

            return baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
