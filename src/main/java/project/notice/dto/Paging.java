package project.notice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Paging {
    private int currentPageNo = 1;
    private int recordsPerPage = 10;
    private int pageSize = 10;
    private String searchKeyword;
    private String searchType;

    /*public int getStartPage() {
        return (currentPageNo - 1) * recordsPerPage;
    }*/
}
