package com.herorickystudios.aprendaingles.fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.herorickystudios.aprendaingles.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NumerosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NumerosFragment extends Fragment implements View.OnClickListener {

    private ImageButton buttomUm, ButtomDois, ButtomTres, ButtomQuatro, ButtomCinco, ButtonSeis;
    private MediaPlayer mediaPlayer;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public NumerosFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NumerosFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NumerosFragment newInstance(String param1, String param2) {
        NumerosFragment fragment = new NumerosFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_numeros, container, false);

        buttomUm = view.findViewById(R.id.ButtonUm);
        ButtomDois = view.findViewById(R.id.Buttondois);
        ButtomTres = view.findViewById(R.id.ButtonTres);
        ButtomQuatro = view.findViewById(R.id.ButtonQuatro);
        ButtomCinco = view.findViewById(R.id.ButtonCinco);
        ButtonSeis = view.findViewById(R.id.ButtonSeis);

        buttomUm.setOnClickListener(this);
        ButtomDois.setOnClickListener(this);
        ButtomTres.setOnClickListener(this);
        ButtomQuatro.setOnClickListener(this);
        ButtomCinco.setOnClickListener(this);
        ButtonSeis.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ButtonUm:
                mediaPlayer =  MediaPlayer.create(getActivity(), R.raw.one);
                tocarSomnumeros();
                break;

            case R.id.Buttondois:
                mediaPlayer =  MediaPlayer.create(getActivity(), R.raw.two);
                tocarSomnumeros();
                break;

            case R.id.ButtonTres:
                mediaPlayer =  MediaPlayer.create(getActivity(), R.raw.three);
                tocarSomnumeros();
                break;


            case R.id.ButtonQuatro:
                mediaPlayer =  MediaPlayer.create(getActivity(), R.raw.four);
                tocarSomnumeros();
                break;

            case R.id.ButtonCinco:
                mediaPlayer =  MediaPlayer.create(getActivity(), R.raw.five);
                tocarSomnumeros();
                break;

            case R.id.ButtonSeis:
                mediaPlayer =  MediaPlayer.create(getActivity(), R.raw.six);
                tocarSomnumeros();
                break;
        }
    }
    public void tocarSomnumeros(){

        if(mediaPlayer != null){

            mediaPlayer.start();

            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mediaPlayer.release();
                }
            });

        }

    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        if(mediaPlayer != null){

            mediaPlayer.release();

            mediaPlayer = null;
        }
    }

}