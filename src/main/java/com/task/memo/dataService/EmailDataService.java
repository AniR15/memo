package com.task.memo.dataService;

import com.task.memo.entity.EmailDetails;

public interface EmailDataService {
    
    String sendSimpleMail(EmailDetails details);
 
    String sendMailWithAttachment(EmailDetails details);
}
