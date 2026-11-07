package p229x5;

import G4.m;
import Z.C0672b;
import Z.C0698o;
import Z.C0699o0;
import Z.X;
import androidx.compose.foundation.layout.b;
import com.ayah.R;
import java.text.NumberFormat;
import java.util.List;
import l0.o;
import l0.r;
import p015b4.f;
import p068g6.c;
import p074h0.d;
import p241y9.e;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f24379a = new d(1602235617, new c(2), false);

    public static final void a(p210v5.a aVar, r rVar, NumberFormat numberFormat, C0698o c0698o, int i10) {
        C0698o c0698o2;
        j.e(aVar, "noteItem");
        c0698o.V(1669474830);
        int i11 = (c0698o.g(aVar) ? 4 : 2) | i10 | (c0698o.g(rVar) ? 32 : 16) | 128;
        if (c0698o.K(i11 & 1, (i11 & 147) != 146)) {
            c0698o.P();
            if ((i10 & 1) == 0 || c0698o.w()) {
                numberFormat = NumberFormat.getIntegerInstance();
                j.d(numberFormat, "getIntegerInstance(...)");
            } else {
                c0698o.N();
            }
            c0698o.q();
            String str = p000a.a.l0(R.array.sura_names, c0698o)[aVar.f23337b - 1];
            String str2 = numberFormat.format(Integer.valueOf(aVar.f23338c));
            j.d(str2, "format(...)");
            String str3 = numberFormat.format(Integer.valueOf(aVar.f23339d));
            j.d(str3, "format(...)");
            c0698o2 = c0698o;
            f.i(384, 0, c0698o2, p074h0.j.d(482718351, new m(14, aVar), c0698o), p000a.a.n0(R.string.quarter_info_format, new Object[]{str, str2, str3}, c0698o), b.h(rVar, 16));
        } else {
            c0698o2 = c0698o;
            c0698o2.N();
        }
        NumberFormat numberFormat2 = numberFormat;
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new A4.a((Object) aVar, rVar, numberFormat2, i10, 16);
        }
    }

    public static final void b(p210v5.b bVar, e eVar, C0698o c0698o, int i10) {
        C0698o c0698o2;
        j.e(bVar, "row");
        j.e(eVar, "onAyahClicked");
        c0698o.V(-229257488);
        int i11 = (c0698o.i(bVar) ? 4 : 2) | i10 | (c0698o.i(eVar) ? 32 : 16);
        if (c0698o.K(i11 & 1, (i11 & 19) != 18)) {
            c0698o2 = c0698o;
            f.f(390, 0, c0698o2, p074h0.j.d(-1364808870, new b(bVar, eVar), c0698o), p000a.a.l0(R.array.sura_names, c0698o)[bVar.f23341a - 1], b.h(o.f19333a, 16));
        } else {
            c0698o2 = c0698o;
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new b(bVar, eVar, i10);
        }
    }

    public static final void c(C4.e eVar, e eVar2, C0698o c0698o, int i10) {
        C4.e eVar3;
        C0698o c0698o2;
        j.e(eVar2, "onAyahClicked");
        c0698o.V(1006723368);
        int i11 = (c0698o.i(eVar) ? 4 : 2) | i10 | (c0698o.i(eVar2) ? 32 : 16);
        if (c0698o.K(i11 & 1, (i11 & 19) != 18)) {
            eVar3 = eVar;
            X xK = C0672b.k(eVar3, p120l9.r.f19440r, null, c0698o, (i11 & 14) | 48, 2);
            f.e(((List) xK.getValue()).isEmpty(), R.string.notes, p000a.a.m0(R.string.empty_notes_title, c0698o), p074h0.j.d(1255997270, new X5.c(xK, eVar2, 1), c0698o), c0698o, 3072);
            c0698o2 = c0698o;
        } else {
            eVar3 = eVar;
            c0698o2 = c0698o;
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new I4.a(i10, 15, eVar3, eVar2);
        }
    }
}
