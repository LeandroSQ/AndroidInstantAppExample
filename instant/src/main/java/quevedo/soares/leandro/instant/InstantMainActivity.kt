package quevedo.soares.leandro.instant

import android.content.Context
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import android.view.View

class InstantMainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_instant_main)
	}

	fun vibrateDevice(view: View) {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
			getSystemService(Vibrator::class.java).vibrate(70)
		} else {
			(getSystemService(Context.VIBRATOR_SERVICE) as Vibrator).vibrate(70)
		}
	}
}
