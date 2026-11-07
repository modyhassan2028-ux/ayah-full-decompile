package com.google.android.material.timepicker;

import H7.I;
import I1.S;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ayah.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Chip f15346r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final EditText f15347s;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f15346r = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.f15347s = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a(this));
        if (Build.VERSION.SDK_INT >= 24) {
            editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        WeakHashMap weakHashMap = S.f3689a;
        editText.setId(View.generateViewId());
        textView.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f15346r.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f15347s.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z10) {
        Chip chip = this.f15346r;
        chip.setChecked(z10);
        int i10 = z10 ? 0 : 4;
        EditText editText = this.f15347s;
        editText.setVisibility(i10);
        chip.setVisibility(z10 ? 8 : 0);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new I(0, editText));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f15346r.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i10, Object obj) {
        this.f15346r.setTag(i10, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f15346r.toggle();
    }
}
