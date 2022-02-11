package project.notice.dto;

import lombok.Getter;

@Getter
public class Board {
    private Long id;
    private String desc;
    private String name;
    private int corp_id;
    private int type_id;
}
