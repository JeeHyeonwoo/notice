package project.notice.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
public class NoticeDto extends Paging{
    private Long notice_Id;

    @NotEmpty(message = "제목을 입력해주세요")
    private String title;

    @NotEmpty(message = "내용을 입력해주세요")
    private String contents;

    private Date create_Date;

    private int view;

}
