package com.example.Convert_XML;


import com.example.Convert_XML.Entities.Report;
import com.example.Convert_XML.Entities.RespenceStaticInfo;
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

    public byte[] convertXlsxToXml(MultipartFile file , RespenceStaticInfo item) {
        try (InputStream is = file.getInputStream(); Workbook workbook = new XSSFWorkbook(is)) {
            Sheet sheet = workbook.getSheetAt(0);
            Report report = new Report();

            report.setRentityId(item.getRentityId());
            report.setRentityBranch(item.getRentityBranch());
            report.setSubmissionCode(item.getSubmissionCode());
            report.setReportCode(item.getReportCode());
            report.setEntityReference(item.getEntityReference());
            report.setSubmissionDate(item.getSubmissionDate());
            report.setCurrencyCodeLocal(item.getCurrencyCodeLocal());
            report.setReportingPerson(item.getReportingPerson());
            report.setReason(item.getReason());
            report.setAction(item.getAction());


            for (Row row : sheet) {
                if (row.getRowNum() < 4) {
                    continue; // Skip header row
                }
                Report.Transaction transaction= new Report.Transaction();
                transaction.setTransactionnumber(row.getCell(3).getStringCellValue());
                transaction.setInternalRefNumber(row.getCell(3).getStringCellValue());
                transaction.setTransactionDescription("VIREMENTS");
                transaction.setDateTransaction(null);
                transaction.setTransmodeCode("2");
                transaction.setAmountLocal(100.00);
//                Report.Transaction.TFromMyClient tFromMyClient=new Report.Transaction.TFromMyClient();

                transaction.setTFromMyClient(null);
                transaction.setTToMyClient(null);
                report.getTransaction().add(transaction);
//                Person person = new Person();
//                person.setName(row.getCell(0).getStringCellValue());
//                person.setAge((int) row.getCell(1).getNumericCellValue());
//                person.setCity(row.getCell(2).getStringCellValue());
//                persons.getPersons().add(person);
            }

            report.setReportIndicators(item.getReportIndicators());

            JAXBContext jaxbContext = JAXBContext.newInstance(Report.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            marshaller.marshal(report, baos);

            return baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
