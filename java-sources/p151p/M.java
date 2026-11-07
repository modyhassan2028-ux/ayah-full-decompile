package p151p;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p244z1.a;

/* JADX INFO: loaded from: classes.dex */
public final class M extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f20571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20572i;
    public final /* synthetic */ WeakReference j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ T f20573k;

    public M(T t2, int i10, int i11, WeakReference weakReference) {
        this.f20573k = t2;
        this.f20571h = i10;
        this.f20572i = i11;
        this.j = weakReference;
    }

    @Override // p244z1.a
    public final void k(Typeface typeface) {
        int i10;
        if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f20571h) != -1) {
            typeface = S.a(typeface, i10, (this.f20572i & 2) != 0);
        }
        T t2 = this.f20573k;
        if (t2.f20595m) {
            t2.f20594l = typeface;
            TextView textView = (TextView) this.j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new N(textView, typeface, t2.j));
                } else {
                    textView.setTypeface(typeface, t2.j);
                }
            }
        }
    }

    @Override // p244z1.a
    public final void j(int i10) {
    }
}
