package com.sangi.dao;

import java.util.List;

import com.sangi.model.Notification;

public interface NotificationDao {
List<Notification> getAllNotification(String email);//login id
void updateViewedStatus(int notificationId);
Notification getNotification(int id);
}
