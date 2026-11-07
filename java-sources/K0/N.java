package K0;

import D0.C0083a;
import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N f4964a = new N();

    public final void a(View view, D0.s sVar) {
        Context context = view.getContext();
        PointerIcon systemIcon = sVar instanceof C0083a ? PointerIcon.getSystemIcon(context, ((C0083a) sVar).f1085b) : PointerIcon.getSystemIcon(context, 1000);
        if (p251z9.j.a(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
