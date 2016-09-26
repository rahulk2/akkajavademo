package service;

import com.google.inject.Singleton;

@Singleton
public class MessageHandlerService {

    public static final String BEAN_NAME = "messageHandlerService";

    public String substr(String message , int index){
        return "Happy bday "+message.substring(index);
    }

}
