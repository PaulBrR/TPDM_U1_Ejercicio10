package paulbriseno.ittepi.edu.mx.tpdm_u1_ejercicio10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import paulbriseno.ittepi.edu.mx.tpdm_u1_ejercicio10.R.drawable.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var usuario: EditText? = null
    var contrase: EditText? = null
    var boton: Button? = null
    var img: ImageView? = null
    var vectorusario = Vector<String>()
    var vectorcontrase = Vector<String>()
    var contador =0

    //var usuariopol :ImageView?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        vectorusario.add(0, "pol")
        vectorusario.add(1, "gary")
        vectorusario.add(2, "falco")
        vectorusario.add(3, "rafiki")
        vectorusario.add(4, "tamarindo")

        vectorcontrase.add(0, "123")
        vectorcontrase.add(1, "456")
        vectorcontrase.add(2, "789")
        vectorcontrase.add(3, "852")
        vectorcontrase.add(4, "963")

        usuario = findViewById(R.id.usuario)
        contrase = findViewById(R.id.contrasena)
        boton = findViewById(R.id.autenticar)
        img=findViewById(R.id.ico1)

        img?.setBackgroundResource(R.drawable.iconoa2)
        //usuariopol=findViewById(R.drawable.iconoa4)

        boton?.setOnClickListener {

            var log=false
            var requestUsuario=usuario?.text.toString()
            var requestContrase=contrase?.text.toString()
            (0..(vectorusario.size-1)).forEach {

                var usariocheck =vectorusario.get(it)
                var contraseCheck=vectorcontrase.get(it)
                if (requestUsuario.equals(usariocheck)&& requestContrase.equals(contraseCheck)){
                    val alerta=AlertDialog.Builder(this)
                    val show = alerta.setTitle("ACEPTADO").setMessage("Bienvenido").show()
                    log=true
                    if (it==0){
                        img?.setBackgroundResource(R.drawable.iconoa4)

                    }else if (it==1){

                        img?.setBackgroundResource(R.drawable.iconoa5)
                    }else if (it==2){
                        img?.setBackgroundResource(R.drawable.iconob3)
                    }else if (it==3){
                        img?.setBackgroundResource(R.drawable.iconob5)
                    }else if (it==4){
                        img?.setBackgroundResource(R.drawable.iconob7)
                    }

                }
            }
            if(!log){
                img?.setBackgroundResource(R.drawable.iconoa2)
                contador++
                val alerta = AlertDialog.Builder(this)
                alerta.setTitle("Denegado").setMessage("Intentenuevamente  \n Intentos Restantes:  " + (3-contador) ).show()
                if (contador==3){
                    finish()
                }


            }
            log=false
            usuario?.setText("")
            contrase?.setText("")


        }
    }
}





