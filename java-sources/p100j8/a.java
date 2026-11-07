package p100j8;

import C6.b;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p017b7.g;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f18787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f18788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f18791f;
    public final Set g;

    public a(String str, Set set, Set set2, int i10, int i11, c cVar, Set set3) {
        this.f18786a = str;
        this.f18787b = DesugarCollections.unmodifiableSet(set);
        this.f18788c = DesugarCollections.unmodifiableSet(set2);
        this.f18789d = i10;
        this.f18790e = i11;
        this.f18791f = cVar;
        this.g = DesugarCollections.unmodifiableSet(set3);
    }

    public static p071g9.a a(p pVar) {
        p[] pVarArr = new p[0];
        p071g9.a aVar = new p071g9.a();
        aVar.f16337c = null;
        HashSet hashSet = new HashSet();
        aVar.f16338d = hashSet;
        aVar.f16339e = new HashSet();
        aVar.f16335a = 0;
        aVar.f16336b = 0;
        aVar.g = new HashSet();
        hashSet.add(pVar);
        for (p pVar2 : pVarArr) {
            g.R(pVar2, "Null interface");
        }
        Collections.addAll((HashSet) aVar.f16338d, pVarArr);
        return aVar;
    }

    public static p071g9.a b(Class cls) {
        return new p071g9.a(cls, new Class[0]);
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(p.a(cls));
        for (Class cls2 : clsArr) {
            g.R(cls2, "Null interface");
            hashSet.add(p.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new b(19, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f18787b.toArray()) + ">{" + this.f18789d + ", type=" + this.f18790e + ", deps=" + Arrays.toString(this.f18788c.toArray()) + "}";
    }
}
