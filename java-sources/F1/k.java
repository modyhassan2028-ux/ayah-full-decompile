package F1;

import Da.r;
import E2.N0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import u.O;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N0 f2172a = new N0(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f2173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f2174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final O f2175d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new n());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f2173b = threadPoolExecutor;
        f2174c = new Object();
        f2175d = new O(0);
    }

    public static String a(int i10, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb.append(((g) list.get(i11)).f2162e);
            sb.append("-");
            sb.append(i10);
            if (i11 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static j b(String str, Context context, List list, int i10) {
        int i11;
        Typeface typefaceM;
        N0 n6 = f2172a;
        Y2.a.n("getFontSync");
        try {
            Typeface typeface = (Typeface) n6.g(str);
            if (typeface != null) {
                j jVar = new j(typeface);
                Trace.endSection();
                return jVar;
            }
            try {
                r rVarA = f.a(context, list);
                List list2 = (List) rVarA.f1388t;
                int i12 = rVarA.f1387s;
                if (i12 == 0) {
                    l[] lVarArr = (l[]) list2.get(0);
                    if (lVarArr == null || lVarArr.length == 0) {
                        i11 = 1;
                    } else {
                        int length = lVarArr.length;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= length) {
                                i11 = 0;
                                break;
                            }
                            int i14 = lVarArr[i13].f2180e;
                            if (i14 != 0) {
                                if (i14 >= 0) {
                                    i11 = i14;
                                    break;
                                }
                                i11 = -3;
                                break;
                            }
                            i13++;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        i11 = -3;
                        break;
                    }
                    i11 = -2;
                }
                if (i11 != 0) {
                    j jVar2 = new j(i11);
                    Trace.endSection();
                    return jVar2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    l[] lVarArr2 = (l[]) list2.get(0);
                    B9.a aVar = A1.f.f469a;
                    Y2.a.n("TypefaceCompat.createFromFontInfo");
                    try {
                        typefaceM = A1.f.f469a.m(context, lVarArr2, i10);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    B9.a aVar2 = A1.f.f469a;
                    Y2.a.n("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typefaceM = A1.f.f469a.n(context, list2, i10);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceM == null) {
                    j jVar3 = new j(-3);
                    Trace.endSection();
                    return jVar3;
                }
                n6.k(str, typefaceM);
                j jVar4 = new j(typefaceM);
                Trace.endSection();
                return jVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                j jVar5 = new j(-1);
                Trace.endSection();
                return jVar5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
