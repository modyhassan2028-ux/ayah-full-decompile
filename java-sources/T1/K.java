package T1;

import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class K extends D {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Object obj, q9.c cVar) {
        J j;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (cVar instanceof J) {
            j = (J) cVar;
            int i10 = j.f7608v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                j.f7608v = i10 - Integer.MIN_VALUE;
            } else {
                j = new J(this, cVar);
            }
        } else {
            j = new J(this, cVar);
        }
        Object obj2 = j.f7606t;
        int i11 = j.f7608v;
        p110k9.y yVar = p110k9.y.f19095a;
        if (i11 == 0) {
            p110k9.a.e(obj2);
            if (this.f7578c.get()) {
                throw new IllegalStateException("This scope has already been closed.");
            }
            FileOutputStream fileOutputStream3 = new FileOutputStream(this.f7576a);
            try {
                Y y10 = this.f7577b;
                f0 f0Var = new f0(fileOutputStream3);
                j.f7604r = fileOutputStream3;
                j.f7605s = fileOutputStream3;
                j.f7608v = 1;
                y10.b(obj, f0Var);
                p161p9.a aVar = p161p9.a.f21156r;
                if (yVar == aVar) {
                    return aVar;
                }
                fileOutputStream2 = fileOutputStream3;
                fileOutputStream = fileOutputStream2;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream3;
                throw th;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream2 = j.f7605s;
            fileOutputStream = j.f7604r;
            try {
                p110k9.a.e(obj2);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    p181s2.o.e(fileOutputStream, th);
                    throw th3;
                }
            }
        }
        fileOutputStream2.getFD().sync();
        p181s2.o.e(fileOutputStream, null);
        return yVar;
    }
}
