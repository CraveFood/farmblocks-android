package br.com.farmblocks_android

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		textViewTextStyles.setOnClickListener {
			startActivity(Intent(this, TextStylesActivity::class.java))
		}

		textViewButton.setOnClickListener {
			startActivity(Intent(this, ButtonsActivity::class.java))
		}

		textViewEditText.setOnClickListener {
			startActivity(Intent(this, EditTextActivity::class.java))
		}
	}
}
