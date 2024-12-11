package com.example.pertemuan9

import android.app.Application
import com.example.pertemuan9.dependeciesinjection.ContainerApp

class KrsApp : Application(){
    //untuk menyimpan instance ContainerApp
    lateinit var containerApp: ContainerApp

    override fun onCreate() {
        super.onCreate()
        //membuat instance ContainerApp
        containerApp = ContainerApp(this)
        //instance adalah object yg dibuat dari class
    }
}