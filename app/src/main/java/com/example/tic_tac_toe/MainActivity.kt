package com.example.tic_tac_toe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var clickCount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        view as Button
        if(clickCount%2 == 1 && view.text == "") {
            view.text = "X"
            clickCount++
//            if (winner()) {
//                button1.isEnabled = false
//                button2.isEnabled = false
//                button3.isEnabled = false
//                button4.isEnabled = false
//                button5.isEnabled = false
//                button6.isEnabled = false
//                button7.isEnabled = false
//                button8.isEnabled = false
//                button9.isEnabled = false
//                clickCount = 0
//            } else if (clickCount == 9) {
//                winner.text = "CAT!"
//            }
        } else if (clickCount%2 == 0 && view.text == "") {
            view.text = "O"
            clickCount++
//            if (winner()) {
//                button1.isEnabled = false
//                button2.isEnabled = false
//                button3.isEnabled = false
//                button4.isEnabled = false
//                button5.isEnabled = false
//                button6.isEnabled = false
//                button7.isEnabled = false
//                button8.isEnabled = false
//                button9.isEnabled = false
//                clickCount = 0
//            } else if (clickCount == 9) {
//                winner.text = "CAT!"
//            }
        }
    }

    fun newGame(view: View) {
        button1.text = ""
        button2.text = ""
        button3.text = ""
        button4.text = ""
        button5.text = ""
        button6.text = ""
        button7.text = ""
        button8.text = ""
        button9.text = ""
        button1.isEnabled = true
        button2.isEnabled = true
        button3.isEnabled = true
        button4.isEnabled = true
        button5.isEnabled = true
        button6.isEnabled = true
        button7.isEnabled = true
        button8.isEnabled = true
        button9.isEnabled = true
        winner.text = ""
        clickCount = 0
    }

//    private fun winner(): Boolean {
//        //row 1
//        if (button1.text == button2.text && button1.text == button3.text) {
//            if (button1.text !== "") {
//                winner.text = button1.text.toString() + " Wins!"
//                return true
//            }
//        }
//        //row 2
//        else if (button4.text == button5.text && button4.text == button6.text) {
//            if (button4.text !== "") {
//                winner.text = button4.text.toString() + " Wins!"
//                return true
//            }
//        }
//        //row 3
//        else if (button7.text == button8.text && button7.text == button9.text) {
//            if (button7.text !== "") {
//                winner.text = button7.text.toString() + " Wins!"
//                return true
//            }
//        }
//        //col 1
//        else if (button1.text == button4.text && button1.text == button7.text) {
//            if (button1.text !== "") {
//                winner.text = button1.text.toString() + " Wins!"
//                return true
//            }
//        }
//        //col 2
//        else if (button2.text == button5.text && button2.text == button8.text) {
//            if (button2.text !== "") {
//                winner.text = button2.text.toString() + " Wins!"
//                return true
//            }
//        }
//        //col 3
//        else if (button3.text == button6.text && button3.text == button9.text) {
//            if (button3.text !== "") {
//                winner.text = button3.text.toString() + " Wins!"
//                return true
//            }
//        }
//        //cross 1
//        else if (button1.text == button5.text && button1.text == button9.text) {
//            if (button1.text !== "") {
//                winner.text = button1.text.toString() + " Wins!"
//                return true
//            }
//        }
//        //cross 2
//        else if (button3.text == button5.text && button3.text == button7.text) {
//            if (button3.text !== "") {
//                winner.text = button3.text.toString() + " Wins!"
//                return true
//            }
//        }
//        return false
//    }
}
