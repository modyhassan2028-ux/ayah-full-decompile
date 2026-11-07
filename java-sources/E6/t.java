package E6;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class t implements B6.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f1956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f1957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f1958c;

    public t(Set set, j jVar, v vVar) {
        this.f1956a = set;
        this.f1957b = jVar;
        this.f1958c = vVar;
    }

    public final u a(String str, B6.b bVar, B6.d dVar) {
        Set set = this.f1956a;
        if (set.contains(bVar)) {
            return new u(this.f1957b, str, bVar, dVar, this.f1958c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, set));
    }
}
