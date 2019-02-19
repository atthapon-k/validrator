package com.atthapon.alphonsevalidator.rules

import com.atthapon.alphonsevalidator.common.AlphoneseValidator

class NonEmptyRule(var errorMsg: String = AlphoneseValidator.errorMessage.getNonEmpty()): BaseRule {
    override fun validate(text: String): Boolean = !text.isEmpty()

    override fun getErrorMessage(): String = errorMsg

    override fun setError(msg: String) {
        errorMsg = msg
    }
}