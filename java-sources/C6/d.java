package C6;

import D6.AbstractC0098a;
import D6.B;
import D6.C;
import D6.C0099b;
import D6.C0100c;
import D6.C0101d;
import D6.C0102e;
import D6.C0103f;
import D6.C0104g;
import D6.C0105h;
import D6.C0106i;
import D6.C0107j;
import D6.C0108k;
import D6.D;
import D6.E;
import D6.F;
import D6.G;
import D6.H;
import D6.I;
import D6.J;
import D6.l;
import D6.m;
import D6.n;
import D6.o;
import D6.p;
import D6.q;
import D6.r;
import D6.t;
import D6.u;
import D6.w;
import D6.x;
import D6.z;
import E6.h;
import E6.i;
import F6.g;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p248z6.c f775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final URL f778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final N6.a f779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final N6.a f780f;
    public final int g;

    public d(Context context, N6.a aVar, N6.a aVar2) {
        E8.d dVar = new E8.d();
        C0100c c0100c = C0100c.f1258a;
        dVar.a(x.class, c0100c);
        dVar.a(m.class, c0100c);
        C0107j c0107j = C0107j.f1281a;
        dVar.a(G.class, c0107j);
        dVar.a(u.class, c0107j);
        C0101d c0101d = C0101d.f1260a;
        dVar.a(z.class, c0101d);
        dVar.a(n.class, c0101d);
        C0099b c0099b = C0099b.f1247a;
        dVar.a(AbstractC0098a.class, c0099b);
        dVar.a(l.class, c0099b);
        C0106i c0106i = C0106i.f1273a;
        dVar.a(F.class, c0106i);
        dVar.a(t.class, c0106i);
        C0102e c0102e = C0102e.f1263a;
        dVar.a(B.class, c0102e);
        dVar.a(o.class, c0102e);
        C0105h c0105h = C0105h.f1271a;
        dVar.a(E.class, c0105h);
        dVar.a(r.class, c0105h);
        C0104g c0104g = C0104g.f1269a;
        dVar.a(D.class, c0104g);
        dVar.a(q.class, c0104g);
        C0108k c0108k = C0108k.f1288a;
        dVar.a(J.class, c0108k);
        dVar.a(w.class, c0108k);
        C0103f c0103f = C0103f.f1266a;
        dVar.a(C.class, c0103f);
        dVar.a(p.class, c0103f);
        dVar.f1986d = true;
        this.f775a = new p248z6.c(5, dVar);
        this.f777c = context;
        this.f776b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f778d = b(a.f764c);
        this.f779e = aVar2;
        this.f780f = aVar;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(p123m2.c.s("Invalid url: ", str), e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00af  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:34:0x010f  */
    public final i a(i iVar) {
        int type;
        int subtype;
        HashMap map;
        String simOperator;
        NetworkInfo activeNetworkInfo = this.f776b.getActiveNetworkInfo();
        h hVarC = iVar.c();
        int i10 = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) hVarC.f1927h;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("sdk-version", String.valueOf(i10));
        hVarC.a("model", Build.MODEL);
        hVarC.a("hardware", Build.HARDWARE);
        hVarC.a("device", Build.DEVICE);
        hVarC.a("product", Build.PRODUCT);
        hVarC.a("os-uild", Build.ID);
        hVarC.a("manufacturer", Build.MANUFACTURER);
        hVarC.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = (HashMap) hVarC.f1927h;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i11 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = I.f1243r;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = (HashMap) hVarC.f1927h;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = H.f1241r;
                subtype = 100;
            } else if (((H) H.f1241r.get(subtype)) == null) {
            }
            map = (HashMap) hVarC.f1927h;
            if (map != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            hVarC.a("country", Locale.getDefault().getCountry());
            hVarC.a("locale", Locale.getDefault().getLanguage());
            Context context = this.f777c;
            simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if (simOperator == null) {
                simOperator = "";
            }
            hVarC.a("mcc_mnc", simOperator);
            try {
                i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e10) {
                Y2.a.w("CctTransportBackend", "Unable to find version code for package", e10);
            }
            hVarC.a("application_build", Integer.toString(i11));
            return hVarC.b();
        }
        SparseArray sparseArray3 = H.f1241r;
        subtype = 0;
        map = (HashMap) hVarC.f1927h;
        if (map != null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        hVarC.a("country", Locale.getDefault().getCountry());
        hVarC.a("locale", Locale.getDefault().getLanguage());
        Context context2 = this.f777c;
        simOperator = ((TelephonyManager) context2.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        hVarC.a("mcc_mnc", simOperator);
        i11 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        hVarC.a("application_build", Integer.toString(i11));
        return hVarC.b();
    }
}
