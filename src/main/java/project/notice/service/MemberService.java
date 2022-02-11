package project.notice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import project.notice.dto.MemberForm;
import project.notice.mapper.MemberMapper;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberMapper memberMapper;

    /** 회원가입 유효성 검사 */
    public Map<String, String> validateHandling(Errors errors) {
        Map<String, String> validatorResult = new HashMap<>();

        for(FieldError error: errors.getFieldErrors()) {
            String valiedKeyName = String.format("valid_%s", error.getField());
            validatorResult.put(valiedKeyName, error.getDefaultMessage());
        }
        return validatorResult;
    }

    public String signUp(){

        return "";
    }


}
