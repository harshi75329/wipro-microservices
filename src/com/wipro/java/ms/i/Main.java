package com.wipro.java.ms.i;

public class Main {
    public static void main(String[] args) {
        ReportGeneration pdfReport = new PdfReport();
        pdfReport.generateReport(); // Generating PDF report...

        EmailReport emailSender = new Email();
        emailSender.sendReportByEmail(); // Sending report via Email...
    }
}