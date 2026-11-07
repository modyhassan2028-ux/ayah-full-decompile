package i7;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.ayah.MainActivity;
import com.ayah.R;
import com.ayah.feature.quran.view.QuranPage;
import com.google.android.gms.internal.measurement.C0809e3;
import com.google.android.gms.internal.measurement.C0819g3;
import com.google.android.gms.internal.measurement.C0834j3;
import com.google.android.gms.internal.measurement.C0864p3;
import com.google.android.gms.internal.measurement.R3;
import com.google.android.gms.internal.measurement.T3;
import com.google.android.gms.internal.measurement.W3;
import com.google.android.gms.internal.measurement.f4;
import java.util.ArrayList;
import java.util.List;
import p223x.AbstractC1427p;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class D implements InterfaceC1034y, N1.h, p140o.v, ka.z, p178r8.d, p201u6.a, p223x.z0, p226x2.k {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static D f16849A;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ D f16850s = new D(0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ D f16851t = new D(1);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ D f16852u = new D(2);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ D f16853v = new D(3);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ D f16854w = new D(4);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ D f16855x = new D(5);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ D f16856y = new D(6);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ D f16857z = new D(7);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f16858r;

    public /* synthetic */ D(int i10) {
        this.f16858r = i10;
    }

    public static final String n(Da.k kVar, Da.k[] kVarArr, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        Da.k kVar2 = xa.a.f24405b;
        int iA = kVar.a();
        int i14 = 0;
        while (i14 < iA) {
            int i15 = (i14 + iA) / 2;
            while (i15 > -1 && kVar.d(i15) != 10) {
                i15--;
            }
            int i16 = i15 + 1;
            int i17 = 1;
            while (true) {
                i11 = i16 + i17;
                if (kVar.d(i11) == 10) {
                    break;
                }
                i17++;
            }
            int i18 = i11 - i16;
            int i19 = i10;
            boolean z11 = false;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                if (z11) {
                    i12 = 46;
                    z10 = false;
                } else {
                    byte bD = kVarArr[i19].d(i20);
                    byte[] bArr = la.c.f19448a;
                    int i22 = bD & 255;
                    z10 = z11;
                    i12 = i22;
                }
                byte bD2 = kVar.d(i16 + i21);
                byte[] bArr2 = la.c.f19448a;
                i13 = i12 - (bD2 & 255);
                if (i13 != 0) {
                    break;
                }
                i21++;
                i20++;
                if (i21 == i18) {
                    break;
                }
                if (kVarArr[i19].a() != i20) {
                    z11 = z10;
                } else {
                    if (i19 == kVarArr.length - 1) {
                        break;
                    }
                    i19++;
                    i20 = -1;
                    z11 = true;
                }
            }
            if (i13 >= 0) {
                if (i13 <= 0) {
                    int i23 = i18 - i21;
                    int iA2 = kVarArr[i19].a() - i20;
                    int length = kVarArr.length;
                    for (int i24 = i19 + 1; i24 < length; i24++) {
                        iA2 += kVarArr[i24].a();
                    }
                    if (iA2 >= i23) {
                        if (iA2 <= i23) {
                            return kVar.h(i16, i18 + i16).g(H9.a.f3610a);
                        }
                    }
                }
                i14 = i11 + 1;
            }
            iA = i15;
        }
        return null;
    }

    public static ArrayList o(List list) {
        p251z9.j.e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ka.s) obj) != ka.s.f19247t) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p120l9.n.a0(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            arrayList2.add(((ka.s) obj2).f19254r);
        }
        return arrayList2;
    }

    public static byte[] p(List list) {
        p251z9.j.e(list, "protocols");
        Da.h hVar = new Da.h();
        ArrayList arrayListO = o(list);
        int size = arrayListO.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListO.get(i10);
            i10++;
            String str = (String) obj;
            hVar.O(str.length());
            hVar.d0(str);
        }
        return hVar.s(hVar.f1362s);
    }

    @Override // i7.InterfaceC1034y
    public Object a() {
        switch (this.f16858r) {
            case 0:
                List list = G.f16928a;
                return Integer.valueOf((int) ((Long) C0834j3.f14343a.b()).longValue());
            case 1:
                List list2 = G.f16928a;
                Boolean bool = (Boolean) f4.f14245a.b();
                bool.getClass();
                return bool;
            case 2:
                List list3 = G.f16928a;
                C0809e3.f14239s.get();
                return Integer.valueOf((int) ((Long) C0819g3.f14299m0.b()).longValue());
            case 3:
                List list4 = G.f16928a;
                R3.f14118s.get();
                Boolean bool2 = (Boolean) T3.g.b();
                bool2.getClass();
                return bool2;
            case 4:
                List list5 = G.f16928a;
                Boolean bool3 = (Boolean) C0864p3.f14385b.b();
                bool3.getClass();
                return bool3;
            case 5:
                List list6 = G.f16928a;
                R3.f14118s.get();
                Boolean bool4 = (Boolean) T3.f14137d.b();
                bool4.getClass();
                return bool4;
            case 6:
                List list7 = G.f16928a;
                C0809e3.f14239s.get();
                Long l10 = (Long) C0819g3.f14276a.b();
                l10.getClass();
                return l10;
            default:
                return new Boolean(((Boolean) W3.f14160a.b()).booleanValue());
        }
    }

    @Override // p223x.x0
    public /* synthetic */ boolean d() {
        return false;
    }

    @Override // p178r8.d
    public String f() {
        return null;
    }

    @Override // p201u6.a
    public View g(MainActivity mainActivity, MainActivity mainActivity2) {
        p251z9.j.e(mainActivity, "context");
        p251z9.j.e(mainActivity2, "controller");
        QuranPage quranPage = new QuranPage(mainActivity);
        quranPage.f13841x = mainActivity2;
        return quranPage;
    }

    @Override // p140o.v
    public boolean h(p140o.k kVar) {
        return false;
    }

    @Override // p223x.x0
    public long i(AbstractC1427p abstractC1427p, AbstractC1427p abstractC1427p2, AbstractC1427p abstractC1427p3) {
        return ((long) 0) * 1000000;
    }

    @Override // p226x2.k
    public CharSequence j(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        CharSequence[] charSequenceArr = listPreference.f12722j0;
        int iB = listPreference.B(listPreference.f12724l0);
        if (TextUtils.isEmpty((iB < 0 || charSequenceArr == null) ? null : charSequenceArr[iB])) {
            return listPreference.f12761r.getString(R.string.not_set);
        }
        int iB2 = listPreference.B(listPreference.f12724l0);
        if (iB2 < 0 || charSequenceArr == null) {
            return null;
        }
        return charSequenceArr[iB2];
    }

    @Override // p223x.z0
    public int k() {
        return 0;
    }

    @Override // p223x.x0
    public AbstractC1427p l(long j, AbstractC1427p abstractC1427p, AbstractC1427p abstractC1427p2, AbstractC1427p abstractC1427p3) {
        return j < ((long) 0) * 1000000 ? abstractC1427p : abstractC1427p2;
    }

    public void q(float f3, p085i0.n nVar) {
        t.a aVar = (t.a) ((Drawable) nVar.f16733s);
        CardView cardView = (CardView) nVar.f16734t;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f3 != aVar.f22497e || aVar.f22498f != useCompatPadding || aVar.g != preventCornerOverlap) {
            aVar.f22497e = f3;
            aVar.f22498f = useCompatPadding;
            aVar.g = preventCornerOverlap;
            aVar.b(null);
            aVar.invalidateSelf();
        }
        t(nVar);
    }

    @Override // p223x.z0
    public int r() {
        return 0;
    }

    @Override // p223x.x0
    public AbstractC1427p s(AbstractC1427p abstractC1427p, AbstractC1427p abstractC1427p2, AbstractC1427p abstractC1427p3) {
        return abstractC1427p3;
    }

    public void t(p085i0.n nVar) {
        CardView cardView = (CardView) nVar.f16734t;
        CardView cardView2 = (CardView) nVar.f16734t;
        if (!cardView.getUseCompatPadding()) {
            nVar.j(0, 0, 0, 0);
            return;
        }
        Drawable drawable = (Drawable) nVar.f16733s;
        float f3 = ((t.a) drawable).f22497e;
        float f7 = ((t.a) drawable).f22493a;
        int iCeil = (int) Math.ceil(t.b.a(f3, f7, cardView2.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(t.b.b(f3, f7, cardView2.getPreventCornerOverlap()));
        nVar.j(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // p178r8.d
    public void c() {
    }

    @Override // p140o.v
    public void b(p140o.k kVar, boolean z10) {
    }

    @Override // p178r8.d
    public void m(long j, String str) {
    }

    @Override // p223x.x0
    public AbstractC1427p e(long j, AbstractC1427p abstractC1427p, AbstractC1427p abstractC1427p2, AbstractC1427p abstractC1427p3) {
        return abstractC1427p3;
    }
}
