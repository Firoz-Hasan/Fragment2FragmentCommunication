package com.fhd.firozhasan.activitiiesfragmentcommunication

interface FragmentCommunicator {
    fun setName(data: String)
    fun getName() : String
    fun gotoFragmentB()
}