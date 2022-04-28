package com.example.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.lovetest.R
import kotlinx.android.synthetic.main.fragment_result.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ResultFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ResultFragment : Fragment() {

    var option = -1

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        option = arguments?.getInt("index")?:-1

        return inflater.inflate(R.layout.fragment_result, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        setResult(option)

        btn_home.setOnClickListener {
            navController.navigate(R.id.action_resultFragment_to_mainFragment2)
        }
    }

    fun setResult(option : Int) {
        when(option) {
            1 -> {
                tv_main.text = "1번결과"
                tv_sub.text = "1번은 이렇고 저렇고 어쩌구 저쩌구다"
            }
            2 -> {
                tv_main.text = "2번결과"
                tv_sub.text = "2번은 이렇고 저렇고 어쩌구 저쩌구다"
            }
            3 -> {
                tv_main.text = "3번결과"
                tv_sub.text = "3번은 이렇고 저렇고 어쩌구 저쩌구다"
            }
            4 -> {
                tv_main.text = "4번결과"
                tv_sub.text = "4번은 이렇고 저렇고 어쩌구 저쩌구다"
            }
        }
    }



}