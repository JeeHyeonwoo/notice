package project.notice.mapper;

import org.apache.ibatis.annotations.Mapper;
import project.notice.dto.MemberForm;

@Mapper
public interface MemberMapper {
    void save(MemberForm memberForm);
}
