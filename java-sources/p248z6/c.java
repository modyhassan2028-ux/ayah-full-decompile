package p248z6;

import Ca.i;
import Ca.n;
import Ca.q;
import E2.AbstractC0115c0;
import E2.AbstractC0135m0;
import E2.C0137n0;
import E2.P0;
import E2.U;
import E8.e;
import F.A;
import F2.C0166k;
import F2.D;
import F7.j;
import H7.C0230d;
import I1.B0;
import I1.InterfaceC0258k;
import I1.S;
import I1.r;
import I1.y0;
import J0.AbstractC0283f;
import J0.D0;
import J0.I;
import K1.f;
import K9.C0389g;
import N9.AbstractC0419l;
import N9.k0;
import Q2.b;
import Z.X;
import android.R;
import android.content.ClipDescription;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.navigation.NavigationView;
import fa.a;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p063g1.o;
import p063g1.p;
import p118l7.d;
import p140o.k;

/* JADX INFO: loaded from: classes.dex */
public class c implements i, U, P0, F1.c, j, a, N7.a, r, b, p140o.i, InterfaceC0258k, d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static c f24845t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f24846r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f24847s;

    public /* synthetic */ c(char c10, int i10) {
        this.f24846r = i10;
    }

    @Override // I1.InterfaceC0258k
    public void A() {
        ((NestedScrollView) this.f24847s).f12368u.abortAnimation();
    }

    public void B(I i10) {
        if (!i10.H()) {
            G0.a.b("DepthSortedSet.add called on an unattached node");
        }
        ((D0) this.f24847s).add(i10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public void C(D d5, q9.c cVar) {
        C0166k c0166k;
        if (cVar instanceof C0166k) {
            c0166k = (C0166k) cVar;
            int i10 = c0166k.f2291t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0166k.f2291t = i10 - Integer.MIN_VALUE;
            } else {
                c0166k = new C0166k(this, cVar);
            }
        } else {
            c0166k = new C0166k(this, cVar);
        }
        Object obj = c0166k.f2289r;
        int i11 = c0166k.f2291t;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(obj);
            throw new A6.a();
        }
        p110k9.a.e(obj);
        k0 k0Var = (k0) this.f24847s;
        c0166k.f2291t = 1;
        k0Var.d(d5, c0166k);
    }

    public String D(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            E8.d dVar = (E8.d) this.f24847s;
            e eVar = new e(stringWriter, dVar.f1983a, dVar.f1984b, dVar.f1985c, dVar.f1986d);
            eVar.h(obj);
            eVar.j();
            eVar.f1988b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public void E(byte b5) {
        ((Parcel) this.f24847s).writeByte(b5);
    }

    public void F(float f3) {
        ((Parcel) this.f24847s).writeFloat(f3);
    }

    public void G(long j) {
        long jB = o.b(j);
        byte b5 = 0;
        if (!p.a(jB, 0L)) {
            if (p.a(jB, 4294967296L)) {
                b5 = 1;
            } else if (p.a(jB, 8589934592L)) {
                b5 = 2;
            }
        }
        E(b5);
        if (p.a(o.b(j), 0L)) {
            return;
        }
        F(o.c(j));
    }

    public O8.c H() {
        return new O8.c(((A) this.f24847s).g());
    }

    public void I() {
        View view = (View) this.f24847s;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void J(Set set) {
        Object value;
        int[] iArr;
        p251z9.j.e(set, "tableIds");
        if (set.isEmpty()) {
            return;
        }
        k0 k0Var = (k0) this.f24847s;
        do {
            value = k0Var.getValue();
            int[] iArr2 = (int[]) value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = set.contains(Integer.valueOf(i10)) ? iArr2[i10] + 1 : iArr2[i10];
            }
        } while (!k0Var.l(value, iArr));
    }

    public boolean K(I i10) {
        if (!i10.H()) {
            G0.a.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((D0) this.f24847s).remove(i10);
    }

    public void L() {
        View viewFindViewById;
        View view = (View) this.f24847s;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new H7.I(1, viewFindViewById));
    }

    @Override // F7.j
    public int a() {
        return ((ExtendedFloatingActionButton) this.f24847s).getMeasuredHeight();
    }

    @Override // F7.j
    public int b() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.f24847s;
        return (extendedFloatingActionButton.getMeasuredWidth() - (extendedFloatingActionButton.getCollapsedPadding() * 2)) + extendedFloatingActionButton.Q + extendedFloatingActionButton.R;
    }

    @Override // Q2.b
    public Q2.a c(String str) {
        p251z9.j.e(str, "fileName");
        return new I2.a(((R2.c) this.f24847s).U());
    }

    @Override // F1.c
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f24847s;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // Ca.i
    public Object d(q qVar) {
        p251z9.j.e(qVar, "reader");
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (!(qVar.c() != null)) {
                return arrayList;
            }
            arrayList.add(((n) this.f24847s).d(qVar));
        }
    }

    @Override // F1.c
    public Cursor e(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f24847s;
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

    @Override // p118l7.d
    public void f(p118l7.o oVar) {
        Exception excD = oVar.d();
        if (excD != null) {
            ((C0389g) this.f24847s).resumeWith(p110k9.a.b(excD));
        } else if (oVar.f19424d) {
            ((C0389g) this.f24847s).h(null);
        } else {
            ((C0389g) this.f24847s).resumeWith(oVar.e());
        }
    }

    @Override // E2.U
    public void g(int i10, int i11) {
        ((AbstractC0115c0) this.f24847s).f1651r.f(i10, i11);
    }

    @Override // E2.U
    public void h(int i10, int i11) {
        ((AbstractC0115c0) this.f24847s).f1651r.c(i10, i11);
    }

    @Override // F7.j
    public int i() {
        return ((ExtendedFloatingActionButton) this.f24847s).R;
    }

    @Override // E2.P0
    public int j() {
        AbstractC0135m0 abstractC0135m0 = (AbstractC0135m0) this.f24847s;
        return abstractC0135m0.f1727o - abstractC0135m0.D();
    }

    @Override // Ca.i
    public void k(Ca.r rVar, Object obj) {
        List list = (List) obj;
        p251z9.j.e(rVar, "writer");
        p251z9.j.e(list, "value");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((n) this.f24847s).a(rVar, it.next());
        }
    }

    @Override // F7.j
    public int l() {
        return ((ExtendedFloatingActionButton) this.f24847s).Q;
    }

    @Override // E2.P0
    public int m(View view) {
        return (view.getTop() - ((C0137n0) view.getLayoutParams()).f1734b.top) - ((ViewGroup.MarginLayoutParams) ((C0137n0) view.getLayoutParams())).topMargin;
    }

    @Override // I1.InterfaceC0258k
    public boolean n(float f3) {
        if (f3 == 0.0f) {
            return false;
        }
        A();
        ((NestedScrollView) this.f24847s).h((int) f3);
        return true;
    }

    @Override // fa.a
    public void o(p072ga.d dVar, int i10) {
        if (i10 == 0) {
            ((X) this.f24847s).setValue(Boolean.FALSE);
        }
    }

    @Override // I1.r
    public B0 p(View view, B0 b5) {
        ScrimInsetsFrameLayout scrimInsetsFrameLayout = (ScrimInsetsFrameLayout) this.f24847s;
        if (scrimInsetsFrameLayout.f14989s == null) {
            scrimInsetsFrameLayout.f14989s = new Rect();
        }
        Rect rect = scrimInsetsFrameLayout.f14989s;
        int iB = b5.b();
        y0 y0Var = b5.f3671a;
        rect.set(iB, b5.d(), b5.c(), b5.a());
        scrimInsetsFrameLayout.e(b5);
        scrimInsetsFrameLayout.setWillNotDraw(y0Var.l().equals(A1.c.f461e) || scrimInsetsFrameLayout.f14988r == null);
        WeakHashMap weakHashMap = S.f3689a;
        scrimInsetsFrameLayout.postInvalidateOnAnimation();
        return y0Var.c();
    }

    @Override // p140o.i
    public boolean q(k kVar, MenuItem menuItem) {
        ((NavigationView) this.f24847s).getClass();
        return false;
    }

    @Override // E2.P0
    public View r(int i10) {
        return ((AbstractC0135m0) this.f24847s).v(i10);
    }

    @Override // E2.U
    public void s(int i10, int i11) {
        ((AbstractC0115c0) this.f24847s).f1651r.e(i10, i11);
    }

    @Override // E2.P0
    public int t() {
        return ((AbstractC0135m0) this.f24847s).G();
    }

    public String toString() {
        switch (this.f24846r) {
            case 17:
                return ((D0) this.f24847s).toString();
            default:
                return super.toString();
        }
    }

    @Override // E2.U
    public void u(int i10, int i11, Object obj) {
        ((AbstractC0115c0) this.f24847s).f1651r.d(i10, i11, obj);
    }

    @Override // E2.P0
    public int v(View view) {
        return view.getBottom() + ((C0137n0) view.getLayoutParams()).f1734b.bottom + ((ViewGroup.MarginLayoutParams) ((C0137n0) view.getLayoutParams())).bottomMargin;
    }

    @Override // F7.j
    public ViewGroup.LayoutParams w() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    @Override // I1.InterfaceC0258k
    public float x() {
        return -((NestedScrollView) this.f24847s).getVerticalScrollFactorCompat();
    }

    @Override // N7.a
    public void y(Typeface typeface) {
        C0230d c0230d = (C0230d) this.f24847s;
        if (c0230d.m(typeface)) {
            c0230d.i(false);
        }
    }

    public /* synthetic */ c(int i10, Object obj) {
        this.f24846r = i10;
        this.f24847s = obj;
    }

    public c(Context context) {
        this.f24846r = 0;
        this.f24847s = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public c(R2.c cVar) {
        this.f24846r = 16;
        p251z9.j.e(cVar, "openHelper");
        this.f24847s = cVar;
    }

    public c(boolean z10) {
        this.f24846r = 28;
        this.f24847s = new AtomicBoolean(z10);
    }

    public c(int i10, byte b5) {
        Object eVar;
        this.f24846r = i10;
        switch (i10) {
            case 25:
                this.f24847s = new AtomicInteger(0);
                break;
            case 29:
                if (Build.VERSION.SDK_INT >= 28) {
                    eVar = new Y0.q();
                } else {
                    eVar = new H8.e(18);
                }
                this.f24847s = eVar;
                break;
            default:
                this.f24847s = new D0(AbstractC0283f.f4083a);
                break;
        }
    }

    public c(Context context, W3.e eVar) {
        this.f24846r = 14;
        this.f24847s = new GestureDetector(context, eVar, null);
    }

    public c(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f24846r = 19;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f24847s = new f(uri, clipDescription, uri2);
        } else {
            this.f24847s = new android.support.v4.media.session.r(uri, clipDescription, uri2, 16);
        }
    }

    public c(Context context, Uri uri) {
        this.f24846r = 6;
        this.f24847s = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public c(int i10) {
        this.f24846r = 7;
        this.f24847s = AbstractC0419l.c(new int[i10]);
    }

    @Override // p140o.i
    public void z(k kVar) {
    }
}
