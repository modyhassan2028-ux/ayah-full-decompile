package p014b3;

import E2.C0137n0;
import E2.InterfaceC0139o0;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class i implements InterfaceC0139o0 {
    @Override // E2.InterfaceC0139o0
    public final void b(View view) {
        C0137n0 c0137n0 = (C0137n0) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) c0137n0).width != -1 || ((ViewGroup.MarginLayoutParams) c0137n0).height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }

    @Override // E2.InterfaceC0139o0
    public final void d(View view) {
    }
}
