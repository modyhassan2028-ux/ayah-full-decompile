package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import p084i.z;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatDialogFragment extends DialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public Dialog T(Bundle bundle) {
        return new z(l(), this.f12584t0);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void U(Dialog dialog, int i10) {
        if (!(dialog instanceof z)) {
            super.U(dialog, i10);
            return;
        }
        z zVar = (z) dialog;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        zVar.e().g(1);
    }
}
