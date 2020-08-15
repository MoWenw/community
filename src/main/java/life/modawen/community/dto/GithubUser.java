package life.modawen.community.dto;

import lombok.Data;

@Data
//是GithubProvider返回值
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatar_url;
}
