package O8;

import A.EnumC0047u0;
import C2.d;
import D0.v;
import D0.w;
import D0.x;
import E2.AbstractC0135m0;
import E2.C0137n0;
import E2.P0;
import F.r;
import F.s;
import F7.j;
import Ga.C0193b;
import Ga.z;
import H7.C0230d;
import H7.H;
import H7.InterfaceC0234h;
import H7.L;
import H7.M;
import I1.B0;
import I1.C0271y;
import I1.S;
import J1.g;
import J1.h;
import M.k;
import N9.AbstractC0419l;
import N9.k0;
import O.N;
import T1.C0485b;
import T1.C0487d;
import T1.InterfaceC0486c;
import T1.W;
import T1.d0;
import T1.e0;
import U0.K;
import Z0.y;
import android.content.ContentProviderClient;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsController;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.viewpager2.widget.ViewPager2;
import com.ayah.MainActivity;
import com.ayah.R;
import com.ayah.ui.widget.DrawerViewPager2;
import com.google.android.gms.internal.measurement.J1;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigationrail.NavigationRailView;
import io.realm.internal.ObjectServerFacade;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import p063g1.m;
import p120l9.n;
import p140o.i;
import p180s0.B;
import p180s0.C1300i;
import p180s0.F;
import p180s0.J;
import u.C1360o;

