package Z;

/* JADX INFO: renamed from: Z.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0693l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q f10687a;

    public AbstractC0693l0(p241y9.a aVar) {
        this.f10687a = new Q(aVar);
    }

    public abstract C0695m0 a(Object obj);

    public O0 b() {
        return this.f10687a;
    }

    public final O0 c(C0695m0 c0695m0, O0 o10) {
        G g;
        O0 o11 = null;
        o11 = null;
        o11 = null;
        o11 = null;
        o11 = null;
        o11 = null;
        if (o10 instanceof G) {
            if (c0695m0.f10697d) {
                g = (G) o10;
                g.f10596a.setValue(c0695m0.a());
            }
        } else if (o10 instanceof N0) {
            if ((c0695m0.f10695b || c0695m0.f10698e != null) && !c0695m0.f10697d) {
                N0 n6 = (N0) o10;
                if (p251z9.j.a(c0695m0.a(), n6.f10630a)) {
                    o11 = n6;
                }
            }
        } else if (o10 instanceof A) {
            c0695m0.getClass();
        }
        if (o11 != null) {
            o11 = g;
            return o11;
        }
        if (!c0695m0.f10697d) {
            o11 = g;
            return new N0(c0695m0.a());
        }
        Object obj = c0695m0.f10698e;
        F0 f3 = c0695m0.f10696c;
        if (f3 == null) {
            o11 = g;
            f3 = S.f10643w;
        }
        o11 = g;
        return new G(new C0681f0(obj, f3));
    }
}
