package com.sujith.jettrivia.repository

import com.sujith.jettrivia.model.QuestionItem
import com.sujith.jettrivia.network.QuestionApi
import javax.inject.Inject

class QuestionRepository @Inject constructor(private val api: QuestionApi) {
    private val listOfQuestions=ArrayList<QuestionItem>(emptyList())
}