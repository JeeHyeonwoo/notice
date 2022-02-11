package project.notice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.notice.dto.Board;
import project.notice.mapper.BoardMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper boardMapper;

    public List<Board> list(Long corp_id){
        return boardMapper.boardList(corp_id);
    }

}
