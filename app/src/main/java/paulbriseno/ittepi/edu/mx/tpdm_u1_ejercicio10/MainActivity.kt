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
        //usuariopol=findViewById(R.drawable.iconoa4)

        boton?.setOnClickListener {

            if(usuario?.text.toString()=="pol"&&contrase?.text.toString()=="123"){

                val alerta=AlertDialog.Builder(this)
                val show = alerta.setTitle("ACEPTADO").setMessage("Bienvenido").show()

                //img= iconoa4

                return@setOnClickListener
            }else {
                val alerta = AlertDialog.Builder(this)
                alerta.setTitle("Denegado").setMessage("Intentenuevamente").show()
            }

                if(usuario?.text.toString()=="gary"&&contrase?.text.toString()=="456"){

                    val alerta=AlertDialog.Builder(this)
                    val show = alerta.setTitle("ACEPTADO").setMessage("Bienvenido").show()

                    //img= iconoa4

                    return@setOnClickListener
                }else {
                    val alerta = AlertDialog.Builder(this)
                    alerta.setTitle("Denegado").setMessage("Intentenuevamente").show()
                }

                    if(usuario?.text.toString()=="falco"&&contrase?.text.toString()=="789"){

                        val alerta=AlertDialog.Builder(this)
                        val show = alerta.setTitle("ACEPTADO").setMessage("Bienvenido").show()

                        //img= iconoa4

                        return@setOnClickListener
                    }else {
                        val alerta = AlertDialog.Builder(this)
                        alerta.setTitle("Denegado").setMessage("Intentenuevamente").show()
                    }

                        if(usuario?.text.toString()=="rafiki"&&contrase?.text.toString()=="123"){

                            val alerta=AlertDialog.Builder(this)
                            val show = alerta.setTitle("ACEPTADO").setMessage("Bienvenido").show()

                            //img= iconoa4

                            return@setOnClickListener
                        }else {
                            val alerta = AlertDialog.Builder(this)
                            alerta.setTitle("Denegado").setMessage("Intentenuevamente").show()
                        }
                        
                            if(usuario?.text.toString()=="tamarindo"&&contrase?.text.toString()=="123"){

                                val alerta=AlertDialog.Builder(this)
                                val show = alerta.setTitle("ACEPTADO").setMessage("Bienvenido").show()

                                //img= iconoa4

                                return@setOnClickListener
                            }else {
                                val alerta = AlertDialog.Builder(this)
                                alerta.setTitle("Denegado").setMessage("Intentenuevamente").show()
                            }


        }
    }
}





