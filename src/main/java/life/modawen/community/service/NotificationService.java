package life.modawen.community.service;

import life.modawen.community.dto.PaginationDTO;
import life.modawen.community.mapper.NotificationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Autowired
    private NotificationMapper notificationMapper;

    public PaginationDTO list(Long id, Integer page, Integer size) {
        return null;
    }
}
