package A1;

import E2.N0;
import F1.o;
import F2.x;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import u.O;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B9.a f469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final N0 f470b;

    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    static {
        Y2.a.n("TypefaceCompat static init");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f469a = new k();
        } else if (i10 >= 28) {
            f469a = new j();
        } else if (i10 >= 26) {
            f469a = new i();
        } else if (i10 < 24) {
            f469a = new g();
        } else {
            Method method = h.f475h;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f469a = new h();
            } else {
                f469a = new g();
            }
        }
        f470b = new N0(16);
        Trace.endSection();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    public static Typeface a(Context context, p244z1.c cVar, Resources resources, int i10, String str, int i11, int i12, p244z1.a aVar, boolean z10) {
        Typeface typefaceL;
        Typeface typefaceCreate;
        List listUnmodifiableList;
        int i13 = 19;
        int i14 = -3;
        if (cVar instanceof p244z1.f) {
            p244z1.f fVar = (p244z1.f) cVar;
            String str2 = fVar.f24764e;
            Typeface typeface = null;
            int i15 = 0;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                if (aVar != null) {
                    new Handler(Looper.getMainLooper()).post(new x(i13, aVar, typefaceCreate));
                }
                return typefaceCreate;
            }
            int i16 = 1;
            boolean z11 = !z10 ? aVar != null : fVar.f24763d != 0;
            int i17 = z10 ? fVar.f24762c : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            O8.c cVar2 = new O8.c();
            cVar2.f6511r = aVar;
            F1.g gVar = fVar.f24761b;
            if (gVar != null) {
                Object[] objArr = {fVar.f24760a, gVar};
                ArrayList arrayList = new ArrayList(2);
                for (int i18 = 0; i18 < 2; i18++) {
                    Object obj = objArr[i18];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            } else {
                Object[] objArr2 = {fVar.f24760a};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = objArr2[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
            }
            E1.c cVar3 = new E1.c(handler, 2);
            M.k kVar = new M.k(11, cVar2, cVar3);
            int i19 = 3;
            if (!z11) {
                String strA = F1.k.a(i12, listUnmodifiableList);
                Typeface typeface2 = (Typeface) F1.k.f2172a.g(strA);
                if (typeface2 != null) {
                    cVar3.execute(new p039d8.a(i19, cVar2, typeface2));
                    typeface = typeface2;
                } else {
                    F1.i iVar = new F1.i(i15, kVar);
                    synchronized (F1.k.f2174c) {
                        try {
                            O o10 = F1.k.f2175d;
                            ArrayList arrayList3 = (ArrayList) o10.get(strA);
                            if (arrayList3 != null) {
                                arrayList3.add(iVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(iVar);
                                o10.put(strA, arrayList4);
                                F1.h hVar = new F1.h(strA, context, listUnmodifiableList, i12, 1);
                                ThreadPoolExecutor threadPoolExecutor = F1.k.f2173b;
                                F1.i iVar2 = new F1.i(i16, strA);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                o oVar = new o();
                                oVar.f2183s = hVar;
                                oVar.f2184t = iVar2;
                                oVar.f2185u = handler2;
                                threadPoolExecutor.execute(oVar);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                if (listUnmodifiableList.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                F1.g gVar2 = (F1.g) listUnmodifiableList.get(0);
                N0 n6 = F1.k.f2172a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj3 = new Object[]{gVar2}[0];
                Objects.requireNonNull(obj3);
                arrayList5.add(obj3);
                String strA2 = F1.k.a(i12, DesugarCollections.unmodifiableList(arrayList5));
                Typeface typeface3 = (Typeface) F1.k.f2172a.g(strA2);
                if (typeface3 != null) {
                    cVar3.execute(new p039d8.a(i19, cVar2, typeface3));
                    typeface = typeface3;
                } else if (i17 == -1) {
                    Object[] objArr3 = {gVar2};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj4 = objArr3[0];
                    Objects.requireNonNull(obj4);
                    arrayList6.add(obj4);
                    F1.j jVarB = F1.k.b(strA2, context, DesugarCollections.unmodifiableList(arrayList6), i12);
                    kVar.D(jVarB);
                    typeface = jVarB.f2170a;
                } else {
                    try {
                        try {
                            F1.j jVar = (F1.j) F1.k.f2173b.submit(new F1.h(strA2, context, gVar2, i12, 0)).get(i17, TimeUnit.MILLISECONDS);
                            kVar.D(jVar);
                            typeface = jVar.f2170a;
                        } catch (InterruptedException e10) {
                            throw e10;
                        } catch (ExecutionException e11) {
                            throw new RuntimeException(e11);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((E1.c) kVar.f5619t).execute(new F1.a(i14, i15, (O8.c) kVar.f5618s));
                    }
                }
            }
            typefaceL = typeface;
        } else {
            typefaceL = f469a.l(context, (p244z1.d) cVar, resources, i12);
            if (aVar != null) {
                if (typefaceL != null) {
                    new Handler(Looper.getMainLooper()).post(new x(i13, aVar, typefaceL));
                } else {
                    aVar.a(-3);
                }
            }
        }
        if (typefaceL != null) {
            f470b.k(b(resources, i10, str, i11, i12), typefaceL);
        }
        return typefaceL;
    }

    public static String b(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }
}
