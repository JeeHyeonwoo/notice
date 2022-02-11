package project.notice.mapper;

import org.apache.ibatis.annotations.Mapper;
import project.notice.dto.Board;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<Board> boardList(Long corp_id);
}
