package com.google.android.material.timepicker;

import H7.G;
import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes.dex */
public final class a extends G {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f15373r;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.f15373r = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f15373r;
        if (zIsEmpty) {
            chipTextInputComboView.f15346r.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        String strA = ChipTextInputComboView.a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f15346r;
        if (TextUtils.isEmpty(strA)) {
            strA = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(strA);
    }
}
