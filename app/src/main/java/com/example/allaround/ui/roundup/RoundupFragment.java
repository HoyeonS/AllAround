package com.example.allaround.ui.roundup;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.allaround.databinding.FragmentRoundupBinding;

public class RoundupFragment extends Fragment {

    private FragmentRoundupBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        RoundupViewModel roundupViewModel =
                new ViewModelProvider(this).get(RoundupViewModel.class);

        binding = FragmentRoundupBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        LinearLayout layout = binding.linear;
//        for (int i = 0; i < 10; i++) {
//            ImageView imageView = new ImageView(this);
//            imageView.setId(i);
//            imageView.setPadding(2, 2, 2, 2);
//            imageView.setImageBitmap(BitmapFactory.decodeResource(
//                    getResources(), binding.drawable.ic_launcher));
//            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
//            layout.addView(imageView);
//        }

        final TextView textView = binding.textDashboard;
        roundupViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}