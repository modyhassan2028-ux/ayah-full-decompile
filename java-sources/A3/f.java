package A3;

import F2.m;
import F2.q;
import H9.o;
import android.content.Context;
import p110k9.y;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f494a;

    public /* synthetic */ f(int i10) {
        this.f494a = i10;
    }

    public static final q b(Context context, Class cls, String str) {
        if (str == null || o.e1(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        if (j.a(str, ":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new q(context, cls, str);
    }

    public static final Object c(m mVar, String str, q9.c cVar) {
        Object objD = mVar.d(str, new d(25), cVar);
        return objD == p161p9.a.f21156r ? objD : y.f19095a;
    }

    public final void a(Q2.c cVar, Object obj) {
        switch (this.f494a) {
            case 0:
                E3.b bVar = (E3.b) obj;
                j.e(cVar, "statement");
                j.e(bVar, "entity");
                cVar.c(bVar.f1838a, 1);
                cVar.c(bVar.f1839b, 2);
                cVar.c(bVar.f1840c, 3);
                break;
            default:
                E3.c cVar2 = (E3.c) obj;
                j.e(cVar, "statement");
                j.e(cVar2, "entity");
                cVar.c(cVar2.f1841a, 1);
                cVar.c(cVar2.f1842b, 2);
                cVar.r(cVar2.f1843c);
                cVar.c(cVar2.f1844d, 4);
                break;
        }
    }

    public void d(Q2.a aVar, Object obj) {
        String str;
        j.e(aVar, "connection");
        if (obj == null) {
            return;
        }
        switch (this.f494a) {
            case 0:
                str = "INSERT OR REPLACE INTO `favorites` (`_id`,`ayah_id`,`timestamp`) VALUES (nullif(?, 0),?,?)";
                break;
            default:
                str = "INSERT OR REPLACE INTO `notes` (`_id`,`ayah_id`,`note`,`timestamp`) VALUES (nullif(?, 0),?,?,?)";
                break;
        }
        Q2.c cVarA0 = aVar.a0(str);
        try {
            a(cVarA0, obj);
            cVarA0.R();
            p186s9.b.b(cVarA0, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p186s9.b.b(cVarA0, th);
                throw th2;
            }
        }
    }
}
