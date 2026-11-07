package p190t4;

import R6.g;
import i6.a;
import i6.d;
import i6.f;
import p241y9.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f22591r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p052ea.b f22592s;

    public /* synthetic */ b(p052ea.b bVar, int i10) {
        this.f22591r = i10;
        this.f22592s = bVar;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        p155p3.b bVar = (p155p3.b) obj;
        switch (this.f22591r) {
            case 0:
                j.e(bVar, "it");
                String str = this.f22592s.f15866r;
                j.d(str, "key");
                return new d(bVar, str, (g) null, 12);
            case 1:
                j.e(bVar, "it");
                String str2 = this.f22592s.f15866r;
                j.d(str2, "key");
                return new d(bVar, str2, (g) null, 12);
            case 2:
                j.e(bVar, "it");
                String str3 = this.f22592s.f15866r;
                j.d(str3, "key");
                return new f(bVar, str3);
            case 3:
                j.e(bVar, "it");
                String str4 = this.f22592s.f15866r;
                j.d(str4, "key");
                return new a(bVar, str4);
            default:
                j.e(bVar, "it");
                String str5 = this.f22592s.f15866r;
                j.d(str5, "key");
                return new i6.b(bVar, str5);
        }
    }
}
