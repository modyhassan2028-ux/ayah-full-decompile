package D4;

import F.C0153b;
import Z.C0698o;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import p110k9.y;
import p180s0.F;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements p241y9.g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1191r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f1192s;

    public /* synthetic */ f(int i10, Object obj) {
        this.f1191r = i10;
        this.f1192s = obj;
    }

    @Override // p241y9.g
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f1191r) {
            case 0:
                p124m3.j jVar = (p124m3.j) this.f1192s;
                ((Integer) obj2).getClass();
                C0698o c0698o = (C0698o) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                p251z9.j.e((C0153b) obj, "$this$stickyHeader");
                if (c0698o.K(iIntValue & 1, (iIntValue & 129) != 128)) {
                    p015b4.f.h(jVar.f19596n.b(), androidx.compose.foundation.layout.b.j(androidx.compose.foundation.a.a(l0.o.f19333a, ((p005a4.a) c0698o.k(p005a4.e.f11187a)).d(), F.f21774a), 16, 0.0f, 2), 0L, c0698o, 0, 4);
                } else {
                    c0698o.N();
                }
                return y.f19095a;
            default:
                O8.c cVar = (O8.c) this.f1192s;
                SQLiteCursorDriver sQLiteCursorDriver = (SQLiteCursorDriver) obj2;
                String str = (String) obj3;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                p251z9.j.b(sQLiteQuery);
                S2.h hVar = new S2.h(sQLiteQuery);
                I2.e eVar = (I2.e) cVar.f6511r;
                int length = eVar.f3806u.length;
                for (int i10 = 1; i10 < length; i10++) {
                    int i11 = eVar.f3806u[i10];
                    if (i11 == 1) {
                        hVar.c(eVar.f3807v[i10], i10);
                    } else if (i11 == 2) {
                        hVar.p(eVar.f3808w[i10], i10);
                    } else if (i11 == 3) {
                        String str2 = eVar.f3809x[i10];
                        p251z9.j.b(str2);
                        hVar.m(i10, str2);
                    } else if (i11 == 4) {
                        byte[] bArr = eVar.f3810y[i10];
                        p251z9.j.b(bArr);
                        hVar.P(i10, bArr);
                    } else if (i11 == 5) {
                        hVar.t(i10);
                    }
                }
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
