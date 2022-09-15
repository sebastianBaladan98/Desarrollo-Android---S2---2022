package com.example.fragments_leccion1.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragments_leccion1.R
import com.example.fragments_leccion1.databinding.FragmentFirstQuestionBinding
import java.lang.ClassCastException

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FirstQuestionFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstQuestionFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var binding: FragmentFirstQuestionBinding

    private var listener: FirstQuestionFragmentListener? = null

    interface FirstQuestionFragmentListener {
        fun deployLastQuestionFragment()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as? FirstQuestionFragmentListener
        if (listener == null ) {
            throw ClassCastException("$context must implement FirstQuestionFragmentListener")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Inflate the layout for this fragment
        binding = FragmentFirstQuestionBinding.inflate( inflater, container, false )

        binding.button.setOnClickListener {
            listener?.deployLastQuestionFragment()
            activity?.supportFragmentManager?.beginTransaction()?.remove(this)?.commit();
        }

        return binding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FirstQuestionFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FirstQuestionFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}