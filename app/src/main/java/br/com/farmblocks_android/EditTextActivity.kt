package br.com.farmblocks_android

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

class EditTextActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_edit_text)

		supportActionBar?.setDisplayHomeAsUpEnabled(true)
	}

	override fun onOptionsItemSelected(item: MenuItem): Boolean {
		if (item.itemId == android.R.id.home) onBackPressed()
		return super.onOptionsItemSelected(item)
	}

}
