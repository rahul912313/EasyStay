/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Email;

import Business.User.User;
import java.util.Properties;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author RAHUL
 */
public class EmailNotification {

    public void SendEmailOfNotification(User userDetails, String facility) {
        final String username = "staywith.easystay@gmail.com";
        final String password = "bginidxnttpfiaaz";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username)); // Use the authenticated email
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(userDetails.getEmailId()));
            message.setSubject("Your Booking Confirmation: " + facility + " Facility");
            message.setText("Dear " + userDetails.getFirstName() + " " + userDetails.getLastName() + ",\n\n" +
                "We’re thrilled to confirm your booking for the " + facility + " facility at our resort! 🏖️\n\n" +
                "Here’s what you can look forward to:\n" +
                "- Exceptional service\n" +
                "- Relaxation and comfort\n" +
                "- A memorable experience tailored just for you\n\n" +
                "If you have any special requests or need assistance, don’t hesitate to contact us. We’re here to make your stay unforgettable!\n\n" +
                "Thank you for choosing us. We can’t wait to welcome you soon!\n\n" +
                "Warm regards,\n" +
                "The EasyStay Team");

            Transport.send(message);
            System.out.println("Email sent successfully!");

        } catch (MessagingException e) {
            e.printStackTrace(); // Useful for debugging
        }
    }
}
