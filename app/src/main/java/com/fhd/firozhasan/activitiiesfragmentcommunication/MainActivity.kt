package com.fhd.firozhasan.activitiiesfragmentcommunication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment

class MainActivity : AppCompatActivity(), FragmentCommunicator {


    var nameofUser : String = ""
    private val fragmentA = FragmentA()
    private val fragmentB = FragmentB()

    override fun getName(): String {
        return nameofUser
    }
    override fun gotoFragmentB() {
        replaceFragment(fragmentB)

    }

    override fun setName(data: String) {
        nameofUser = data
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(fragmentA)

    }

    private fun replaceFragment(fragment: Fragment) {
        // create a FragmentManager(old java way now we hv support manager dont need frag manager)
        // create a FragmentTransaction to begin the transaction and replace the Fragment
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        // replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.fragmentHolder, fragment)
        // save the changes
        fragmentTransaction.commit()
    }
}
