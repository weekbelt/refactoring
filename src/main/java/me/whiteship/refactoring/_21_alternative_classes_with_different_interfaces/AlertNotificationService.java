package me.whiteship.refactoring._21_alternative_classes_with_different_interfaces;

public record AlertNotificationService(AlertService alertService) implements NotificationService {

    @Override
    public void sendNotification(Notification notification) {
        AlertMessage alertMessage = new AlertMessage();
        alertMessage.setMessage(notification.getTitle());
        alertMessage.setFor(notification.getReceiver());
        alertService.add(alertMessage);
    }
}
