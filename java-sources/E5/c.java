package E5;

import A.C0023i;
import E2.AbstractC0115c0;
import E2.F0;
import F2.C0162g;
import F2.l;
import K.A0;
import K.J;
import K.O;
import K.j0;
import K9.AbstractC0405x;
import K9.d0;
import N9.U;
import N9.Y;
import N9.k0;
import O.G;
import O.T;
import U0.C0515g;
import U0.K;
import X3.i;
import X3.k;
import Z0.C0710a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.ayah.MainActivity;
import com.ayah.common.data.source.json.model.booklist.BookType;
import com.ayah.feature.library.view.LibraryComposePage;
import com.ayah.feature.picker.book.view.ChooseBookPage;
import com.ayah.feature.tafsir.view.TafsirPage;
import com.ayah.feature.today.ui.wrapper.TodayPage;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import p110k9.y;
import p120l9.m;
import p124m3.j;
import p180s0.F;
import p232y.AbstractC1450d;
import p232y.C1448b;
import p251z9.h;
import p251z9.r;
import u.A;
import u.w;
import z3.g;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c extends h implements p241y9.c {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f1894z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, Object obj, Class cls, String str, String str2, int i11, int i12, int i13) {
        super(i10, obj, cls, str, str2, i11, i12);
        this.f1894z = i13;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x029d  */
    /* JADX WARN: Code duplicated, block: B:198:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:202:0x03e1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [o9.c] */
    /* JADX WARN: Type inference failed for: r10v23 */
    @Override // p241y9.c
    public final Object e(Object obj) {
        C0710a c0710a;
        O oA;
        Integer numValueOf;
        RecyclerView recyclerView;
        AbstractC0115c0 adapter;
        int iL;
        boolean z10;
        RecyclerView recyclerView2;
        AbstractC0115c0 adapter2;
        int iL2;
        p124m3.f fVar;
        List listA;
        Object[] objArr;
        int i10 = this.f1894z;
        int i11 = -1;
        int i12 = 8;
        boolean z11 = true;
        boolean z12 = false;
        int i13 = 0;
        z12 = false;
        z12 = false;
        Rect rectS = 0;
        Object obj2 = null;
        jVar = null;
        j jVar = null;
        Object obj3 = null;
        aVar = null;
        p124m3.a aVar = null;
        y yVar = y.f19095a;
        Object obj4 = this.f24870s;
        switch (i10) {
            case 0:
                BookType bookType = (BookType) obj;
                p251z9.j.e(bookType, "p0");
                ChooseBookPage chooseBookPage = (ChooseBookPage) obj4;
                AbstractC0405x.x(chooseBookPage.f13822J0, null, new d(chooseBookPage, bookType, rectS, z11 ? 1 : 0), 3);
                return yVar;
            case 1:
                p251z9.j.e((Set) obj, "p0");
                C0162g c0162g = (C0162g) obj4;
                ReentrantLock reentrantLock = c0162g.f2280d;
                reentrantLock.lock();
                try {
                    List listC0 = m.C0(c0162g.f2279c.values());
                    reentrantLock.unlock();
                    Iterator it = listC0.iterator();
                    if (!it.hasNext()) {
                        return yVar;
                    }
                    ((l) it.next()).getClass();
                    throw null;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 2:
                KeyEvent keyEvent = ((B0.b) obj).f585a;
                j0 j0Var = (j0) obj4;
                T t2 = j0Var.f4657f;
                boolean z13 = j0Var.f4655d;
                if (keyEvent.getAction() != 0 || Character.isISOControl(keyEvent.getUnicodeChar())) {
                    c0710a = null;
                } else {
                    J j = j0Var.f4659i;
                    j.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        j.f4479a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        numValueOf = null;
                    } else {
                        Integer num = j.f4479a;
                        if (num != null) {
                            j.f4479a = null;
                            int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                            numValueOf = Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                numValueOf = null;
                            }
                            if (numValueOf == null) {
                                numValueOf = Integer.valueOf(unicodeChar);
                            }
                        } else {
                            numValueOf = Integer.valueOf(unicodeChar);
                        }
                    }
                    if (numValueOf != null) {
                        c0710a = new C0710a(new StringBuilder().appendCodePoint(numValueOf.intValue()).toString(), 1);
                    } else {
                        c0710a = null;
                    }
                }
                if (c0710a != null) {
                    if (z13) {
                        j0Var.a(AbstractC0813f2.K(c0710a));
                        t2.f6339a = null;
                    } else {
                        z11 = false;
                    }
                } else if (B0.c.O(keyEvent) != 2 || (oA = j0Var.j.a(keyEvent)) == null || (oA.f4538r && !z13)) {
                    z11 = false;
                } else {
                    r rVar = new r();
                    rVar.f24882r = true;
                    C0023i c0023i = new C0023i(oA, j0Var, rVar, 9);
                    Z0.y yVar2 = j0Var.f4654c;
                    G g = new G(yVar2, j0Var.g, j0Var.f4652a.d(), t2);
                    c0023i.e(g);
                    boolean zA = K.a(g.f6290f, yVar2.f10954b);
                    C0515g c0515g = g.g;
                    if (!zA || !p251z9.j.a(c0515g, yVar2.f10953a)) {
                        j0Var.f4660k.e(Z0.y.a(yVar2, c0515g, g.f6290f, 4));
                    }
                    A0 a9 = j0Var.f4658h;
                    if (a9 != null) {
                        a9.f4438e = true;
                    }
                    z11 = rVar.f24882r;
                }
                return Boolean.valueOf(z11);
            case 3:
                p241y9.a aVar2 = (p241y9.a) obj;
                A a10 = ((AndroidComposeView) obj4).L0;
                if (a10.f(aVar2) < 0) {
                    a10.a(aVar2);
                }
                return yVar;
            case 4:
                int i14 = ((p162q0.d) obj).f21191a;
                AndroidComposeView androidComposeView = (AndroidComposeView) obj4;
                Class cls = AndroidComposeView.f11987U0;
                androidComposeView.getClass();
                if (i14 != 7 && i14 != 8) {
                    Integer numD = p162q0.f.D(i14);
                    if (numD == null) {
                        throw new IllegalStateException("Invalid focus direction");
                    }
                    int iIntValue = numD.intValue();
                    p171r0.e eVarD = androidComposeView.D();
                    rectS = eVarD != null ? F.s(eVarD) : 0;
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View viewFindNextFocus = rectS == 0 ? focusFinder.findNextFocus(androidComposeView, androidComposeView.findFocus(), iIntValue) : focusFinder.findNextFocusFromRect(androidComposeView, rectS, iIntValue);
                    if (viewFindNextFocus != null) {
                        z12 = p162q0.f.z(viewFindNextFocus, Integer.valueOf(iIntValue), rectS);
                    }
                }
                return Boolean.valueOf(z12);
            case 5:
                ((d0) obj4).l((Throwable) obj);
                return yVar;
            case 6:
                F0 f3 = (F0) obj;
                p251z9.j.e(f3, "p0");
                N5.c cVar = (N5.c) obj4;
                cVar.getClass();
                ArrayList arrayList = cVar.f6033A;
                if (f3.f1502s != null && (recyclerView = f3.f1501r) != null && (adapter = recyclerView.getAdapter()) != null && (iL = f3.f1501r.L(f3)) != -1 && f3.f1502s == adapter) {
                    i11 = iL;
                }
                O5.d dVar = (O5.d) arrayList.get(i11);
                if (dVar instanceof O5.c) {
                    O5.c cVar2 = (O5.c) dVar;
                    if (cVar2.f6497c instanceof p088i3.c) {
                        cVar.f6040y.invoke(cVar2.f6496b, Integer.valueOf(cVar2.f6495a.f19528b));
                    }
                }
                return yVar;
            case 7:
                F0 f7 = (F0) obj;
                p251z9.j.e(f7, "p0");
                N5.c cVar3 = (N5.c) obj4;
                cVar3.getClass();
                if (f7.f1502s != null && (recyclerView2 = f7.f1501r) != null && (adapter2 = recyclerView2.getAdapter()) != null && (iL2 = f7.f1501r.L(f7)) != -1 && f7.f1502s == adapter2) {
                    i11 = iL2;
                }
                O5.d dVar2 = (O5.d) cVar3.f6033A.get(i11);
                if (dVar2 instanceof O5.c) {
                    O5.c cVar4 = (O5.c) dVar2;
                    z10 = (cVar4.f6497c instanceof p088i3.c) && ((Boolean) cVar3.f6039x.invoke(cVar4.f6496b, Integer.valueOf(cVar4.f6495a.f19528b))).booleanValue();
                }
                return Boolean.valueOf(z10);
            case 8:
                String str = (String) obj;
                p251z9.j.e(str, "p0");
                MainActivity mainActivity = (MainActivity) obj4;
                int i15 = MainActivity.f13622J0;
                mainActivity.C();
                mainActivity.f13630H0.S(str);
                return yVar;
            case 9:
                k kVar = (k) obj;
                p251z9.j.e(kVar, "p0");
                int i16 = TafsirPage.f13889D;
                p027c6.f presenter = ((TafsirPage) obj4).getPresenter();
                U u8 = presenter.j;
                Y y10 = presenter.f13530k;
                p218w3.h hVar = presenter.g;
                if (kVar instanceof X3.f) {
                    hVar.a(((X3.f) kVar).f9937a, false);
                } else if (kVar instanceof i) {
                    hVar.a(((i) kVar).f9940a, false);
                } else if (kVar.equals(X3.e.f9936a) || kVar.equals(X3.h.f9939a)) {
                    k0 k0Var = hVar.f23673c;
                    k0Var.getClass();
                    g gVar = g.f24791a;
                    k0Var.n(null, gVar);
                    k0 k0Var2 = hVar.f23672b;
                    k0Var2.getClass();
                    k0Var2.n(null, gVar);
                } else if (kVar instanceof X3.g) {
                    hVar.b(((X3.g) kVar).f9938a, false);
                } else {
                    if (!(kVar instanceof X3.j)) {
                        throw new A6.a();
                    }
                    hVar.b(((X3.j) kVar).f9941a, false);
                }
                if (kVar instanceof i) {
                    p124m3.d dVar3 = (p124m3.d) u8.f6130r.getValue();
                    if (dVar3 != null && (listA = dVar3.a()) != null) {
                        for (Object obj5 : listA) {
                            if (((j) obj5).f19585a == ((i) kVar).f9940a) {
                                obj2 = obj5;
                                jVar = (j) obj2;
                            }
                        }
                        jVar = (j) obj2;
                    }
                    if (jVar != null) {
                        y10.g(new X3.b(jVar));
                    }
                } else if (kVar instanceof X3.j) {
                    p124m3.d dVar4 = (p124m3.d) u8.f6130r.getValue();
                    if (dVar4 != null && (fVar = (p124m3.f) dVar4.f19559m.getValue()) != null) {
                        ArrayList arrayList2 = fVar.f19566c;
                        int size = arrayList2.size();
                        while (i13 < size) {
                            Object obj6 = arrayList2.get(i13);
                            i13++;
                            if (((p124m3.a) obj6).f19528b == ((X3.j) kVar).f9941a) {
                                obj3 = obj6;
                                aVar = (p124m3.a) obj3;
                            }
                        }
                        aVar = (p124m3.a) obj3;
                    }
                    if (aVar != null) {
                        y10.g(new X3.c(aVar));
                    }
                } else if (kVar instanceof X3.h) {
                    y10.g(X3.a.f9933b);
                }
                return yVar;
            case 10:
                p048e6.b bVar = (p048e6.b) obj;
                p251z9.j.e(bVar, "p0");
                TodayPage todayPage = (TodayPage) obj4;
                int i17 = TodayPage.f13902v;
                todayPage.getClass();
                List list = bVar.f15826a;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj7 : list) {
                    if (obj7 instanceof p048e6.c) {
                        arrayList3.add(obj7);
                    }
                }
                p048e6.c cVar5 = (p048e6.c) m.g0(arrayList3);
                j jVar2 = cVar5 != null ? cVar5.f15827a : null;
                if (jVar2 == null) {
                    throw new IllegalArgumentException("Unable to share text due to non-text without ayah");
                }
                Bitmap bitmap = (Bitmap) AbstractC0405x.C(p150o9.i.f20380r, new O9.y(todayPage, jVar2, rectS, 19));
                Context context = todayPage.getContext();
                p251z9.j.d(context, "getContext(...)");
                p017b7.g.n0(context, bitmap);
                return yVar;
            case 11:
                int iIntValue2 = ((Number) obj).intValue();
                int i18 = TodayPage.f13902v;
                Object context2 = ((TodayPage) obj4).getContext();
                U3.a aVar3 = context2 instanceof U3.a ? (U3.a) context2 : null;
                if (aVar3 != null) {
                    ((MainActivity) aVar3).E(iIntValue2);
                }
                return yVar;
            case 12:
                int iIntValue3 = ((Number) obj).intValue();
                int i19 = LibraryComposePage.f13804x;
                k0 k0Var3 = ((LibraryComposePage) obj4).getLibraryPagePresenter().f19030f;
                Integer numValueOf2 = Integer.valueOf(iIntValue3);
                k0Var3.getClass();
                k0Var3.n(null, numValueOf2);
                return yVar;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                AbstractC1450d abstractC1450d = (AbstractC1450d) obj4;
                w wVar = abstractC1450d.S;
                if (zBooleanValue) {
                    abstractC1450d.B0();
                } else {
                    if (abstractC1450d.f24484H != null) {
                        Object[] objArr2 = wVar.f22769c;
                        long[] jArr = wVar.f22767a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i20 = 0;
                            while (true) {
                                long j10 = jArr[i20];
                                int i21 = i20;
                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i22 = 8 - ((~(i21 - length)) >>> 31);
                                    int i23 = 0;
                                    while (i23 < i22) {
                                        if ((j10 & 255) < 128) {
                                            AbstractC0405x.x(abstractC1450d.h0(), null, new C1448b(abstractC1450d, (B.l) objArr2[(i21 << 3) + i23], rectS, z12 ? 1 : 0), 3);
                                        }
                                        j10 >>= i12;
                                        i23++;
                                        i12 = i12;
                                        objArr2 = objArr2;
                                    }
                                    objArr = objArr2;
                                    if (i22 == i12) {
                                    }
                                } else {
                                    objArr = objArr2;
                                }
                                if (i21 != length) {
                                    i20 = i21 + 1;
                                    objArr2 = objArr;
                                    i12 = 8;
                                }
                            }
                        }
                    }
                    wVar.a();
                    abstractC1450d.C0();
                }
                return yVar;
        }
    }
}
