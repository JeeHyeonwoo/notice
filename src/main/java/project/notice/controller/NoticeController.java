package project.notice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import project.notice.dto.NoticeDto;
import project.notice.service.NoticeService;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "notice")
@RequiredArgsConstructor
public class NoticeController {
    private final NoticeService noticeService;

    @GetMapping("")
    public String main(){
        return "index";
    }

    @GetMapping("/create")
    public String create(){
        return "notice/create";
    }

    /**
     * 게시물 작성
     * */
    @PostMapping("/create")
    public String create(NoticeDto notice) {
        noticeService.create(notice);
        return "redirect:/index";
    }

    /**
     * 리스트
     * */
    @GetMapping("/list")
    public String list(NoticeDto noticeDto, Model model) {
        model.addAttribute("noticeList", noticeService.list(noticeDto));
        return "/fragments/notice/list";
    }

    @GetMapping("/{notice_id}")
    public String view(@PathVariable("notice_id") Long notice_id, Model model){
        model.addAttribute("notice", noticeService.view(notice_id));
        return "/fragments/notice/view";
    }
    /** 수정 */
    @PostMapping("/update/{notice_id}")
    public ResponseEntity<?> update(){

        return new ResponseEntity<>("{}", HttpStatus.OK);
    }

    @GetMapping("/delete/{notice_id}")
    public ResponseEntity<?> delete(@PathVariable("notice_id") Long notice_id) {
        try{
            noticeService.delete(notice_id);
        }catch (Exception e){
            return new ResponseEntity<>("{result : 해당 값이 존재하지 않습니다}", HttpStatus.NOT_FOUND);
        };
        return new ResponseEntity<>("{result : 게시물을 삭제하였습니다}", HttpStatus.OK);
    }

}
