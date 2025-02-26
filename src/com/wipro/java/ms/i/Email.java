package com.wipro.java.ms.i;

//Class that sends reports via email (only implements email sending)
class Email implements EmailReport {
 @Override
 public void sendReportByEmail() {
     System.out.println("Sending report via Email...");
 }
}
