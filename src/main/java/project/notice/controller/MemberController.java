package project.notice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import project.notice.dto.MemberForm;
import project.notice.service.MemberService;

import javax.validation.Valid;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("member")
public class MemberController {
    private final MemberService memberService;
    // 회원가입
    @GetMapping
    public String signUp(@Valid MemberForm memberForm, Errors errors, Model model){
        if(errors.hasErrors()) {
            model.addAttribute("memberForm", memberForm);

            Map<String, String> validatorResult = memberService.validateHandling(errors);
            for(String key : validatorResult.keySet()) {
                model.addAttribute(key, validatorResult.get(key));
            }
            return "/signup";
        }
        return "redirect:/login";
    }
}
