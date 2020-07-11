package com.trios.trivia.data;

import com.trios.trivia.model.Question;

import java.util.ArrayList;

public interface AnswerListAsyncResponse {

    void processFinished(ArrayList<Question> questionArrayList);

}
