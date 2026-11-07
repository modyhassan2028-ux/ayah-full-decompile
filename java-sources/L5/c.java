package L5;

import A.C0039q;
import A.M0;
import A.Y;
import Da.A;
import Da.s;
import E2.N0;
import E6.u;
import I1.B0;
import I1.G;
import I1.S;
import I1.Z;
import I1.r;
import R6.g;
import U0.C0515g;
import W.C0601t1;
import Z.W;
import Z0.B;
import Z0.InterfaceC0716g;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C0763l;
import androidx.lifecycle.EnumC0767p;
import androidx.viewpager.widget.ViewPager;
import com.ayah.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import com.google.android.gms.internal.measurement.B1;
import io.realm.RealmFieldTypeConstants;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k3.f;
import k3.h;
import ka.w;
import oa.m;
import p013b2.p;
import p013b2.y;
import p056f2.AbstractComponentCallbacksC0947u;
import p056f2.K;
import p057f4.e;
import p084i.x;
import p118l7.d;
import p118l7.i;
import p120l9.n;
import p140o.k;
import p140o.z;
import p151p.C1256n;
import p181s2.o;
import p232y.T;
import p251z9.j;
import u.E;
import u.O;

/* JADX INFO: loaded from: classes.dex */
public class c implements d, W0.d, Y, r, p {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5531r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f5532s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f5533t;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f5531r = i10;
        this.f5533t = obj;
        this.f5532s = obj2;
    }

    public static final boolean i(c cVar, h hVar, k3.a aVar) {
        return (hVar instanceof f) && ((f) hVar).f18973a == aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object j(c cVar, Context context, int i10, p046e4.a aVar, q9.c cVar2) throws IOException {
        e eVar;
        int i11;
        Context context2;
        Bitmap bitmap;
        if (cVar2 instanceof e) {
            eVar = (e) cVar2;
            int i12 = eVar.f16222x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                eVar.f16222x = i12 - Integer.MIN_VALUE;
            } else {
                eVar = new e(cVar, cVar2);
            }
        } else {
            eVar = new e(cVar, cVar2);
        }
        Object obj = eVar.f16220v;
        int i13 = eVar.f16222x;
        if (i13 == 0) {
            p110k9.a.e(obj);
            T3.a aVar2 = (T3.a) cVar.f5533t;
            aVar2.getClass();
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(aVar2.f7779a.getResources(), 2131231026, new BitmapFactory.Options());
            j.d(bitmapDecodeResource, "decodeResource(...)");
            aVar.getClass();
            int iV = 1440 - (B9.a.V(1440 * 0.015f) * 2);
            int iV2 = B9.a.V((bitmapDecodeResource.getHeight() * iV) / (bitmapDecodeResource.getWidth() * 1.0f));
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iV, iV2, Bitmap.Config.ARGB_8888);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeResource, (Rect) null, new Rect(0, 0, iV, iV2), new Paint(7));
            int height = bitmapCreateBitmap.getHeight() + (aVar.f15759b * 2);
            p218w3.j jVar = (p218w3.j) cVar.f5532s;
            eVar.f16216r = context;
            eVar.f16217s = aVar;
            eVar.f16218t = bitmapCreateBitmap;
            eVar.f16219u = height;
            eVar.f16222x = 1;
            Object objB = jVar.b(i10, eVar);
            p161p9.a aVar3 = p161p9.a.f21156r;
            if (objB == aVar3) {
                return aVar3;
            }
            obj = objB;
            i11 = height;
            context2 = context;
            bitmap = bitmapCreateBitmap;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = eVar.f16219u;
            bitmap = eVar.f16218t;
            aVar = eVar.f16217s;
            context2 = eVar.f16216r;
            p110k9.a.e(obj);
        }
        p124m3.b bVarA = ((p124m3.a) obj).a();
        int i14 = bVarA.f19541b;
        int i15 = bVarA.f19542c + 1;
        aVar.getClass();
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(1440, i11, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        float width = (1440 - bitmap.getWidth()) / 2.0f;
        Paint paint = new Paint(7);
        canvas.drawBitmap(bitmap, width, aVar.f15759b, paint);
        paint.setColorFilter(new PorterDuffColorFilter(context2.getColor(R.color.quran_text), PorterDuff.Mode.SRC_ATOP));
        InputStream inputStreamOpen = context2.getAssets().open("quran-images/" + i14 + "/" + i15 + ".png");
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen, null, p057f4.c.f16203e);
            if (bitmapDecodeStream != null) {
                canvas.drawBitmap(bitmapDecodeStream, 0.0f, (float) Math.rint((((double) i11) / 2.0d) - ((double) (bVarA.f19544e * aVar.f15758a))), paint);
            }
            o.e(inputStreamOpen, null);
            return bitmapCreateBitmap2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o.e(inputStreamOpen, th);
                throw th2;
            }
        }
    }

    public void A(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u, View view, boolean z10) {
        j.e(abstractComponentCallbacksC0947u, "f");
        j.e(view, "v");
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = ((K) this.f5532s).f15984y;
        if (abstractComponentCallbacksC0947u2 != null) {
            abstractComponentCallbacksC0947u2.o().f15974o.A(abstractComponentCallbacksC0947u, view, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5533t).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void B(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u, boolean z10) {
        j.e(abstractComponentCallbacksC0947u, "f");
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = ((K) this.f5532s).f15984y;
        if (abstractComponentCallbacksC0947u2 != null) {
            abstractComponentCallbacksC0947u2.o().f15974o.B(abstractComponentCallbacksC0947u, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5533t).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public int C(p031ca.b bVar, u uVar, String str, int i10) throws Throwable {
        Da.j jVarI;
        int i11;
        p040da.b bVar2 = (p040da.b) this.f5533t;
        p052ea.b bVar3 = bVar.f13599a;
        File file = new File(android.support.v4.media.session.p.z(str, ".part"));
        s sVar = null;
        try {
            try {
                try {
                    try {
                        ka.r rVar = (ka.r) this.f5532s;
                        rVar.getClass();
                        ka.u uVarB = new m(rVar, uVar).b();
                        if (uVarB.f19272F) {
                            if (!file.getParentFile().exists()) {
                                try {
                                    file.mkdirs();
                                } catch (IOException e10) {
                                    e = e10;
                                    jVarI = null;
                                    i11 = 2;
                                }
                            }
                            s sVarO = Y2.a.o(new Da.c(1, new FileOutputStream(file, true), new A()));
                            try {
                                w wVar = uVarB.f19279x;
                                long jB = wVar.b();
                                jVarI = wVar.i();
                                try {
                                    try {
                                        try {
                                            Da.h hVar = sVarO.f1390s;
                                            long j = 0;
                                            i11 = 2;
                                            do {
                                                try {
                                                    long jO = jVarI.o(8192L, hVar);
                                                    if (jO == -1) {
                                                        sVarO.flush();
                                                        if (file.renameTo(new File(str))) {
                                                            B1.o(sVarO);
                                                            B1.o(jVarI);
                                                            return 1;
                                                        }
                                                        bVar2.e(bVar3, new g(new Exception("Couldn't rename partial file.")));
                                                        B1.o(sVarO);
                                                        B1.o(jVarI);
                                                        return i11;
                                                    }
                                                    j += jO;
                                                    sVarO.D();
                                                    bVar2.c(bVar3, j, jB, i10);
                                                } catch (IOException e11) {
                                                    e = e11;
                                                    sVar = sVarO;
                                                    bVar2.e(bVar3, new g(e));
                                                    B1.o(sVar);
                                                }
                                            } while (!Thread.interrupted());
                                            throw new InterruptedException();
                                        } catch (InterruptedIOException | InterruptedException unused) {
                                            sVar = sVarO;
                                            bVar2.d(bVar3);
                                            B1.o(sVar);
                                            B1.o(jVarI);
                                            return 3;
                                        }
                                    } catch (IOException e12) {
                                        e = e12;
                                        i11 = 2;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    sVar = sVarO;
                                    B1.o(sVar);
                                    B1.o(jVarI);
                                    throw th;
                                }
                            } catch (InterruptedIOException | InterruptedException unused2) {
                                jVarI = null;
                            } catch (IOException e13) {
                                e = e13;
                                i11 = 2;
                                jVarI = null;
                            } catch (Throwable th2) {
                                th = th2;
                                jVarI = null;
                            }
                        } else {
                            i11 = 2;
                            try {
                                int i12 = uVarB.f19276u;
                                if (i12 != 412 && i12 != 416) {
                                    bVar2.e(bVar3, new g(new Exception("Invalid network code: " + i12)));
                                    return 2;
                                }
                                if (file.delete()) {
                                    return C(bVar, uVar, str, i10);
                                }
                                bVar2.e(bVar3, new g(new Exception("Couldn't remove partial download.")));
                                return 2;
                            } catch (IOException e14) {
                                e = e14;
                            }
                        }
                    } catch (IOException e15) {
                        e = e15;
                        i11 = 2;
                    }
                    B1.o(jVarI);
                    return i11;
                } catch (InterruptedIOException | InterruptedException unused3) {
                    jVarI = null;
                }
            } catch (Throwable th3) {
                th = th3;
                jVarI = null;
            }
            jVarI = null;
            bVar2.e(bVar3, new g(e));
            B1.o(sVar);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public M2.d D() {
        M2.d dVar;
        O2.b bVar = (O2.b) this.f5532s;
        synchronized (bVar.f6452c) {
            Iterator it = bVar.f6453d.entrySet().iterator();
            do {
                dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                M2.d dVar2 = (M2.d) entry.getValue();
                if (j.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    dVar = dVar2;
                }
            } while (dVar == null);
        }
        return dVar;
    }

    public String E(String str) {
        String str2 = (String) this.f5533t;
        Resources resources = (Resources) this.f5532s;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void F(p130n.a aVar) {
        Aa.a aVar2 = (Aa.a) this.f5532s;
        ((ActionMode.Callback) aVar2.f554r).onDestroyActionMode(aVar2.p(aVar));
        x xVar = (x) this.f5533t;
        if (xVar.f16664N != null) {
            xVar.f16653C.getDecorView().removeCallbacks(xVar.f16665O);
        }
        if (xVar.f16663M != null) {
            Z z10 = xVar.f16666P;
            if (z10 != null) {
                z10.b();
            }
            Z zA = S.a(xVar.f16663M);
            zA.a(0.0f);
            xVar.f16666P = zA;
            zA.d(new p084i.o(2, this));
        }
        xVar.f16662L = null;
        ViewGroup viewGroup = xVar.R;
        WeakHashMap weakHashMap = S.f3689a;
        G.c(viewGroup);
        xVar.K();
    }

    public boolean G(p130n.a aVar, Menu menu) {
        ViewGroup viewGroup = ((x) this.f5533t).R;
        WeakHashMap weakHashMap = S.f3689a;
        G.c(viewGroup);
        Aa.a aVar2 = (Aa.a) this.f5532s;
        ActionMode.Callback callback = (ActionMode.Callback) aVar2.f554r;
        p130n.e eVarP = aVar2.p(aVar);
        O o10 = (O) aVar2.f557u;
        Menu zVar = (Menu) o10.get(menu);
        if (zVar == null) {
            zVar = new z((Context) aVar2.f555s, (k) menu);
            o10.put(menu, zVar);
        }
        return callback.onPrepareActionMode(eVarP, zVar);
    }

    public void H() {
        ((O2.b) this.f5532s).a();
    }

    public void I(Bundle bundle) {
        O2.b bVar = (O2.b) this.f5532s;
        M2.e eVar = bVar.f6450a;
        if (!bVar.f6454e) {
            bVar.a();
        }
        if (eVar.h().f12672c.compareTo(EnumC0767p.f12664u) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + eVar.h().f12672c).toString());
        }
        if (bVar.g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleF = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleF = B9.a.F("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        bVar.f6455f = bundleF;
        bVar.g = true;
    }

    public void J(Bundle bundle) {
        O2.b bVar = (O2.b) this.f5532s;
        Bundle bundleP = AbstractC0813f2.p((p110k9.j[]) Arrays.copyOf(new p110k9.j[0], 0));
        Bundle bundle2 = bVar.f6455f;
        if (bundle2 != null) {
            bundleP.putAll(bundle2);
        }
        synchronized (bVar.f6452c) {
            for (Map.Entry entry : bVar.f6453d.entrySet()) {
                Y2.a.b0(bundleP, (String) entry.getKey(), ((M2.d) entry.getValue()).a());
            }
        }
        if (bundleP.isEmpty()) {
            return;
        }
        Y2.a.b0(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleP);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:42:0x011c A[LOOP:2: B:40:0x0116->B:42:0x011c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x012f  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [l9.r] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    public Serializable K(boolean z10, String str, int i10, q9.c cVar) {
        b bVar;
        String str2;
        List list;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        List list2;
        ?? arrayList2;
        String str3;
        Object arrayList3;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i11 = bVar.f5530x;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f5530x = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objA = bVar.f5528v;
        int i12 = bVar.f5530x;
        p161p9.a aVar = p161p9.a.f21156r;
        if (i12 == 0) {
            p110k9.a.e(objA);
            p218w3.f fVar = (p218w3.f) this.f5532s;
            bVar.f5525s = str;
            bVar.f5524r = z10;
            bVar.f5527u = i10;
            bVar.f5530x = 1;
            objA = fVar.a(i10, bVar);
            if (objA != aVar) {
            }
            return aVar;
        }
        if (i12 == 1) {
            i10 = bVar.f5527u;
            z10 = bVar.f5524r;
            str = bVar.f5525s;
            p110k9.a.e(objA);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = bVar.f5524r;
            list = bVar.f5526t;
            str2 = bVar.f5525s;
            p110k9.a.e(objA);
        }
        linkedHashMap = new LinkedHashMap();
        for (Object obj : (List) objA) {
            str3 = ((p065g3.a) obj).f16275c;
            arrayList3 = linkedHashMap.get(str3);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(str3, arrayList3);
            }
            ((List) arrayList3).add(obj);
        }
        List<J5.b> listY0 = p120l9.m.y0(J5.b.f4335w, new a(0, z10));
        arrayList = new ArrayList();
        for (J5.b bVar2 : listY0) {
            list2 = (List) linkedHashMap.get(bVar2.f4336r);
            if (list2 != null) {
                List<p065g3.a> listY1 = p120l9.m.y0(list2, new a(1, z10));
                arrayList2 = new ArrayList(n.a0(listY1, 10));
                for (p065g3.a aVar2 : listY1) {
                    arrayList2.add(new K5.b(aVar2, p017b7.g.h0(aVar2, str2, list)));
                }
            } else {
                arrayList2 = p120l9.r.f19440r;
            }
            p120l9.m.d0(arrayList, p120l9.m.q0(AbstractC0813f2.K(new K5.a(bVar2)), arrayList2));
        }
        return arrayList;
        List listA = ((p124m3.d) objA).a();
        ArrayList arrayList4 = new ArrayList(n.a0(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList4.add(new Integer(((p124m3.j) it.next()).f19595m));
        }
        List listC0 = p120l9.m.C0(p120l9.m.F0(arrayList4));
        p144o3.h hVar = (p144o3.h) this.f5533t;
        bVar.f5525s = str;
        bVar.f5526t = listC0;
        bVar.f5524r = z10;
        bVar.f5527u = i10;
        bVar.f5530x = 2;
        Object objB = hVar.b(bVar);
        if (objB != aVar) {
            str2 = str;
            list = listC0;
            objA = objB;
            linkedHashMap = new LinkedHashMap();
            while (r14.hasNext()) {
                str3 = ((p065g3.a) obj).f16275c;
                arrayList3 = linkedHashMap.get(str3);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap.put(str3, arrayList3);
                }
                ((List) arrayList3).add(obj);
            }
            List<J5.b> listY2 = p120l9.m.y0(J5.b.f4335w, new a(0, z10));
            arrayList = new ArrayList();
            while (r14.hasNext()) {
                list2 = (List) linkedHashMap.get(bVar2.f4336r);
                if (list2 != null) {
                    List<p065g3.a> listY3 = p120l9.m.y0(list2, new a(1, z10));
                    arrayList2 = new ArrayList(n.a0(listY3, 10));
                    while (r4.hasNext()) {
                        arrayList2.add(new K5.b(aVar2, p017b7.g.h0(aVar2, str2, list)));
                    }
                } else {
                    arrayList2 = p120l9.r.f19440r;
                }
                p120l9.m.d0(arrayList, p120l9.m.q0(AbstractC0813f2.K(new K5.a(bVar2)), arrayList2));
            }
            return arrayList;
        }
        return aVar;
    }

    public void L(String str, M2.d dVar) {
        j.e(dVar, "provider");
        O2.b bVar = (O2.b) this.f5532s;
        synchronized (bVar.f6452c) {
            if (bVar.f6453d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            bVar.f6453d.put(str, dVar);
        }
    }

    public void M() {
        if (!((O2.b) this.f5532s).f6456h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        M2.a aVar = (M2.a) this.f5533t;
        if (aVar == null) {
            aVar = new M2.a(this);
        }
        this.f5533t = aVar;
        try {
            C0763l.class.getDeclaredConstructor(null);
            M2.a aVar2 = (M2.a) this.f5533t;
            if (aVar2 != null) {
                ((LinkedHashSet) aVar2.f5671b).add(C0763l.class.getName());
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + C0763l.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }

    public void N(int i10, Bundle bundle, Messenger messenger) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i10;
        messageObtain.arg1 = 1;
        messageObtain.setData(bundle);
        messageObtain.replyTo = messenger;
        ((Messenger) this.f5532s).send(messageObtain);
    }

    public void O(W w9) {
        Object objG = ((E) this.f5533t).g(w9);
        if (objG != null) {
            if (!(objG instanceof u.A)) {
                throw new ClassCastException();
            }
            u.A a9 = (u.A) objG;
            Object[] objArr = a9.f22650a;
            if (a9.f22651b <= 0) {
                return;
            }
            j.c(objArr[0], "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
            throw new ClassCastException();
        }
    }

    public void P(boolean z10, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.f5532s)) {
            map = new HashMap((Map) this.f5532s);
        }
        synchronized (((Map) this.f5533t)) {
            map2 = new HashMap((Map) this.f5533t);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((i) entry2.getKey()).a(new g(status));
            }
        }
    }

    @Override // p013b2.p
    public Object a() {
        return (p013b2.A) this.f5532s;
    }

    @Override // p013b2.p
    public boolean b(CharSequence charSequence, int i10, int i11, p013b2.x xVar) {
        if ((xVar.f13199c & 4) > 0) {
            return true;
        }
        if (((p013b2.A) this.f5532s) == null) {
            this.f5532s = new p013b2.A(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((H8.e) this.f5533t).getClass();
        ((p013b2.A) this.f5532s).setSpan(new y(xVar), i10, i11, 33);
        return true;
    }

    @Override // A.Y
    public Object c(C0039q c0039q, A.S s10) {
        Object objB = ((X.s) this.f5533t).b(T.f24455s, new X.r(this, c0039q, null), s10);
        return objB == p161p9.a.f21156r ? objB : p110k9.y.f19095a;
    }

    @Override // W0.d
    public int d(int i10) {
        do {
            i10 = ((W0.e) this.f5533t).j(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f5532s).charAt(i10)));
        return i10;
    }

    @Override // W0.d
    public int e(int i10) {
        do {
            i10 = ((W0.e) this.f5533t).i(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f5532s).charAt(i10 - 1)));
        return i10;
    }

    @Override // p118l7.d
    public void f(p118l7.o oVar) {
        ((Map) ((c) this.f5533t).f5533t).remove((i) this.f5532s);
    }

    @Override // W0.d
    public int g(int i10) {
        CharSequence charSequence = (CharSequence) this.f5532s;
        do {
            i10 = ((W0.e) this.f5533t).i(i10);
            if (i10 == -1 || i10 == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i10)));
        return i10;
    }

    @Override // W0.d
    public int h(int i10) {
        do {
            i10 = ((W0.e) this.f5533t).j(i10);
            if (i10 == -1 || i10 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f5532s).charAt(i10 - 1)));
        return i10;
    }

    public void k(Object obj, String str) {
        ((ArrayList) this.f5532s).add(str + "=" + String.valueOf(obj));
    }

    public Z0.y l(List list) {
        InterfaceC0716g interfaceC0716g;
        Exception e10;
        try {
            int size = list.size();
            int i10 = 0;
            interfaceC0716g = null;
            while (i10 < size) {
                try {
                    InterfaceC0716g interfaceC0716g2 = (InterfaceC0716g) list.get(i10);
                    try {
                        interfaceC0716g2.a((Z0.h) this.f5533t);
                        i10++;
                        interfaceC0716g = interfaceC0716g2;
                    } catch (Exception e11) {
                        e10 = e11;
                        interfaceC0716g = interfaceC0716g2;
                        StringBuilder sb = new StringBuilder();
                        StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                        sb2.append(((Z0.h) this.f5533t).f10923a.b());
                        sb2.append(", composition=");
                        sb2.append(((Z0.h) this.f5533t).c());
                        sb2.append(", selection=");
                        Z0.h hVar = (Z0.h) this.f5533t;
                        sb2.append((Object) U0.K.g(va.g.e(hVar.f10924b, hVar.f10925c)));
                        sb2.append("):");
                        sb.append(sb2.toString());
                        sb.append('\n');
                        p120l9.m.k0(list, sb, new M0(interfaceC0716g, this), 60);
                        String string = sb.toString();
                        j.d(string, "toString(...)");
                        throw new RuntimeException(string, e10);
                    }
                } catch (Exception e12) {
                    e10 = e12;
                }
            }
            Z0.h hVar2 = (Z0.h) this.f5533t;
            hVar2.getClass();
            C0515g c0515g = new C0515g(hVar2.f10923a.toString());
            Z0.h hVar3 = (Z0.h) this.f5533t;
            long jE = va.g.e(hVar3.f10924b, hVar3.f10925c);
            U0.K k7 = U0.K.f(((Z0.y) this.f5532s).f10954b) ? null : new U0.K(jE);
            Z0.y yVar = new Z0.y(c0515g, k7 != null ? k7.f8035a : va.g.e(U0.K.d(jE), U0.K.e(jE)), ((Z0.h) this.f5533t).c());
            this.f5532s = yVar;
            return yVar;
        } catch (Exception e13) {
            interfaceC0716g = null;
            e10 = e13;
        }
    }

    public Bundle m(String str) {
        j.e(str, "key");
        O2.b bVar = (O2.b) this.f5532s;
        if (!bVar.g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = bVar.f6455f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleF = bundle.containsKey(str) ? B9.a.F(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            bVar.f6455f = null;
        }
        return bundleF;
    }

    public void n(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u, boolean z10) {
        j.e(abstractComponentCallbacksC0947u, "f");
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = ((K) this.f5532s).f15984y;
        if (abstractComponentCallbacksC0947u2 != null) {
            abstractComponentCallbacksC0947u2.o().f15974o.n(abstractComponentCallbacksC0947u, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5533t).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void o(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u, boolean z10) {
        j.e(abstractComponentCallbacksC0947u, "f");
        K k7 = (K) this.f5532s;
        FragmentActivity fragmentActivity = k7.f15982w.f16173s;
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = k7.f15984y;
        if (abstractComponentCallbacksC0947u2 != null) {
            abstractComponentCallbacksC0947u2.o().f15974o.o(abstractComponentCallbacksC0947u, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5533t).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override // I1.r
    public B0 p(View view, B0 b5) {
        ViewPager viewPager = (ViewPager) this.f5533t;
        B0 b0J = S.j(view, b5);
        if (b0J.f3671a.o()) {
            return b0J;
        }
        Rect rect = (Rect) this.f5532s;
        rect.left = b0J.b();
        rect.top = b0J.d();
        rect.right = b0J.c();
        rect.bottom = b0J.a();
        int childCount = viewPager.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            B0 b0B = S.b(viewPager.getChildAt(i10), b0J);
            rect.left = Math.min(b0B.b(), rect.left);
            rect.top = Math.min(b0B.d(), rect.top);
            rect.right = Math.min(b0B.c(), rect.right);
            rect.bottom = Math.min(b0B.a(), rect.bottom);
        }
        return b0J.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void q(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u, boolean z10) {
        j.e(abstractComponentCallbacksC0947u, "f");
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = ((K) this.f5532s).f15984y;
        if (abstractComponentCallbacksC0947u2 != null) {
            abstractComponentCallbacksC0947u2.o().f15974o.q(abstractComponentCallbacksC0947u, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5533t).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void r(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u, boolean z10) {
        j.e(abstractComponentCallbacksC0947u, "f");
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = ((K) this.f5532s).f15984y;
        if (abstractComponentCallbacksC0947u2 != null) {
            abstractComponentCallbacksC0947u2.o().f15974o.r(abstractComponentCallbacksC0947u, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5533t).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void s(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u, boolean z10) {
        j.e(abstractComponentCallbacksC0947u, "f");
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = ((K) this.f5532s).f15984y;
        if (abstractComponentCallbacksC0947u2 != null) {
            abstractComponentCallbacksC0947u2.o().f15974o.s(abstractComponentCallbacksC0947u, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5533t).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void t(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u, boolean z10) {
        j.e(abstractComponentCallbacksC0947u, "f");
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = ((K) this.f5532s).f15984y;
        if (abstractComponentCallbacksC0947u2 != null) {
            abstractComponentCallbacksC0947u2.o().f15974o.t(abstractComponentCallbacksC0947u, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5533t).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public String toString() {
        switch (this.f5531r) {
            case 8:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f5533t.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f5532s;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u, boolean z10) {
        j.e(abstractComponentCallbacksC0947u, "f");
        K k7 = (K) this.f5532s;
        FragmentActivity fragmentActivity = k7.f15982w.f16173s;
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = k7.f15984y;
        if (abstractComponentCallbacksC0947u2 != null) {
            abstractComponentCallbacksC0947u2.o().f15974o.u(abstractComponentCallbacksC0947u, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5533t).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void v(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u, boolean z10) {
        j.e(abstractComponentCallbacksC0947u, "f");
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = ((K) this.f5532s).f15984y;
        if (abstractComponentCallbacksC0947u2 != null) {
            abstractComponentCallbacksC0947u2.o().f15974o.v(abstractComponentCallbacksC0947u, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5533t).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void w(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u, boolean z10) {
        j.e(abstractComponentCallbacksC0947u, "f");
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = ((K) this.f5532s).f15984y;
        if (abstractComponentCallbacksC0947u2 != null) {
            abstractComponentCallbacksC0947u2.o().f15974o.w(abstractComponentCallbacksC0947u, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5533t).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void x(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u, Bundle bundle, boolean z10) {
        j.e(abstractComponentCallbacksC0947u, "f");
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = ((K) this.f5532s).f15984y;
        if (abstractComponentCallbacksC0947u2 != null) {
            abstractComponentCallbacksC0947u2.o().f15974o.x(abstractComponentCallbacksC0947u, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5533t).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void y(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u, boolean z10) {
        j.e(abstractComponentCallbacksC0947u, "f");
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = ((K) this.f5532s).f15984y;
        if (abstractComponentCallbacksC0947u2 != null) {
            abstractComponentCallbacksC0947u2.o().f15974o.y(abstractComponentCallbacksC0947u, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5533t).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void z(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u, boolean z10) {
        j.e(abstractComponentCallbacksC0947u, "f");
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = ((K) this.f5532s).f15984y;
        if (abstractComponentCallbacksC0947u2 != null) {
            abstractComponentCallbacksC0947u2.o().f15974o.z(abstractComponentCallbacksC0947u, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5533t).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public /* synthetic */ c(int i10, Object obj, Object obj2, boolean z10) {
        this.f5531r = i10;
        this.f5532s = obj;
        this.f5533t = obj2;
    }

    public /* synthetic */ c(int i10, boolean z10) {
        this.f5531r = i10;
    }

    public c(int i10) {
        this.f5531r = i10;
        switch (i10) {
            case 10:
                R6.e eVar = R6.e.f7244d;
                this.f5532s = new SparseIntArray();
                this.f5533t = eVar;
                break;
            case 11:
                this.f5532s = new LinkedHashMap();
                this.f5533t = new LinkedHashMap();
                break;
            case 12:
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
            default:
                this.f5532s = DesugarCollections.synchronizedMap(new WeakHashMap());
                this.f5533t = DesugarCollections.synchronizedMap(new WeakHashMap());
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                this.f5532s = new R7.f(24);
                this.f5533t = new N0(16);
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                this.f5532s = new E();
                this.f5533t = new E();
                break;
        }
    }

    public c(W6.b bVar, H8.e eVar) {
        this.f5531r = 3;
        this.f5533t = "ClientTelemetry.API";
        this.f5532s = bVar;
    }

    public c(B b5, p085i0.n nVar) {
        this.f5531r = 28;
        this.f5533t = nVar;
        b5.k(new p081h8.b(0, this));
        this.f5532s = new HashSet();
    }

    public c(Context context) {
        this.f5531r = 9;
        U6.y.f(context);
        Resources resources = context.getResources();
        this.f5532s = resources;
        this.f5533t = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public /* synthetic */ c(Object obj) {
        this.f5531r = 8;
        this.f5533t = obj;
        this.f5532s = new ArrayList();
    }

    public c(p218w3.f fVar, p144o3.h hVar) {
        this.f5531r = 0;
        j.e(fVar, "pageModel");
        j.e(hVar, "reciterModel");
        this.f5532s = fVar;
        this.f5533t = hVar;
    }

    public c(p208v3.c cVar, p227x3.a aVar) {
        this.f5531r = 4;
        j.e(cVar, "notificationModel");
        j.e(aVar, "permissionsModel");
        this.f5532s = cVar;
        this.f5533t = aVar;
    }

    public c(O2.b bVar, int i10) {
        this.f5531r = i10;
        switch (i10) {
            case 2:
                this.f5532s = bVar;
                this.f5533t = new c(bVar, 1);
                break;
            default:
                this.f5532s = bVar;
                break;
        }
    }

    public c(C1256n c1256n, p046e4.a aVar) {
        this.f5531r = 27;
        j.e(aVar, "pageInfo");
        this.f5532s = c1256n;
        this.f5533t = aVar;
    }

    public c(K k7) {
        this.f5531r = 25;
        this.f5532s = k7;
        this.f5533t = new CopyOnWriteArrayList();
    }

    public c(p218w3.j jVar, T3.a aVar) {
        this.f5531r = 26;
        j.e(jVar, "suraModel");
        j.e(aVar, "imageStorage");
        this.f5532s = jVar;
        this.f5533t = aVar;
    }

    public c(Animation animation) {
        this.f5531r = 24;
        this.f5532s = animation;
        this.f5533t = null;
    }

    public c(Animator animator) {
        this.f5531r = 24;
        this.f5532s = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f5533t = animatorSet;
        animatorSet.play(animator);
    }

    public c(EditText editText) {
        this.f5531r = 23;
        this.f5532s = editText;
        p034d2.i iVar = new p034d2.i(editText);
        this.f5533t = iVar;
        editText.addTextChangedListener(iVar);
        if (p034d2.a.f15555b == null) {
            synchronized (p034d2.a.f15554a) {
                try {
                    if (p034d2.a.f15555b == null) {
                        p034d2.a aVar = new p034d2.a();
                        try {
                            p034d2.a.f15556c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, p034d2.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        p034d2.a.f15555b = aVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        editText.setEditableFactory(p034d2.a.f15555b);
    }

    public c(X.s sVar) {
        this.f5531r = 13;
        this.f5533t = sVar;
        this.f5532s = new C0601t1(1, sVar);
    }

    public c(ViewPager viewPager) {
        this.f5531r = 17;
        this.f5533t = viewPager;
        this.f5532s = new Rect();
    }
}
