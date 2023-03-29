package com.example.letras

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class BotonFlotante : Fragment() {

    companion object {
        fun newInstance() = BotonFlotante()
    }

    private lateinit var viewModel: BotonFlotanteViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_boton_flotante, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(BotonFlotanteViewModel::class.java)
        // TODO: Use the ViewModel
    }

}