package p151p;

import A.C0040q0;
import I1.B0;
import I1.S;
import I1.r;
import I1.y0;
import K9.AbstractC0405x;
import K9.H;
import R9.d;
import R9.e;
import T1.C0504v;
import X.C0641m;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import i7.B;
import i7.C;
import io.realm.RealmFieldTypeConstants;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;
import p110k9.y;
import p118l7.h;
import p118l7.o;
import p140o.i;
import p160p8.g;
import p202u7.a;
import p207v2.C1369g;
import p207v2.f0;
import p207v2.i0;
import p223x.A;
import p223x.AbstractC1427p;
import p223x.InterfaceC1428q;
import p223x.InterfaceC1436z;
import p224x0.C1446j;
import p224x0.k;
import p224x0.m;
import p224x0.n;
import p224x0.s;
import p224x0.t;
import p224x0.u;
import p224x0.x;
import p224x0.z;
import q9.c;
import x8.b;

/* JADX INFO: renamed from: p.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1256n implements i, InterfaceC1258o, h, r, a, InterfaceC1428q {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f20746r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f20747s;

    public /* synthetic */ C1256n(int i10, Object obj) {
        this.f20746r = i10;
        this.f20747s = obj;
    }

    public void a() {
        ((ArrayList) this.f20747s).add(C1446j.f24250c);
    }

    public void b(float f3, float f7, float f10, float f11, float f12, float f13) {
        ((ArrayList) this.f20747s).add(new k(f3, f7, f10, f11, f12, f13));
    }

    public void c(float f3, float f7, float f10, float f11, float f12, float f13) {
        ((ArrayList) this.f20747s).add(new s(f3, f7, f10, f11, f12, f13));
    }

    public void d(float f3) {
        ((ArrayList) this.f20747s).add(new t(f3));
    }

    public void e(float f3, float f7) {
        ((ArrayList) this.f20747s).add(new m(f3, f7));
    }

    public void f(float f3, float f7) {
        ((ArrayList) this.f20747s).add(new u(f3, f7));
    }

    public Object g(int i10, c cVar) {
        e eVar = H.f5322a;
        return AbstractC0405x.I(d.f7436t, new C0040q0(i10, 19, this, null), cVar);
    }

    @Override // p223x.InterfaceC1428q
    public InterfaceC1436z get(int i10) {
        switch (this.f20746r) {
            case 11:
                return ((A[]) this.f20747s)[i10];
            default:
                return (InterfaceC1436z) this.f20747s;
        }
    }

    @Override // p118l7.h
    public o h(Object obj) {
        b bVar = (b) obj;
        p160p8.m mVar = ((p160p8.k) this.f20747s).f21084e;
        if (bVar != null) {
            return p000a.a.q0(Arrays.asList(p160p8.m.a(mVar), mVar.f21099m.i(mVar.f21093e.f21345a, null)));
        }
        Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
        return p000a.a.E(null);
    }

    public Object i(Integer[] numArr, c cVar) {
        e eVar = H.f5322a;
        return AbstractC0405x.I(d.f7436t, new B2.d(numArr, this, null, 17), cVar);
    }

    public void j(float f3, float f7) {
        ((ArrayList) this.f20747s).add(new n(f3, f7));
    }

    public b k(JSONObject jSONObject) {
        x8.c c10;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            c10 = new B(17);
        } else {
            c10 = new C(17);
        }
        return c10.e((C) this.f20747s, jSONObject);
    }

    public JSONObject l() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f20747s;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(g.i(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        g.b(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    g.b(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            g.b(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            g.b(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void m(float f3, float f7, float f10, float f11) {
        ((ArrayList) this.f20747s).add(new x(f3, f7, f10, f11));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(C0504v c0504v, c cVar) {
        i0 i0Var;
        C1256n c1256n;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i10 = i0Var.f23254u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                i0Var.f23254u = i10 - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(this, cVar);
            }
        } else {
            i0Var = new i0(this, cVar);
        }
        Object obj = i0Var.f23252s;
        int i11 = i0Var.f23254u;
        if (i11 == 0) {
            p110k9.a.e(obj);
            try {
                C0641m c0641m = new C0641m(this, c0504v, null, 16);
                i0Var.f23251r = this;
                i0Var.f23254u = 1;
                Object objJ = AbstractC0405x.j(c0641m, i0Var);
                p161p9.a aVar = p161p9.a.f21156r;
                if (objJ == aVar) {
                    return aVar;
                }
            } catch (f0 e10) {
                e = e10;
                c1256n = this;
                if (e.f23232r != c1256n) {
                    throw e;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1256n = i0Var.f23251r;
            try {
                p110k9.a.e(obj);
            } catch (f0 e11) {
                e = e11;
                if (e.f23232r != c1256n) {
                    throw e;
                }
            }
        }
        return y.f19095a;
    }

    public void o(float f3) {
        ((ArrayList) this.f20747s).add(new z(f3));
    }

    @Override // I1.r
    public B0 p(View view, B0 b5) {
        switch (this.f20746r) {
            case 5:
                p193t7.e eVar = (p193t7.e) this.f20747s;
                p193t7.d dVar = eVar.f22634D;
                if (dVar != null) {
                    eVar.f22638w.f14686o0.remove(dVar);
                }
                p193t7.d dVar2 = new p193t7.d(eVar.f22641z, b5);
                eVar.f22634D = dVar2;
                dVar2.e(eVar.getWindow());
                BottomSheetBehavior bottomSheetBehavior = eVar.f22638w;
                p193t7.d dVar3 = eVar.f22634D;
                ArrayList arrayList = bottomSheetBehavior.f14686o0;
                if (!arrayList.contains(dVar3)) {
                    arrayList.add(dVar3);
                }
                break;
            default:
                y0 y0Var = b5.f3671a;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f20747s;
                if (!Objects.equals(coordinatorLayout.f12298E, b5)) {
                    coordinatorLayout.f12298E = b5;
                    boolean z10 = b5.d() > 0;
                    coordinatorLayout.f12299F = z10;
                    coordinatorLayout.setWillNotDraw(!z10 && coordinatorLayout.getBackground() == null);
                    if (!y0Var.o()) {
                        int childCount = coordinatorLayout.getChildCount();
                        for (int i10 = 0; i10 < childCount; i10++) {
                            View childAt = coordinatorLayout.getChildAt(i10);
                            WeakHashMap weakHashMap = S.f3689a;
                            if (!childAt.getFitsSystemWindows() || ((u1.e) childAt.getLayoutParams()).f22806a == null || !y0Var.o()) {
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                break;
        }
        return b5;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003c A[RETURN] */
    @Override // p140o.i
    public boolean q(p140o.k kVar, MenuItem menuItem) {
        boolean zOnMenuItemClick;
        InterfaceC1258o interfaceC1258o = ((ActionMenuView) this.f20747s).R;
        if (interfaceC1258o != null) {
            Toolbar toolbar = (Toolbar) ((C1256n) interfaceC1258o).f20747s;
            Iterator it = ((CopyOnWriteArrayList) toolbar.f11691a0.f11365t).iterator();
            while (it.hasNext()) {
                if (((p056f2.C) it.next()).f15936a.p()) {
                    zOnMenuItemClick = true;
                    if (zOnMenuItemClick) {
                        return true;
                    }
                }
            }
            f1 f1Var = toolbar.f11693c0;
            zOnMenuItemClick = f1Var != null ? f1Var.onMenuItemClick(menuItem) : false;
            if (zOnMenuItemClick) {
                return true;
            }
        }
        return false;
    }

    @Override // p140o.i
    public void z(p140o.k kVar) {
        i iVar = ((ActionMenuView) this.f20747s).f11481M;
        if (iVar != null) {
            iVar.z(kVar);
        }
    }

    public C1256n(int i10) {
        this.f20746r = i10;
        switch (i10) {
            case 8:
                Aa.a aVar = new Aa.a();
                aVar.f554r = new C1369g();
                aVar.f555s = new C1369g();
                aVar.f557u = new ReentrantLock();
                this.f20747s = aVar;
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                this.f20747s = new ArrayList(32);
                break;
        }
    }

    public C1256n(p213v8.b bVar) {
        this.f20746r = 14;
        this.f20747s = new File((File) bVar.f23380c, "com.crashlytics.settings.json");
    }

    public C1256n(boolean z10) {
        this.f20746r = 9;
        this.f20747s = new Ca.r(this, z10);
    }

    public C1256n(p160p8.k kVar, String str) {
        this.f20746r = 3;
        this.f20747s = kVar;
    }

    public C1256n(AbstractC1427p abstractC1427p, float f3, float f7) {
        this.f20746r = 11;
        int iB = abstractC1427p.b();
        A[] aArr = new A[iB];
        for (int i10 = 0; i10 < iB; i10++) {
            aArr[i10] = new A(f3, f7, abstractC1427p.a(i10));
        }
        this.f20747s = aArr;
    }
}
