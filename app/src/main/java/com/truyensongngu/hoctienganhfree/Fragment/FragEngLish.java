package com.truyensongngu.hoctienganhfree.Fragment;

import android.app.Fragment;
import android.os.Bundle;

import android.support.annotation.Nullable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.truyensongngu.hoctienganhfree.R;

public class FragEngLish extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frageng, container, false);
    }
}