/* JADX INFO: loaded from: classes.dex */
public class c implements d, P0, F1.c, j, InterfaceC0234h, N7.a, J, i, L, InterfaceC0486c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static volatile c f6510s;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f6511r;

    public /* synthetic */ c(Object obj) {
        this.f6511r = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Iterable, java.lang.Object] */
    public ArrayList A() {
        ?? r10 = ((r) this.f6511r).f2103k;
        ArrayList arrayList = new ArrayList(n.a0(r10, 10));
        Iterator it = r10.iterator();
        while (it.hasNext()) {
            arrayList.add(new z((s) it.next(), s()));
        }
        return arrayList;
    }

    public boolean C(int i10, int i11, Bundle bundle) {
        return false;
    }

    public J1 D(k kVar, AndroidComposeView androidComposeView) {
        long jM;
        long j;
        boolean z10;
        C1360o c1360o = (C1360o) this.f6511r;
        List list = (List) kVar.f5618s;
        C1360o c1360o2 = new C1360o(list.size());
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            x xVar = (x) list.get(i10);
            long j10 = xVar.f1148a;
            w wVar = (w) c1360o.d(j10);
            if (wVar == null) {
                j = xVar.f1149b;
                jM = xVar.f1151d;
                z10 = false;
            } else {
                long j11 = wVar.f1145a;
                boolean z11 = wVar.f1147c;
                jM = androidComposeView.M(wVar.f1146b);
                j = j11;
                z10 = z11;
            }
            long j12 = xVar.f1148a;
            List list2 = list;
            int i11 = size;
            c1360o2.h(j12, new v(j12, xVar.f1149b, xVar.f1151d, xVar.f1152e, xVar.f1153f, j, jM, z10, xVar.g, xVar.f1155i, xVar.j, xVar.f1156k));
            boolean z12 = xVar.f1152e;
            if (z12) {
                c1360o.h(j10, new w(xVar.f1149b, xVar.f1150c, z12));
            } else {
                c1360o.i(j10);
            }
            i10++;
            list = list2;
            size = i11;
        }
        return new J1(c1360o2, kVar);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    public void E(d0 d0Var) {
        Object value;
        d0 d0Var2;
        p251z9.j.e(d0Var, "newState");
        k0 k0Var = (k0) this.f6511r;
        do {
            value = k0Var.getValue();
            d0Var2 = (d0) value;
            if (d0Var2 instanceof W ? true : p251z9.j.a(d0Var2, e0.f7670b)) {
                d0Var2 = d0Var;
            } else if (d0Var2 instanceof C0487d) {
                if (d0Var.f7669a > d0Var2.f7669a) {
                    d0Var2 = d0Var;
                }
            } else if (!(d0Var2 instanceof T1.L)) {
                throw new A6.a();
            }
        } while (!k0Var.l(value, d0Var2));
    }

    public void F(y yVar, long j, boolean z10, J1.c cVar) {
        N n6 = (N) this.f6511r;
        n6.o(K.b(N.a(n6, yVar, j, z10, false, cVar, false)) ? K.L.f4486t : K.L.f4485s);
    }

    @Override // F7.j
    public int a() {
        return ((ExtendedFloatingActionButton) this.f6511r).getCollapsedSize();
    }

    @Override // F7.j
    public int b() {
        return ((ExtendedFloatingActionButton) this.f6511r).getCollapsedSize();
    }

    @Override // p180s0.J
    public F c(long j, m mVar, p063g1.c cVar) {
        return new B((C1300i) this.f6511r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // F1.c
    public void close() throws Exception {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f6511r;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                F1.d.d((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override // F1.c
    public Cursor e(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f6511r;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e10) {
            Log.w("FontsProvider", "Unable to query the content provider", e10);
            return null;
        }
    }

    @Override // T1.InterfaceC0486c
    public Object f(C0485b c0485b) {
        return ((p241y9.c) this.f6511r).e(c0485b);
    }

    @Override // C2.d
    public void g() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // C2.d
    public void h(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f6511r).setResultCode(i10);
    }

    @Override // F7.j
    public int i() {
        return ((ExtendedFloatingActionButton) this.f6511r).getCollapsedPadding();
    }

    @Override // E2.P0
    public int j() {
        AbstractC0135m0 abstractC0135m0 = (AbstractC0135m0) this.f6511r;
        return abstractC0135m0.f1726n - abstractC0135m0.F();
    }

    public g k(int i10) {
        return null;
    }

    @Override // F7.j
    public int l() {
        return ((ExtendedFloatingActionButton) this.f6511r).getCollapsedPadding();
    }

    @Override // E2.P0
    public int m(View view) {
        return (view.getLeft() - ((C0137n0) view.getLayoutParams()).f1734b.left) - ((ViewGroup.MarginLayoutParams) ((C0137n0) view.getLayoutParams())).leftMargin;
    }

    @Override // H7.L
    public B0 n(View view, B0 b5, M m10) {
        boolean fitsSystemWindows;
        boolean fitsSystemWindows2;
        boolean fitsSystemWindows3;
        A1.c cVarG = b5.f3671a.g(519);
        NavigationRailView navigationRailView = (NavigationRailView) this.f6511r;
        Boolean bool = navigationRailView.f15098z;
        if (bool != null) {
            fitsSystemWindows = bool.booleanValue();
        } else {
            WeakHashMap weakHashMap = S.f3689a;
            fitsSystemWindows = navigationRailView.getFitsSystemWindows();
        }
        if (fitsSystemWindows) {
            m10.f3459b += cVarG.f463b;
        }
        Boolean bool2 = navigationRailView.f15094A;
        if (bool2 != null) {
            fitsSystemWindows2 = bool2.booleanValue();
        } else {
            WeakHashMap weakHashMap2 = S.f3689a;
            fitsSystemWindows2 = navigationRailView.getFitsSystemWindows();
        }
        if (fitsSystemWindows2) {
            m10.f3461d += cVarG.f465d;
        }
        Boolean bool3 = navigationRailView.f15095B;
        if (bool3 != null) {
            fitsSystemWindows3 = bool3.booleanValue();
        } else {
            WeakHashMap weakHashMap3 = S.f3689a;
            fitsSystemWindows3 = navigationRailView.getFitsSystemWindows();
        }
        if (fitsSystemWindows3) {
            m10.f3458a += H.l(view) ? cVarG.f464c : cVarG.f462a;
        }
        int i10 = m10.f3458a;
        int i11 = m10.f3459b;
        int i12 = m10.f3460c;
        int i13 = m10.f3461d;
        WeakHashMap weakHashMap4 = S.f3689a;
        view.setPaddingRelative(i10, i11, i12, i13);
        return b5;
    }

    public g o(int i10) {
        return null;
    }

    public d0 p() {
        return (d0) ((k0) this.f6511r).getValue();
    }

    @Override // p140o.i
    public boolean q(p140o.k kVar, MenuItem menuItem) {
        int i10;
        NavigationBarView navigationBarView = (NavigationBarView) this.f6511r;
        int i11 = NavigationBarView.f15069w;
        navigationBarView.getClass();
        K7.i iVar = navigationBarView.f15074v;
        if (iVar != null) {
            MainActivity mainActivity = ((p035d3.z) iVar).f15689r;
            int i12 = MainActivity.f13622J0;
            p251z9.j.e(menuItem, "item");
            DrawerViewPager2 drawerViewPager2 = mainActivity.f13637b0;
            if (drawerViewPager2 == null) {
                p251z9.j.k("rightPager");
                throw null;
            }
            ViewPager2 pager = drawerViewPager2.getPager();
            if (mainActivity.f13638c0 == null) {
                p251z9.j.k("rightAdapter");
                throw null;
            }
            int itemId = menuItem.getItemId();
            if (itemId == R.id.index) {
                i10 = 0;
            } else if (itemId == R.id.khatmah) {
                i10 = 1;
            } else if (itemId == R.id.bookmarks) {
                i10 = 2;
            } else {
                i10 = itemId == R.id.favorites ? 3 : 4;
            }
            if (pager.getCurrentItem() != i10) {
                pager.setCurrentItem(i10, false);
            }
        }
        return false;
    }

    @Override // E2.P0
    public View r(int i10) {
        return ((AbstractC0135m0) this.f6511r).v(i10);
    }

    public EnumC0047u0 s() {
        return ((r) this.f6511r).f2107o;
    }

    @Override // E2.P0
    public int t() {
        return ((AbstractC0135m0) this.f6511r).E();
    }

    public Set u() {
        Set setUnmodifiableSet;
        synchronized (((HashSet) this.f6511r)) {
            setUnmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f6511r);
        }
        return setUnmodifiableSet;
    }

    @Override // E2.P0
    public int v(View view) {
        return view.getRight() + ((C0137n0) view.getLayoutParams()).f1734b.right + ((ViewGroup.MarginLayoutParams) ((C0137n0) view.getLayoutParams())).rightMargin;
    }

    @Override // F7.j
    public ViewGroup.LayoutParams w() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.f6511r;
        return new ViewGroup.LayoutParams(extendedFloatingActionButton.getCollapsedSize(), extendedFloatingActionButton.getCollapsedSize());
    }

    public Ga.B x(C0193b c0193b) {
        long jG;
        r rVar = (r) this.f6511r;
        p251z9.j.e(c0193b, "padding");
        float f3 = c0193b.f3006a;
        float f7 = c0193b.f3007b;
        int iOrdinal = s().ordinal();
        if (iOrdinal == 0) {
            jG = rVar.g() & 4294967295L;
        } else {
            if (iOrdinal != 1) {
                throw new A6.a();
            }
            jG = rVar.g() >> 32;
        }
        return new Ga.B(f3, ((int) jG) - f7);
    }

    @Override // N7.a
    public void y(Typeface typeface) {
        C0230d c0230d = (C0230d) this.f6511r;
        if (c0230d.o(typeface)) {
            c0230d.i(false);
        }
    }

    public c(ViewGroup viewGroup) {
        this.f6511r = viewGroup.getOverlay();
    }

    public c(int i10) {
        switch (i10) {
            case 4:
                this.f6511r = new C1360o((Object) null);
                break;
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f6511r = new J1.i(this);
                } else {
                    this.f6511r = new h(this);
                }
                break;
            case 26:
                this.f6511r = AbstractC0419l.c(e0.f7670b);
                break;
            default:
                this.f6511r = new HashSet();
                break;
        }
    }

    public c(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            C0271y c0271y = new C0271y(15, view);
            c0271y.f3794u = view;
            this.f6511r = c0271y;
            return;
        }
        this.f6511r = new p248z6.c(15, view);
    }

    public c(WindowInsetsController windowInsetsController) {
        C0271y c0271y = new C0271y(15, null);
        c0271y.f3795v = windowInsetsController;
        this.f6511r = c0271y;
    }

    public void B() {
    }

    @Override // p140o.i
    public void z(p140o.k kVar) {
    }

    public void d(int i10, g gVar, String str, Bundle bundle) {
    }
}
