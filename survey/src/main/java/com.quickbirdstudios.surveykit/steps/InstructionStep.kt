package com.quickbirdstudios.surveykit.steps

import android.content.Context
import androidx.annotation.StringRes
import com.quickbirdstudios.survey.R
import com.quickbirdstudios.surveykit.StepIdentifier
import com.quickbirdstudios.surveykit.backend.views.questions.IntroQuestionView
import com.quickbirdstudios.surveykit.result.StepResult

open class InstructionStep(
    @StringRes private val title: Int? = null,
    @StringRes private val text: Int? = null,
    @StringRes private val buttonText: Int = R.string.start,
    override var isOptional: Boolean = false,
    override val id: StepIdentifier = StepIdentifier()
) : Step {
    override fun createView(context: Context, stepResult: StepResult?) =
        IntroQuestionView(
            context = context,
            id = id,
            isOptional = isOptional,
            title = title,
            text = text,
            startButtonText = buttonText
        )

}