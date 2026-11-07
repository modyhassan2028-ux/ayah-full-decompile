package W6;

import H8.e;
import T6.r;
import U6.C0534l;
import com.google.android.gms.internal.measurement.H;
import com.google.android.gms.internal.measurement.J1;
import p118l7.i;
import p118l7.o;

/* JADX INFO: loaded from: classes.dex */
public final class c extends S6.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final L5.c f9642i = new L5.c(new b(12), new e(15));

    public final o a(C0534l c0534l) {
        p248z6.c cVar = new p248z6.c((char) 0, 26);
        R6.d[] dVarArr = {p038d7.c.f15701a};
        cVar.f24847s = new O8.c(c0534l);
        J1 j10 = new J1(cVar, dVarArr, false);
        i iVar = new i();
        T6.d dVar = this.f7512h;
        dVar.getClass();
        T6.o oVar = new T6.o(new r(j10, iVar, this.g), dVar.f7825i.get(), this);
        H h7 = dVar.f7828m;
        h7.sendMessage(h7.obtainMessage(4, oVar));
        return iVar.f19402a;
    }
}
