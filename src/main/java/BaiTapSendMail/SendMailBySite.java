package BaiTapSendMail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendMailBySite {
    public static void main(String[] args) {
        String host = "smtp.gmail.com";
        final String user = "truonganhduc450@gmail.com";
        final String pass = "anhduc23121997";

//        String sendTo = "truonganhduc321@gmail.com;
        String sendTo = "tbtoanit@gmail.com";

        Properties properties = new Properties();
        properties.put("mail.smtp.host",host);
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(user,pass);
            }
        });

        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(sendTo));
            message.setSubject("Java send mail Test");
            message.setText("Truong Anh Duc gui mail bai tap!!!");

            Transport.send(message);

            System.out.println("message sent successfully...");


        }catch (MessagingException e){
            e.printStackTrace();
        }
    }
}
