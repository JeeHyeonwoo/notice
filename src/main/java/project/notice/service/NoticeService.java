package project.notice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.notice.mapper.NoticeMapper;
import project.notice.dto.NoticeDto;

import javax.annotation.Resource;
import java.util.List;


@Service
@RequiredArgsConstructor
public class NoticeService {
    private final NoticeMapper noticeMapper;

    /**
     * 게시판 등록
     * */
    public void create(NoticeDto notice) {
        noticeMapper.save(notice);
    }

    /**
     * 리스트
     * */
    public List<NoticeDto> list(NoticeDto notice){
        return noticeMapper.list(notice);
    }

    /** 상세보기 */
    public NoticeDto view(Long notice_id){
        return noticeMapper.view(notice_id);
    }

    /** 삭제 */
    public void delete(Long notice_id) throws Exception {
        noticeMapper.delete(notice_id);
    }
}
