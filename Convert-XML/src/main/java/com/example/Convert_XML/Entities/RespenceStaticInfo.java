package com.example.Convert_XML.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.datatype.XMLGregorianCalendar;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespenceStaticInfo {
    protected int rentityId;
    protected String rentityBranch;
    protected SubmissionType submissionCode;
    protected ReportType reportCode;
    protected String entityReference;
    protected XMLGregorianCalendar submissionDate;
    protected String currencyCodeLocal;
    protected TPersonRegistrationInReport reportingPerson;
    protected String reason;
    protected String action;
    protected Report.ReportIndicators reportIndicators;
}

