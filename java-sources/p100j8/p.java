package p100j8;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f18819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f18820b;

    public p(Class cls, Class cls2) {
        this.f18819a = cls;
        this.f18820b = cls2;
    }

    public static p a(Class cls) {
        return new p(o.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f18820b.equals(pVar.f18820b)) {
            return this.f18819a.equals(pVar.f18819a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18819a.hashCode() + (this.f18820b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f18820b;
        Class cls2 = this.f18819a;
        if (cls2 == o.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
