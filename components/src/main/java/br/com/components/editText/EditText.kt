package br.com.components.editText

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import br.com.components.R
import kotlinx.android.synthetic.main.component_edit_text.view.*

class EditText @JvmOverloads constructor(
	context: Context,
	attrs: AttributeSet? = null
) : RelativeLayout(context, attrs) {

	init {
		LayoutInflater.from(context)
			.inflate(R.layout.component_edit_text, this, true)

		attrs?.let {
			val typedArray = context.obtainStyledAttributes(it, R.styleable.EditText, 0, 0)

			val isEnabled = typedArray.getBoolean(R.styleable.EditText_enabled, true)
			setEnabled(isEnabled)

			val hint = typedArray.getText(R.styleable.EditText_hint)
			setHint(hint)

			val text = typedArray.getText(R.styleable.EditText_text)
			setText(text)

			val bottomLabel = typedArray.getText(R.styleable.EditText_bottomLabel)
			setBottomLabel(bottomLabel)

			typedArray.recycle()
		}
	}

	override fun isEnabled(): Boolean {
		return textInputLayout.isEnabled
	}

	override fun setEnabled(enabled: Boolean) {
		textInputLayout.isEnabled = enabled
	}

	fun setHint(text: CharSequence?) {
		if (text != null) textInputLayout.hint = text
	}

	fun setText(text: CharSequence?) {
		if (text != null) textInputEditText.setText(text)
	}

	fun setBottomLabel(text: CharSequence?) {
		if (text != null) {
			textViewBottomLabel.text = text
			textViewBottomLabel.visibility = View.VISIBLE
		} else {
			textViewBottomLabel.visibility = View.GONE
		}
	}

}