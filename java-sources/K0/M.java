package K0;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M f4957a = new M();

    public final void a(View view) {
        view.clearViewTranslationCallback();
    }

    public final void b(View view) {
        view.setViewTranslationCallback(L.f4955a);
    }
}
