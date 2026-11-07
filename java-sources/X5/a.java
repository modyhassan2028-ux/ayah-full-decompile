package X5;

import Z.C0672b;
import Z.C0698o;
import Z.C0699o0;
import Z.X;
import com.ayah.R;
import java.text.NumberFormat;
import java.util.List;
import l0.o;
import p015b4.f;
import p110k9.y;
import p120l9.r;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p074h0.d f9973a = new p074h0.d(-194756886, new A5.d(21), false);

    public static final void a(V5.a aVar, p241y9.e eVar, C0698o c0698o, int i10) {
        C0698o c0698o2;
        j.e(aVar, "row");
        j.e(eVar, "onAyahClicked");
        c0698o.V(-595299090);
        int i11 = (c0698o.i(aVar) ? 4 : 2) | i10 | (c0698o.i(eVar) ? 32 : 16);
        if (c0698o.K(i11 & 1, (i11 & 19) != 18)) {
            c0698o2 = c0698o;
            f.f(390, 0, c0698o2, p074h0.j.d(-1524345640, new b(aVar, eVar), c0698o), p000a.a.l0(R.array.sura_names, c0698o)[aVar.f8416a.f19527a], androidx.compose.foundation.layout.b.h(o.f19333a, 16));
        } else {
            c0698o2 = c0698o;
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new b(aVar, eVar, i10);
        }
    }

    public static final void b(C4.e eVar, p241y9.e eVar2, C0698o c0698o, int i10) {
        C4.e eVar3;
        C0698o c0698o2;
        j.e(eVar2, "onAyahClicked");
        c0698o.V(-1051460413);
        int i11 = (c0698o.i(eVar) ? 4 : 2) | i10 | (c0698o.i(eVar2) ? 32 : 16);
        if (c0698o.K(i11 & 1, (i11 & 19) != 18)) {
            eVar3 = eVar;
            X xK = C0672b.k(eVar3, r.f19440r, null, c0698o, (i11 & 14) | 48, 2);
            f.e(((List) xK.getValue()).isEmpty(), R.string.favorites, p000a.a.m0(R.string.empty_favorites_title, c0698o), p074h0.j.d(-96424235, new c(xK, eVar2, 0), c0698o), c0698o, 3072);
            c0698o2 = c0698o;
        } else {
            eVar3 = eVar;
            c0698o2 = c0698o;
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new I4.a(i10, 4, eVar3, eVar2);
        }
    }

    public static final void c(final int i10, final int i11, final int i12, final String str, final l0.r rVar, final NumberFormat numberFormat, C0698o c0698o, final int i13) {
        int i14;
        j.e(str, "codePoints");
        c0698o.V(196031534);
        if ((i13 & 6) == 0) {
            i14 = (c0698o.e(i10) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c0698o.e(i11) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c0698o.e(i12) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c0698o.g(str) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c0698o.g(rVar) ? 16384 : 8192;
        }
        if ((196608 & i13) == 0) {
            i14 |= c0698o.i(numberFormat) ? 131072 : 65536;
        }
        if (c0698o.K(i14 & 1, (74899 & i14) != 74898)) {
            c0698o.P();
            if ((i13 & 1) != 0 && !c0698o.w()) {
                c0698o.N();
            }
            c0698o.q();
            String str2 = p000a.a.l0(R.array.sura_names, c0698o)[i10 - 1];
            String str3 = numberFormat.format(Integer.valueOf(i11));
            j.d(str3, "format(...)");
            String str4 = numberFormat.format(Integer.valueOf(i12));
            j.d(str4, "format(...)");
            f.a(str, p000a.a.n0(R.string.quarter_info_format, new Object[]{str2, str3, str4}, c0698o), androidx.compose.foundation.layout.b.h(rVar, 16), 0, c0698o, (i14 >> 9) & 14, 8);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new p241y9.e() { // from class: X5.e
                @Override // p241y9.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a.c(i10, i11, i12, str, rVar, numberFormat, (C0698o) obj, C0672b.y(i13 | 1));
                    return y.f19095a;
                }
            };
        }
    }

    public static final void d(p124m3.j jVar, l0.r rVar, NumberFormat numberFormat, C0698o c0698o, int i10) {
        NumberFormat numberFormat2;
        int i11;
        NumberFormat numberFormat3;
        j.e(jVar, "verseDao");
        c0698o.V(334962873);
        int i12 = (c0698o.i(jVar) ? 4 : 2) | i10 | (c0698o.g(rVar) ? 32 : 16) | 128;
        if (c0698o.K(i12 & 1, (i12 & 147) != 146)) {
            c0698o.P();
            if ((i10 & 1) == 0 || c0698o.w()) {
                NumberFormat integerInstance = NumberFormat.getIntegerInstance();
                j.d(integerInstance, "getIntegerInstance(...)");
                i11 = i12 & (-897);
                numberFormat3 = integerInstance;
            } else {
                c0698o.N();
                i11 = i12 & (-897);
                numberFormat3 = numberFormat;
            }
            c0698o.q();
            c(jVar.f19595m, jVar.f19586b, jVar.c(), jVar.f19590f, rVar, numberFormat3, c0698o, (i11 << 9) & 516096);
            numberFormat2 = numberFormat3;
        } else {
            c0698o.N();
            numberFormat2 = numberFormat;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new A4.a((Object) jVar, rVar, numberFormat2, i10, 6);
        }
    }
}
