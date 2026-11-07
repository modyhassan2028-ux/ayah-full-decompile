package F2;

import E2.W;
import K9.AbstractC0405x;
import U6.C0532j;
import android.app.ActivityManager;
import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p251z9.e f2299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f2300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2301c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public B2.c f2304f;
    public B2.c g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f2311o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public File f2312p;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f2302d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f2303e = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f2305h = r.f2314r;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f2306i = -1;
    public final s j = new s(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f2307k = new LinkedHashSet();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f2308l = new LinkedHashSet();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f2309m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f2310n = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f2313q = true;

    public q(Context context, Class cls, String str) {
        this.f2299a = p251z9.w.a(cls);
        this.f2300b = context;
        this.f2301c = str;
    }

    public final u a() {
        R2.b rVar;
        String name;
        W wC;
        R2.c cVarB;
        R2.c cVarB2;
        boolean zContainsKey;
        B2.c cVar = this.f2304f;
        if (cVar == null && this.g == null) {
            B2.c cVar2 = q.a.f21180k;
            this.g = cVar2;
            this.f2304f = cVar2;
        } else if (cVar != null && this.g == null) {
            this.g = cVar;
        } else if (cVar == null) {
            this.f2304f = this.g;
        }
        LinkedHashSet linkedHashSet = this.f2308l;
        p251z9.j.e(linkedHashSet, "migrationStartAndEndVersions");
        LinkedHashSet linkedHashSet2 = this.f2307k;
        p251z9.j.e(linkedHashSet2, "migrationsNotRequiredFrom");
        if (!linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet2.contains(Integer.valueOf(iIntValue))) {
                    throw new IllegalArgumentException(p123m2.c.r(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ").toString());
                }
            }
        }
        C0532j c0532j = new C0532j(14);
        boolean z10 = this.f2306i > 0;
        String str = this.f2311o;
        boolean z11 = (str == null && this.f2312p == null) ? false : true;
        String str2 = this.f2301c;
        if (z10) {
            if (str2 != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
        }
        if (!z11) {
            rVar = c0532j;
        } else {
            if (str2 == null) {
                throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
            }
            int i10 = str == null ? 0 : 1;
            File file = this.f2312p;
            if (i10 + (file == null ? 0 : 1) != 1) {
                throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
            }
            rVar = new android.support.v4.media.session.r(str, file, c0532j, 17);
        }
        r rVar2 = this.f2305h;
        rVar2.getClass();
        Context context = this.f2300b;
        p251z9.j.e(context, "context");
        if (rVar2 == r.f2314r) {
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            rVar2 = (activityManager == null || activityManager.isLowRamDevice()) ? r.f2315s : r.f2316t;
        }
        r rVar3 = rVar2;
        B2.c cVar3 = this.f2304f;
        if (cVar3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        B2.c cVar4 = this.g;
        if (cVar4 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        C0156a c0156a = new C0156a(context, this.f2301c, rVar, this.j, this.f2302d, false, rVar3, cVar3, cVar4, null, this.f2310n, false, linkedHashSet2, this.f2311o, this.f2312p, null, this.f2303e, this.f2309m, false, null, null);
        c0156a.f2271w = this.f2313q;
        Class clsD = p171r0.a.d(this.f2299a);
        Package r10 = clsD.getPackage();
        if (r10 == null || (name = r10.getName()) == null) {
            name = "";
        }
        String canonicalName = clsD.getCanonicalName();
        p251z9.j.b(canonicalName);
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            p251z9.j.d(canonicalName, "substring(...)");
        }
        String strReplace = canonicalName.replace('.', '_');
        p251z9.j.d(strReplace, "replace(...)");
        String strConcat = strReplace.concat("_Impl");
        try {
            Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, clsD.getClassLoader());
            p251z9.j.c(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.util.KClassUtil.findAndInstantiateDatabaseImpl>");
            u uVar = (u) cls.getDeclaredConstructor(null).newInstance(null);
            uVar.getClass();
            uVar.f2328k = c0156a.f2271w;
            try {
                wC = uVar.c();
                p251z9.j.c(wC, "null cannot be cast to non-null type androidx.room.RoomOpenDelegate");
            } catch (p110k9.i unused) {
                wC = null;
            }
            if (wC == null) {
                new p(c0156a, new A3.d(uVar));
                throw null;
            }
            uVar.f2324e = new p(c0156a, wC);
            uVar.f2325f = uVar.b();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set setE = uVar.e();
            List list = c0156a.f2266r;
            int size = list.size();
            boolean[] zArr = new boolean[size];
            Iterator it2 = setE.iterator();
            while (true) {
                int i11 = -1;
                if (!it2.hasNext()) {
                    int size2 = list.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i12 = size2 - 1;
                            if (size2 >= size || !zArr[size2]) {
                                throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                            }
                            if (i12 < 0) {
                                break;
                            }
                            size2 = i12;
                        }
                    }
                    for (C3.a aVar : uVar.a(linkedHashMap)) {
                        int i13 = aVar.f722a;
                        int i14 = aVar.f723b;
                        s sVar = c0156a.f2254d;
                        LinkedHashMap linkedHashMap2 = sVar.f2318a;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i13))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i13));
                            if (map == null) {
                                map = p120l9.s.f19441r;
                            }
                            zContainsKey = map.containsKey(Integer.valueOf(i14));
                        } else {
                            zContainsKey = false;
                        }
                        if (!zContainsKey) {
                            sVar.b(aVar);
                        }
                    }
                    LinkedHashMap linkedHashMapF = uVar.f();
                    List list2 = c0156a.f2265q;
                    boolean[] zArr2 = new boolean[list2.size()];
                    for (Map.Entry entry : linkedHashMapF.entrySet()) {
                        F9.c cVar5 = (F9.c) entry.getKey();
                        for (F9.c cVar6 : (List) entry.getValue()) {
                            int size3 = list2.size() - 1;
                            if (size3 < 0) {
                                size3 = -1;
                                break;
                            }
                            while (true) {
                                int i15 = size3 - 1;
                                if (((p251z9.e) cVar6).d(list2.get(size3))) {
                                    zArr2[size3] = true;
                                    break;
                                }
                                if (i15 < 0) {
                                    size3 = -1;
                                    break;
                                }
                                size3 = i15;
                            }
                            if (size3 < 0) {
                                throw new IllegalArgumentException(("A required type converter (" + ((p251z9.e) cVar6).b() + ") for " + ((p251z9.e) cVar5).b() + " is missing in the database configuration.").toString());
                            }
                            Object obj = list2.get(size3);
                            p251z9.j.e(cVar6, "kclass");
                            p251z9.j.e(obj, "converter");
                            uVar.j.put(cVar6, obj);
                        }
                    }
                    int size4 = list2.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i16 = size4 - 1;
                            if (!zArr2[size4]) {
                                throw new IllegalArgumentException("Unexpected type converter " + list2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                            }
                            if (i16 < 0) {
                                break;
                            }
                            size4 = i16;
                        }
                    }
                    uVar.f2322c = c0156a.f2257h;
                    uVar.f2323d = new y(c0156a.f2258i);
                    Executor executor = uVar.f2322c;
                    if (executor == null) {
                        p251z9.j.k("internalQueryExecutor");
                        throw null;
                    }
                    P9.d dVarB = AbstractC0405x.b(Y2.a.Z(AbstractC0405x.n(executor), AbstractC0405x.e()));
                    uVar.f2320a = dVarB;
                    p150o9.h hVar = dVarB.f6772r;
                    y yVar = uVar.f2323d;
                    if (yVar == null) {
                        p251z9.j.k("internalTransactionExecutor");
                        throw null;
                    }
                    uVar.f2321b = hVar.L(AbstractC0405x.n(yVar));
                    uVar.f2326h = c0156a.f2256f;
                    p pVar = uVar.f2324e;
                    if (pVar == null) {
                        p251z9.j.k("connectionManager");
                        throw null;
                    }
                    R2.c cVarC = pVar.c();
                    if (cVarC == null) {
                        cVarB = null;
                        break;
                    }
                    cVarB = cVarC;
                    while (!(cVarB instanceof K2.b)) {
                        if (!(cVarB instanceof InterfaceC0157b)) {
                            cVarB = null;
                            break;
                        }
                        cVarB = ((InterfaceC0157b) cVarB).b();
                    }
                    K2.b bVar = (K2.b) cVarB;
                    if (bVar != null) {
                        bVar.f5224w = c0156a;
                    }
                    p pVar2 = uVar.f2324e;
                    if (pVar2 == null) {
                        p251z9.j.k("connectionManager");
                        throw null;
                    }
                    R2.c cVarC2 = pVar2.c();
                    if (cVarC2 == null) {
                        cVarB2 = null;
                        break;
                    }
                    cVarB2 = cVarC2;
                    while (!(cVarB2 instanceof K2.a)) {
                        if (!(cVarB2 instanceof InterfaceC0157b)) {
                            cVarB2 = null;
                            break;
                        }
                        cVarB2 = ((InterfaceC0157b) cVarB2).b();
                    }
                    return uVar;
                }
                F9.c cVar7 = (F9.c) it2.next();
                int size5 = list.size() - 1;
                if (size5 >= 0) {
                    while (true) {
                        int i17 = size5 - 1;
                        if (((p251z9.e) cVar7).d(list.get(size5))) {
                            zArr[size5] = true;
                            i11 = size5;
                            break;
                        }
                        if (i17 < 0) {
                            break;
                        }
                        size5 = i17;
                    }
                }
                if (i11 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + ((p251z9.e) cVar7).b() + ") is missing in the database configuration.").toString());
                }
                linkedHashMap.put(cVar7, list.get(i11));
            }
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("Cannot find implementation for " + clsD.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Cannot access the constructor " + clsD.getCanonicalName(), e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException("Failed to create an instance of " + clsD.getCanonicalName(), e12);
        }
    }
}
