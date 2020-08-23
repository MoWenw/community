package life.modawen.community.mapper;

import life.modawen.community.model.Question;

public interface QuestionExtMapper {
    int incView(Question record);
    int incCommentCount(Question record);
}