package p056f2;

import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.DialogFragment;

/* JADX INFO: renamed from: f2.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0944q extends AbstractC0951y {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0945s f16113r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ DialogFragment f16114s;

    public C0944q(DialogFragment dialogFragment, C0945s c0945s) {
        this.f16114s = dialogFragment;
        this.f16113r = c0945s;
    }

    @Override // p056f2.AbstractC0951y
    public final View d(int i10) {
        C0945s c0945s = this.f16113r;
        if (c0945s.e()) {
            return c0945s.d(i10);
        }
        Dialog dialog = this.f16114s.f12590z0;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    @Override // p056f2.AbstractC0951y
    public final boolean e() {
        return this.f16113r.e() || this.f16114s.f12578D0;
    }
}
