package com.example.demo.mapper;

import java.util.List;

import com.example.demo.model.ChatMessage;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MessageMapper {
    @Select("SELECT * FROM MESSAGES")
    List<ChatMessage> getMessages();

    @Insert("INSERT INTO MESSAGES (username, messagetext) VALUES (#{username}, #{message})")
    @Options(useGeneratedKeys = true, keyProperty = "messageid")
    int addMessage(ChatMessage chatMessage);
}
