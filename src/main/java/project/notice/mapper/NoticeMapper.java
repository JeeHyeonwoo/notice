package project.notice.mapper;


import org.apache.ibatis.annotations.Mapper;
import project.notice.dto.NoticeDto;

import java.util.List;

@Mapper
public interface NoticeMapper {
    void save(NoticeDto notice);
    List<NoticeDto> list(NoticeDto noticeDto);
    NoticeDto view(Long notice_id);
    void delete(Long notice_id);
}
