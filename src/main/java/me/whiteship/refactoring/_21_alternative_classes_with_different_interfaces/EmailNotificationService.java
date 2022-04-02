package me.whiteship.refactoring._21_alternative_classes_with_different_interfaces;

public record EmailNotificationService(EmailService emailService) implements NotificationService {

    @Override
    public void sendNotification(Notification notification) {
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setTitle(notification.getTitle());
        emailMessage.setTo(notification.getReceiver());
        emailMessage.setFrom(notification.getSender());
        emailService.sendEmail(emailMessage);
    }
}
