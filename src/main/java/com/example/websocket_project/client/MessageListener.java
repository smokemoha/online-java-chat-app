package com.example.websocket_project.client;

import com.example.websocket_project.Message;

import java.util.ArrayList;

public interface MessageListener {
	
    void onMessageRecieve(Message message);
    
    void onActiveUsersUpdated(ArrayList<String> users);
}
