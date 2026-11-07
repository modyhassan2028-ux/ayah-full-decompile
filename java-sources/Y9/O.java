package Y9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class O implements W9.f, InterfaceC0654j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0666w f10474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10476d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f10477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List[] f10478f;
    public final boolean[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f10479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f10480i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f10481k;

    public O(String str, InterfaceC0666w interfaceC0666w, int i10) {
        this.f10473a = str;
        this.f10474b = interfaceC0666w;
        this.f10475c = i10;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.f10477e = strArr;
        int i12 = this.f10475c;
        this.f10478f = new List[i12];
        this.g = new boolean[i12];
        this.f10479h = p120l9.s.f19441r;
        final int i13 = 0;
        p241y9.a aVar = new p241y9.a(this) { // from class: Y9.N

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ O f10472s;

            {
                this.f10472s = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k9.g] */
            @Override // p241y9.a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        InterfaceC0666w interfaceC0666w2 = this.f10472s.f10474b;
                        return interfaceC0666w2 != null ? interfaceC0666w2.a() : M.f10470b;
                    case 1:
                        return M.c(this.f10472s.f10474b != null ? new ArrayList(0) : null);
                    default:
                        O o10 = this.f10472s;
                        return Integer.valueOf(M.d(o10, (W9.f[]) o10.j.getValue()));
                }
            }
        };
        p110k9.h hVar = p110k9.h.f19074r;
        this.f10480i = p110k9.a.c(hVar, aVar);
        final int i14 = 1;
        this.j = p110k9.a.c(hVar, new p241y9.a(this) { // from class: Y9.N

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ O f10472s;

            {
                this.f10472s = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k9.g] */
            @Override // p241y9.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        InterfaceC0666w interfaceC0666w2 = this.f10472s.f10474b;
                        return interfaceC0666w2 != null ? interfaceC0666w2.a() : M.f10470b;
                    case 1:
                        return M.c(this.f10472s.f10474b != null ? new ArrayList(0) : null);
                    default:
                        O o10 = this.f10472s;
                        return Integer.valueOf(M.d(o10, (W9.f[]) o10.j.getValue()));
                }
            }
        });
        final int i15 = 2;
        this.f10481k = p110k9.a.c(hVar, new p241y9.a(this) { // from class: Y9.N

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ O f10472s;

            {
                this.f10472s = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k9.g] */
            @Override // p241y9.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        InterfaceC0666w interfaceC0666w2 = this.f10472s.f10474b;
                        return interfaceC0666w2 != null ? interfaceC0666w2.a() : M.f10470b;
                    case 1:
                        return M.c(this.f10472s.f10474b != null ? new ArrayList(0) : null);
                    default:
                        O o10 = this.f10472s;
                        return Integer.valueOf(M.d(o10, (W9.f[]) o10.j.getValue()));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // W9.f
    public final int a(String str) {
        p251z9.j.e(str, "name");
        Integer num = (Integer) this.f10479h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // W9.f
    public final String b() {
        return this.f10473a;
    }

    @Override // W9.f
    public va.g c() {
        return W9.i.f9679c;
    }

    @Override // W9.f
    public final int d() {
        return this.f10475c;
    }

    @Override // W9.f
    public final String e(int i10) {
        return this.f10477e[i10];
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, k9.g] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, k9.g] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof O) {
            W9.f fVar = (W9.f) obj;
            if (this.f10473a.equals(fVar.b()) && Arrays.equals((W9.f[]) this.j.getValue(), (W9.f[]) ((O) obj).j.getValue())) {
                int iD = fVar.d();
                int i10 = this.f10475c;
                if (i10 == iD) {
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (p251z9.j.a(j(i11).b(), fVar.j(i11).b()) && p251z9.j.a(j(i11).c(), fVar.j(i11).c())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // W9.f
    public boolean f() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // Y9.InterfaceC0654j
    public final Set g() {
        return this.f10479h.keySet();
    }

    @Override // W9.f
    public final List getAnnotations() {
        return p120l9.r.f19440r;
    }

    @Override // W9.f
    public final boolean h() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k9.g] */
    public int hashCode() {
        return ((Number) this.f10481k.getValue()).intValue();
    }

    @Override // W9.f
    public final List i(int i10) {
        List list = this.f10478f[i10];
        return list == null ? p120l9.r.f19440r : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k9.g] */
    @Override // W9.f
    public W9.f j(int i10) {
        return ((U9.a[]) this.f10480i.getValue())[i10].d();
    }

    @Override // W9.f
    public final boolean k(int i10) {
        return this.g[i10];
    }

    public final void l(String str, boolean z10) {
        p251z9.j.e(str, "name");
        int i10 = this.f10476d + 1;
        this.f10476d = i10;
        String[] strArr = this.f10477e;
        strArr[i10] = str;
        this.g[i10] = z10;
        this.f10478f[i10] = null;
        if (i10 == this.f10475c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                map.put(strArr[i11], Integer.valueOf(i11));
            }
            this.f10479h = map;
        }
    }

    public String toString() {
        return p120l9.m.l0(B0.c.i0(0, this.f10475c), ", ", this.f10473a.concat("("), ")", new E5.a(10, this), 24);
    }
}
