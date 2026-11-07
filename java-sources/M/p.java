package M;

import A.C0041r0;
import I1.AbstractC0272z;
import K.W;
import K0.c1;
import O.N;
import U0.K;
import Z0.y;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import com.google.android.gms.internal.measurement.K1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f5641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f5642b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public W f5645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public N f5646f;
    public c1 g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Rect f5650l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m f5651m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p251z9.k f5643c = a.f5588t;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p241y9.c f5644d = a.f5589u;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public y f5647h = new y(K.f8033b, 4, "");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Z0.k f5648i = Z0.k.g;
    public final ArrayList j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f5649k = p110k9.a.c(p110k9.h.f19075s, new C0041r0(19, this));

    public p(View view, b bVar, k kVar) {
        this.f5641a = view;
        this.f5642b = kVar;
        this.f5651m = new m(bVar, kVar);
    }

    public final q a(EditorInfo editorInfo) {
        int i10;
        int i11;
        y yVar = this.f5647h;
        String str = yVar.f10953a.f8060s;
        long j = yVar.f10954b;
        Z0.k kVar = this.f5648i;
        int i12 = kVar.f10933e;
        int i13 = kVar.f10932d;
        boolean z10 = kVar.f10929a;
        if (i12 == 1) {
            i10 = z10 ? 6 : 0;
        } else if (i12 == 0) {
            i10 = 1;
        } else if (i12 == 2) {
            i10 = 2;
        } else if (i12 == 6) {
            i10 = 5;
        } else if (i12 == 5) {
            i10 = 7;
        } else if (i12 == 3) {
            i10 = 3;
        } else if (i12 == 4) {
            i10 = 4;
        } else {
            if (i12 != 7) {
                throw new IllegalStateException("invalid ImeAction");
            }
        }
        editorInfo.imeOptions = i10;
        if (Build.VERSION.SDK_INT >= 24) {
            K1.k(editorInfo, kVar.f10934f);
        }
        if (i13 == 1) {
            i11 = 1;
        } else if (i13 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i11 = 1;
        } else if (i13 == 3) {
            i11 = 2;
        } else if (i13 == 4) {
            i11 = 3;
        } else if (i13 == 5) {
            i11 = 17;
        } else if (i13 == 6) {
            i11 = 33;
        } else if (i13 == 7) {
            i11 = 129;
        } else if (i13 == 8) {
            i11 = 18;
        } else {
            if (i13 != 9) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            i11 = 8194;
        }
        editorInfo.inputType = i11;
        if (!z10 && (i11 & 1) == 1) {
            editorInfo.inputType = 131072 | i11;
            if (kVar.f10933e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i14 = editorInfo.inputType;
        if ((i14 & 1) == 1) {
            int i15 = kVar.f10930b;
            if (i15 == 1) {
                editorInfo.inputType = i14 | 4096;
            } else if (i15 == 2) {
                editorInfo.inputType = i14 | 8192;
            } else if (i15 == 3) {
                editorInfo.inputType = i14 | 16384;
            }
            if (kVar.f10931c) {
                editorInfo.inputType |= 32768;
            }
        }
        int i16 = K.f8034c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        K1.c.c(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!L.c.f5429a || i13 == 7 || i13 == 8) {
            K1.c.d(editorInfo, false);
        } else {
            K1.c.d(editorInfo, true);
            AbstractC0272z.o(editorInfo);
        }
        n nVar = o.f5640a;
        if (p013b2.j.d()) {
            p013b2.j.a().i(editorInfo);
        }
        q qVar = new q(this.f5647h, new p248z6.c(21, this), this.f5648i.f10931c, this.f5645e, this.f5646f, this.g);
        this.j.add(new WeakReference(qVar));
        return qVar;
    }
}
