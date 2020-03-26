package com.example.android.myproject.presentation.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.TransitionAdapter
import androidx.lifecycle.Observer
import com.example.android.myproject.R
import com.example.android.myproject.database.User
import com.example.android.myproject.presentation.ScreenState
import com.example.android.myproject.presentation.main.MainActivity
import com.example.android.myproject.utils.IdGenerator
import com.example.android.myproject.utils.clearText
import com.example.android.myproject.utils.getString
import com.example.android.myproject.utils.minLength
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.login_container.*
import kotlinx.android.synthetic.main.sign_up_container.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginActivity : AppCompatActivity() {

    private val loginViewModel: LoginViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initMotionLayout()
        initButtons()
    }

    private fun initButtons() {
        btnLogin.setOnClickListener {
            checkUser()
        }

        btnSignUp.setOnClickListener {
            createProfile()
        }
    }

    private fun initMotionLayout() {
        motionLayout.setTransitionListener(object : TransitionAdapter() {
            override fun onTransitionStarted(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int
            ) {
                if (startId == R.id.start) {
                    clearFocusAndTextLogin()
                } else {
                    clearFocusAndTextSignUp()
                }
            }
        })
    }

    private fun checkUser() {
        val login = editLogin.getString()
        val password = editPassword.getString()

        if (login.isNotEmpty() && password.isNotEmpty() && login.minLength() && password.minLength()) {
            loginViewModel.checkIsUserExist(login, password)

            loginViewModel.state.observe(this, Observer {
                when (it) {
                    is ScreenState.Loading -> {
                        Toast.makeText(this, "Start", Toast.LENGTH_SHORT).show()
                    }
                    is ScreenState.Success -> {
                        startActivity(Intent(this, MainActivity::class.java))
                        finish()
                    }
                    is ScreenState.Error -> {
                        Toast.makeText(this, "Login or password is not correct", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            })
        } else {
            Toast.makeText(
                this,
                "Fields must not be empty or fields length must be more then 3 symbols",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun createProfile() {
        val name = createName.getString()
        val login = createLogin.getString()
        val password = createPassword.getString()

        val isUserInfoNotEmpty = name.isNotEmpty() && login.isNotEmpty() &&
                password.isNotEmpty() && name.minLength() && login.minLength() && password.minLength()

        if (isUserInfoNotEmpty) {
            val user = User(
                IdGenerator.generateId(),
                name,
                login,
                password
            )

            loginViewModel.addProfile(user)

            loginViewModel.state.observe(this, Observer {
                when (it) {
                    is ScreenState.Loading -> {
                        Toast.makeText(this, "Start", Toast.LENGTH_SHORT).show()
                    }
                    is ScreenState.Success -> {
                        motionLayout.transitionToStart()
                    }
                    is ScreenState.Error -> {
                        Toast.makeText(this, "Login or name exist", Toast.LENGTH_SHORT).show()
                    }
                }
            })
        } else {
            Toast.makeText(
                this,
                "Fields must not be empty or fields length must be more then 3 symbols",
                Toast.LENGTH_SHORT
            ).show()
        }

        clearFocusAndTextSignUp()
    }

    private fun clearFocusAndTextLogin() {
        editLogin.clearText()
        editPassword.clearText()
        currentFocus?.clearFocus()
    }

    private fun clearFocusAndTextSignUp() {
        createName.clearText()
        createLogin.clearText()
        createPassword.clearText()
        currentFocus?.clearFocus()
    }
}
