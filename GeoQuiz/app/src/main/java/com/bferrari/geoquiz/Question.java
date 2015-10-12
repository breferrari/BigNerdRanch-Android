package com.bferrari.geoquiz;

/**
 * Created by bferrari on 10/12/15.
 */

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(int mTextResId, boolean mAnswerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }
    
    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

}
