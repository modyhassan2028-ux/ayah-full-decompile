package H7;

import I1.B0;
import I1.S;
import android.view.View;
import java.util.WeakHashMap;
import p151p.V;

/* JADX INFO: loaded from: classes.dex */
public final class J implements L {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f3453r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f3454s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f3455t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ V f3456u;

    public J(boolean z10, boolean z11, boolean z12, V v10) {
        this.f3453r = z10;
        this.f3454s = z11;
        this.f3455t = z12;
        this.f3456u = v10;
    }

    @Override // H7.L
    public final B0 n(View view, B0 b5, M m10) {
        if (this.f3453r) {
            m10.f3461d = b5.a() + m10.f3461d;
        }
        boolean zL = H.l(view);
        if (this.f3454s) {
            if (zL) {
                m10.f3460c = b5.b() + m10.f3460c;
            } else {
                m10.f3458a = b5.b() + m10.f3458a;
            }
        }
        if (this.f3455t) {
            if (zL) {
                m10.f3458a = b5.c() + m10.f3458a;
            } else {
                m10.f3460c = b5.c() + m10.f3460c;
            }
        }
        int i10 = m10.f3458a;
        int i11 = m10.f3459b;
        int i12 = m10.f3460c;
        int i13 = m10.f3461d;
        WeakHashMap weakHashMap = S.f3689a;
        view.setPaddingRelative(i10, i11, i12, i13);
        this.f3456u.n(view, b5, m10);
        return b5;
    }
}
