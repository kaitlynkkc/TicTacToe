package com.example.tic_tac_toe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var clickCount = 0
    lateinit var buttons : Array<Button>
    var p1 = arrayOfNulls<Button>(9)
    var p2 = arrayOfNulls<Button>(9)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttons = arrayOf(button1, button2, button3, button4, button5, button6, button7, button8, button9)
    }

    fun onClick(view: View) {
        view as Button
        var buttonNum = view.id.toString().substring(view.id.toString().length-1).toInt()
        if(clickCount%2 == 1 && view.text == "") {
            view.text = "X"
            p1[buttonNum] = view
            clickCount++
            if (winner(p1)) {
                Toast.makeText(this, "X Wins!", Toast.LENGTH_LONG).show()
                for (button in buttons) {
                    button.isEnabled = false
                }
            } else if (clickCount == 9) {
                Toast.makeText(this, "CAT!", Toast.LENGTH_LONG).show()
            }
        } else if (clickCount%2 == 0 && view.text == "") {
            view.text = "O"
            p2[buttonNum] = view
            clickCount++
            if (winner(p2)) {
                Toast.makeText(this, "O Wins!", Toast.LENGTH_LONG).show()
                for (button in buttons) {
                    button.isEnabled = false
                }
            } else if (clickCount == 9) {
                Toast.makeText(this, "CAT!", Toast.LENGTH_LONG).show()
            }
        }
    }

    fun newGame(view: View) {
        for (button in buttons) {
            button.text = ""
            button.isEnabled = true
        }
        for (i in 0..8) {
            p1[i] = null
            p2[i] = null
        }
        clickCount = 0
    }

    private fun winner(player: Array<Button?>): Boolean {
        //row1
        if (player.contains(button1) && player.contains(button2) && player.contains(button3))
        {
            return true
        }

        //row2
        if (player.contains(button4) && player.contains(button5) && player.contains(button6))
        {
            return true
        }

        //row3
        if (player.contains(button7) && player.contains(button8) && player.contains(button9))
        {
            return true
        }

        //col1
        if (player.contains(button1) && player.contains(button4) && player.contains(button7))
        {
            return true
        }

        //col2
        if (player.contains(button2) && player.contains(button5) && player.contains(button8))
        {
            return true
        }

        //col3
        if (player.contains(button3) && player.contains(button6) && player.contains(button9))
        {
            return true
        }

        //cross1
        if (player.contains(button1) && player.contains(button5) && player.contains(button9))
        {
            return true
        }

        //cross2
        if (player.contains(button3) && player.contains(button5) && player.contains(button7))
        {
            return true
        }

        return false
    }
}
