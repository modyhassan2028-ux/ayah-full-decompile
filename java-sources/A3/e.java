package A3;

import A.C0030l0;
import C4.i;
import Ca.r;
import D.e0;
import E2.C0127i0;
import F2.x;
import G9.m;
import H9.v;
import I1.V;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import Z.C0673b0;
import Z.C0675c0;
import Z.F;
import Z.L0;
import Z.U;
import Z.X;
import android.content.Context;
import android.text.SpannableStringBuilder;
import androidx.lifecycle.InterfaceC0771u;
import androidx.lifecycle.w;
import com.ayah.R;
import com.ayah.feature.audioconfig.AudioConfigWrapper;
import com.ayah.feature.ayahmenu.ui.wrapper.AyahMenuWrapper;
import com.ayah.feature.library.edit.view.EditLibraryComposePage;
import io.realm.RealmFieldTypeConstants;
import java.util.LinkedHashMap;
import p110k9.j;
import p110k9.y;
import p120l9.l;
import p173r2.A;
import p173r2.D;
import p181s2.t;
import p181s2.z;
import p214w.B;
import p214w.C1390c;
import p214w.C1400m;
import p214w.C1401n;
import p214w.C1406t;
import p214w.G;
import p214w.H;
import p214w.I;
import p214w.Q;
import p214w.T;
import p214w.u;
import p223x.AbstractC1413d;
import p223x.u0;
import p223x.v0;
import z3.k;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f491r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f492s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f493t;

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.f491r = i10;
        this.f492s = obj;
        this.f493t = obj2;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        j jVar;
        u uVarC;
        w wVarH;
        int i10 = this.f491r;
        int i11 = 6;
        p150o9.c cVar = null;
        y yVar = y.f19095a;
        Object obj2 = this.f493t;
        Object obj3 = this.f492s;
        switch (i10) {
            case 0:
                E3.b[] bVarArr = (E3.b[]) obj2;
                Q2.a aVar = (Q2.a) obj;
                p251z9.j.e(aVar, "_connection");
                f fVar = ((g) obj3).f496b;
                Q2.c cVarA0 = aVar.a0("INSERT OR REPLACE INTO `favorites` (`_id`,`ayah_id`,`timestamp`) VALUES (nullif(?, 0),?,?)");
                try {
                    V vH = p251z9.j.h(bVarArr);
                    while (vH.hasNext()) {
                        Object next = vH.next();
                        if (next != null) {
                            fVar.a(cVarA0, next);
                            cVarA0.R();
                            cVarA0.reset();
                        }
                    }
                    p186s9.b.b(cVarA0, null);
                    return yVar;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p186s9.b.b(cVarA0, th);
                        throw th2;
                    }
                }
            case 1:
                Q2.a aVar2 = (Q2.a) obj;
                p251z9.j.e(aVar2, "_connection");
                ((g) obj3).f496b.d(aVar2, (E3.b) obj2);
                return yVar;
            case 2:
                Q2.a aVar3 = (Q2.a) obj;
                p251z9.j.e(aVar3, "_connection");
                ((h) obj3).f498b.d(aVar3, (E3.c) obj2);
                return yVar;
            case 3:
                X x9 = (X) obj2;
                p124m3.j jVar2 = (p124m3.j) obj;
                int i12 = AudioConfigWrapper.f13759u;
                p251z9.j.e(jVar2, "ayah");
                int i13 = jVar2.f19586b;
                int i14 = jVar2.f19595m;
                i audioConfigPresenter = ((AudioConfigWrapper) obj3).getAudioConfigPresenter();
                B4.b bVar = (B4.b) x9.getValue();
                audioConfigPresenter.getClass();
                p251z9.j.e(bVar, "ayahRangeType");
                int i15 = jVar2.f19585a;
                p165q3.b bVarA = audioConfigPresenter.f752a.a();
                if (bVarA != null) {
                    p165q3.a aVar4 = bVarA.g;
                    k kVar = aVar4.f21279a;
                    k kVar2 = aVar4.f21280b;
                    if (bVar == B4.b.f619s) {
                        jVar = i15 >= kVar2.f24798t ? new j(kVar2, new k(i14, i13, i15)) : new j(new k(i14, i13, i15), kVar2);
                    } else if (bVar == B4.b.f620t) {
                        jVar = i15 >= kVar.f24798t ? new j(kVar, new k(i14, i13, i15)) : new j(new k(i14, i13, i15), kVar);
                    } else {
                        jVar = new j(kVar, kVar2);
                    }
                    audioConfigPresenter.f755d.a(new p165q3.a((k) jVar.f19077r, (k) jVar.f19078s, aVar4.f21281c, aVar4.f21282d));
                }
                x9.setValue(B4.b.f618r);
                return yVar;
            case 4:
                r rVar = (r) obj3;
                Ca.e eVar = (Ca.e) obj2;
                p251z9.j.e((Da.i) obj, "it");
                Da.k kVar3 = eVar.f808e;
                rVar.getClass();
                p251z9.j.e(kVar3, "byteString");
                rVar.d().v(kVar3);
                rVar.f848b = eVar.f806c;
                return yVar;
            case 5:
                C0675c0 c0675c0 = (C0675c0) obj3;
                p241y9.c cVar2 = (p241y9.c) obj2;
                String str = (String) obj;
                p251z9.j.e(str, "it");
                Integer numS0 = v.S0(str);
                int iIntValue = numS0 != null ? numS0.intValue() : 2;
                c0675c0.h(iIntValue);
                cVar2.e(Integer.valueOf(iIntValue));
                return yVar;
            case 6:
                X x10 = (X) obj2;
                C1401n c1401n = (C1401n) obj;
                p251z9.j.e(c1401n, "$this$AnimatedContent");
                if (((Boolean) ((X) obj3).getValue()).booleanValue() || ((Boolean) x10.getValue()).booleanValue()) {
                    u0 u0VarQ = AbstractC1413d.q(200, 0, null, 6);
                    C1400m c1400m = new C1400m(C1390c.f23478t, c1401n);
                    v0 v0Var = B.f23415a;
                    uVarC = androidx.compose.animation.a.c(new G(new T((I) null, new Q(new U(c1400m, 2), u0VarQ), (C1406t) null, (t) null, (LinkedHashMap) null, 61)), B.b(AbstractC1413d.q(100, 0, null, 6), 2));
                } else {
                    uVarC = androidx.compose.animation.a.c(B.a(AbstractC1413d.q(200, 0, null, 6), 2), new H(new T((I) null, new Q(new U(new C1400m(c1401n, C1390c.f23479u), 3), AbstractC1413d.q(200, 0, null, 6)), (C1406t) null, (t) null, (LinkedHashMap) null, 61)));
                }
                uVarC.f23540c.h(((Boolean) c1401n.c()).booleanValue() ? 1.0f : 0.0f);
                return uVarC;
            case 7:
                p241y9.c cVar3 = (p241y9.c) obj3;
                N3.a aVar5 = (N3.a) obj;
                p251z9.j.e(aVar5, "bookmarkListRow");
                cVar3.e(new E4.b(((E4.a) obj2).f1845a, aVar5 instanceof N3.b ? ((N3.b) aVar5).f6001a : -1, aVar5.b(), aVar5.a()));
                return yVar;
            case 8:
                E4.u uVar = (E4.u) obj;
                int i16 = AyahMenuWrapper.f13763v;
                p251z9.j.e(uVar, "playUntilType");
                AbstractC0405x.x((InterfaceC0402u) obj3, null, new C0030l0((AyahMenuWrapper) obj2, uVar, cVar, 15), 3);
                return yVar;
            case 9:
                ((L9.d) obj3).f5582t.removeCallbacks((x) obj2);
                return yVar;
            case 10:
                int i17 = EditLibraryComposePage.f13797v;
                p251z9.j.e((F) obj, "$this$DisposableEffect");
                return new e0(i11, (X) obj3, (Context) obj2);
            case 11:
                H9.k kVar4 = (H9.k) obj;
                p251z9.j.e(kVar4, "matchResult");
                p106k4.a.b((SpannableStringBuilder) obj3, (Context) obj2, R.color.red_text, kVar4.a());
                E9.d dVarA = kVar4.a();
                return l.S(new Integer[]{Integer.valueOf(dVarA.f1995r), Integer.valueOf(dVarA.f1996s)});
            case 12:
                p173r2.v vVar = (p173r2.v) obj3;
                p197u2.h hVar = ((A) obj2).f21412b;
                D d5 = (D) obj;
                p251z9.j.e(d5, "$this$navOptions");
                C0127i0 c0127i0 = d5.f21423a;
                c0127i0.f1681a = 0;
                c0127i0.f1682b = 0;
                if (vVar instanceof p173r2.x) {
                    int i18 = p173r2.v.f21491v;
                    for (p173r2.v vVar2 : p173r2.i.b(vVar)) {
                        p173r2.v vVarG = hVar.g();
                        if (p251z9.j.a(vVar2, vVarG != null ? vVarG.f21494t : null)) {
                        }
                    }
                    int i19 = p173r2.x.f21501x;
                    d5.f21425c = ((p173r2.v) G9.k.d0(G9.k.b0(hVar.h(), new m(24)))).f21493s.f1641a;
                    d5.f21426d = true;
                }
                return yVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return new e0(8, (L0) obj3, (p181s2.i) obj2);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                A a9 = (A) obj3;
                InterfaceC0771u interfaceC0771u = (InterfaceC0771u) obj2;
                a9.getClass();
                p251z9.j.e(interfaceC0771u, "owner");
                p197u2.h hVar2 = a9.f21412b;
                O2.a aVar6 = hVar2.f22864r;
                if (!interfaceC0771u.equals(hVar2.f22860n)) {
                    InterfaceC0771u interfaceC0771u2 = hVar2.f22860n;
                    if (interfaceC0771u2 != null && (wVarH = interfaceC0771u2.h()) != null) {
                        wVarH.f(aVar6);
                    }
                    hVar2.f22860n = interfaceC0771u;
                    interfaceC0771u.h().a(aVar6);
                }
                return new z();
            default:
                Float f3 = (Float) obj;
                ((C0673b0) obj3).h(f3.floatValue());
                ((p241y9.c) obj2).e(f3);
                return yVar;
        }
    }

    public /* synthetic */ e(p106k4.a aVar, SpannableStringBuilder spannableStringBuilder, Context context) {
        this.f491r = 11;
        this.f492s = spannableStringBuilder;
        this.f493t = context;
    }
}
