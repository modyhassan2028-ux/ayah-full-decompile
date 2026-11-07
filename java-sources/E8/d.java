package E8;

import C8.g;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d implements D8.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f1981f;
    public static final b g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f1983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f1984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f1985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f1980e = new a(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f1982h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [E8.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [E8.b] */
    static {
        final int i10 = 0;
        f1981f = new C8.f() { // from class: E8.b
            @Override // C8.a
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((g) obj2).b((String) obj);
                        break;
                    default:
                        ((g) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i11 = 1;
        g = new C8.f() { // from class: E8.b
            @Override // C8.a
            public final void a(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        ((g) obj2).b((String) obj);
                        break;
                    default:
                        ((g) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap map = new HashMap();
        this.f1983a = map;
        HashMap map2 = new HashMap();
        this.f1984b = map2;
        this.f1985c = f1980e;
        this.f1986d = false;
        map2.put(String.class, f1981f);
        map.remove(String.class);
        map2.put(Boolean.class, g);
        map.remove(Boolean.class);
        map2.put(Date.class, f1982h);
        map.remove(Date.class);
    }

    public final D8.a a(Class cls, C8.d dVar) {
        this.f1983a.put(cls, dVar);
        this.f1984b.remove(cls);
        return this;
    }
}
