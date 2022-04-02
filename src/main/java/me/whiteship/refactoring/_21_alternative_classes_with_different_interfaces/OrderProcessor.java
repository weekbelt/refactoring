package me.whiteship.refactoring._21_alternative_classes_with_different_interfaces;

public record OrderProcessor(NotificationService notificationService) {

    public void notifyShipping(Shipping shipping) {
        Notification notification = Notification.newNotification(shipping.getOrder() + " is Shipped")
            .receiver(shipping.getEmail())
            .sender("no-reply@whiteship.com");

        notificationService.sendNotification(notification);
    }
}
