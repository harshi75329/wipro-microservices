package com.wipro.java.ms.i;

//Class that generates a PDF report (only implements report generation)
class PdfReport implements ReportGeneration {
 @Override
 public void generateReport() {
     System.out.println("Generating PDF report...");
 }
}