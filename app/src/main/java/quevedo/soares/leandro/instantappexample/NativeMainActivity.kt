package quevedo.soares.leandro.instantappexample

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class NativeMainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_native_main)
	}

	fun openUrl (view: View) {
		val intent = Intent (Intent.ACTION_VIEW, Uri.parse ("http://leandrosoaresquevedo.com/exemplo"))
		startActivity(intent)
	}

}
