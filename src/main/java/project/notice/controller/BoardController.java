package project.notice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import project.notice.dto.Board;
import project.notice.service.BoardService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RequiredArgsConstructor
@Controller
@RequestMapping("{corp_id}/board")
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/list")
    @ResponseBody
    public Map<String, Object> boardList(@PathVariable("corp_id") Long corp_id, Model model) {
        List<Board> boardList = boardService.list(corp_id);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("boardList", boardList);
        return map;
    }


}
