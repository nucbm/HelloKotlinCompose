package ro.calculmobil.hellocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Nu exista fisier XML de layout: interfata este descrisa in cod.
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    EcranSalut()
                }
            }
        }
    }
}

@Composable
fun EcranSalut() {
    // Starea ecranului. Cand se schimba, Compose redeseneaza singur
    // partile care o folosesc (recompozitie).
    var contor by remember { mutableIntStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (contor == 0) {
            Salut(nume = "World")
        } else {
            Text(
                text = "Apăsări: $contor",
                style = MaterialTheme.typography.headlineMedium
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Butonul nu modifica textul; modifica doar starea.
        Button(onClick = { contor++ }) {
            Text("Apasă-mă")
        }
    }
}

@Composable
fun Salut(nume: String) {
    Text(
        text = "Hello, $nume!",
        style = MaterialTheme.typography.headlineMedium
    )
}

// Previzualizare in Android Studio, fara a rula aplicatia.
@Preview(showBackground = true)
@Composable
fun EcranSalutPreview() {
    MaterialTheme {
        EcranSalut()
    }
}
