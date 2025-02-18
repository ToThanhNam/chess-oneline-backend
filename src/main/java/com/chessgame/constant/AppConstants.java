package com.chessgame.constant;

public class AppConstants {
    public static final String API_VERSION = "/api/v1";
    public static final String AUTH_PATH = API_VERSION + "/auth";
    public static final String GAME_PATH = API_VERSION + "/games";
    
    // JWT Constants
    public static final long JWT_EXPIRATION = 86400000; // 1 day
    public static final String JWT_SECRET = "your-secret-key";
    
    // WebSocket Constants
    public static final String WEBSOCKET_ENDPOINT = "/ws";
    public static final String GAME_TOPIC = "/topic/game/";
    public static final String CHAT_TOPIC = "/topic/chat/";
} 