package Z0;

import I1.RunnableC0250e0;
import I1.S;
import Z.C0672b;
import Z.C0681f0;
import Z.L0;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.internal.measurement.BinderC0831j0;
import com.google.android.gms.internal.measurement.C0816g0;
import com.google.android.gms.internal.measurement.C0846m0;
import com.google.android.gms.internal.measurement.Z;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import i7.C1003n0;
import i7.C1023u0;
import i7.EnumC0984h;
import i7.G0;
import i7.Q1;
import i7.U1;
import i7.V;
import i7.X;
import io.realm.internal.ObjectServerFacade;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import p151p.B0;
import p151p.C1250k;

/* JADX INFO: loaded from: classes.dex */
public final class B implements J1.q, U1, p118l7.f, p138n8.a, B0, I1.r, p140o.v {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f10874r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f10875s;

    public /* synthetic */ B(int i10, Object obj) {
        this.f10874r = i10;
        this.f10875s = obj;
    }

    @Override // i7.U1
    public void a(String str, String str2, Bundle bundle) {
        Q1 q10 = (Q1) this.f10875s;
        if (!TextUtils.isEmpty(str)) {
            q10.c().x(new RunnableC0250e0(this, str, str2, bundle, 9, false));
            return;
        }
        C1023u0 c1023u0 = q10.f17084C;
        if (c1023u0 != null) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17182w.b(str2, "AppId not known when logging event");
        }
    }

    @Override // p140o.v
    public void b(p140o.k kVar, boolean z10) {
        if (kVar instanceof p140o.C) {
            ((p140o.C) kVar).f20075z.k().c(false);
        }
        p140o.v vVar = ((C1250k) this.f10875s).f20711v;
        if (vVar != null) {
            vVar.b(kVar, z10);
        }
    }

    @Override // p151p.B0
    public void c(p140o.k kVar, MenuItem menuItem) {
        ((p140o.e) this.f10875s).f20115w.removeCallbacksAndMessages(kVar);
    }

    public ka.l d() {
        return new ka.l((String[]) ((ArrayList) this.f10875s).toArray(new String[0]));
    }

    @Override // p151p.B0
    public void e(p140o.k kVar, p140o.m mVar) {
        p140o.e eVar = (p140o.e) this.f10875s;
        Handler handler = eVar.f20115w;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.f20117y;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (kVar == ((p140o.d) arrayList.get(i10)).f20093b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        handler.postAtTime(new RunnableC0250e0(this, i11 < arrayList.size() ? (p140o.d) arrayList.get(i11) : null, mVar, kVar, 10, false), kVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // J1.q
    public boolean f(View view) {
        Aa.a aVar = (Aa.a) this.f10875s;
        int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
        ViewPager2 viewPager2 = (ViewPager2) aVar.f557u;
        if (viewPager2.f13046I) {
            viewPager2.d(currentItem, true);
        }
        return true;
    }

    @Override // p118l7.f
    public void g(Object obj) {
        ((p118l7.i) ((X4.c) this.f10875s).f9953r).f19402a.k();
    }

    @Override // p140o.v
    public boolean h(p140o.k kVar) {
        C1250k c1250k = (C1250k) this.f10875s;
        if (kVar == c1250k.f20709t) {
            return false;
        }
        c1250k.f20706P = ((p140o.C) kVar).f20074A.f20162a;
        p140o.v vVar = c1250k.f20711v;
        if (vVar != null) {
            return vVar.h(kVar);
        }
        return false;
    }

    @Override // p138n8.a
    public void i(Bundle bundle) {
        p070g8.b bVar = (p070g8.b) ((p070g8.a) this.f10875s);
        bVar.getClass();
        if (p081h8.a.f16466c.contains("clx") || p081h8.a.f16465b.contains("_ae")) {
            return;
        }
        p029c8.i iVar = p081h8.a.f16467d;
        int i10 = iVar.f13558u;
        int i11 = 0;
        while (i11 < i10) {
            boolean zContainsKey = bundle.containsKey((String) iVar.get(i11));
            i11++;
            if (zContainsKey) {
                return;
            }
        }
        bundle.putLong("_r", 1L);
        C0846m0 c0846m0 = (C0846m0) bVar.f16331a.f10875s;
        c0846m0.a(new C0816g0(c0846m0, "clx", "_ae", bundle, true));
    }

    public L0 j() {
        p013b2.j jVarA = p013b2.j.a();
        if (jVarA.c() == 1) {
            return new p022c1.j(true);
        }
        C0681f0 c0681f0R = C0672b.r(Boolean.FALSE);
        jVarA.h(new p022c1.f(c0681f0R, this));
        return c0681f0R;
    }

    public void k(p081h8.b bVar) {
        C0846m0 c0846m0 = (C0846m0) this.f10875s;
        ArrayList arrayList = c0846m0.f14359c;
        synchronized (arrayList) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                try {
                    if (bVar.equals(((Pair) arrayList.get(i10)).first)) {
                        Log.w("FA", "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            BinderC0831j0 binderC0831j0 = new BinderC0831j0(bVar);
            arrayList.add(new Pair(bVar, binderC0831j0));
            if (c0846m0.f14362f != null) {
                try {
                    c0846m0.f14362f.registerOnMeasurementEventListener(binderC0831j0);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            c0846m0.a(new Z(c0846m0, binderC0831j0, 4));
        }
    }

    public void l(String str) {
        ArrayList arrayList = (ArrayList) this.f10875s;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i10))) {
                arrayList.remove(i10);
                arrayList.remove(i10);
                i10 -= 2;
            }
            i10 += 2;
        }
    }

    public void m(int i10, String str, List list, boolean z10, boolean z11) {
        V v10;
        C1003n0 c1003n0 = (C1003n0) this.f10875s;
        int i11 = i10 - 1;
        if (i11 == 0) {
            X x9 = ((C1023u0) c1003n0.f16104r).f17584w;
            C1023u0.m(x9);
            v10 = x9.f17177D;
        } else if (i11 != 1) {
            if (i11 == 3) {
                X x10 = ((C1023u0) c1003n0.f16104r).f17584w;
                C1023u0.m(x10);
                v10 = x10.f17178E;
            } else if (i11 != 4) {
                X x11 = ((C1023u0) c1003n0.f16104r).f17584w;
                C1023u0.m(x11);
                v10 = x11.f17176C;
            } else if (z10) {
                X x12 = ((C1023u0) c1003n0.f16104r).f17584w;
                C1023u0.m(x12);
                v10 = x12.f17174A;
            } else if (z11) {
                X x13 = ((C1023u0) c1003n0.f16104r).f17584w;
                C1023u0.m(x13);
                v10 = x13.f17185z;
            } else {
                X x14 = ((C1023u0) c1003n0.f16104r).f17584w;
                C1023u0.m(x14);
                v10 = x14.f17175B;
            }
        } else if (z10) {
            X x15 = ((C1023u0) c1003n0.f16104r).f17584w;
            C1023u0.m(x15);
            v10 = x15.f17183x;
        } else if (z11) {
            X x16 = ((C1023u0) c1003n0.f16104r).f17584w;
            C1023u0.m(x16);
            v10 = x16.f17182w;
        } else {
            X x17 = ((C1023u0) c1003n0.f16104r).f17584w;
            C1023u0.m(x17);
            v10 = x17.f17184y;
        }
        int size = list.size();
        if (size == 1) {
            v10.b(list.get(0), str);
            return;
        }
        if (size == 2) {
            v10.c(list.get(0), list.get(1), str);
        } else if (size != 3) {
            v10.a(str);
        } else {
            v10.d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    public void n(G0 g10, int i10) {
        EnumC0984h enumC0984h;
        if (i10 == -30) {
            enumC0984h = EnumC0984h.TCF;
        } else if (i10 == -20) {
            enumC0984h = EnumC0984h.API;
        } else if (i10 == -10) {
            enumC0984h = EnumC0984h.MANIFEST;
        } else if (i10 != 0) {
            enumC0984h = i10 != 30 ? EnumC0984h.UNSET : EnumC0984h.INITIALIZATION;
        } else {
            enumC0984h = EnumC0984h.API;
        }
        ((EnumMap) this.f10875s).put(g10, enumC0984h);
    }

    public void o(G0 g10, EnumC0984h enumC0984h) {
        ((EnumMap) this.f10875s).put(g10, enumC0984h);
    }

    @Override // I1.r
    public I1.B0 p(View view, I1.B0 b5) {
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.f10875s;
        WeakHashMap weakHashMap = S.f3689a;
        I1.B0 b10 = collapsingToolbarLayout.getFitsSystemWindows() ? b5 : null;
        if (!Objects.equals(collapsingToolbarLayout.R, b10)) {
            collapsingToolbarLayout.R = b10;
            collapsingToolbarLayout.requestLayout();
        }
        return b5.f3671a.c();
    }

    public String toString() {
        switch (this.f10874r) {
            case 11:
                StringBuilder sb = new StringBuilder("1");
                for (G0 g10 : G0.values()) {
                    EnumC0984h enumC0984h = (EnumC0984h) ((EnumMap) this.f10875s).get(g10);
                    if (enumC0984h == null) {
                        enumC0984h = EnumC0984h.UNSET;
                    }
                    sb.append(enumC0984h.f17383r);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public B(EnumMap enumMap) {
        this.f10874r = 11;
        EnumMap enumMap2 = new EnumMap(G0.class);
        this.f10875s = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public B(p218w3.j jVar) {
        this.f10874r = 21;
        p251z9.j.e(jVar, "suraModel");
        this.f10875s = jVar;
    }

    public B(int i10) {
        this.f10874r = i10;
        switch (i10) {
            case 4:
                break;
            case 11:
                this.f10875s = new EnumMap(G0.class);
                break;
            case 17:
                this.f10875s = new ArrayList(20);
                break;
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                this.f10875s = new p118l7.o();
                break;
            case 28:
                this.f10875s = new LinkedHashSet();
                break;
            default:
                this.f10875s = new ConcurrentHashMap(16);
                break;
        }
    }

    public B(EditText editText) {
        this.f10874r = 6;
        this.f10875s = new L5.c(editText);
    }

    public B(long[] jArr) {
        u.v vVar;
        this.f10874r = 15;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            vVar = new u.v(jArrCopyOf.length);
            int i10 = vVar.f22766b;
            if (i10 >= 0) {
                if (jArrCopyOf.length != 0) {
                    int length = jArrCopyOf.length + i10;
                    long[] jArr2 = vVar.f22765a;
                    if (jArr2.length < length) {
                        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                        p251z9.j.d(jArrCopyOf2, "copyOf(...)");
                        vVar.f22765a = jArrCopyOf2;
                    }
                    long[] jArr3 = vVar.f22765a;
                    int i11 = vVar.f22766b;
                    if (i10 != i11) {
                        p120l9.l.Z(jArr3, jArr3, jArrCopyOf.length + i10, i10, i11);
                    }
                    p120l9.l.Z(jArrCopyOf, jArr3, i10, 0, jArrCopyOf.length);
                    vVar.f22766b += jArrCopyOf.length;
                }
            } else {
                p204v.a.d("");
                throw null;
            }
        } else {
            vVar = new u.v(16);
        }
        this.f10875s = vVar;
    }
}
