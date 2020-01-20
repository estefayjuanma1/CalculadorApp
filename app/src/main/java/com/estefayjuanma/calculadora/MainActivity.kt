package com.estefayjuanma.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import com.estefayjuanma.calculadora.Constantes.Constantes.Companion.SPACE
import com.estefayjuanma.calculadora.Constantes.Constantes.Companion.SUMA
import com.estefayjuanma.calculadora.Constantes.Constantes.Companion.RESTA
import com.estefayjuanma.calculadora.Constantes.Constantes.Companion.MULTI
import com.estefayjuanma.calculadora.Constantes.Constantes.Companion.DIV
import com.estefayjuanma.calculadora.Constantes.Constantes.Companion.CERO
import com.estefayjuanma.calculadora.Constantes.Constantes.Companion.UNO
import com.estefayjuanma.calculadora.Constantes.Constantes.Companion.DOS
import com.estefayjuanma.calculadora.Constantes.Constantes.Companion.TRES
import com.estefayjuanma.calculadora.Constantes.Constantes.Companion.CUATRO
import com.estefayjuanma.calculadora.Constantes.Constantes.Companion.CINCO
import com.estefayjuanma.calculadora.Constantes.Constantes.Companion.ERROR
import com.estefayjuanma.calculadora.Constantes.Constantes.Companion.SEIS
import com.estefayjuanma.calculadora.Constantes.Constantes.Companion.SIETE
import com.estefayjuanma.calculadora.Constantes.Constantes.Companion.OCHO
import com.estefayjuanma.calculadora.Constantes.Constantes.Companion.NUEVE


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var numero= 0
        var numero2= 0
        var operacion = CERO
        var resultado = 0
        var resultadoflotante = 0.0
        var calcmodule = 0.0
        var resultados = ""
        var bloqueo = 0
        var bloqueo2= 0
        var blo = 0
        var blo2 = 0
        var bandera= 0
        var contador= 0
        var i= 0
        var j= 0
        var numbers1: Array<Int> = arrayOf(0,0,0,0,0)
        var numbers2: Array<Int> = arrayOf(0,0,0,0,0)


        button_mas.setOnClickListener {

            operacion = SUMA
            Tv_Dos.text = numero.toString() + SPACE + operacion
            bandera=1
            contador=0
            bloqueo=0

        }
        button_menos.setOnClickListener {

            operacion = RESTA
            Tv_Dos.text = numero.toString() + SPACE + operacion
            bandera=1
            contador=0
            bloqueo=0

        }
        button_por.setOnClickListener {

            operacion = MULTI
            Tv_Dos.text = numero.toString() + SPACE + operacion
            bandera=1
            contador=0
            bloqueo=0

        }
        button_division.setOnClickListener {

            operacion = DIV
            Tv_Dos.text = numero.toString() + SPACE + operacion
            bandera=1
            contador=0
            bloqueo=0

        }



        button_0.setOnClickListener {
            if(bandera==0){
                if (blo <= 4) {
                    contador++
                    numbers1[i] = 0
                    blo++
                }
                if (i > 4) {
                    bloqueo = 1
                } else if (contador == 1 && bloqueo == 0) {
                    numero = numbers1[0]
                    Tv_Dos.text = numero.toString()
                } else if (contador == 2 && bloqueo == 0) {
                    numero = numbers1[0] * 10 + numbers1[1]
                    Tv_Dos.text = numero.toString()
                } else if (contador == 3 && bloqueo == 0) {
                    numero = numbers1[0] * 100 + numbers1[1] * 10 + numbers1[2]
                    Tv_Dos.text = numero.toString()
                } else if (contador == 4 && bloqueo == 0) {
                    numero = numbers1[0] * 1000 + numbers1[1] * 100 + numbers1[2] * 10 + numbers1[3]
                    Tv_Dos.text = numero.toString()
                } else if (contador == 5 && bloqueo == 0) {
                    numero =
                        numbers1[0] * 10000 + numbers1[1] * 1000 + numbers1[2] * 100 + numbers1[3] * 10 + numbers1[4]
                    Tv_Dos.text = numero.toString()
                }
                i++
            }

            if(bandera==1){
                if(blo2<=4) {
                    contador++
                    numbers2[j] = 0
                    blo2++
                }
                if(j>4){
                    bloqueo2=1
                }
                else if(contador==1 && bloqueo2==0){
                    numero2=numbers2[0]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==2 && bloqueo2==0){
                    numero2=numbers2[0]*10+numbers2[1]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==3 && bloqueo2==0){
                    numero2=numbers2[0]*100+numbers2[1]*10+numbers2[2]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==4 && bloqueo2==0){
                    numero2=numbers2[0]*1000+numbers2[1]*100+numbers2[2]*10+numbers2[3]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==5 && bloqueo2==0){
                    numero2=numbers2[0]*10000+numbers2[1]*1000+numbers2[2]*100+numbers2[3]*10+numbers2[4]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                j++

            }



        }


        button_1.setOnClickListener {
         if(bandera==0){
            if (blo <= 4) {
                contador++
                numbers1[i] = 1
                blo++
            }
            if (i > 4) {
                bloqueo = 1
            } else if (contador == 1 && bloqueo == 0) {
                numero = numbers1[0]
                Tv_Dos.text = numero.toString()
            } else if (contador == 2 && bloqueo == 0) {
                numero = numbers1[0] * 10 + numbers1[1]
                Tv_Dos.text = numero.toString()
            } else if (contador == 3 && bloqueo == 0) {
                numero = numbers1[0] * 100 + numbers1[1] * 10 + numbers1[2]
                Tv_Dos.text = numero.toString()
            } else if (contador == 4 && bloqueo == 0) {
                numero = numbers1[0] * 1000 + numbers1[1] * 100 + numbers1[2] * 10 + numbers1[3]
                Tv_Dos.text = numero.toString()
            } else if (contador == 5 && bloqueo == 0) {
                numero =
                    numbers1[0] * 10000 + numbers1[1] * 1000 + numbers1[2] * 100 + numbers1[3] * 10 + numbers1[4]
                Tv_Dos.text = numero.toString()
            }
            i++
        }

            if(bandera==1){
                if(blo2<=4) {
                    contador++
                    numbers2[j] = 1
                    blo2++
                }
                if(j>4){
                    bloqueo2=1
                }
                else if(contador==1 && bloqueo2==0){
                    numero2=numbers2[0]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==2 && bloqueo2==0){
                    numero2=numbers2[0]*10+numbers2[1]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==3 && bloqueo2==0){
                    numero2=numbers2[0]*100+numbers2[1]*10+numbers2[2]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==4 && bloqueo2==0){
                    numero2=numbers2[0]*1000+numbers2[1]*100+numbers2[2]*10+numbers2[3]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==5 && bloqueo2==0){
                    numero2=numbers2[0]*10000+numbers2[1]*1000+numbers2[2]*100+numbers2[3]*10+numbers2[4]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                j++

            }


        }
        button_2.setOnClickListener {
        if(bandera==0) {
            if (blo <= 4) {
                contador++
                numbers1[i] = 2
                blo++
            }
            if (i > 4) {
                bloqueo = 1
            } else if (contador == 1 && bloqueo == 0) {
                numero = numbers1[0]
                Tv_Dos.text = numero.toString()
            } else if (contador == 2 && bloqueo == 0) {
                numero = numbers1[0] * 10 + numbers1[1]
                Tv_Dos.text = numero.toString()
            } else if (contador == 3 && bloqueo == 0) {
                numero = numbers1[0] * 100 + numbers1[1] * 10 + numbers1[2]
                Tv_Dos.text = numero.toString()
            } else if (contador == 4 && bloqueo == 0) {
                numero = numbers1[0] * 1000 + numbers1[1] * 100 + numbers1[2] * 10 + numbers1[3]
                Tv_Dos.text = numero.toString()
            } else if (contador == 5 && bloqueo == 0) {
                numero =
                    numbers1[0] * 10000 + numbers1[1] * 1000 + numbers1[2] * 100 + numbers1[3] * 10 + numbers1[4]
                Tv_Dos.text = numero.toString()
            }
            if (i == 2) {
                Tv_Dos.text = numero.toString()
            }
            i++

        }

            if(bandera==1){
                if(blo2<=4) {
                    contador++
                    numbers2[j] = 2
                    blo2++
                }
                if(j>4){
                    bloqueo2=1
                }
                else if(contador==1 && bloqueo2==0){
                    numero2=numbers2[0]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==2 && bloqueo2==0){
                    numero2=numbers2[0]*10+numbers2[1]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==3 && bloqueo2==0){
                    numero2=numbers2[0]*100+numbers2[1]*10+numbers2[2]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==4 && bloqueo2==0){
                    numero2=numbers2[0]*1000+numbers2[1]*100+numbers2[2]*10+numbers2[3]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==5 && bloqueo2==0){
                    numero2=numbers2[0]*10000+numbers2[1]*1000+numbers2[2]*100+numbers2[3]*10+numbers2[4]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                j++

            }


        }

        button_3.setOnClickListener {
        if(bandera==0) {
            if (blo <= 4) {
                contador++
                numbers1[i] = 3
                blo++
            }
            if (i > 4) {
                bloqueo = 1
            } else if (contador == 1 && bloqueo == 0) {
                numero = numbers1[0]
                Tv_Dos.text = numero.toString()
            } else if (contador == 2 && bloqueo == 0) {
                numero = numbers1[0] * 10 + numbers1[1]
                Tv_Dos.text = numero.toString()
            } else if (contador == 3 && bloqueo == 0) {
                numero = numbers1[0] * 100 + numbers1[1] * 10 + numbers1[2]
                Tv_Dos.text = numero.toString()
            } else if (contador == 4 && bloqueo == 0) {
                numero = numbers1[0] * 1000 + numbers1[1] * 100 + numbers1[2] * 10 + numbers1[3]
                Tv_Dos.text = numero.toString()
            } else if (contador == 5 && bloqueo == 0) {
                numero = numbers1[0]
                numero =
                    numbers1[0] * 10000 + numbers1[1] * 1000 + numbers1[2] * 100 + numbers1[3] * 10 + numbers1[4]
                Tv_Dos.text = numero.toString()
            }
            if (i == 2) {
                Tv_Dos.text = numero.toString()
            }
            i++
        }


            if(bandera==1){
                if(blo2<=4) {
                    contador++
                    numbers2[j] = 3
                    blo2++
                }
                if(j>4){
                    bloqueo2=1
                }
                else if(contador==1 && bloqueo2==0){
                    numero2=numbers2[0]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==2 && bloqueo2==0){
                    numero2=numbers2[0]*10+numbers2[1]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==3 && bloqueo2==0){
                    numero2=numbers2[0]*100+numbers2[1]*10+numbers2[2]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==4 && bloqueo2==0){
                    numero2=numbers2[0]*1000+numbers2[1]*100+numbers2[2]*10+numbers2[3]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==5 && bloqueo2==0){
                    numero2=numbers2[0]*10000+numbers2[1]*1000+numbers2[2]*100+numbers2[3]*10+numbers2[4]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                j++

            }

        }


        button_4.setOnClickListener {
         if(bandera==0) {
             if (blo <= 4) {
                 contador++
                 numbers1[i] = 4
                 blo++
             }
             if (i > 4) {
                 bloqueo = 1
             } else if (contador == 1 && bloqueo == 0) {
                 numero = numbers1[0]
                 Tv_Dos.text = numero.toString()
             } else if (contador == 2 && bloqueo == 0) {
                 numero = numbers1[0] * 10 + numbers1[1]
                 Tv_Dos.text = numero.toString()
             } else if (contador == 3 && bloqueo == 0) {
                 numero = numbers1[0] * 100 + numbers1[1] * 10 + numbers1[2]
                 Tv_Dos.text = numero.toString()
             } else if (contador == 4 && bloqueo == 0) {
                 numero = numbers1[0] * 1000 + numbers1[1] * 100 + numbers1[2] * 10 + numbers1[3]
                 Tv_Dos.text = numero.toString()
             } else if (contador == 5 && bloqueo == 0) {
                 numero =
                     numbers1[0] * 10000 + numbers1[1] * 1000 + numbers1[2] * 100 + numbers1[3] * 10 + numbers1[4]
                 Tv_Dos.text = numero.toString()
             }
             if (i == 2) {
                 Tv_Dos.text = numero.toString()
             }
             i++
         }

            if(bandera==1){
                if(blo2<=4) {
                    contador++
                    numbers2[j] = 4
                    blo2++
                }
                if(j>4){
                    bloqueo2=1
                }
                else if(contador==1 && bloqueo2==0){
                    numero2=numbers2[0]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==2 && bloqueo2==0){
                    numero2=numbers2[0]*10+numbers2[1]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==3 && bloqueo2==0){
                    numero2=numbers2[0]*100+numbers2[1]*10+numbers2[2]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==4 && bloqueo2==0){
                    numero2=numbers2[0]*1000+numbers2[1]*100+numbers2[2]*10+numbers2[3]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==5 && bloqueo2==0){
                    numero2=numbers2[0]*10000+numbers2[1]*1000+numbers2[2]*100+numbers2[3]*10+numbers2[4]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                j++

            }

        }


        button_5.setOnClickListener {
          if(bandera==0) {
              if (blo <= 4) {
                  contador++
                  numbers1[i] = 5
                  blo++
              }
              if (i > 4) {
                  bloqueo = 1
              } else if (contador == 1 && bloqueo == 0) {
                  numero = numbers1[0]
                  Tv_Dos.text = numero.toString()
              } else if (contador == 2 && bloqueo == 0) {
                  numero = numbers1[0] * 10 + numbers1[1]
                  Tv_Dos.text = numero.toString()
              } else if (contador == 3 && bloqueo == 0) {
                  numero = numbers1[0] * 100 + numbers1[1] * 10 + numbers1[2]
                  Tv_Dos.text = numero.toString()
              } else if (contador == 4 && bloqueo == 0) {
                  numero = numbers1[0] * 1000 + numbers1[1] * 100 + numbers1[2] * 10 + numbers1[3]
                  Tv_Dos.text = numero.toString()
              } else if (contador == 5 && bloqueo == 0) {
                  numero =
                      numbers1[0] * 10000 + numbers1[1] * 1000 + numbers1[2] * 100 + numbers1[3] * 10 + numbers1[4]
                  Tv_Dos.text = numero.toString()
              }
              i++
          }

            if(bandera==1){
                if(blo2<=4) {
                    contador++
                    numbers2[j] = 5
                    blo2++
                }
                if(j>4){
                    bloqueo2=1
                }
                else if(contador==1 && bloqueo2==0){
                    numero2=numbers2[0]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==2 && bloqueo2==0){
                    numero2=numbers2[0]*10+numbers2[1]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==3 && bloqueo2==0){
                    numero2=numbers2[0]*100+numbers2[1]*10+numbers2[2]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==4 && bloqueo2==0){
                    numero2=numbers2[0]*1000+numbers2[1]*100+numbers2[2]*10+numbers2[3]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==5 && bloqueo2==0){
                    numero2=numbers2[0]*10000+numbers2[1]*1000+numbers2[2]*100+numbers2[3]*10+numbers2[4]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                j++

            }

        }


        button_6.setOnClickListener {
           if(bandera==0) {
               if (blo <= 4) {
                   contador++
                   numbers1[i] = 6
                   blo++
               }
               if (i > 4) {
                   bloqueo = 1
               } else if (contador == 1 && bloqueo == 0) {
                   numero = numbers1[0]
                   Tv_Dos.text = numero.toString()
               } else if (contador == 2 && bloqueo == 0) {
                   numero = numbers1[0] * 10 + numbers1[1]
                   Tv_Dos.text = numero.toString()
               } else if (contador == 3 && bloqueo == 0) {
                   numero = numbers1[0] * 100 + numbers1[1] * 10 + numbers1[2]
                   Tv_Dos.text = numero.toString()
               } else if (contador == 4 && bloqueo == 0) {
                   numero = numbers1[0] * 1000 + numbers1[1] * 100 + numbers1[2] * 10 + numbers1[3]
                   Tv_Dos.text = numero.toString()
               } else if (contador == 5 && bloqueo == 0) {
                   numero =
                       numbers1[0] * 10000 + numbers1[1] * 1000 + numbers1[2] * 100 + numbers1[3] * 10 + numbers1[4]
                   Tv_Dos.text = numero.toString()
               }
               i++

           }
            if(bandera==1){
                if(blo2<=4) {
                    contador++
                    numbers2[j] = 6
                    blo2++
                }
                if(j>4){
                    bloqueo2=1
                }
                else if(contador==1 && bloqueo2==0){
                    numero2=numbers2[0]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==2 && bloqueo2==0){
                    numero2=numbers2[0]*10+numbers2[1]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==3 && bloqueo2==0){
                    numero2=numbers2[0]*100+numbers2[1]*10+numbers2[2]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==4 && bloqueo2==0){
                    numero2=numbers2[0]*1000+numbers2[1]*100+numbers2[2]*10+numbers2[3]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==5 && bloqueo2==0){
                    numero2=numbers2[0]*10000+numbers2[1]*1000+numbers2[2]*100+numbers2[3]*10+numbers2[4]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                j++

            }

        }


        button_7.setOnClickListener {
            if(bandera==0) {
                if (blo <= 4) {
                    contador++
                    numbers1[i] = 7
                    blo++
                }
                if (i > 4) {
                    bloqueo = 1
                } else if (contador == 1 && bloqueo == 0) {
                    numero = numbers1[0]
                    Tv_Dos.text = numero.toString()
                } else if (contador == 2 && bloqueo == 0) {
                    numero = numbers1[0] * 10 + numbers1[1]
                    Tv_Dos.text = numero.toString()
                } else if (contador == 3 && bloqueo == 0) {
                    numero = numbers1[0] * 100 + numbers1[1] * 10 + numbers1[2]
                    Tv_Dos.text = numero.toString()
                } else if (contador == 4 && bloqueo == 0) {
                    numero = numbers1[0] * 1000 + numbers1[1] * 100 + numbers1[2] * 10 + numbers1[3]
                    Tv_Dos.text = numero.toString()
                } else if (contador == 5 && bloqueo == 0) {
                    numero =
                        numbers1[0] * 10000 + numbers1[1] * 1000 + numbers1[2] * 100 + numbers1[3] * 10 + numbers1[4]
                    Tv_Dos.text = numero.toString()
                }
                if (i == 2) {
                    Tv_Dos.text = numero.toString()
                }
                i++
            }

            if(bandera==1){
                if(blo2<=4) {
                    contador++
                    numbers2[j] = 7
                    blo2++
                }
                if(j>4){
                    bloqueo2=1
                }
                else if(contador==1 && bloqueo2==0){
                    numero2=numbers2[0]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==2 && bloqueo2==0){
                    numero2=numbers2[0]*10+numbers2[1]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==3 && bloqueo2==0){
                    numero2=numbers2[0]*100+numbers2[1]*10+numbers2[2]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==4 && bloqueo2==0){
                    numero2=numbers2[0]*1000+numbers2[1]*100+numbers2[2]*10+numbers2[3]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==5 && bloqueo2==0){
                    numero2=numbers2[0]*10000+numbers2[1]*1000+numbers2[2]*100+numbers2[3]*10+numbers2[4]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                j++

            }

        }

        button_8.setOnClickListener {
            if(bandera==0) {
                if (blo <= 4) {
                    contador++
                    numbers1[i] = 8
                    blo++
                }
                if (i > 4) {
                    bloqueo = 1
                } else if (contador == 1 && bloqueo == 0) {
                    numero = numbers1[0]
                    Tv_Dos.text = numero.toString()
                } else if (contador == 2 && bloqueo == 0) {
                    numero = numbers1[0] * 10 + numbers1[1]
                    Tv_Dos.text = numero.toString()
                } else if (contador == 3 && bloqueo == 0) {
                    numero = numbers1[0] * 100 + numbers1[1] * 10 + numbers1[2]
                    Tv_Dos.text = numero.toString()
                } else if (contador == 4 && bloqueo == 0) {
                    numero = numbers1[0] * 1000 + numbers1[1] * 100 + numbers1[2] * 10 + numbers1[3]
                    Tv_Dos.text = numero.toString()
                } else if (contador == 5 && bloqueo == 0) {
                    numero =
                        numbers1[0] * 10000 + numbers1[1] * 1000 + numbers1[2] * 100 + numbers1[3] * 10 + numbers1[4]
                    Tv_Dos.text = numero.toString()
                }
                if (i == 2) {
                    Tv_Dos.text = numero.toString()
                }
                i++
            }

            if(bandera==1){
                if(blo2<=4) {
                    contador++
                    numbers2[j] = 8
                    blo2++
                }
                if(j>4){
                    bloqueo2=1
                }
                else if(contador==1 && bloqueo2==0){
                    numero2=numbers2[0]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==2 && bloqueo2==0){
                    numero2=numbers2[0]*10+numbers2[1]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==3 && bloqueo2==0){
                    numero2=numbers2[0]*100+numbers2[1]*10+numbers2[2]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==4 && bloqueo2==0){
                    numero2=numbers2[0]*1000+numbers2[1]*100+numbers2[2]*10+numbers2[3]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==5 && bloqueo2==0){
                    numero2=numbers2[0]*10000+numbers2[1]*1000+numbers2[2]*100+numbers2[3]*10+numbers2[4]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                j++

            }

        }

        button_9.setOnClickListener {
            if (bandera == 0){
                if (blo <= 4) {
                    contador++
                    numbers1[i] = 9
                    blo++
                }
            if (i > 4) {
                bloqueo = 1
            } else if (contador == 1 && bloqueo == 0) {
                numero = numbers1[0]
                Tv_Dos.text = numero.toString()
            } else if (contador == 2 && bloqueo == 0) {
                numero = numbers1[0] * 10 + numbers1[1]
                Tv_Dos.text = numero.toString()
            } else if (contador == 3 && bloqueo == 0) {
                numero = numbers1[0] * 100 + numbers1[1] * 10 + numbers1[2]
                Tv_Dos.text = numero.toString()
            } else if (contador == 4 && bloqueo == 0) {
                numero = numbers1[0] * 1000 + numbers1[1] * 100 + numbers1[2] * 10 + numbers1[3]
                Tv_Dos.text = numero.toString()
            } else if (contador == 5 && bloqueo == 0) {
                numero =
                    numbers1[0] * 10000 + numbers1[1] * 1000 + numbers1[2] * 100 + numbers1[3] * 10 + numbers1[4]
                Tv_Dos.text = numero.toString()
            }
            if (i == 2) {
                Tv_Dos.text = numero.toString()
            }
            i++
        }

            if(bandera==1){
                if(blo2<=4) {
                    contador++
                    numbers2[j] = 9
                    blo2++
                }
                if(j>4){
                    bloqueo2=1
                }
                else if(contador==1 && bloqueo2==0){
                    numero2=numbers2[0]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==2 && bloqueo2==0){
                    numero2=numbers2[0]*10+numbers2[1]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==3 && bloqueo2==0){
                    numero2=numbers2[0]*100+numbers2[1]*10+numbers2[2]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==4 && bloqueo2==0){
                    numero2=numbers2[0]*1000+numbers2[1]*100+numbers2[2]*10+numbers2[3]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                else if(contador==5 && bloqueo2==0){
                    numero2=numbers2[0]*10000+numbers2[1]*1000+numbers2[2]*100+numbers2[3]*10+numbers2[4]
                    Tv_Dos.text = numero.toString() + SPACE + operacion + SPACE + numero2.toString()
                }
                j++

            }

        }

        button_igual.setOnClickListener {
            if (operacion == SUMA) {
                resultado = numero + numero2
                resultados = resultado.toString()
                Tv_Dos.text = resultados



            } else if (operacion == RESTA) {
                resultado = numero - numero2
                resultados = resultado.toString()
                Tv_Dos.text = resultados



            } else if (operacion == MULTI) {
                resultado = numero * numero2
                resultados = resultado.toString()
                Tv_Dos.text = resultados



            } else if (operacion == DIV) {
                if(numero2 != 0) {
                    resultadoflotante = numero.toDouble() / numero2.toDouble()
                    calcmodule = numero.toDouble() % numero2.toDouble()
                    if(calcmodule == 0.0){
                        resultado=resultadoflotante.toInt()
                        resultados = resultado.toString()
                        Tv_Dos.text = resultados
                    }else{
                        resultados = resultadoflotante.toString()
                        Tv_Dos.text = resultados
                    }
                }else{
                    Tv_Dos.text = ERROR
                }

            }

            numero= 0
            numero2= 0
            operacion = CERO
            resultado= 0
            bloqueo = 0
            bloqueo2= 0
            blo = 0
            blo2 = 0
            bandera=0
            contador=0
            i=0
            j=0
            for (l in 0..4) {
                numbers1[l] = 0
                numbers2[l] = 0
            }
        }
        button_punto.setOnClickListener {
            numero= 0
            numero2= 0
            operacion = CERO
            resultado= 0
            bloqueo = 0
            bloqueo2= 0
            blo = 0
            blo2 = 0
            bandera=0
            contador=0
            i=0
            j=0
            for (l in 0..4) {
                numbers1[l] = 0
                numbers2[l] = 0
                }
            Tv_Dos.text = CERO
            }
    }
}

