package H8;

import A.C0040q0;
import K9.AbstractC0405x;
import android.content.Context;
import android.os.Build;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p181s2.s;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final X1.e f3606b = new X1.e("fire-global");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final X1.e f3607c = new X1.e("fire-count");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final X1.e f3608d = B9.a.Z("last-used-date");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p250z8.a f3609a;

    public j(Context context, String str) {
        this.f3609a = new p250z8.a(context, p123m2.c.s("FirebaseHeartBeat", str));
    }

    public final synchronized long a(X1.b bVar) {
        long j;
        try {
            long jLongValue = ((Long) s.f(bVar, f3607c, 0L)).longValue();
            String str = "";
            Set hashSet = new HashSet();
            String str2 = null;
            for (Map.Entry entry : bVar.a().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str3 : set) {
                        if (str2 == null || str2.compareTo(str3) > 0) {
                            str = ((X1.e) entry.getKey()).f9850a;
                            hashSet = set;
                            str2 = str3;
                        }
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str2);
            bVar.f(B9.a.a0(str), hashSet2);
            j = jLongValue - 1;
            bVar.e(f3607c, Long.valueOf(j));
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    public final synchronized void b() {
        this.f3609a.a(new E5.a(2, this));
    }

    public final synchronized ArrayList c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String strD = d(System.currentTimeMillis());
            p250z8.a aVar = this.f3609a;
            aVar.getClass();
            for (Map.Entry entry : ((Map) AbstractC0405x.C(p150o9.i.f20380r, new C0040q0(aVar, (p150o9.c) null, 28))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strD);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new a(((X1.e) entry.getKey()).f9850a, new ArrayList(hashSet)));
                    }
                }
            }
            h(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String d(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public final synchronized X1.e e(X1.b bVar, String str) {
        for (Map.Entry entry : bVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return B9.a.a0(((X1.e) entry.getKey()).f9850a);
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void f(X1.b bVar, String str) {
        try {
            X1.e eVarE = e(bVar, str);
            if (eVarE == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) s.f(bVar, eVarE, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                bVar.d(eVarE);
            } else {
                bVar.f(eVarE, hashSet);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g(long j, String str) throws Throwable {
        try {
            try {
                String strD = d(j);
                X1.e eVarA0 = B9.a.a0(str);
                this.f3609a.a(new h(this, strD, str, eVarA0, 0));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void h(long j) {
        this.f3609a.a(new i(j, 0));
    }
}
