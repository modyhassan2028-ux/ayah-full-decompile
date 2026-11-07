package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.ayah.R;
import p193t7.c;
import p193t7.e;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog T(Bundle bundle) {
        Context contextL = l();
        int i10 = this.f12584t0;
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            i10 = contextL.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        e eVar = new e(contextL, i10);
        eVar.f22631A = true;
        eVar.f22632B = true;
        eVar.f22637G = new c(eVar, 0);
        eVar.e().g(1);
        eVar.f22635E = eVar.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
        return eVar;
    }
}
