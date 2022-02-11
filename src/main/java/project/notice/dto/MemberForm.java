package project.notice.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class MemberForm {
    private Long id;

    @NotBlank(message = "필수입력란 입니다.")
    @Length(max=2_64, message = "길이 제한 2~64")
    private String name;

    private int age;

    @NotBlank(message = "필수입력란 입니다.")
    @Email
    private String email;

    @NotBlank(message = "필수입력란 입니다.")
    private String member_id;

    @NotBlank(message = "필수입력란 입니다.")
    private String password;

    @NotBlank(message = "필수입력란 입니다.")
    private String checkPassword;
}
